package com.nexsoft.logic;

public class Sample1 {
	public static void main(String[] args) {
		/* + - / * %
		 * +=
		 * < >
		 * && || !
		 * & |
		 * ? :
		 * */
		
		//|| vs |
		int a = 10, //0000 1010
			b = 5,  //0000 0101
			c = 20,
			d = 0;
//		System.out.println(a>b || a<c);
//		System.out.println(a>b | a<c);
//		System.out.println();
//		System.out.println(a>b || a++<c);
//		System.out.println(a);
//		System.out.println(a>b | a++<c);
//		System.out.println(a);
		
		//bitwise logic
		//1 = true
		//0 = false
		
		d = a & b;
		System.out.println("a & b: "+d);
		// a = 1010
		// b = 0101
		// &   ---- and (keduanya harus true untuk true)
		// d = 0000
		// 0000 = 0
		d = a | b;
		System.out.println("a | b: "+d);
		// a = 1010
		// b = 0101
		// |   ---- or (salah satu harus true untuk true)
		// d = 1111
		// 1111 = 15
		
		
		
	}
}
