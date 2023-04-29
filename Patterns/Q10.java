import java.util.Scanner;
public class Q10 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    for(int rows=1; rows<=num; rows++){
      for(int space=1; space<=rows-1; space++){
        System.out.print("-");
      }
      for(int star=rows; star<=num; star++){
        System.out.print("*");
      }
      for(int star2=rows; star2<num; star2++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
