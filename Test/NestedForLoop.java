public class NestedForLoop{

  public static void main(String[] args) {
    
    for(int row=1; row<=7; row+=2){
        for(int spaces=row; spaces<10; spaces-=2){
            System.out.print(" ");
        }
        for(int stars=row; stars>0; stars--){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    for(int row=7; row>0; row--){
        for(int spaces=row; spaces<10; spaces++){
            System.out.print(" ");
        }
        for(int stars=row; stars>0; stars--){
            System.out.print("*");
        }
        System.out.print("\n");
    }
  }
}