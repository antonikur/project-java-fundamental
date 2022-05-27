package com.nexsoft.function;

import java.util.Scanner;

public class SampleFunction1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		ucapan();
		ucapan("Selamat");
		ucapan("Hadiah");
		System.out.println(convertCelsius(30));
		System.out.println(convertCelsius(20));
		formData("Koswara", "Jawa Barat");
		formData("Koswara", "123456");
		
//		System.out.println("Input nama dan alamat:");
//		formData(input.nextLine(), input.nextLine());
		
		System.out.print("input angka: ");
		genapGanjil(input.nextInt());
		
	}
	
	static void ucapan(String text) {
		System.out.println(text);
	}
	
	static void formData(String nama, String alamat) {
		System.out.println("Nama: "+ nama);
		System.out.println("Alamat: "+ alamat);
	}
	
	static float convertCelsius(float temptC) {
		float convert = (temptC * 9f / 5f) + 32f;
		return convert;
	}
	
	//masukan angka: 6
	//bilangan genap
	static void genapGanjil(int angka) {
		if(angka % 2 == 0) {
			System.out.println("angka bilangan genap");
		} else {
			System.out.println("angka bilangan ganjil");
		}
	}
	
}
