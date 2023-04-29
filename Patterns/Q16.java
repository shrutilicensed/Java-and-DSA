import java.util.Scanner;
public class Q16 {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int num = scan.nextInt();
    scan.close();
    for(int rows=1; rows<=num; rows++){
      for(int space=1; space<=num-rows; space++){
        System.out.print("-");
      }
      for(int star=1; star<=num-rows+1; star++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int rows=1; rows<num; rows++){
      for(int space=1; space<=rows; space++){
        System.out.print("-");
      }
      for(int star=1; star<=rows+1; star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
