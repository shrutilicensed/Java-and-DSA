package Arrays;
import java.util.*;

public class sumOfTwoIndices {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = scan.nextInt();
    int nums[] = new int[n];
    for(int i=0; i<n; i++){
      System.out.println("Enter " + i + " element: ");
      nums[i] = scan.nextInt();
    }
    System.out.println("Enter target sum");
    int target = scan.nextInt();
    int[] ans= twoSum(nums, target);
    for(int i=0; i<2; i++){
      System.out.println(ans[i]);
    }

  }

  public static int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];
    for(int i=0; i<nums.length; i++ ){
        for(int j = i+1; j<nums.length; j++){
            if(nums[i] + nums[j] == target){
            ans[0]= i;
            ans[1] = j;
            break;
        }
        }
        
    }
    return ans;
}
}
