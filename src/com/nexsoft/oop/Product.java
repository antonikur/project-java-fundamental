package com.nexsoft.oop;

public class Product {
	String nama = "Unknown", id;
	double harga;
	
	public Product(String id, String nama, double harga) {
		this.id = id;
		this.nama = nama;
		setHarga(harga);
		
	}
	
	public String getId() {
		return id;
	}
	
	public String getNama() {
		return nama;
	}
	
	public double getHarga() {
		return harga;
	}
	
	public void setHarga(double harga) {
		if(harga < 0) {
			System.out.println("ada kesalahan");
		}
		this.harga = harga;
	}
	
	public void printProduct() {
		System.out.printf("ID: %s, Nama Produk: %s, Harga: %.2f\n", id, nama, harga);
	}
}
