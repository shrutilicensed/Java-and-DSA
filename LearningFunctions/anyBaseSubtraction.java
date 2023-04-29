package LearningFunctions; 
import java.util.*;
public class anyBaseSubtraction {
  public static void baseSubtraction(int base, int num1, int num2){
    int r1= 0;
    int borrow= 0;
    int r2= 0;
    int subDigit= 0;
    List<Integer> subtractedNum = new ArrayList<Integer>();

    while(num1>0){
      r1= (num1%10) + borrow ;
      r2= num2%10;
      num1= num1/10;
      num2= num2/10;
      if(r1>r2){
        subDigit= r1-r2;
        borrow=0;
      }
      else{
        r1+=8;
        subDigit= r1-r2;
        borrow= -1;
      }
      subtractedNum.add(subDigit);
    }
    for(int i= subtractedNum.size() -1; i>=0; i--){
      System.out.print(subtractedNum.get(i));
    }
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int base = scan.nextInt();
    int num1= scan.nextInt();
    int num2= scan.nextInt();
    scan.close();
    baseSubtraction(base, num1, num2);
  }
}
