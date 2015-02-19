/* Controls Screen (joystick) of the App
 * Project Delta Fountains
 */

package com.deltafountains;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Controls extends Activity {

	RelativeLayout layout_joystick;
	ImageView image_joystick, image_border;
	TextView xAxisValue, yAxisValue, angleValue, distanceValue, directionValue;
	
	JoyStickClass js;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);

        xAxisValue = (TextView)findViewById(R.id.textView1);
        yAxisValue = (TextView)findViewById(R.id.textView2);
        angleValue = (TextView)findViewById(R.id.textView3);
        distanceValue = (TextView)findViewById(R.id.textView4);
        directionValue = (TextView)findViewById(R.id.textView5);
        
	    layout_joystick = (RelativeLayout)findViewById(R.id.layout_joystick);

        js = new JoyStickClass(getApplicationContext()
        		, layout_joystick, R.drawable.image_button);
	    js.setStickSize(150, 150);
	    js.setLayoutSize(500, 500);
	    js.setLayoutAlpha(150);
	    js.setStickAlpha(100);
	    js.setOffset(90);
	    js.setMinimumDistance(50);
	    
	    layout_joystick.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View arg0, MotionEvent arg1) {
				js.drawStick(arg1);
				if(arg1.getAction() == MotionEvent.ACTION_DOWN
						|| arg1.getAction() == MotionEvent.ACTION_MOVE) {
					xAxisValue.setText("X : " + String.valueOf(js.getX()));
					yAxisValue.setText("Y : " + String.valueOf(js.getY()));
					angleValue.setText("Angle : " + String.valueOf(js.getAngle()));
					distanceValue.setText("Distance : " + String.valueOf(js.getDistance()));
					
					//Get the position the user has moved the joystick to
					int direction = js.get8Direction();
					if(direction == JoyStickClass.STICK_UP) { //North
						directionValue.setText("Direction : North");
					} else if(direction == JoyStickClass.STICK_UPRIGHT) { //North-East
						directionValue.setText("Direction : North-East");
					} else if(direction == JoyStickClass.STICK_RIGHT) { //East
						directionValue.setText("Direction : East");
					} else if(direction == JoyStickClass.STICK_DOWNRIGHT) { //South-East
						directionValue.setText("Direction : South-East");
					} else if(direction == JoyStickClass.STICK_DOWN) { //South
						directionValue.setText("Direction : South");
					} else if(direction == JoyStickClass.STICK_DOWNLEFT) { //South-West
						directionValue.setText("Direction : South-West");
					} else if(direction == JoyStickClass.STICK_LEFT) { //West
						directionValue.setText("Direction : West");
					} else if(direction == JoyStickClass.STICK_UPLEFT) { //North-West
						directionValue.setText("Direction : North-West");
					} else if(direction == JoyStickClass.STICK_NONE) { //Centre
						directionValue.setText("Direction : Centre");
					}
				} else if(arg1.getAction() == MotionEvent.ACTION_UP) {
					xAxisValue.setText("X :");
					yAxisValue.setText("Y :");
					angleValue.setText("Angle :");
					distanceValue.setText("Distance :");
					directionValue.setText("Direction :");
				}
				return true;
			}
        });
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.controls, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}