package Arrays;
import java.util.*;

public class spanAnArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of array");
    int arrSize= scan.nextInt();
    int[] arr= new int[arrSize];

    for(int i=0; i<arrSize; i++){
      System.out.println("Enter element no. " + i + ":");
      arr[i]= scan.nextInt();
    }

    int min=arr[0];
    int max=arr[0];

    for(int i=0; i<arrSize; i++){
      if(arr[i]>max){
        max= arr[i];
      }
    }

    for(int i=0; i<arrSize; i++){
      if(arr[i]<min){
        min= arr[i];
      }
    }

    System.out.println("maximum value of array is:" + max);
    System.out.println("minimum value of array is:" + min);
  }
}
