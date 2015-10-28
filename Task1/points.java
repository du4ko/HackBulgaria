package Task1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class points {

    
    public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(in.readLine());
        int y = Integer.parseInt(in.readLine());
        int regularWay = 1;
      String input = in.readLine();
      String[] arrayCheck = input.split("");
        for (int i = 0; i < arrayCheck.length; i++) {
            if (arrayCheck[i].equals("~")) {
                if (regularWay == 1) {
                    regularWay = -1;
                }
                else   {
                    regularWay = 1;
                }
            }       
            if (arrayCheck[i].equals("<")) {
                x-=regularWay;
            }
            else if (arrayCheck[i].equals(">")) {
               x+=regularWay;
            }
            else if (arrayCheck[i].equals("^")) {
               y-=regularWay;
            }
            else if (arrayCheck[i].equals("v")) {
               y+=regularWay;
            }         
        }
	System.out.print("("+ x + "," + y + ")");
    }
}

