package com.my.newproject4;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity {
	
	
	private String st = "";
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear26;
	private LinearLayout linear24;
	private TextView text_shift;
	private TextView textview58;
	private TextView textview59;
	private TextView textview60;
	private TextView textview55;
	private TextView textview56;
	private TextView textview57;
	private Button button1;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button7;
	private Button button8;
	private TextView textview36;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private Button button10;
	private Button button11;
	private Button button12;
	private Button button13;
	private Button button14;
	private Button button15;
	private TextView textview37;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private Button button17;
	private Button button18;
	private Button button19;
	private Button button20;
	private Button button21;
	private Button button22;
	private Button button24;
	private Button button25;
	private Button button26;
	private Button button27;
	private Button button28;
	private TextView textview38;
	private TextView textview39;
	private TextView textview40;
	private TextView textview41;
	private TextView textview42;
	private Button button57;
	private Button button58;
	private Button button59;
	private Button button60;
	private Button button61;
	private TextView textview43;
	private TextView textview44;
	private TextView textview45;
	private TextView textview46;
	private TextView textview47;
	private Button button63;
	private Button button64;
	private Button button65;
	private Button button66;
	private Button button67;
	private TextView textview48;
	private TextView textview49;
	private TextView textview50;
	private TextView textview51;
	private TextView textview52;
	private Button button69;
	private Button button70;
	private Button button71;
	private Button button72;
	private Button button73;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		text_shift = (TextView) findViewById(R.id.text_shift);
		textview58 = (TextView) findViewById(R.id.textview58);
		textview59 = (TextView) findViewById(R.id.textview59);
		textview60 = (TextView) findViewById(R.id.textview60);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview56 = (TextView) findViewById(R.id.textview56);
		textview57 = (TextView) findViewById(R.id.textview57);
		button1 = (Button) findViewById(R.id.button1);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		textview36 = (TextView) findViewById(R.id.textview36);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		button10 = (Button) findViewById(R.id.button10);
		button11 = (Button) findViewById(R.id.button11);
		button12 = (Button) findViewById(R.id.button12);
		button13 = (Button) findViewById(R.id.button13);
		button14 = (Button) findViewById(R.id.button14);
		button15 = (Button) findViewById(R.id.button15);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		button17 = (Button) findViewById(R.id.button17);
		button18 = (Button) findViewById(R.id.button18);
		button19 = (Button) findViewById(R.id.button19);
		button20 = (Button) findViewById(R.id.button20);
		button21 = (Button) findViewById(R.id.button21);
		button22 = (Button) findViewById(R.id.button22);
		button24 = (Button) findViewById(R.id.button24);
		button25 = (Button) findViewById(R.id.button25);
		button26 = (Button) findViewById(R.id.button26);
		button27 = (Button) findViewById(R.id.button27);
		button28 = (Button) findViewById(R.id.button28);
		textview38 = (TextView) findViewById(R.id.textview38);
		textview39 = (TextView) findViewById(R.id.textview39);
		textview40 = (TextView) findViewById(R.id.textview40);
		textview41 = (TextView) findViewById(R.id.textview41);
		textview42 = (TextView) findViewById(R.id.textview42);
		button57 = (Button) findViewById(R.id.button57);
		button58 = (Button) findViewById(R.id.button58);
		button59 = (Button) findViewById(R.id.button59);
		button60 = (Button) findViewById(R.id.button60);
		button61 = (Button) findViewById(R.id.button61);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview44 = (TextView) findViewById(R.id.textview44);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview46 = (TextView) findViewById(R.id.textview46);
		textview47 = (TextView) findViewById(R.id.textview47);
		button63 = (Button) findViewById(R.id.button63);
		button64 = (Button) findViewById(R.id.button64);
		button65 = (Button) findViewById(R.id.button65);
		button66 = (Button) findViewById(R.id.button66);
		button67 = (Button) findViewById(R.id.button67);
		textview48 = (TextView) findViewById(R.id.textview48);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview50 = (TextView) findViewById(R.id.textview50);
		textview51 = (TextView) findViewById(R.id.textview51);
		textview52 = (TextView) findViewById(R.id.textview52);
		button69 = (Button) findViewById(R.id.button69);
		button70 = (Button) findViewById(R.id.button70);
		button71 = (Button) findViewById(R.id.button71);
		button72 = (Button) findViewById(R.id.button72);
		button73 = (Button) findViewById(R.id.button73);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final AlertDialog dialog2 = new AlertDialog.Builder(MainActivity.this).create();
				View inflate = getLayoutInflater().inflate(R.layout.chh, null);
				dialog2.setView(inflate);
				
				/*
Button button11 = (Button) inflate.findViewById(R.id.button11);
Button button2 = (Button) inflate.findViewById(R.id.button2);
button11.setOnClickListener(new OnClickListener() { 
public void onClick(View view) {
MainActivity.this.finish(); } });
button2.setOnClickListener(new OnClickListener() { 
public void onClick(View view){ dialog2.dismiss(); } });
*/
				//dialog2.getWindow().getAttributes().gravity=Gravity.LEFT|Gravity.TOP;
				
				WindowManager.LayoutParams wmlp = dialog2.getWindow().getAttributes();
				
				wmlp.gravity = Gravity.LEFT|Gravity.TOP;
				/*
wmlp.width = 100;
wmlp.height = 500;*/
				
				wmlp.x = getLocationX(button1);
				wmlp.y = 300;
				dialog2.show();
				
				/*
Window window = dialog2.getWindow();
window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
*/
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (text_shift.getText().toString().equals("")) {
					text_shift.setText("SHIFT");
				}
				else {
					text_shift.setText("");
				}
			}
		});
		
		button69.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (text_shift.getText().toString().equals("SHIFT")) {
					final AlertDialog dialog1 = new AlertDialog.Builder(MainActivity.this).create();
					View inflate = getLayoutInflater().inflate(R.layout.fgv, null);
					dialog1.setView(inflate);
					
					/*
Button button11 = (Button) inflate.findViewById(R.id.button11);
Button button2 = (Button) inflate.findViewById(R.id.button2);
button11.setOnClickListener(new OnClickListener() { 
public void onClick(View view) {
MainActivity.this.finish(); } });
button2.setOnClickListener(new OnClickListener() { 
public void onClick(View view){ dialog2.dismiss(); } });
*/
					/*/dialog1.getWindow().getAttributes().gravity=Gravity.LEFT|Gravity.TOP;

WindowManager.LayoutParams wmlp = dialog1.getWindow().getAttributes();

wmlp.gravity = Gravity.CENTER;
/*wmlp.x = getLocationX(button1);
wmlp.y = 300; */
					
					dialog1.show();
					
				}
			}
		});
		
		button70.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (text_shift.getText().toString().equals("SHIFT")) {
					final AlertDialog dialog3 = new AlertDialog.Builder(MainActivity.this).create();
					View inflate = getLayoutInflater().inflate(R.layout.constants, null);
					dialog3.setView(inflate);
					
					/*
Button button11 = (Button) inflate.findViewById(R.id.button11);*/
					
					TextView text_universal = (TextView) inflate.findViewById(R.id.text_universal);
					text_universal.setOnClickListener(new OnClickListener() { 
						public void onClick(View view) {
							final AlertDialog dialog4 = new AlertDialog.Builder(MainActivity.this).create();
							View inflate = getLayoutInflater().inflate(R.layout.distance_from, null);
							dialog4.setView(inflate);
							dialog4.show();
						} });
					
					/*
button2.setOnClickListener(new OnClickListener() { 
public void onClick(View view){ dialog2.dismiss(); } });
dialog1.getWindow().getAttributes().gravity=Gravity.LEFT|Gravity.TOP;
*/
					
					WindowManager.LayoutParams wmlp = dialog3.getWindow().getAttributes();
					
					wmlp.gravity = Gravity.CENTER;
					/*wmlp.x = getLocationX(button1);
wmlp.y = 300; */
					
					dialog3.show();
					
				}
			}
		});
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
