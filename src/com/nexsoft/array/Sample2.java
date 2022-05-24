package com.nexsoft.array;

public class Sample2 {
	public static void main(String[] args) {
		int data [][] = new int [3][2];
		data[0][0] = 1;
		data[0][1] = 2;
		data[1][0] = 3;
		data[1][1] = 4;
		data[2][0] = 5;
		data[2][1] = 6;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		
		int angka[][] = {{1,2},{3,4},{5,6}};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(angka[i][j]+" ");
			}
			System.out.println();
		}
		
		int angkaku[][] = {{1,2,3,4},{5,6,7},{8}};
		System.out.println(angkaku[1][2]);//baris ke 2, kolom ke 3
		System.out.println(angkaku[0][3]);//baris ke 1, kolom ke 4
		System.out.println(angkaku[2][0]);
		
		
		
	}
}
