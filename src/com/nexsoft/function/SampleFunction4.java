package com.nexsoft.function;



class BangunDatar{
	static double luasPersegi(double sisi) {
		System.out.println("luas persegi dari bangun datar");
		return sisi*sisi;
	}
	protected static double luasSegitiga(double alas, double tinggi) {
		System.out.println("luas segitiga dari bangun datar");
		return 0.5* alas*tinggi;
	}
	
	
}

class Mahasiswa{
	void identitas(String nama, String nim) {
		System.out.println("Nama: "+nama);
		System.out.println("NIM: "+nim);
	}
	
}

class Laptop{
	void spesifikasi(int proc, int memory, int hardDisk) {
		System.out.println("Processor: "+proc+"GHz");
		System.out.println("Memory: "+memory+"GB");
		System.out.println("Hard Disk: "+hardDisk+"GB");
	}
}

public class SampleFunction4 {
	public static void main(String[] args) {
		System.out.println(BangunDatar.luasPersegi(10));
		System.out.println(BangunDatar.luasSegitiga(10, 10));
		System.out.println("Minimal = "+Math.min(10, 0));
		
		Mahasiswa mahasiswa1 = new Mahasiswa();
		mahasiswa1.identitas("AAAAA", "202212121212");
		Mahasiswa mahasiswa2 = new Mahasiswa();
		mahasiswa2.identitas("BBBBB", "123123123123");
		
		//buat class laptop, method spesifikasi: proc, memory, harddisk
		//buat object laptop1, laptop2
		Laptop laptop1 = new Laptop();
		System.out.println("\nSpec laptop Acer:");
		laptop1.spesifikasi(160, 18, 500);
		
		
		Laptop laptop2 = new Laptop();
		System.out.println("\nSpec laptop Asus:");
		laptop2.spesifikasi(175, 24, 1000);
		
	}
	
	public void display() {
		System.out.println("display dari sample function 4");
	}
	
	protected static double luasSegitiga(double alas, double tinggi) {
		System.out.println("luas segitiga dari sample function 4");
		return 0.5* alas*tinggi;
	}
//	
	protected void ucapanSalam() {
		System.out.println("salam dari sample function 4");
	}
	
	
	
	
	
	
	
	
	
	
}
