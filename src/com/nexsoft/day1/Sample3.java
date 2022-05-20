package com.nexsoft.day1;

import java.util.Calendar;
import java.util.Scanner;

public class Sample3 {
//	public static void main(String[] args) {
//		//Biodata
//		//nama, umur, alamat
//		Scanner input = new Scanner(System.in);
//		
//		String nama="", alamat="";
//		int umur=0;
//		
//		System.out.print("Masukan nama = ");
//		nama = input.nextLine();
//		System.out.print("Masukan umur = ");
//		umur = Integer.parseInt(input.nextLine()); 
////		input.nextLine();
//		System.out.print("Masukan alamat = ");
//		alamat = input.nextLine();
//		System.out.println("================================");
//		System.out.println("Nama = "+nama);
//		System.out.println("Umur = "+umur);
//		System.out.println("Alamat = "+alamat);
//		input.close();
//		
//	}
	
	
	public static void main(String[] args) {
		//Biodata
		//nama, umur, alamat
		Scanner input = new Scanner(System.in);
		
		double a = 10;
		double b = 3;
		double hasil = a/b;
		System.out.printf("%.2f", hasil);
		System.out.println();
		
		//Masukan Nama
		//Tahun Mulai Bekerja
		//Berapa tahun dia bekerja sampai sekarang
		
//		String nama;
//		int tahunBekerja;
//		
//		System.out.print("Input nama: ");
//		nama = input.nextLine();
//		System.out.print("Input tahun bekerja: ");
//		tahunBekerja = input.nextInt();
//		
//		Calendar kalendar = Calendar.getInstance();
//		int tahunSekarang = kalendar.get(kalendar.YEAR);
//		
//		System.out.println("Nama: "+nama);
//		System.out.println("Lama tahun bekerja: "+(tahunSekarang - tahunBekerja) );
		
		//input nilai 95.5
		//input predikat A
		
		double nilai;
		char predikat;
		

		
		System.out.print("input predikat: ");
		predikat = input.nextLine().charAt(0);
		
		System.out.print("input nilai: ");
		nilai = input.nextDouble();
		
		System.out.println("Nilai: "+nilai);
		System.out.println("Predikat: "+predikat);
		
		
		
	}
}
