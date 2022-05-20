package com.nexsoft.day1;

public class Sample2 {
	public static void main(String[] args) {
		int i = 123;
		long j = i;
		
		char huruf = 'W';
		int angka = huruf;
		
		float data = 123.4f;
		double data2 = data;
		
		System.out.println(j);
		System.out.println(angka);
		System.out.println(data);
		System.out.println(data2);
		
		float jarak = 100;
		float waktu = 10;
		
		float kecepatan = jarak/waktu;
		double skala = kecepatan;
		
		int bil = 10;
		double bil2 = bil;
		System.out.println(bil2);
		System.out.println(skala);
		
		//=====================
		Rectangle kotak = new Rectangle(0, 0, 20, 30);
		Rectangle duplikatKotak = kotak;
		duplikatKotak.setSize(80, 90);
		
		System.out.println(kotak.getSize());
		System.out.println(duplikatKotak.getSize());
		
		
		
	}
}
