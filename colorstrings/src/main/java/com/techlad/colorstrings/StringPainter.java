package com.techlad.colorstrings;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import java.util.List;

/**
 * Created by Umair Khalid on 7/1/2018.
 */

public class  StringPainter {
	private StringPainter(){}

	public static SpannableStringBuilder getColoredText(List<ColoredString> coloredStrings){
		SpannableStringBuilder builder = new SpannableStringBuilder();

		for (int i = 0; i < coloredStrings.size(); i++){
			ColoredString cs = coloredStrings.get(i);
			SpannableString colorString = new SpannableString(cs.getText());
			colorString.setSpan(new ForegroundColorSpan(cs.getColor()), 0, cs.getText().length(), 0);
			builder.append(colorString);
		}

		return builder;
	}
}
