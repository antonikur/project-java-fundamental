package com.nexsoft.array;

public class Sample4 {
	public static void main(String[] args) {
		
		int data[] = {95, 100, 80, 90, 85};
		int key = 90;
		
		//linear
		for(int i=0; i<data.length; i++) {
			if(data[i] == key) {
				System.out.println(key+" berada di index "+ (i+1));
			}
		}
		
		//binary
		int mid = data.length/2;
		
		for(int i=0; i<data.length; i++) {
			
		}
		
		
	}
}
