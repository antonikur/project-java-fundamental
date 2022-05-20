package com.nexsoft.day1;

public class Rectangle {
	int	size = 0;
		Rectangle rectangle;
	
	
	Rectangle(int x, int y, int height, int width){
		size = x+y+height+width;
		
	}
	
	public Rectangle setSize(int height, int width) {

		size = height + width;
		rectangle = new Rectangle(0, 0, height, width);
		return rectangle;
		
	}
	public int getSize() {
		
		return size;
	}
}
