package com.nexsoft.decision;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

import com.nexsoft.function.SampleFunction4;

public class SampleDecision4 extends SampleFunction4{
	
//	public void testProtected() {
//		super.ucapanSalam();
//		super.luasSegitiga(10, 10);
//	}
	
	public static void main(String[] args) {
		double total = 100000;
		System.out.println(total);
		
		DecimalFormat formatRupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols simbolRupiah = new DecimalFormatSymbols();
		
		simbolRupiah.setCurrencySymbol("Rp. ");
		simbolRupiah.setMonetaryDecimalSeparator(',');
//		simbolRupiah.setGroupingSeparator('.');
		
		//indonesia (rupiah)
		formatRupiah.setDecimalFormatSymbols(simbolRupiah);
		System.out.println(formatRupiah.format(total));
		
		//US (dollar)
		NumberFormat formatDolar = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(formatDolar.format(total));
		
		//nihon
		NumberFormat formatJepang = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
		System.out.println(formatJepang.format(total));
		
		if(total >= 100000) {
			System.out.println("Mendapatkan kupon");
		} else {
			System.out.println("Belum mendapatkan kupon");
		}
		
		int x = 1;
		String a = "Nexsoft Juara", b = "BootCamp";
		System.out.printf("%15s%15s%03d", a, b, x);
		System.out.println();
		System.out.printf("%-15s%-15s%03d\n", a, b, x);
		/////////////////////////////////////////////////////////////////
//		new SampleDecision4().testProtected();
		SampleDecision4 obj = new SampleDecision4();
		obj.luasSegitiga(10, 10);
		obj.display();
		obj.ucapanSalam();
		//jika method display() di class SampleDecision4 memiliki modifier default, maka method tersebut tidak dapat di akses
		//method perlu di beri public access modifier agar dapat di akses
		//method juga dapat di akses dengan protected access modifier,
	}
	
}
