package com.nexsoft.function;

public class SampleFunction2 {
	public static void main(String[] args) {
		double sisi = 10;
		System.out.println(luasKotak(sisi));
		System.out.println(luasKubus(sisi));
		
		System.out.println("persen pajak nya adalah: "+persenPajak(7000000));
		System.out.println("Pajak tahunan nya adalah:"+kalkulasiPajakTahunan(7000000));
		
		//gaji bersih
		System.out.printf("Gaji bersih: %.0f\n", gajiBersih(7000000));
		System.out.println("Gaji bersih: "+ String.format("%.0f", gajiBersih(7000000)));
		
		
	}
	
	static double luasKotak(double sisi) {
		double luas = sisi*sisi;
		return luas;
	}
	
	static double luasKubus(double sisi) {
		return 6*luasKotak(sisi);	
	}
	
	//fungsi1: kalkulasi pajak penghasilan 1 tahun
	//fungsi2: kondisi penghasilan per bulan > 7jt = 10, kalau dibawah < 7jt = 0
	
	static double kalkulasiPajakTahunan(double penghasilan) {
		double pajak = persenPajak(penghasilan);
		double hasil = (penghasilan * 12) * (pajak/100);
		return hasil;
	}
	
	static double persenPajak(double penghasilan) {
		double pajak = 0;
		if(penghasilan >= 7000000) {
			pajak = 10;
		} else {
			pajak = 0;
		}
		return pajak;
	}
	
	//gaji bersih = total penghasilan tahunan - kalkulasi pajak
	static double gajiBersih(double penghasilan) {
		double gajiBersih = (penghasilan * 12) - kalkulasiPajakTahunan(penghasilan);
		return gajiBersih;
	}
	
}
