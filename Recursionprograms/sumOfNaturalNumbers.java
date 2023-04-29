package Recursionprograms;
import java.util.Scanner;
public class sumOfNaturalNumbers{
  public int printSumOfN(int n){
    int sum=0;
    if(n<=0){
      return 0;
    }
    sum= n + printSumOfN(n-1);
    return sum;
  }

  public static void main(String[] args){
    sumOfNaturalNumbers sonn= new sumOfNaturalNumbers();
    Scanner scan = new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    System.out.println(sonn.printSumOfN(num));
  }
}