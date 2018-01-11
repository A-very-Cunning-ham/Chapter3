//************************************************
// Avery Cunningham
// Converting phonewords to phone numbers 👿
// 12/11/17
//************************************************
import java.util.Scanner;

public class phoneNumber2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num;

        System.out.print("Enter a phoneword: ");
        num = scan.nextLine().toLowerCase();
        
        while(num.length()>11||num.matches(".*[%<>@&;'\0-].*| ")){
        System.out.print("Try again. Phonewords must not contain dashes or special characters, "+
        "and are limited to 1 digit country codes\nEnter a phoneword: ");
        num = scan.nextLine().toLowerCase();
        }
        
        num = num.replaceAll("[a-c]","2");
        num = num.replaceAll("[d-f]","3");
        num = num.replaceAll("[g-i]","4");
        num = num.replaceAll("[j-l]","5");
        num = num.replaceAll("[m-o]","6");
        num = num.replaceAll("[p-s]","7");
        num = num.replaceAll("[t-v]","8");
        num = num.replaceAll("[w-z]","9");
        
        if(num.length()==11){
            System.out.println("Number: " + num.substring(0,1)+
            "-"+num.substring(1,4)+"-"+num.substring(4,7)+"-"+num.substring(7,11));
        }else if(num.length()==10){
            System.out.println("Number: " + num.substring(0,3)+
            "-"+num.substring(3,6)+"-"+num.substring(6,10));
        }else{
            System.out.println("Short code or improper phone number - no dashes added"+
            "\nTry again with a 10 or 11 digit number for dashes\n\nNumber: " + num);
        }
    }
}