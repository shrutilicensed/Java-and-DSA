package LearningFunctions;
import java.util.*;

public class palendrome {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    System.out.println("" + isPalindrome(x));
  }

  public static boolean isPalindrome(int x) {
    String word = Integer.toString(x);
    int length = word.length();
    String reverse="";
    for(int i=length-1; i>=0; i--){
        reverse = reverse + word.charAt(i) ;
    }

    boolean ans = (word.equals(reverse) ? true : false);
    return ans;
}


}
