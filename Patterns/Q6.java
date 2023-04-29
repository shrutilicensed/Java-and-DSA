import java.util.Scanner;
public class Q6 {
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    for(int rows= 1; rows<=num; rows++){
      for(int space=1; space<2*rows-1; space++ ){
        System.out.print("-");
      }
      for(int star=num-rows; star>=0; star--){
        System.out.print("*");
      }
      
      System.out.println();
    } 
  }
}
