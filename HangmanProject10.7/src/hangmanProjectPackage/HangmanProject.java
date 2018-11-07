package hangmanProjectPackage;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanProject {

	public static void main(String[] args) {
		Game g1 = new Game("maine", "Vacationland");
		Game g2 = new Game("school", "Where you go to learn");
		Game g3 = new Game("cake", "Tasty dessert for your birthday");
		Game g4 = new Game("computer", "Hardware you are using to play the game");
		Game g5 = new Game("coffee", "Tasty morning beverage to wake you up");

		List<Game> games = new ArrayList<Game>();
		games.add(g1);
		games.add(g2);
		games.add(g3);
		games.add(g4);
		games.add(g5);
for (Game g : games) {
	while (!g.isSolved) {
		boolean playGame = true;

		System.out.println("Would you like to play a game? y/n");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		char input = sc.nextLine().charAt(0);

		if (input == 'n') {
			playGame = false;
			System.out.println("Goodbye!");
		}
		if (input == 'y') {
			playGame = true;
			System.out.println("Welcome to Hangman!");
		}
		while (playGame) {
			
					boolean areWePlaying = true;
					while (areWePlaying) {
						String word = g.word;
						String hint = g.hint;
						char[] letters = word.toCharArray();
						int amountOfGuesses = letters.length;
						char[] playerGuesses = new char[amountOfGuesses];
						for (int i = 0; i < playerGuesses.length; i++) {
							playerGuesses[i] = '*';
						}

						boolean wordIsGuessed = false;
						int tries = 0;
						while (!wordIsGuessed && tries != amountOfGuesses) {
							System.out.println("Current guesses: ");
							System.out.println(playerGuesses);
							System.out.printf("You have %d tries left. Enter '?' for hint or '-'to exit",
									amountOfGuesses - tries);
							System.out.println(" ");
							System.out.println("Please enter a letter");
							char input2 = sc.nextLine().charAt(0);
							tries++;
							
							for (int i = 0; i < letters.length; i++) {
								if (letters[i] == input2) {
									playerGuesses[i] = input2;
								}
							}
								
							if (isTheWordGuessed(playerGuesses)) {
									wordIsGuessed = true;
									areWePlaying = true;
									g.isSolved = true;
									System.out.println("YOU WIN! Would you like to play again?");
								}
							}
						
						if (tries == amountOfGuesses && wordIsGuessed == false) {
							System.out.println("GAME OVER");
							System.out.println("You have ran out of guesses");
							System.out.println("Would you like to play again? y/n");
							wordIsGuessed = false;
							areWePlaying = false;
							playGame = false;
							g.isSolved = false;
							char anotherGame = sc.nextLine().charAt(0);
							if (anotherGame == 'n') {
								playGame = false;
								areWePlaying = false;
								g.isSolved = false;
							}
							if (anotherGame == ' ')
							{
								playGame = false;
								areWePlaying = false;
								
							}
							else if (anotherGame == 'y')
							{
								
							}
					}
					}
		}
	}
}
		}
		

	public static boolean isTheWordGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '*')
				return false;
		}
		return true;
	}
}
