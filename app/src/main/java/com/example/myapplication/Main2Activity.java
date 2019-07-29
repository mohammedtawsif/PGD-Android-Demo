package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
		final EditText editText = findViewById(R.id.text_edit);
		final TextView prevText = findViewById(R.id.prev_text);

		int previousText = getIntent().getIntExtra("Text", 0);

		Log.e("DEFAULT VALUE", previousText + "");


		Button minusButton = findViewById(R.id.button_minus);
		minusButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Editable editable = editText.getText();
				int value = Integer.parseInt(editable.toString());;
				count = count - value;
				editText.setText(  null);
			}
		});


		Button plusButton = findViewById(R.id.button_plus);

		plusButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				count = count + Integer.parseInt(editText.getText().toString()); ;

				editText.setText(  null);

			}
		});


		Button equal = findViewById(R.id.button_equal);
		equal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				counter.setText( count + "");

				Intent data = new Intent();
				data.putExtra("Result", count + "");
				setResult(Activity.RESULT_CANCELED);
				finish();
			}
		});


	}

}
