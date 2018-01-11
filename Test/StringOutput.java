import java.util.Scanner;
public class  StringOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.print("Enter a string: ");
        input = scan.nextString();
        
        for(int i = 0; i < input.length(); i++){
            System.out.println(input.charAt(i) + "\t" + i);
        }
        
        
    }
}