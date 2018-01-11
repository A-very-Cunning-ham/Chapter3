//*************************************************
// Avery Cunningham
// Counts the number of words in a string 👿
// 12/6/17
//************************************************

import java.util.Scanner;

public class numOfWords{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        char space = ' ';
        int count = 1;
        
        System.out.println("Enter a string: ");
        input = scan.nextLine();
        
        
        
        for(int i = 0; i<input.length(); i++){
                if(input.charAt(i) == space){
                    count++;
                }
            }
         System.out.println("The string \"" + input + "\"" + " contains "  +
        count + " words");
    }
}