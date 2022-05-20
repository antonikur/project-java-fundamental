package com.nexsoft.looping;

public class SampleLooping {
	public static void main(String[] args) {
		
		for(int i=1; i <= 10; i++) {
			System.out.println("Nexsoft");
		}
		
		int a = 0;
		System.out.println(a+=2);
		System.out.println(a=+2);
		System.out.println(a+=2);
		
		for(int i=1; i<=10; i += 2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int errorLogin = 3;
		for(int i=1; i <= errorLogin; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		int nilai = 10;
		System.out.println(nilai--);
		System.out.println(--nilai);
		
		
		String motor[] = {"Suzuki", "Honda", "Yamaha"};
		for(String i : motor) {
			System.out.println(i);
		}

		
		
	}
}
