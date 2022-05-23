package com.nexsoft.looping;

public class SampleLooping3 {
	public static void main(String[] args) {
		int size = 10;
		
		for(int i = 0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=0; i<size; i++) {
			for(int blank=0; blank < i; blank++) {
				System.out.print(" ");
			}
			for(int j=0; j<size-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//		System.out.println();
		
		
		for(int i=size; i>0; i--) {
			for(int blank=i; blank > 1; blank--) {
				System.out.print(" ");
			}
			
			for(int j=size; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=size; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=2; i<=size; i++) {
			for(int j=2; j<=size-(i-2); j++) {
				if(j % 2 == 0) {
					System.out.print(j+" ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		//tampilkan bilangan yang habis di bagi 3 atau 5
		//range 20-200
		//berapa total
		int jumlahBilangan35 = 0,
			range = 20;
		for(int i = 1; i <= range; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.print(i+" ");
				jumlahBilangan35+=i;
			} 
		}
		System.out.println();
		System.out.println("Jumlah bilangan yang bisa dibagi 3 atau 5 adalah: "+jumlahBilangan35);
		
		System.out.println();
		
		int bintang = 1;
		for(int i=size; i>0; i--) {
			for(int blank=i; blank > 1; blank--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<bintang; j++) {
				System.out.print("*");
			}
			bintang += 2;
			System.out.println();
		}
		
		
	}
}
