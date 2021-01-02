package com.mudanyali;
/**
 * Really simple test class for rectangle class.
 * Just create 3 rectangles, and print their information.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2021-01-02
 */
public class RectangleTest {
	public static void main(String[] args) {
		// Create 3 rectangles.
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(15,15);
		Rectangle r3 = new Rectangle(30,45);
		// Calling them just by their names returns
		// the toString() function.
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}
