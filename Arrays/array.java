//*********************
// Avery Cunningham
// Arrays
// 1/9/18
//*********************
import java.util.Scanner;

public class array{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        
        String phrase;
        System.out.print("Enter your string: ");
        phrase = scan.nextLine();
        
        int length = phrase.length();
        
        char[] letters = new char[length];
        
        
        for(int i = 0; i<length; i++){
            letters[i] = phrase.charAt(i);
            System.out.println(letters[i]);
        }
        
        
    }
    
}