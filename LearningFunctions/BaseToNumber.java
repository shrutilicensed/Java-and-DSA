package LearningFunctions;
import java.util.*;
public class BaseToNumber {
  public static void calcBaseToNum(int n, int b){
    int sum=0;
    for(int i=0; n>0; i++){
      int rem= n%10;
      // System.out.println(rem);
      n=n/10;
      sum += Math.pow(b,i)* rem;
    }
    System.out.println(sum);
    }
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n= scan.nextInt();
      int b= scan.nextInt();
      scan.close();
      calcBaseToNum(n, b);
    }
  }