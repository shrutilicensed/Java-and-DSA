package Arrays;
import java.util.*;

public class barChart {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int size = scan.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements: ");
    for(int i=0; i<size; i++){
      arr[i] = scan.nextInt();
    }
    // finding the max Element
    int rows = arr[0];
    for(int i=0; i<size; i++){
      if (rows < arr[i]){
        rows= arr[i];
      }
    }
    for(int i=0; i<rows; i++){
      for(int j=0; j<size; j++){
        if(i<rows-arr[j]){
          System.out.print("  ");
        }
        else{
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
