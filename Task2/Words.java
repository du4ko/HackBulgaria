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
	    int length = aryWord.length;
		//Looking for the word/words
	   
	    //Scanning for the first char of the word if found
		//Scanning all directions for the word by the 2ht char of the word
		int countWords = 0;
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				if (mTable[row][col].equals(aryWord[0])) {
					
					//Checking top side
				  if (row > 0 && mTable[row-1][col].equals(aryWord[1])) {
	
					 for (int chr = 1;  chr < aryWord.length; chr++) {
						if (row-chr >= 0 && mTable[row-chr][col].equals(aryWord[chr])) {
							if(chr + 1 == length){
						        countWords++;
						        break;
						    }
						}	
				    }
				}
				  //Checking top right side
				  if (row > 0 && (col + 1) < mTable[row].length && mTable[row-1][col+1].equals(aryWord[1])) {
						
						 for (int chr = 1;  chr < aryWord.length; chr++) {
							if (row-chr >= 0 && mTable[row-chr][col+chr].equals(aryWord[chr])) {
								if(chr + 1 == length){
							        countWords++;
							        break;
							    }
							}	
					    }
					}
				  //Checking right side
				  if ( col + 1 < mTable[row].length && mTable[row][col+1].equals(aryWord[1])) {
						
						 for (int chr = 1;  chr < aryWord.length; chr++) {
							if (col + chr <= mTable[row].length - 1 && mTable[row][col+chr].equals(aryWord[chr])) {
								if(chr + 1 == length){
							        countWords++;
							        break;
							    }
							}	
					    }
					}
				 //Checking bottom right side
				  if ( col + 1 < mTable[row].length && row + 1 < mTable.length && mTable[row+1][col+1].equals(aryWord[1])) {
						
						 for (int chr = 0;  chr < aryWord.length; chr++) {
							if (col + chr <= mTable.length && row + chr < mTable[row].length&& mTable[row+chr][col+chr].equals(aryWord[chr])) {
								if(chr + 1 == length){
							        countWords++;
							        break;
							    }
							}	
					    }
					}
				//Checking the bottom side
				  if (row + 1 < mTable.length && mTable[row+1][col].equals(aryWord[1])) {
						
						 for (int chr = 0;  chr < aryWord.length; chr++) {
							if (row + chr <= mTable[row].length - 1&& mTable[row+chr][col].equals(aryWord[chr])) {
								if(chr + 1 == length){
							        countWords++;
							        break;
							    }
							}	
					    }
					}
				//Checking bottom left side
				  if (row < mTable[row].length -1 && col > 0 && mTable[row+1][col-1].equals(aryWord[1])) {
						
						 for (int chr = 0;  chr < aryWord.length; chr++) {
							if (row + chr <= mTable[row].length - 1 && col - chr >= 0 && mTable[row+chr][col-chr].equals(aryWord[chr])) {
								if(chr + 1 == length){
							        countWords++;
							        break;
							    }
							}	
					    }
					}
				//Checking left side
				  if ( col > 0 && mTable[row][col-1].equals(aryWord[1])) {
						
						 for (int chr = 0;  chr < aryWord.length; chr++) {
							if (col - chr >= 0 && mTable[row][col-chr].equals(aryWord[chr])) {
								if(chr + 1 == length){
							        countWords++;
							        break;
							    }
							}	
					    }
					}
				//Checking top left side
				  if ( col > 0 && row > 0 && mTable[row-1][col-1].equals(aryWord[1])) {
						
						 for (int chr = 0;  chr < aryWord.length; chr++) {
							if (col - chr >= 0 && row-chr >= 0 && mTable[row-chr][col-chr].equals(aryWord[chr])) {
								if(chr + 1 == length){
							        countWords++;
							        break;
							    }
							}	
					    }
					}
		      } 
		  }
	   }
	   System.out.println(countWords);
	   input.close();
	}
}