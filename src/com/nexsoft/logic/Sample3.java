package com.nexsoft.logic;

public class Sample3 {
	public static void main(String[] args) {
		//substring
		String teks1 = "nexsoft juara";
		System.out.println(teks1.substring(12, 13));
		System.out.println(teks1.substring(1, 4));
		System.out.println(teks1.substring(4, 7));
		String nim = "20180102003";
		/* 4 digit pertama tahun masuk
		 * 2 digit fakultas
		 * 2 digit prodi
		 * 3 digit nourut
		 */
		String 	tahunMasuk = nim.substring(0,4),
				fakultas = nim.substring(4, 6),
				prodi = nim.substring(6, 8),
				noUrut = nim.substring(8, 11);
		System.out.println("Tahun Masuk "+tahunMasuk);
		System.out.println("Fakultas "+fakultas);
		System.out.println("Prodi "+prodi);
		System.out.println("No Urut "+noUrut);
		
		System.out.println(teks1.contains("os"));
		
		String message = "Error: Username Password Invalid";
		if(message.contains("Invalid")) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
		
		String nama1 = "Dono";
		String nama2 = "Doyok";
		System.out.println("Dono - Doyok : "+nama1.compareTo(nama2));
		System.out.println("Doyok - Dono : "+nama2.compareTo(nama1));
		
		
	}
}
