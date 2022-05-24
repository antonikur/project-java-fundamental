package com.nexsoft.array;

public class Sample5 {
	public static void main(String[] args) {
		
		int insertAt = 5;
		int data1[] = {9,10,11,12,13,14};
		int data2[] = {7,8};
		int data3[] = new int [data1.length+data2.length];
		
		for (int i=0; i<insertAt; i++) {//0-2
			data3[i] = data1[i];//data3[0] = data1[2]
			System.out.print(data3[i]+" ");
		}
		
		for (int i=insertAt; i<insertAt+data2.length; i++) {//3-4
			data3[i] = data2[i-insertAt];//data3[3] = data2[0]
			System.out.print(data3[i]+" ");
		}
		
		for(int i=insertAt+data2.length; i<data3.length; i++) {//5-7
			data3[i] = data1[i-data2.length];//data3[5] = data1[3
			System.out.print(data3[i]+" ");
		}
		
		//1,2,3,7,8,4,5,6
		
		
		
		
	}
}