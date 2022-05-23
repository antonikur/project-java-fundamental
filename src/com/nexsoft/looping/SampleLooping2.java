package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/////////////////////////////////////////////////
//		int nilaiAwal,
//			nilaiAkhir;
//		
//		System.out.print("Masukan nilai Awal: ");
//		nilaiAwal = input.nextInt();
////		input.nextLine();
//		System.out.print("Masukan nilai Akhir: ");
//		nilaiAkhir = input.nextInt();
//		
//		for(int i = nilaiAwal; i <= nilaiAkhir; i++) {
//			System.out.println(i);
//		}
		
		//////////////////////////////////////////////////
//		int batas = 3;
//		String motor[] = new String[10];
//		System.out.println("Masukan data motor: ");
//		for(int i=0; i<=batas; i++) {
//			motor[i] = input.nextLine();
//		}
//		for(String i:motor) {
//			System.out.println(i);
//		}
		
		/*///////////////////////////////////////////
		 * */
		int batas = 4;
		int nilai[] = new int[batas];
		System.out.println("Masukan data nilai: ");
		for(int i=0; i<nilai.length; i++) {
			nilai[i] = input.nextInt();
		}
		int sum = 0;
		for(int i:nilai) {
			System.out.println(i);
			sum+=1;
		}
		System.out.println("Jumlah Nilai = "+sum);
		
		int nilai1 = 80, nilai2 = 90;
		System.out.println("Sum = "+Integer.sum(80, 90));
		
		///////////////////
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.print("* ");
			} else {
				System.out.print(i+" ");
			}
		}
//		
//		String kalimat1 = scan.nextLine();
//	    String kalimat2 = scan.nextLine();
//	    String kalimat3 = scan.nextLine();
//	    
//	    String kalimat12 = kalimat1.substring(kalimat.indexOf(' '), kalimat1.length());
//	    String kalimat22 = kalimat2.substring(kalimat.indexOf(' '), kalimat2.length());
//	    String kalimat32 = kalimat3.substring(kalimat.indexOf(' '), kalimat3.length());
		
	}
}
