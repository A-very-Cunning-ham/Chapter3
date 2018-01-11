//*************************************************
// Avery Cunningham
// Finding letters and words in strings 👿
// 12/6/17
//************************************************

import java.util.Scanner;

public class StringScan1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        String search;
        int count = 0;
        
        System.out.print("Enter a string: ");
        input = scan.nextLine();
        
        System.out.print("Enter a word or character: ");
        
        search = scan.nextLine();
        
        if (search.length() == 1){
            String inputNoSpace = input.replaceAll(" ","");
            char searchChar = search.charAt(0);
            
            for(int i = 0; i<inputNoSpace.length(); i++){
                if(inputNoSpace.charAt(i) == searchChar){
                    count++;
                }
            }
        }
        System.out.println("The string \"" + input + "\" contains \"" +
        search + "\" " + count + " times");
        
    }
}
