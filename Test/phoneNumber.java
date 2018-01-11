//************************************************
// Avery Cunningham
// Converting phonewords to phone numbers 👿
// 12/11/17
//************************************************
import java.util.Scanner;

public class phoneNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        String output = "";
        String ch;

        System.out.print("Enter a phone number: ");
        input = scan.nextLine().toLowerCase();
        
        for(int i=0;i<input.length();i++){
            ch = input.substring(i,i+1);
            if(ch.matches("0|1|2|3|4|5|6|7|8|9")){ 
                output += ch;
            }else if(ch.matches("a|b|c")){
                output += "2";
            }else if(ch.matches("d|e|f")){
                output += "3";
            }else if(ch.matches("g|h|i")){
                output += "4";
            }else if(ch.matches("j|k|l")){
                output += "5";
            }else if(ch.matches("m|n|o")){
                output += "6";
            }else if(ch.matches("p|q|r|s")){
                output += "7";
            }else if(ch.matches("t|u|v")){
                output += "8";
            }else if(ch.matches("w|x|y|z")){
                output += "9";
            }
        
            if(input.length()==11){
                if(i==0||i==3||i==6)
                output += "-";
            }else if(input.length()==10){
                if(i==2||i==5)
                output += "-";
            }
        }

        System.out.println("Number: "+ output);
        
    }
}