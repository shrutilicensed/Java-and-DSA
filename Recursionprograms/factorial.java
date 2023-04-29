package Recursionprograms;
import java.util.Scanner;
public class factorial {

  public int printFactorial(int n){
    int result=0;
    if(n==0 || n==1)
    {
      return 1;
    }
    else{
      result=n*printFactorial(n-1);
      return result;
    }
  }
  public static void main(String[] args){
    factorial factClass = new factorial();
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    System.out.println(factClass.printFactorial(num));

  }
}
