package com.nexsoft.function;

public class SampleString {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Salam");
//		sb.append(" sapa");
//		sb.insert(3, " Sapa");
//		sb.replace(2, 4, " sapa");
//		sb.delete(2,4);
		sb.reverse();
		System.out.println(sb);
		
		//var text1, text2, text3 = "kasur rusak" : constructor
		//reverse
		//delete int start, end
		
		int start = 1, end = 3;
		
		StringBuffer sb1 = new StringBuffer("text1");
		sb1.reverse();
		sb1.delete(start, end);
		System.out.println(sb1);
		
		sb1 = new StringBuffer("text2");
		sb1.reverse();
		sb1.delete(start, end);
		System.out.println(sb1);
		
		sb1 = new StringBuffer("Kasur rusak");
		sb1.reverse();
		sb1.delete(start, end);
		System.out.println(sb1);
		

		
		
	}
}
