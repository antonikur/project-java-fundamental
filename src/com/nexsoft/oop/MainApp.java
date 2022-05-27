package com.nexsoft.oop;

public class MainApp {
	public static void main(String[] args) {
//		Product product = new Product("B001", "Monitor", 1000000);
//		product.print();
//		System.out.println(product);
		
		User user = new User("U001", "Nama Konsumen", "Cirebon");
		Cart cart = new Cart(user);
		cart.add(new Product("B001", "Monitor", 1000000));
		cart.add(new Product("B002", "SSD", 500000));
		cart.add(new Product("B003", "Mouse", 70000));
		System.out.println("Total: "+cart.getTotal());
		
		user.printUser();
		System.out.println();
		cart.printAllProduct();
	}
}
