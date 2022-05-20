package com.nexsoft.decision;

import java.util.Scanner;

public class SampleDecision1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//jika number > 2 maka rumus dijalankan
		int num = 3;
		if (num > 2) {
			int x = 10 * num - 2;
			System.out.println("x = " + x);
		}
		
		String kata1 = "Nexsoft";
		String kata2 = "Nexsoft";
		if(kata1 == kata2) {
			System.out.println("Kata sama");
		}
		
		Integer num1 = 10;
		Integer num2 = 10;
		if (num1 == num2) {
			System.out.println("angka sama");
		}
		
		//pilih firefox
		//jalankan firefox
		String inputBrowser;
		String browser = "firefox";
		System.out.print("Masukan nama browser: ");
		inputBrowser = input.nextLine();
		if(inputBrowser.equalsIgnoreCase(browser)) {
			System.out.println("jalankan browser firefox");
		}
		
		int angka = 3;
		System.out.println("Angka: "+angka);
		if(angka%2==0) 
			System.out.println("genap");
		else 
			System.out.println("ganjil");
		
		//gunakan scanner untuk input error atau tidak
		//jika error maka screenshot error
		
		System.out.print("Input hasil error atau tidak: ");
		String status = input.nextLine();
		
		if(status.equalsIgnoreCase("error"))
			System.out.println("Screenshoot error");
		else
			System.out.println("Tidak screenshoot");
		
		
	}
}
