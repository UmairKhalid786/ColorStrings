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

		List<ColoredString> coloredStringsList  = new ArrayList<>();

		ColoredString coloredString1 = new ColoredString(Color.BLACK , "Hello ");
		ColoredString coloredString2 = new ColoredString(Color.RED , "Colored ");
		ColoredString coloredString3 = new ColoredString(Color.BLACK , "World");

		coloredStringsList.add(coloredString1);
		coloredStringsList.add(coloredString2);
		coloredStringsList.add(coloredString3);

		SpannableStringBuilder builder = StringPainter.getColoredText(coloredStringsList);

		((TextView) findViewById(R.id.attributed_tv)).setText(builder , BufferType.SPANNABLE);
	}
}
