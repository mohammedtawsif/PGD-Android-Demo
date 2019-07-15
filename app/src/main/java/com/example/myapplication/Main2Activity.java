package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

	int count = 0 ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		FloatingActionButton fab = findViewById(R.id.fab);

		final TextView counter = findViewById(R.id.text_view);

		Button minusButton = findViewById(R.id.button_minus);
		minusButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				count = count - 1;
				counter.setText( count + "");
			}
		});


		Button plusButton = findViewById(R.id.button_plus);

		plusButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				count = count + 1 ;

				counter.setText( count + "");
			}
		});



	}

}
