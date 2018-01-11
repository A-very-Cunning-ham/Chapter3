import java.util.Scanner;

public class hw128{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        String savedInput;
        String word;
        int count = 0;
        
        System.out.print("Enter a string: ");
        input = scan.nextLine().toLowerCase();
        
        System.out.print("Enter a word: ");
        word = scan.nextLine().toLowerCase();
        
        savedInput = input;
        
        while(input.indexOf(word)>=0){
            count++;
            input = input.substring(input.indexOf(word)+word.length());
        }
        
        System.out.println("The word: " + word + ", occurs "+ count + 
        " times in the string: " + savedInput);
    }
}
