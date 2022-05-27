package com.nexsoft.function;

public class SampleFunction3 {
	
	//var global
	static int usia = 50;
	static String jenisKelamin = "Laki-laki";
	int angka = 90;
	
	public static void main(String[] args) {
		//var lokal
		int usia = 60;
		
		System.out.println("Usia lokal = "+ usia);//var lokal
		System.out.println("Usia static global = "+ SampleFunction3.usia);//static var global in static method
		System.out.println("Angka non static global : "+new SampleFunction3().angka);//non static var global in static method
		System.out.println("Jenis Kelamin static global  = "+jenisKelamin);//static var global in static method
		
		System.out.println("Method");
		identitas();
		int sisi = 10;
		System.out.println(new SampleFunction3().luasPersegi(sisi));
		//////////////////////////////////////////////////////////
		SampleFunction4 obj = new SampleFunction4();
		obj.ucapanSalam();
	}
	
	static void identitas() {
		System.out.println("Usia static global = "+usia);//static var global in non static method
		System.out.println("Jenis Kelamin = "+jenisKelamin);//static var global in non static method
	}
	
	double luasPersegi(double sisi) {
		return sisi*sisi;
	}
}
