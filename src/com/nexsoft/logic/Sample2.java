package com.nexsoft.logic;

import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) {
		/*
		 *laki2 minimal penghasilan 7 jt belum menikah, maka pajak 10%
		 *laki2 penghasilan 7jt menikah, maka pajak 5%
		 *perempuan minimal penghasilan 7jt belum menikah, maka pajak 7%
		 *perempuan minimal penghasilan 7jt menikah, maka pajak 4%
		 *
		 *penghasilan < 7 jt = tidak wajib pajak
		 *laki2 = 1, perempuan = 0
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		char codeGender;
//		boolean statusMenikah = false;
//		int penghasilan,
//			pajak;
//		
//		System.out.print("Pilih jenis kelamin: [P/W] ");
//		codeGender = scan.nextLine().charAt(0);
//		
//		System.out.print("Isi penghasilan: ");
//		penghasilan = scan.nextInt();
//		scan.nextLine();
//		
//		System.out.print("Status sudah menikah: [Y/N] ");
//		char pilihanYN = scan.nextLine().charAt(0);
//		statusMenikah = pilihanYN == 'Y' || pilihanYN == 'y';
//		
//		if(codeGender == 'p' || codeGender == 'P') {
//			if (penghasilan >= 7000000) {
//				if(statusMenikah) {
//					pajak = 5;
//				} else { //belum menikah
//					pajak = 10;
//				}
//			} else { //dibawah 7jt
//				pajak = 0;
//			}
//		} else {//wanita
//			if (penghasilan >= 7000000) {
//				if(statusMenikah) {
//					pajak = 4;
//				} else { //belum menikah
//					pajak = 7;
//				}
//			} else { //dibawah 7jt
//				pajak = 0;
//			}
//		}
//		
//		System.out.println("Pajak anda adalah: "+ pajak +"%");
		///////////////////////////////////////////////////////////
		
		luasSegitiga(4, 2);
		
		double 	angkaGenapGanjil = 13;
		int compare = (int) angkaGenapGanjil / 2;
		
		
		
		
	}
	
	public static void luasSegitiga(double alas, double tinggi) {
		double luas = 0.5 * alas * tinggi;
//		double luas = alas/tinggi;
		System.out.println(luas);
	}
	
}
