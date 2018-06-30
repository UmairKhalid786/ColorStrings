package com.techlad.colorstrings;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;

/**
 * Created by Umair Khalid on 7/1/2018.
 */

public class ColoredString {
	int color = Color.GRAY;
	String text;

	public ColoredString() {
	}

	public ColoredString(String text) {
		this.text = text;
	}

	public ColoredString(int color, String text) {
		this.color = color;
		this.text = text;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
