package com.nexsoft.array;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		
		String motor1 = "Honda";
		String motor2 = "Suzuki";
		String motor3 = "Yamaha";
		
		String motor[] = new String[3];
		motor[0] = "Honda";
		motor[1] = "Suzuki";
		motor[2] = "Yamaha";
		
//		motor[] = new String[9];
 		
		System.out.println(motor);
		System.out.println(motor[1]);
		
		for(int i = 1; i < 3; i++) {
			System.out.println(motor[i]);
		}
		
		String mobil[] = {"Toyota", "Honda", "Mitsubishi"};
		System.out.println(mobil[2]);
		
		for(int i=0; i<mobil.length; i++) {
			System.out.println(mobil[i]);
		}
		
		int [] data = {1,2,3,4};
		System.out.println(data[2]);
		
		for(String i : mobil) {
			System.out.println(i);
		}
		
		
		int [][] angka2D = {{1,2},
						    {3,4,9,10},
						    {5,6},
						    {7,8,11,13,15,19}};
		
		System.out.println("angka 2D length: "+angka2D.length);
		for(int i=0; i<angka2D.length; i++) {
			for(int j=0; j<angka2D[i].length; j++) {
				System.out.print(angka2D[i][j]+", ");
			}
			System.out.println();
		}
		
		System.out.println("==============");
		for(int i:angka2D[0]) {
			System.out.print(i+", ");
		}
		System.out.println("\n==============");
		
		Scanner scan = new Scanner(System.in);
		
		int batas = 5;
		//nama buah dan harga
		String buah[] = new String [batas];
		int hargaBuah[] = new int [batas];
		for(int i=0; i<buah.length; i++) {
			System.out.print("Input nama buah ke "+(i+1)+": ");
			buah[i] = scan.nextLine();
			System.out.print("Input harga buah ke "+(i+1)+": ");
			hargaBuah[i] = scan.nextInt();
			scan.nextLine();
			
		}
		System.out.println("==================");
		System.out.printf("%-15s %s\n", "Nama Buah","Harga");
		for(int i=0; i<buah.length; i++) {
			System.out.printf("%-15s Rp. %d\n", buah[i], hargaBuah[i]);
//			System.out.println("Buah ke " +(i+1)+ " adalah "+buah[i]+", dengan harga "+hargaBuah[i]);
		}
	}
}
