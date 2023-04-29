import java.util.Scanner;
public class Q7 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    for(int rows=1; rows<=num; rows++){
      for(int columns=1; columns<=num; columns++){
        if(rows==1 || rows==5|| columns==1 || columns==5)
        {
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
