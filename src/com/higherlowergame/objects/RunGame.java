package com.higherlowergame.objects;

import java.util.Random;
import java.util.Scanner;

public class RunGame {

	public static void main(String[] args) {
		Random randomizer = new Random();
		int randomNumber = randomizer.nextInt(100) + 1;
		boolean win = false;
		Scanner scanner = new Scanner(System.in);
		
		for (int tries = 5; tries > 0; tries--) { 
			
			System.out.println("Pick a number between 1 and 100");
			int userGuess = scanner.nextInt();
			
			while(userGuess > 100 || userGuess < 1) {
				System.out.println("Please enter a valid number between 1 and 100");
				userGuess = scanner.nextInt();
			}

			if (userGuess == randomNumber) { 
				win = true;
				break;
			}

			else if (userGuess < randomNumber) {
				System.out.println("Please pick a higher number");				 
			}
			else if (userGuess > randomNumber) {
				System.out.println("Pick a lower number");
			}
			
		}
		scanner.close();
		if (win) {
			System.out.println("You win!");	
		}
		else {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + randomNumber);
		}
	}
}

