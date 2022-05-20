package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping5 {
	public static void main(String[] args) {
//		int i = 0, 
//			sum = 0;
//		
//		while(i < 5) {
//			i++;
//			if(i == 2) continue;
//			sum += i;
//		}
//		System.out.println(sum);
		
		for(int i=0; i<10; i++) {
			if(i==1) {
				continue;
			}
			System.out.println(i);
		}
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Close ya/tidak?");
			String jawab = input.nextLine();
			if(jawab.equalsIgnoreCase("ya"))
				break;
		} System.out.println("terima kasih");
		
		
		//gunakan if dan break ketika input angka 0
		while(true) {
			System.out.println("input angka: ");
			int angka = input.nextInt();
			if(angka == 0)
				break;
		} System.out.println("keluar");
	}
}
