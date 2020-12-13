package com.mudanyali;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * A sample program to explain types of arrays.
 * @author Furkan Mudanyali
 * @version 1.0
 * @since 2020-11-22
 */
public class ArrayTypes{
	public static void main(String[] args) {
		/*
		One-dimensional arrays
		These arrays store one type of elements with a single index.
		They can simply be used as a list to store simple types of data like
		the days in a week, types of fruit etc. 
		*/
		String[] weekDays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday",
			"Friday", "Saturday", "Sunday"};
		for(int i=0; i<weekDays.length; ++i){
			System.out.printf("Today is %s%n", weekDays[i]);
			if(i!=6) System.out.printf("One day has passed%n");
		}
		/*
		Multi-dimensional arrays
		These arrays store one type of elements with multiple index.
		They are mostly used for matrix operations in graphics calculations but
		can also be used to give the previous defined lists a more depth.
		*/
		String[][] foods = new String[][]{{"Vegetables","Lettuce","Onion","Potato"},{"Fruits","Orange","Apple","Strawberry"}};
		for(int i=0; i<foods.length; ++i){
			System.out.printf("%s consist of:%n",foods[i][0]);
			for(int k=1;k<foods[0].length; ++k){
				System.out.printf("%s%n",foods[i][k]);
			}
		}
		/*
		Array lists
		They are arrays but with a twist, their size can be changed during
		runtime unlike regular arrays. These can prove especially useful
		if we are prompting user to fill it.
		*/
		ArrayList<String> peopleYouKnow = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter people you know. 'exit' to stop.%n");
		String person = input.nextLine();
		while(!person.equals("exit")){
			peopleYouKnow.add(person);
			person = input.next();
		}
		System.out.printf("Apparently you know these people:%n");
		for(int i=0; i<peopleYouKnow.size(); ++i){
			System.out.printf("%s%n", peopleYouKnow.get(i));
		}
		input.close();
	}
}