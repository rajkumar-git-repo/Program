package com.raj;

public class StringSampleProgram {

	public static void main(String[] args) {
		reverse("abcdefgh");
	}
	
	public static void reverse(String str) {
		System.out.println("String Before Reverse:"+str);
		char[] strArray = str.toCharArray();
		for(int i=0;i<str.length()/2;i++) {
			char ch = strArray[i];
			strArray[i] = strArray[str.length()-1-i];
			strArray[str.length()-1-i] = ch;
		}
		System.out.println("String After Reverse:"+new String(strArray));
	}
}
