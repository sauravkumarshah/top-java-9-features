package com.example.demo;

public class UnicodeExample {
	public static void main(String[] args) {
		String string = "Hello \uD83D\uDE00";

		// Get the code point at index 6
		int codePoint = string.codePointAt(6);
		System.out.println("Code point at index 6: " + codePoint); // Code point at index 6: 128512

		// Get the number of code points in the string
		int codePointCount = string.codePointCount(0, string.length());
		System.out.println("Number of code points in string: " + codePointCount); // Number of code points in string: 7

		// Convert code point to character
		char[] charArray = Character.toChars(codePoint);
		System.out.println("Character from code point: " + new String(charArray)); // Character from code point: 😀
		
	}
}
