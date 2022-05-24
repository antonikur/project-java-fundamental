package com.nexsoft.array;

public class Sample3 {
	public static void main(String[] args) {
		int data[] = {95, 100, 80, 90, 85};
		int max = data[0];
		int min = data[0];
		for(int i=0; i<data.length; i++) {
			if(max<data[i]) {
				max=data[i];
			}
		}
		System.out.println("max: "+max);
		for(int i=0; i<data.length;i++) {
			if(min>data[i]) {
				min=data[i];
			}
		}
		System.out.println("min: "+min);
		
		System.out.println("before sort:");
		for(int i : data) {
			System.out.print(i+", ");
		}
		
		System.out.println("\nafter sort:");
		
		//=======================================selection sort
//		for(int i=0; i<data.length; i++) {
//			int index = i;
//			for(int j=i+1; j<data.length; j++) {
//				if(data[j]>data[index]) {//100>95
//					index = j;
//				}
//			}
//			int temp = data[index];//100
//			data[index] = data[i];//100 position replaced by 95
//			data [i]=temp;//95 position replaced by 100 //100,95,80,90,85
//		}
		//=========================================================
		
		//========================================bubble sort
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data.length; j++) {
				if(data[i]>data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j]=temp;
				}
			}
		}
		//===========================================
		
		for(int i : data) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
}
