import java.util.Scanner;

public class Q4 {
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    for( int i=1; i<=num; i++){
      for(int space=num-i; space>0; space--){
        System.out.print(" ");
      }
      for(int star= 1; star<=i; star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
