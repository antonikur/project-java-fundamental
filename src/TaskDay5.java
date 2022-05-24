import java.util.Scanner;

public class TaskDay5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// isi disini no 1
	    String kalimat = "";
	    for(int i = 0; i<3; i++){
	        String kata = scan.nextLine();
	        kalimat = kalimat + kata + " ";
	    }
	    System.out.println(kalimat);
		
		// isi disini no 2
	    int [] angka = new int[5];
	    
	    for(int i=0; i<angka.length; i++){
	        angka[i] = scan.nextInt();
	    }
	    System.out.println(angka[2]);
		
		// isi disini no 3
	    String [] murid = {"Dewabrata", "Ahmad Aqil", "Hanif", "Koswara", "Paulus", "Yudha", "Dewi", "Desi"};

	     
	    for(int i=0; i<murid.length; i++){
	        if(murid[i].equalsIgnoreCase("Koswara")){
	            System.out.println("Jumlah Murid : "+murid.length+" Dan yang di panggil : "+murid[i]);
	        }
	    }
	    
	 // isi disini no 4
	    
	    String [] siswa = {"Dewabrata", "Ahmad Aqil", "Hanif", "Koswara", "Paulus"};
	    
	    for(int i=0; i<siswa.length; i++){
	        if(siswa[i].equalsIgnoreCase("Ahmad Aqil")){
	            System.out.println(siswa[i]);
	        }
	    }
	}
}
