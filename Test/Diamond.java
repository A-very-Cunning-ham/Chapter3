//*************************************************
// Avery Cunningham
// Star Star Diamond Guy 👿
// 11/28/17
//************************************************


public class  Diamond {
    public static void main(String[] args) {
             
int n = 5;
 
	for(int i=1;i<=n;i++) {
	    
	        for(int s=1;s<=n-i;s++) {
	            
                               System.out.print(" ");
                        }
 
                      for(int s=1;s<=i*2-1;s++) {
                               System.out.print("*");
                        }
                        
	 System.out.println("\n");
	    
               }
               
    for(int i=n-1;i>0;i--) {
                   
	        for(int s=1;s<=n-i;s++) {
                               System.out.print(" ");
                        }
                      for(int s=1;s<=i*2-1;s++) {
                               System.out.print("*");
                        }
	    System.out.println("\n");
               }  
 
 
                
    }
}