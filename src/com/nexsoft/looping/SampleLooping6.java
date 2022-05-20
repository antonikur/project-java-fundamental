package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		///////////////////////////////////////
//		String password = "nexsoft";
//		int maxInput = 3;
//		int jumlahInput = 0;
//		do {
//			System.out.println("Masukan password");
//			String inputPassword = input.nextLine();
//			
//			if(inputPassword.equals(password)) {
//				System.out.println("password benar");
//				break;
//			} else {
//				System.out.println("password salah, coba lagi");
//				jumlahInput++;
//			}
//		}while(jumlahInput < 3);
//		
//		if(jumlahInput >= 3) {
//			System.out.println("anda sudah salah 3 kali");
//		} else {
//			System.out.println("anda berhasil masuk");
//		}
		//////////////////////////
		
		int jumlahDeret = 10, angka1 = 0, angka2 = 1;
		System.out.println("Deret Fibbonaci");
		for(int i=1; i<jumlahDeret; i++) {
			System.out.print(angka1+ " ");
			int angkaSebelumnya = angka1+angka2;
			angka1 = angka2;
			angka2 = angkaSebelumnya;
		}
		System.out.println();
		//////////////////////////
		System.out.print("input angka: ");
		int inputAngka = input.nextInt();
		for(int i=1; i <=10; i++){
			System.out.println(inputAngka+" * "+i+" = " + (inputAngka*i));
		}
		
		
	}
}
