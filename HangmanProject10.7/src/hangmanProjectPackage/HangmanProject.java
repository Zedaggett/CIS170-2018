package hangmanProjectPackage;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanProject {

public static void main (String[] args) {
	
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


	boolean wouldYouLikeToPlay = true;
		while (wouldYouLikeToPlay) {
			System.out.println("Would you like to play a game? y/n");
			Scanner sc = new Scanner(System.in);
			char input = sc.nextLine().charAt(0);
			
			if (input == 'y') 
			{
				System.out.println("Welcome to Hangman!");
					boolean whichGame = true;
						while (whichGame) {
							Game gameChoice = games.get(0);
							for (int j = 0; j < games.size(); j++);
						
					boolean areWePlaying = true;
						while (areWePlaying) 
						{
							String word = gameChoice.getWord();
							String hint = gameChoice.getHint();
							char[] letters = word.toCharArray();
							int amountOfGuesses = word.length();
							char[]playerGuesses = new char[amountOfGuesses];
								for (int l = 0; l < playerGuesses.length; l++)
									{
										playerGuesses[l] = '*';
										if (input == 'n') 
										{
											wouldYouLikeToPlay = false; 
										}
					boolean wordIsGuessed = false;
					int tries = 0;
						while (!wordIsGuessed && tries != amountOfGuesses){ 
							System.out.println("Current guesses: ");
							System.out.println(playerGuesses);
							System.out.printf("You have %d tries left. Enter '?' for hint or '-'to exit", amountOfGuesses - tries); 
							System.out.println(" ");
							System.out.println("Please enter a letter");
							char input2 = sc.nextLine().charAt(0);
							tries++;
								if (input2 == '-')  
									{
									areWePlaying = false; 
									wordIsGuessed = true; 
									}
								if (input2 == '?')
									tries--;
								{
									System.out.println(hint);
								}
								if (input2 == ' ');
								tries--;
								{
									System.out.println("Please try again");
								}
									for (int i = 0; i < letters.length; i++)  
									{
										if (letters[i] == input) 
										{
											playerGuesses[i] = input; 
										}
										if (isTheWordGuessed(playerGuesses)) 
										{
											wordIsGuessed = true;
											System.out.println("YOU WIN!"); 
										}
								
								 if (!wordIsGuessed) 
								{					
									System.out.println("GAME OVER");
									System.out.println("You have ran out of guesses :/");
									System.out.println("Would you like to play again? y/n");
									String anotherGame = sc.nextLine(); 
									if (anotherGame.equals("n")) areWePlaying = false; 
								}
							}
						}
					}
				}
			}
		}
	}
}

	

						public static boolean isTheWordGuessed(char[] array)  
						{
							for (int i = 0; i < array.length; i++)
							{
								if (array[i] == '*') return false;
							}	
							return true;
						}
}

