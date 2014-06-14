package com.vrs.pulse7.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

	// Constant Value for Splash Screen time visibility
	private static int SPLASH_SCREEN_TIME = 5000;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);

		// Create object of Handler class and call method postDelayed to make
		// Splash Screen visible for SPLASH_SCREEN_TIME
		new Handler().postDelayed(new Runnable() {

			public void run() {
				// This is method will be executed when SPLASH_SCREEN_TIME is
				// over, Now you can call your Home Screen
				Intent iHomeScreen = new Intent(getApplicationContext(),
						HomeScreen.class);
				startActivity(iHomeScreen);

				// Finish Current Splash Screen, as it should be visible only
				// once when application start
				finish();
			}

		}, SPLASH_SCREEN_TIME);
	}
}