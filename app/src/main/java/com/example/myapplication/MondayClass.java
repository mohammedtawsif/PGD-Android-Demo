package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MondayClass extends AppCompatActivity {

	TextView textView ;
	Button plus;
	Button minus;

	int count = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_monday_class);
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		textView = findViewById(R.id.textview);
		plus = findViewById(R.id.button_plus);
		minus = findViewById(R.id.button_minus);


		plus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				textView.setText( ++count + "");
			}
		});

		minus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				textView.setText( --count + "");
			}
		});

//		FloatingActionButton fab = findViewById(R.id.fab);
//		fab.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View view) {
//				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//						.setAction("Action", null).show();
//			}
//		});
	}

}
