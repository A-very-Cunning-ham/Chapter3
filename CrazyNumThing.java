public class CrazyNumThing
{
  public static void main(String[] args) {
    int num = 100, count = 0;
    
    while(num<=1000){
        if(num%5==0 && num%6==0){
            System.out.print(num + " ");
            count++;
        }
        if(count%10==0){
            System.out.println();
        }
        num++;
    }
    
   
  }
}