import java.util.Scanner;
public class Q5 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    for(int rows=1; rows<=num; rows++){
      for(int space= 1; space<=rows-1; space++){
        System.out.print(" ");
      }
      for(int star=num-rows; star>=0; star--){
        System.out.print("*");
      }
      System.out.println();
      
      
      
    }
  }
}
