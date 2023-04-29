package LearningFunctions;
import java.util.Scanner;
public class countDigitsOfNumber {

  public static int countDigitsInNum(int n){
    int count=0;
    for(int i=0; n>0; i++){
      n=n/10;
      count ++;
    }
    return count;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();
    int ans=countDigitsInNum(n);
    System.out.println(ans);
  }

}
