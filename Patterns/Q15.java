import java.util.Scanner;
public class Q15{
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    for(int rows=1; rows<=num; rows++){
      for(int space=2; space<2*rows; space++){
        System.out.print("-");
      }
      for(int star=1; star<=num-rows+1; star++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int rows=1; rows<num; rows++){
      for(int space=1; space<=num-2*rows+3; space++){
        System.out.print("-");
        // space++;
      }
      for(int star=1; star<=rows+1; star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}