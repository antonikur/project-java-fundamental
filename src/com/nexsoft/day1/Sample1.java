package com.nexsoft.day1;

public class Sample1 {
	public static void main(String[] args) {
		byte umur = 127, perkalian = 5*2;
		double saldo = 100000.77;
		char predikat = 'S';
		int umurInt = umur;
		
		boolean perbandingan = 5 > 10;
		
		String nama = "Koswara";
		
		System.out.println("Umur = " + umur);
		System.out.println("Perkalian 5*2 = " + perkalian);
		System.out.println("Saldo = " + saldo);
		System.out.println("umur dari byte ke int = "+umurInt);
		
		System.out.println("\n\t"+predikat);
		
		System.out.println(perbandingan);
		System.out.println(nama.toUpperCase());
		
		
		int angkaInt = 200;
		byte angkaByte = (byte) angkaInt;
		
		System.out.println(angkaByte);
		
		
	}
}
