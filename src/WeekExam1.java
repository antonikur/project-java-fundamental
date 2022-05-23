import java.util.Scanner;

public class WeekExam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// isi disini no 1
        for(int i = 1; i <= 2; i++) {
			double angka = scan.nextDouble();
			scan.nextLine();
			System.out.println("Harga "+i+": "+((int)angka));
		}
        
        //isi disini no 2
        int angkaNo2 = scan.nextInt();
        angkaNo2 += 3;
        System.out.println(angkaNo2);
        System.out.println(angkaNo2 * 3);
        
	     // isi disini no 3
        String kalima = scan.nextLine();
		int pertama = scan.nextInt();
		int kedua = scan.nextInt();
		
		System.out.println(kalima.substring(pertama, kedua));
    		
		
		// isi disini no 4
	    int angka = scan.nextInt();
	    String kalimat = "";
        for(int i = 0; i<angka; i++){
            for(int j=angka; j>0; j--){
                if(j%3==0){
                    kalimat += "*";
                } else {
                    kalimat += j;
                }
            }
            
        }
        for(int i = 0; i<angka; i++){
            System.out.println(kalimat.substring(0, angka-i));
        }
	        
	        //isi disini no 5
	        int size = scan.nextInt();
	        
	        int bintang = 1;
			for(int i=size; i>0; i--) {
				for(int blank=i; blank > 1; blank--) {
					System.out.print(" ");
				}
				
				for(int j=0; j<bintang; j++) {
					System.out.print("*");
				}
				bintang += 2;
				System.out.println();
			}
			
			// isi disini no 6
		    int angka1 = scan.nextInt();
		    int angka2 = scan.nextInt();
		    
		    for(int i=1; i<=angka2; i++){
		        System.out.println(angka1+" x "+i+" = "+ (angka1 * i));
		    }
		    
		    // isi disini no 7
		    int nomor1 = scan.nextInt();
		    int	nomor2 = scan.nextInt();
		    double nomor3 = 1;
		    for(int i=1; i<=nomor2; i++){
		    	nomor3 = nomor3 * nomor1;
		        System.out.print(nomor3+" ");
		    }
    		    
		 // isi disini no 8
		    int input = scan.nextInt();
		    int flag=1;
		    for(int i = 1; i<input; i++){
		        for(int j=0; j<input; j++){
		            if(j==0){
		                System.out.println(flag);
		                flag++;
		            } else {
		                System.out.println("Text print");
		            }
		        }
		    }
    		    
    		 // isi disini no 9
    		    int isi1 = scan.nextInt();
    		    int isi2 = scan.nextInt();
    		    int isi3 = scan.nextInt();
    		    
    		    System.out.println("Deret aritmatika");
    		    while(isi1 < isi2){
    		        System.out.print(isi1+" ");
    		        isi1 += isi3;
    		    }
    		    
    		// isi disini no10
			//salam 150
			//sang 85
			//juara 70
		    String kalimat1 = scan.nextLine();
		    String kalimat2 = scan.nextLine();
		    String kalimat3 = scan.nextLine();
//		    String kalimat1 = "salam 150";
//		    String kalimat2 = "sang 85";
//		    String kalimat3 = "juara 70";    
		    
		    int kalimat12 = Integer.parseInt(kalimat1.substring(kalimat1.indexOf(' '), kalimat1.length()).trim());
		    int kalimat22 = Integer.parseInt(kalimat2.substring(kalimat2.indexOf(' '), kalimat2.length()).trim());
		    int kalimat32 = Integer.parseInt(kalimat3.substring(kalimat3.indexOf(' '), kalimat3.length()).trim());
		    
		    kalimat1 = kalimat1.substring(0, kalimat1.indexOf(' '));
		    kalimat2 = kalimat2.substring(0, kalimat2.indexOf(' '));
		    kalimat3 = kalimat3.substring(0, kalimat3.indexOf(' '));
		    
		    System.out.println("==============================");
		    System.out.printf("%-15s%03d\n",kalimat1, kalimat12);
		    System.out.printf("%-15s%03d\n",kalimat2, kalimat22);
		    System.out.printf("%-15s%03d\n",kalimat3, kalimat32);
		    System.out.println("==============================");
	}
	
	
}

