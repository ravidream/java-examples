package com.example.programs;

import com.example.programs.EnumLookup.TextStyle;

public class EnumLookup {
	public enum TextStyle {
		BOLD, ITALICS, UNDERLINE, STRICKTHROUGH;
	}

	public static void main(String args[]) {

		String style = "Underline";

		TextStyle textStyle = TextStyle.valueOf(style.toUpperCase());

		System.out.println("textStyle : " + textStyle);
	}

}
