package com.higherlowergame.objects;

import java.util.Random;
import java.util.Scanner;

public class RunGame {

	public static void main(String[] args) {
		Random randomNumber = new Random();
		int theRandom = randomNumber.nextInt(100) + 1;
		
		for (int tries = 5; tries > 0; tries--) {
			
			System.out.println("Pick a number between 1 and 100");
			Scanner scanner = new Scanner(System.in);
			int userGuess = scanner.nextInt();
			
			if (userGuess > 100 || userGuess < 1) {
				System.out.println("Please enter a valid number between 1 and 100");
				tries = tries++;
			}
			else if (userGuess < theRandom) {
				if (tries == 1) {
					break; 
					}
					else {
				System.out.println("Please pick a higher number");
					}
				}
			else if (userGuess > theRandom) {
				if (tries == 1) {
					break; 
					}
				else {
				System.out.println("Please pick a lower number");
				}
			}
			else if (userGuess == theRandom) {
				System.out.println("You win!");
			}
		}
	System.out.println("You lose! The random number was " + theRandom);
	}
}

