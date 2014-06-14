package com.vrs.pulse7.splashscreen;


import android.app.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HomeScreen extends Activity {

   private EditText usernameField,passwordField;
   private TextView status,role,method;

   @Override 
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.homescreen);
      usernameField = (EditText)findViewById(R.id.editText1);
      passwordField = (EditText)findViewById(R.id.editText2);
      status = (TextView)findViewById(R.id.textView6);
      role = (TextView)findViewById(R.id.textView7);
      method = (TextView)findViewById(R.id.textView9);
      
		
   }

   public void login(View view){
      String username = usernameField.getText().toString();
      String password = passwordField.getText().toString();
      method.setText("Get Method");
      new LoginDataBaseAdapter(this,status,role,0).execute(username,password);
   // This is method will be executed when SPLASH_SCREEN_TIME is
   		// over, Now you can call your Home Screen
   		Intent iHomeScreen = new Intent(getApplicationContext(),
   				Dashboard.class);
   		startActivity(iHomeScreen);

   		// Finish Current Splash Screen, as it should be visible only
   		// once when application start
   		finish();
   }
   
   public void loginPost(View view){
      String username = usernameField.getText().toString();
      String password = passwordField.getText().toString();
      method.setText("Post Method");
      new LoginDataBaseAdapter(this,status,role,1).execute(username,password);

      
		// This is method will be executed when SPLASH_SCREEN_TIME is
		// over, Now you can call your Home Screen
		Intent iHomeScreen = new Intent(getApplicationContext(),
				Dashboard.class);
		startActivity(iHomeScreen);

		// Finish Current Splash Screen, as it should be visible only
		// once when application start
		finish();
   }

}
