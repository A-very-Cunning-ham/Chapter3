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
        
        System.out.println("Enter a string: ");
        input = scan.nextString();
        
        System.out.println("Enter a word or character: ");
        search = scan.nextString();
        
        if (search.length() == 1){
            System.out.println("one long");
        }
        
        
    }
}