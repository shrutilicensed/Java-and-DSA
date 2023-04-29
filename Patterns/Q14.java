import java.util.Scanner;
public class Q14 {
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int num = scan.nextInt();
    scan.close();
    for(int rows=1; rows<=num; rows++){
      for(int space=1; space<=num-rows; space++){
        System.out.print(" ");
      }
      for(int star=1; star<=rows; star++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int rows2=1; rows2<num; rows2++){
      for(int space=1; space<=rows2; space++){
        System.out.print(" ");
      }
      for(int star=1; star<=num-rows2; star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
