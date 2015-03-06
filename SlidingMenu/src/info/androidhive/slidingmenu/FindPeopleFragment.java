package info.androidhive.slidingmenu;



import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.app.ListFragment;

public class FindPeopleFragment extends ListFragment {

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    
    String[] emails = getResources().getStringArray(R.array.emails);
    
    // Binding Array to ListAdapter
    this.setListAdapter(new ArrayAdapter<String>(getActivity(), R.layout.fragment_find_people, R.id.label, emails));
    
    ListView lv = getListView();
    

    // listening to single list item on click
    lv.setOnItemClickListener(new OnItemClickListener() {
      public void onItemClick(AdapterView<?> arg1, View view,
          int position, long arg3) {
    	  
    	  // selected item 
    	            if(position==0){
          String[] items = { "bsaurabh@cdac.in" };
          
          ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                      android.R.layout.simple_list_item_1, items);
          
          
    	  String product = ((TextView) view).getText().toString();
    	  
    	  // Launching new Activity on selecting single List Item
    	 
    	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
    	    emailintent.setType("plain/text");
    	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
    	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
    	            }
      
      if(position==1){
      	  // selected item 
      	 
            
            String[] items = { "mohamed.imran@au-kbc.org" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==2){
      	  // selected item 
      	 
            
            String[] items = { "sidhpurwala.huzaifa@gmail.com" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==3){
      	  // selected item 
      	 
            
            String[] items = { "senthils@au-kbc.org" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==4){
      	  // selected item 
      	 
            
            String[] items = { "amachu@amachu.me" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==5){
      	  // selected item 
      	 
            
            String[] items = { "varadarajan.s@gmail.com" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==6){
      	  // selected item 
      	 
            
            String[] items = { "karunakarg@gmail.com" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==7){
      	  // selected item 
      	 
            
            String[] items = { "amachu@amachu.me" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==8){
      	  // selected item 
      	 
            
            String[] items = { "senthils@au-kbc.org" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==9){
      	  // selected item 
      	 
            
            String[] items = { "mohamed.imran@au-kbc.org" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==10){
      	  // selected item 
      	 
            
            String[] items = { "savee3@yahoo.com" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==11){
      	  // selected item 
      	 
            
            String[] items = { "srini.it@gmail.com" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==12){
      	  // selected item 
      	 
            
            String[] items = { "srini.it@gmail.com" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==13){
      	  // selected item 
      	 
            
            String[] items = { "sksaini@au-kbc.org" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==14){
      	  // selected item 
      	 
            
            String[] items = { "sksaini@au-kbc.org" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
      if(position==15){
      	  // selected item 
      	 
            
            String[] items = { "amachu@amachu.me" };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, items);
            
            
      	  String product = ((TextView) view).getText().toString();
      	  
      	  // Launching new Activity on selecting single List Item
      	 
      	  Intent emailintent = new Intent(android.content.Intent.ACTION_SEND);
      	    emailintent.setType("plain/text");
      	    emailintent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {items[0]});
      	    startActivity(Intent.createChooser(emailintent, "Send mail..."));
        }
    
      }
    });
  }


  @Override
  public void onListItemClick(ListView l, View v, int position, long id) {
    // do something with the data
  }
} 