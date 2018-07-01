package com.techlad.colorstrings_example;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.techlad.colorstrings.ColoredString;
import com.techlad.colorstrings.StringPainter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView textView = (TextView) findViewById(R.id.attributed_tv);

		List<ColoredString> coloredStringsList  = new ArrayList<>();
		//Add create your colored String objects
		ColoredString coloredString1 = new ColoredString(Color.BLACK , "Hello ");
		ColoredString coloredString2 = new ColoredString(Color.RED , "Colored ");
		ColoredString coloredString3 = new ColoredString(Color.BLACK , "World");
		//add them to array of this objects
		coloredStringsList.add(coloredString1);
		coloredStringsList.add(coloredString2);
		coloredStringsList.add(coloredString3);
		//And then call this function to get SpannableStringBuilder
		SpannableStringBuilder builder = StringPainter.getColoredText(coloredStringsList);
		//Set this builder to textView without converting using toString() method on builder
		textView.setText(builder , BufferType.SPANNABLE);
	}
}
