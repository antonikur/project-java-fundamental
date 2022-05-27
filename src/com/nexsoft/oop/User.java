package com.nexsoft.oop;

public class User {
	String id;
	String nama;
	String kota;
	
	public User(String id, String nama, String kota) {
		this.id = id;
		this.nama = nama;
		this.kota = kota;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getKota() {
		return kota;
	}
	
	public void printUser() {
		System.out.println("User");
		System.out.println("========");
		System.out.println("ID: "+getId());
		System.out.println("Nama: "+getNama());
		System.out.println("Kota: "+getKota());
	}
	
}
