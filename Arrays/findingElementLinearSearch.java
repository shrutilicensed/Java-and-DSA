package Arrays;
import java.util.*;
public class findingElementLinearSearch {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = scan.nextInt();
    int[] arr = new int[size];

    for(int i=0; i<size; i++){
      System.out.println("Enter element no. "+ i + " :");
      arr[i]= scan.nextInt();
    }

    System.out.println("Enter element to search:");
    int element=scan.nextInt();

    for(int i=0; i<size; i++){
      if(element == arr[i]){
        System.out.println("Found at " + i + " index");
      }
    }
  }
}
