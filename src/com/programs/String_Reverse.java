package com.programs;

import java.util.Iterator;

public class String_Reverse {
 public static void reverseString() {
	 String str = "Java";
	 String rev = "";

	 for (int i = 0; i < str.length(); i++) {
	   rev = str.charAt(i) + rev;
	 }

	 System.out.println("Reversed string: "+ rev);
 }
 public static void main(String[] args) {
	reverseString();
}
}
