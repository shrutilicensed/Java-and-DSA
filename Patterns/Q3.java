import java.util.Scanner;
public class Q3 {
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();

    for(int i=1; i<=n; i++){
      for(int j=n; j>=i; j--){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }

}
