package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping4 {
	public static void main(String[] args) {
		//while
		int x = 0;
		while(x < 5) {
			System.out.println(x);
			x++;
		}
		
		int y = 0;
		do {
			System.out.println(y);
			y++;
		} while(y < 4);
		
		Scanner input = new Scanner(System.in);
		////////////////////////////////////////////
		
//		System.out.print("Masukkan angka sesukannya: ");
//		int angka = input.nextInt();
//		int sum = 0;
//		while (angka != 0) {
//			sum += angka;
//			System.out.print("Masukkan angka sesukannya lagi: ");
//			angka = input.nextInt();
//		}
//		System.out.println("Jumlah: "+sum);
		
		//jika input ya maka berhenti
		String kata = "";
		do {
			System.out.print("input kata: ");
			kata = input.nextLine();
		} while(!kata.equalsIgnoreCase("ya"));
		System.out.println("keluar");
	}
}
