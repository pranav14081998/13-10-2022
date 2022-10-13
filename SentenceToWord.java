package com.strings.demo;

import java.util.Scanner;

public class SentenceToWord {

	static void sort(String[]s,int n) {
		for(int i=1;i<n;i++) {
			String temp=s[i];
			int j=i-1;
			while(j>=0 && temp.length() <s[j].length()) {
				s[j+1]=s[j];
				j--;
			}
			s[j+1]=temp;
		}
	}
		
		static void PrintString(String []s,int n) {
			for (int i=0; i<n; i++)
		        System.out.print(s[i]+" ");
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter a sentence : ");
		String sentence = sc.nextLine();			
		String[] words = sentence.split(" ");
		int n=words.length;
		
		sort(words,n);
		
		PrintString(words,n);
		
		sc.close();
	}

}
