package com.nexsoft.decision;

import java.util.Calendar;
import java.util.Scanner;

public class SampleDecision2 {
	//nilai A = 90 - 100
	//nilai B = 85 - 89
	//nilai C = 75 - 84
	//nilai D = < 74
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.print("Input grade: ");
//		int nilai = input.nextInt();
//		
//		if(nilai < 0 || nilai > 100) {
//			System.out.println("grade tidak valid!");
//		} else if(nilai >= 90) { 
//			System.out.println("grade A");
//		} else if(nilai >= 85) {
//			System.out.println("grade B");
//		} else if(nilai >= 75) {
//			System.out.println("grade C");
//		} else {
//			System.out.println("grade D");
//		}
		
		
		Calendar time = Calendar.getInstance();
		int hour = time.get(Calendar.HOUR_OF_DAY);
		
		/* > 0 dan < 12 : selamat pagi
		 * >= 12 dan < 16 : selamat siang
		 * >= 16 dan <= 18 : selamat sore
		 * > 18 dan < 23 : selamat malam
		 */
		
//		hour = 18;
		
		if(hour < 12) {
			System.out.println("Selamat Pagi");
		} else if(hour < 16) {
			System.out.println("Selamat Siang");
		} else if(hour < 19) {
			System.out.println("Selamat Sore");
		} else {
			System.out.println("Selamat Malam");
		}
		
		System.out.println("Sekarang jam "+hour);
		
		/*tidak melanggar, boleh melewati jalur ini, jika plat nomor ganjil, tanggal ganjil
		 *tidak melanggar, boleh melewati jalur ini, jika plat nomor genap, tanggal genap
		 * */
//		System.out.print("Plat Nomor: ");
//		int platNomor = input.nextInt();
//		input.nextLine();
//		
//		System.out.print("Tanggal: ");
//		int tanggal;
//		// = input.nextInt();
////		input.nextLine();
//		
//		tanggal = time.DAY_OF_MONTH;
//		System.out.println(tanggal);
//		
//		if(platNomor % 2 == 0 && tanggal % 2 == 0 || 
//		   platNomor % 2 == 1 && tanggal % 2 == 1) {
//			System.out.println("Plat dan tanggal sesuai genap/ganjil, boleh lewat");
//		} else {
//			System.out.println("Plat dan tanggal tidak sesuai genap/ganjil, tidak boleh lewat");
//		}
		
		// donor darah
		// usia > 17 dan < 50
		// berat badan > 55
		int usia = 51, 
			beratBadan = 54;
		
		if(usia > 17 && usia < 50 && beratBadan > 55) {
			System.out.print("Boleh melakukan donor darah, ");
			
		} else {
			System.out.print("tidak memenuhi syarat untuk donor darah, karena ");
			if(usia <= 17) {
				System.out.print("tidak cukup umur, ");
			} else {
				System.out.print("terlalu tua, ");
			} if (beratBadan <= 55) {
				System.out.println("berat badan tidak mencukupi");
			}
		}
		
		/*jumlah menginap = ... malam
		 * kelas 1 = 100rb/malam, 2 = 50rb/malam
		 * dokter A = 1 jt, B = 2 jt
		 * total bayar
		 */
		
		int totalBayar = 0,
			jumlahNginap,
			kelas;
		char dokter;
		
		System.out.print("Input nginap: ");
		jumlahNginap = input.nextInt();
		input.nextLine();
		
		System.out.print("Input dokter A atau B: ");
		dokter = input.nextLine().charAt(0);
		
		System.out.print("Input kelas: ");
		kelas = input.nextInt();
		input.nextLine();
		
		if(dokter == 'A' || dokter == 'a') {
			totalBayar += 1000000;
		} else if (dokter == 'B' || dokter == 'b') {
			totalBayar += 2000000;
		} else {
			System.out.println("dokter tidak terpilih");
		}
		if(kelas == 1) {
			totalBayar += 100000 * jumlahNginap;
		} else if (kelas == 2) {
			totalBayar += 50000 * jumlahNginap;
		} else {
			System.out.println("kelas tidak terpilih");
		}
		
		System.out.println("Total Bayar: "+totalBayar);
		
		
		
		
	}
}
