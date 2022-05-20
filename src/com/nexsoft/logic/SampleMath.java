package com.nexsoft.logic;

import java.util.Random;

public class SampleMath {
	public static void main(String[] args) {
		
		double rand = Math.random();
		System.out.println(rand);
		
		int max = 10;
		int min = 5;
		int range = max - min + 1;//ditambah 1 karena jika di jadikan int maka pecahan akan dibulatkan ke bawah
		
		for(int i=0; i<10; i++) {
			int randInt = (int) (Math.random()*range)+min;
			System.out.println(randInt);
		}
		
		System.out.println();

		double nilai1 = Math.sqrt(9);
		System.out.println(nilai1);
		double nilai2 = Math.pow(3, 4);
		System.out.println(nilai2);
		System.out.println();
		Random random = new Random();
		for(int i=0; i<10; i++) {
			int randomNumber = random.nextInt(20);
			System.out.println(randomNumber);
		}
		System.out.println("random using random util:");
		for(int i=0; i<10; i++) {
			int randomNumber = random.nextInt(max + 1 - min) + min;
			System.out.println(randomNumber);
		}
		
		
		
		
	}
}
