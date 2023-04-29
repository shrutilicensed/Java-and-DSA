package LearningFunctions;
import java.util.Scanner;

public class countDigit {
  public static int countDigitInNumber(int num, int digit){
    int counter =0;
    while(num>0){
      int temp = num%10;
      num= num/10;
      if(temp == digit){
        counter++;
      }
    }
    return counter;
  }

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num= scan.nextInt();
    int digit = scan.nextInt();
    int result= countDigitInNumber(num, digit);
    System.out.println(result);
    scan.close();
  }
}
