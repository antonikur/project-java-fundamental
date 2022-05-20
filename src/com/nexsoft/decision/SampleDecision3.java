package com.nexsoft.decision;

import java.util.Scanner;

public class SampleDecision3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int hari = 2;
		
		switch(hari) {
		case 1:
			System.out.println("senin");
			break;
			
		case 2:
			System.out.println("selasa");
			break;
			
		case 3:
			System.out.println("rabu");
			break;
			
		case 4:
			System.out.println("kamis");
			break;
			
		case 5:
			System.out.println("jumat");
			break;
			
		case 6:
			System.out.println("sabtu");
			break;
			
		case 7:
			System.out.println("minggu");
			break;
			
		default:
			System.out.println("tidak ada hari tersebut");
			break;
		}
		
		System.out.print("Input browser: ");
		
//		String browser = input.nextLine();
		String browser = "chrome";
		
		switch (browser) {
		case "firefox":
			System.out.println("open firefox");
			break;
			
		case "chrome":
			System.out.println("open chrome");
			break;

		default:
			System.out.println("Tidak ada browser lain");
			break;
		}
		
		char huruf = 'A';
		
		switch(huruf) {
		case 'A':
		case 'a':
			System.out.println("huruf vokal");
			break;
		case 'I':
		case 'i':
			System.out.println("huruf vokal");
			break;
		case 'U':
		case 'u':
			System.out.println("huruf vokal");
			break;
		case 'E':
		case 'e':
			System.out.println("huruf vokal");
			break;
		case 'O':
		case 'o':
			System.out.println("huruf vokal");
			break;
		}
		
		
		//Rumus bangun datar
		//1. persegi
		//2. persegi panjang
		//3. segitiga
		
//		System.out.println("1. Persegi");
//		System.out.println("2. persegi panjang");
//		System.out.println("3. segitiga");
//		System.out.print("Pilih mau yang mana:");
//		int menu = input.nextInt();
////		int menu = 1;
//		input.nextLine();
//		
//		switch(menu) {
//		case 1:
//			System.out.print("Input sisi: ");
//			int sisi = input.nextInt();
//			input.nextLine();
//			
//			System.out.println("Luas persegi adalah "+ sisi * 4);
//			break;
//		case 2:
//			System.out.print("Input lebar: ");
//			int lebar = input.nextInt();
//			input.nextLine();
//			
//			System.out.print("input panjang: ");
//			int panjang = input.nextInt();
//			input.nextLine();
//			
//			System.out.println("Luas persegi panjang adalah "+ panjang * lebar);
//			break;
//		case 3:
//			System.out.print("input alas: ");
//			int alas = input.nextInt();
//			input.nextLine();
//			
//			System.out.print("input tinggi: ");
//			int tinggi = input.nextInt();
//			input.nextLine();
//			
//			System.out.println("Luas segitiga adalah "+ 0.5 * alas * tinggi);
//			break;
//			
//		default:
//			System.out.println("tidak ada menu seperti itu!");
//		}
		
		
		//input kelas
		//input jam
		//kelas 1A, jam 9 = statistik, jam 10 = pemrograman java
		//kelas 1B, jam 9 = bahasa indonesia, jam 10 = praktikum java
		
		System.out.print("input kelas: ");
		String kelas = input.nextLine();
		
		System.out.print("input jam: ");
		int jam = input.nextInt();
		input.nextLine();
		
		switch(kelas) {
		case "1A":
		case "1a":
			switch(jam) {
			case 9:
				System.out.println("Kelas 1A jam 9 ada statistik");
				break;
			case 10:
				System.out.println("Kelas 1A jam 10 ada pemrograman java");
				break;
			default:
				System.out.println("tidak ada kegiatan di jam itu");
			}
			break;
			
		case "1B":
		case "1b":
			switch(jam) {
			case 9:
				System.out.println("kelas 1B jam 9 ada bahasa indonesia");
				break;
			case 10:
				System.out.println("kelas 1B jam 10 ada praktikum java");
				break;
			default:
				System.out.println("tidak ada kegiatan di jam itu");
			}
			break;
		default:
			System.out.println("Kelas yang dipilih tidak ada");
		}
		
		
		int nilai = 80;
		String output = nilai > 75 ? "lulus" : "tidak lulus";
		System.out.println(output);
		
		
	}
}
