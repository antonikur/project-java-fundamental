
public class HelloWorld {
	public static void main(String[]args) {
		System.out.println("Hello World");
		System.out.println("");
		
		int size = 4;
        
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
	}
}
