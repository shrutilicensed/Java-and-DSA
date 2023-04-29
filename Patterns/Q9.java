import java.util.Scanner;
public class Q9{
public static void main(String[] args){
  Scanner scan= new Scanner(System.in);
  int num= scan.nextInt();
  scan.close();
  for(int rows=1; rows<=num; rows++){
    for(int space=1; space<=num-rows; space++){
      System.out.print("-");
    }
    // print odd stars
    for(int star= 1; star<=rows; star++){
      System.out.print("*");
    }
    for(int star2= 2; star2<=rows; star2++){
      System.out.print("*");
    }
    System.out.println();
  }
}
}