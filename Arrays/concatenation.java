package Arrays;
import java.util.*;

public class concatenation{
  public static void main(String[] args) {
    int n=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter size of array");
    n = scan.nextInt();
    int [] nums = new int[n];
    for(int i=0; i<n; i++){
      System.out.println("Enter " + i +" element ");
      nums[i]= scan.nextInt();
    }
    int [] ans = getConcatenation(nums);
    System.out.println("Concatenated array :");
    int m = ans.length;
    for(int i =0; i<m; i++){
      System.out.println(ans[i]);
    }

  }

  public static int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] ans = new int[2*n];
    int j = 0;
    for(int ansIndx=0; ansIndx<2*n; ansIndx++){
        if(ansIndx<n){
            ans[ansIndx] = nums[ansIndx];
        }
        else{
            ans[ansIndx] = nums[j];
            j++;
        }
    }
    return ans;
}
}