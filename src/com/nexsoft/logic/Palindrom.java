package com.nexsoft.logic;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//////////////////////////////////////////
//		System.out.print("Input kalimat: ");
//		String kalimat = scan.nextLine();
//		
//		System.out.print(kalimat);
//		for(int i = kalimat.length()-1; i >= 0; i--) {
//			System.out.print(kalimat.charAt(i));
//		}
		//////////////////////////////////////////
		new Palindrom().palindrome("kasur rusak");
		
		new Palindrom().palindrom2("kasur rusak");
		
		if(new Palindrom().palindromReverse("kasur rusak")) {
			System.out.println(" ini palindrom");
		} else {
			System.out.println(" bukan palidrome");
		}
	}
	
	public void palindrome(String teks) {
		String poli = "";
		for(int i=teks.length(); i > 0; i--) {
			String huruf = teks.substring(i-1, i);
			poli += huruf;
		}
		if(teks.equals(poli)) {
			System.out.println(teks + " ini palindrom");
		} else {
			System.out.println(teks + " bukan palindrom");
		}
	}
	
	public void palindrom2(String teks) {
		String poli = "";
		for(int i=teks.length()-1; i >= 0; i--) {
			poli += teks.charAt(i);
		}
		if(teks.equals(poli)) {
			System.out.println(teks + " ini palindrom");
		} else {
			System.out.println(teks + " bukan palindrom");
		}
	}
	
	public boolean palindromReverse(String teks) {
		String reverse = new StringBuilder(teks).reverse().toString();
		
		System.out.print(reverse);
		return reverse.equals(teks);
	}
	
}
