package com.nexsoft.decision;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class SampleDecision4 {
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
		System.out.printf("%-15s%-15s%03d", a, b, x);
		
	}
}
