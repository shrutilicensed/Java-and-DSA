package LearningFunctions;
import java.util.*;

public class anyBaseAddition {
  public static void baseAddition(int base, int num1, int num2 ){
    int r1=0; //for taking digits from unit place
    int r2=0;
    int carry =0; 
    int digitSum=0; 
    List<Integer> sum= new ArrayList<Integer> (); //this list stores sum
    while(num1>0 || num2>0 || carry>0){
      r1= num1%10;
      num1= num1/10;
      r2= num2%10;
      num2=num2/10;
      digitSum = r1+r2+carry;

      if(digitSum>=base){
        sum.add(digitSum%base);
        carry = digitSum/base;
      }
      else{
        sum.add(digitSum);
        carry=0;
      }
    }
    for(int i= sum.size()-1; i>=0; i--){
      System.out.print(sum.get(i));
    }
  }
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int base= scan.nextInt();
    int num1= scan.nextInt();
    int num2= scan.nextInt();
    scan.close();
    baseAddition(base, num1, num2);
  }
}
