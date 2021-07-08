package com.higherlowergame.objects;

import java.util.Random;
import java.util.Scanner;

public class RunGame {

	public static void main(String[] args) {
		Random randomNumber = new Random();
		int theRandom = randomNumber.nextInt(100) + 1;
		boolean win = false;
		Scanner scanner = new Scanner(System.in);
		
		for (int tries = 5; tries > 0; tries--) { 
			
			System.out.println("Pick a number between 1 and 100");
			
			int userGuess = scanner.nextInt();
			
			if (userGuess == theRandom) { 
				win = true;
				break;
			}
			
			if (userGuess > 100 || userGuess < 1) {
				// User guessed outside of range
				System.out.println("Please enter a valid number between 1 and 100");
				 tries = tries + 1;
				 continue;	 
			}
			if (tries > 1) {
				if (userGuess < theRandom) {
					System.out.println("Please pick a higher number");				 
				}
				if (userGuess > theRandom) {
					System.out.println("Pick a lower number");
				}
			}
		}
		scanner.close();
		if (win) {
			System.out.println("You win!");	
		}
		else {
			System.out.println("Sorry you lose");
		}
	}
}

