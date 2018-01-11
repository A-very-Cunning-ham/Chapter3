import java.util.Scanner;

public class splitString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        
        System.out.print("Enter a string: ");
        input = scan.nextLine();
        int end = ((input.length())/2);
        
        
        if((input.length()%2!=0)){
            end++;
        }
        System.out.println("First half: "+ input.substring(0, end));
        
        System.out.println("Second half: "+ input.substring(end));
        
       
        
    }
}

