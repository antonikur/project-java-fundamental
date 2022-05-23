import java.util.Scanner;

public class WeekExam1 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
		
//		for(int i = 1; i <= 2; i++) {
//			double angka = scan.nextInt();
//			System.out.println("Harga "+i+": "+((int)angka));
//		}
//		
//		int angka = scan.nextInt();
//		for(int i=0; i<5; i++) {
//			System.out.println(angka+=3);
//		}
//		
//		String kalima = scan.nextLine();
//		int pertama = scan.nextInt();
//		int kedua = scan.nextInt();
//		
//		System.out.println(kalima.substring(pertama, kedua));
		
		
		Scanner scan = new Scanner(System.in);
	    // isi disini
	    int angka = scan.nextInt();
	        for(int i = 0; i<angka; i++){
	            for(int j=angka; j>0; j++){
	                if(j%3==0){
	                    System.out.print("*");
	                } else {
	                    System.out.print(j);
	                }
	            }
	            System.out.println();
	        }
	}
	
	
}

