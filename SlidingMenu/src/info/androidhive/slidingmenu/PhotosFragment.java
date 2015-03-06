package info.androidhive.slidingmenu;



import android.net.Uri;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;
import android.content.DialogInterface;


public class PhotosFragment extends Fragment  {

	private EditText recipient;
	private EditText subject;
	private EditText body;
	 private AutoCompleteTextView actv;
	   private MultiAutoCompleteTextView mactv;
	 final PhotosFragment context = this;
	  
	
   @Override
   public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_photos, container, false);
      super.onCreate(savedInstanceState);
      String[] cities = getResources().
    	        getStringArray(R.array.cities);
    	        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,cities);
    	        mactv = (MultiAutoCompleteTextView) view.findViewById(R.id.recipient); //autocompletes city name
    	        mactv.setAdapter(adapter);
    	        
    	      
    	            
    	        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

      recipient  = (EditText) view.findViewById(R.id.recipient);
      subject = (EditText) view.findViewById(R.id.subject);
      body = (EditText) view.findViewById(R.id.body);
      
      Button sendBtn = (Button) view.findViewById(R.id.sendEmail);
      sendBtn.setOnClickListener(new View.OnClickListener() {
         public void onClick(View view) {
        	 sendEmail();
        	 // after sending the email, clear the fields
        	 recipient.setText("");
        	 subject.setText("");
        	 body.setText("");
         }
   });
      return view;
   }
   protected void sendEmail() {

      String[] recipients = {recipient.getText().toString()};
      Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
      // prompts email clients only
      email.setType("message/rfc822");

      email.putExtra(Intent.EXTRA_EMAIL, recipients);
      email.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
      email.putExtra(Intent.EXTRA_TEXT, body.getText().toString());

      
         startActivity(Intent.createChooser(email, "Choose an email client from..."));
     
      
   }
   
}
