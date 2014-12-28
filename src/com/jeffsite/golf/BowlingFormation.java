package com.jeffsite.golf;
import java.util.ArrayList;
import java.util.Scanner;

public class BowlingFormation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter the pins separated by spaces.");
		Scanner input2 = new Scanner(input.nextLine());
		while(input2.hasNextInt()) {
			list.add(input2.nextInt());
		}
		
		printPins(buildPins(list));
		
	}
	
	public static ArrayList<Character> buildPins(ArrayList<Integer> list) {
		ArrayList<Character> pins = new ArrayList<Character>();
		for (int i = 1; i <= 10; i++) {
			if (list.contains(i)) {
				pins.add('O');
			}
			else {
				pins.add('.');
			}
		}
		
		return pins;
	}
	
	public static void printPins(ArrayList<Character> list) {
		final int MAX_PINS = 4;
		int count = 7;
		for (int pins = MAX_PINS; pins > 0; pins--) {
			for (int spaces = MAX_PINS; spaces > pins; spaces--) {
				System.out.print(" ");
			}
			for (int print = 0; print < pins; print++) {
				System.out.print(list.get(count - 1) + " ");
				count++;
			}
			switch (pins) {
				case (4) :
					count = 4;
					break;
				case (3) :
					count = 2;
					break;
				case (2) :
					count = 1;
					break;
			}
			System.out.println();
			
		}
	}
	
	

}
