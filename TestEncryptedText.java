package com.strings.demo;

import java.util.Scanner;

public class TestEncryptedText {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the text");
		String text= sc.nextLine();
		EncryptedText t = new EncryptedText(text, 5);
	    System.out.println(t.getEncryptedText());
	    System.out.println(t.getDecryptedText(5));
	    t.setKey(15, 20);
	    System.out.println(t.getDecryptedText(5));
	    System.out.println(t.getDecryptedText(10));
	    sc.close();

	}

}
