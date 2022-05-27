import java.util.Scanner;

public class TaskDay6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 // Lengkapi no 1
	    String nama = scan.nextLine();
	    String profesi = scan.nextLine();
	    int salary = scan.nextInt();
	    new TaskDay6().karyawan(nama, profesi, salary);
	    
	    //Lengkapi no 2
	    String siswa1 = scan.nextLine();
	    String nim1 = scan.nextLine();
	    TaskDay6 mahasiswa1 = new TaskDay6();
	    mahasiswa1.tampilkan(siswa1, nim1);
	    
	    // String siswa2 = scan.nextLine();
	    // String nim2 = scan.nextLine();
	    // Main mahasiswa2 = new Main();
	    // mahasiswa2.tampilkan(siswa2, nim2);
	    
	    
	    //no 3
	     perkalian(4, 6);
	     pengurangan(10, 5);
	     
	  // lengkapi no 4
	     int panjang = scan.nextInt();
	     int lebar = scan.nextInt();
	     int tinggi = scan.nextInt();
	     volumeBalok(panjang, lebar, tinggi);
	}
	//no 1
	void karyawan(String nama, String profesi, int salary) {
	    // Lengkap
	    System.out.println("Nama: "+nama.toUpperCase());
	    System.out.println("Profesi: "+profesi.toUpperCase());
	    System.out.println("Salary: "+salary);
	  }
	
	//ini fungsi parameter no 2
	  void tampilkan(String nama, String nim){
	      System.out.println("Nama: "+nama.toUpperCase());
	      System.out.println("NIM: "+nim);
	      String tahun = nim.substring(0, 4);
	      System.out.println("Tahun Masuk: "+tahun);
	  }
	  
	  // no 3
	  static void perkalian(int a, int b) { //method parameter
		    System.out.println("Perkalian A * B = "+(a*b));
		  }
		  
	  static void pengurangan(int a, int b) { //method parameter
	      System.out.println("Pengurangan A - B = "+(a-b));
	  }
	  
	//ini fungsi parameter no 4
	    static void volumeBalok(int panjang, int lebar, int tinggi){
	        System.out.println("Volume Balok: "+(panjang * lebar * tinggi)+" meter kubik");
	    }
}
