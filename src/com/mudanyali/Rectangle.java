package com.mudanyali;
/**
 * A simple rectange class. Has 3 functions, 2 of which should be
 * self-explanatory, and the last one is called when we try to
 * print out the object itself, so we don't really call it directly.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2021-01-02
 */
public class Rectangle {
	private int length;
	private int width;
	// Constructors
	Rectangle(){
		length = 0;
		width = 0;
	}
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	// Simple functions.
	public boolean isSquare(){
		return length==width;
	}
	public int getArea(){
		return length*width;
	}
	// Called when we try to call the object directly.
	// Returns a formatted string that carries the object information.
	public String toString(){
		return String.format("A new object defined.%n"+
			"Length: %d%nWidth: %d%nArea: %d%nThis object is%s a square.%n",
			length, width, getArea(), isSquare() ? "": " not");
	}
}
