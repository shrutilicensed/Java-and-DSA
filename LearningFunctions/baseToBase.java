package LearningFunctions;
import java.util.*;

public class baseToBase {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int base1= scan.nextInt();
    int base2= scan.nextInt();
    scan.close();
    baseToBaseConv(num, base1, base2);
    }

  public static void baseToBaseConv(int num, int base1, int base2){
    int sum =0;
    for(int i =0; num>0; i++){
      int rem= num%10;
      num=num/10;
      sum += Math.pow(base1, i ) * rem;
    }
    List<Integer> newNum = new ArrayList<Integer> ();
    
    for(int i=0; sum>0; i++){
    int rem= sum%base2;
    sum=sum/base2;
      newNum.add(rem);
    }
    for(int i=newNum.size()-1; i>=0; i--){
      System.out.print(newNum.get(i)+"");
    }
  }
}