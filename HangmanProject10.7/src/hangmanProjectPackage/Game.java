package hangmanProjectPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Game {
	
	String word;
	String hint;
	public boolean isSolved;

public Game(String word, String hint) 
	{
	this.word = word;
	this.hint = hint;
	}

protected void readFromFile() throws IOException
{
	File f = new File("words and hints.txt");
	
	BufferedReader reader = new BufferedReader(new FileReader(f));
	String st;
	while ((st = reader.readLine()

}

catch (IOException e) {
	throw e;
}



}


	

	