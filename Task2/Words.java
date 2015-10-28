package Task2;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    //Setting table dimensions and creating it
	    System.out.println(" Please provide dimeonsions of the rectangle! ");
	    System.out.println(" How many rows:");
	    int rows = Integer.parseInt(input.nextLine());
	    System.out.println(" How many coloms:");
	    int cols = Integer.parseInt(input.nextLine());
	    System.out.println("Provide the table data. Every row should be provided like a single word. E.G the row I V A N should be ivan");
	    String[][] mTable = new String[rows][cols];
       // Filling the table with data
	    for(int i = 0; i < rows;i++){
	    	String line = input.nextLine();
	    	String[] ary = line.split("");
	    	for(int  j = 0; j < cols; j++){
               mTable[i][j] = ary[j];
	    	}
	    }
	    // Obtaining the special word to look for.
	    //System.out.println("And now the word we are looking for:");
	   String word = input.nextLine();
	   String[] aryWord = word.split("");
	   
	   //Looking for the word/words
	   
	    //Scanning for the first char of the word if found
	   //Scanning all directions for the word by the 2ht char of the word
	   int countWords = 0;
	   for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			if (mTable[i][j].equals(aryWord[0])) {
				
				//Checking top side
				try {
					if (mTable[i-1][j].equals(aryWord[1])) {
						for (int chr = 2;  chr < aryWord.length; chr++) {
							if (mTable[i-chr][j].equals(aryWord[chr])) {
								if ((chr - (aryWord.length - 1)) == 0) {
									countWords++;								}
							}
						}
					}
				 //Checking the right top corner side
				   if (mTable[i-1][j+1].equals(aryWord[1])) {
						for (int chr = 2;  chr < aryWord.length; chr++) {
							if (mTable[i-chr][j+chr].equals(aryWord[chr])) {
								if ((chr - (aryWord.length - 1)) == 0) {
									countWords++;								}
							}
						}
				 }
				  //Checking the right side  
				   if (mTable[i][j+1].equals(aryWord[1])) {
						for (int chr = 2;  chr < aryWord.length; chr++) {
							if (mTable[i][j+chr].equals(aryWord[chr])) {
								if ((chr - (aryWord.length - 1)) == 0) {
									countWords++;								}
							}
						}
				 }
				   
				//Checking the bottom right side  
				   if (mTable[i+1][j+1].equals(aryWord[1])) {
						for (int chr = 2;  chr < aryWord.length; chr++) {
							if (mTable[i+chr][j+chr].equals(aryWord[chr])) {
								if ((chr - (aryWord.length - 1)) == 0) {
									countWords++;								}
							}
						}
				 }
				 //Checking bottom side
				   if (mTable[i+1][j].equals(aryWord[1])) {
						for (int chr = 2;  chr < aryWord.length; chr++) {
							if (mTable[i+chr][j].equals(aryWord[chr])) {
								if ((chr - (aryWord.length - 1)) == 0) {
									countWords++;								}
							}
						}
				 }
				 //Checking bottom left side
				   if (mTable[i+1][j-1].equals(aryWord[1])) {
						for (int chr = 2;  chr < aryWord.length; chr++) {
							if (mTable[i+chr][j-chr].equals(aryWord[chr])) {
								if ((chr - (aryWord.length - 1)) == 0) {
									countWords++;								}
							}
						}
				 }
				 //Checking left side
				   if (mTable[i][j-1].equals(aryWord[1])) {
						for (int chr = 2;  chr < aryWord.length; chr++) {
							if (mTable[i][j-chr].equals(aryWord[chr])) {
								if ((chr - (aryWord.length - 1)) == 0) {
									countWords++;								}
							}
						}
				 }
				 //Checking top left side
				   if (mTable[i-1][j-1].equals(aryWord[1])) {
						for (int chr = 2;  chr < aryWord.length; chr++) {
							if (mTable[i-chr][j-chr].equals(aryWord[chr])) {
								if ((chr - (aryWord.length - 1)) == 0) {
									countWords++;								}
							}
						}
				 }
				} catch (Exception e) {
					System.out.println("Vlezee");			
				}
			}
		}
	   }
	   System.out.println(countWords);
	}
}
