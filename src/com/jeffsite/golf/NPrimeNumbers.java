package com.jeffsite.golf;
import java.util.Scanner;

public class NPrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		System.out.println("How many prime numbers do you want to display?");
		count = input.nextInt();
		
		for (int i = 1, j = 0; j < count; i++) {
			if (isPrime(i)) {
				System.out.print(i + (j == count - 1 ? "." : ", "));
				j++;
			}
		}
	}
	
	public static boolean isPrime (int n) {
		if (n <= 3) {
			return true;
		}
		else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		else {
			for (int i = 4; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
