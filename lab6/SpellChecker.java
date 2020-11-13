package labs.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SpellChecker {	
	// Constructor that creates a SpellChecker object using the specified word list file
	HashSet<String> words;
	
	SpellChecker(String wordListFileName)  {
		words = new HashSet<String>();
		try(Scanner in = new Scanner(new File(wordListFileName))){
			while(in.hasNextLine()) {
				words.add(in.nextLine().toLowerCase());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File: "+wordListFileName+" not found");
		}
	}
	
	
	// Returns true if the given word is in the word list (ignoring letter case and any character that is not a letter), false otherwise
	boolean checkWord(String word) {
		return words.contains(word.toLowerCase());
	}
	
	// Checks all the words in the given file to see if they are in the word list.
	// Returns an ArrayList of all words that were not found in the word list, with
	// all non-letter characters removed. This ArrayList should not contain duplicates.
	ArrayList<String> checkFile(String fileName) {
		ArrayList<String> out = new ArrayList<String>();
		try(Scanner in = new Scanner(new File(fileName))){
			while(in.hasNext()) {
				String next = in.next().replaceAll("[^a-zA-Z]+","");
				if(!checkWord(next) && !out.contains(next)) {
					out.add(next);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File: "+fileName+" not found");
		}
	
		return out; //stub
	}
	
	
	public static void main(String[] args) {
		SpellChecker checker = new SpellChecker("./src/labs/lab6/words.txt");
		ArrayList<String> notFoundWords = checker.checkFile("./src/labs/lab6/doc.txt");
		System.out.println(notFoundWords); // prints: [foolishness, incredulity, Charles, A, I, havent, Christmas, Oliver] 
	}

}
