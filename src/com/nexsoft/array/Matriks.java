package com.nexsoft.array;

public class Matriks {
	public static void main(String[] args) {
		
		int [][] array1 = {{1,2,3},
						   {4,5,6}};
		int [][] array2 = {{7,8,9},
						   {10,11,12}};
		
		int [][] matriks = new int [2][3];
		
		for(int i=0; i<matriks.length; i++) {
			for(int j=0; j<matriks[i].length; j++) {
				matriks[i][j] = array1[i][j] + array2[i][j]; 
				System.out.print(matriks[i][j]+", ");
			}
			System.out.println();
		}
		
		//transpose
		System.out.println("Array 1 di transpose:");
		
		int [][] arrayTP1 = new int [array1[0].length][array1.length];
		
		/* array1
		 *   i i i
		 * j 1 2 3
		 * j 4 5 6
		 * */
		
		/* arrayTP1
		 *   j j
		 * i 1 4
		 * i 2 5
		 * i 3 6
		 * */
		for(int i=0; i<arrayTP1.length; i++) {
			for(int j=0; j<arrayTP1[i].length; j++) {
				arrayTP1[i][j] = array1[j][i];
				
				System.out.print(arrayTP1[i][j]+", ");
			}
			System.out.println();
		}
		
		
	}
}
