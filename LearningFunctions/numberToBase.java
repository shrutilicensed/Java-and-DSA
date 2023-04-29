package LearningFunctions;
import java.util.*;
 
  public class numberToBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      scn.close();
      getValueInBase(n, b);
    //   int dn = getValueInBase(n, b);
    //   System.out.println(dn);
   }
  
   public static void getValueInBase(int n, int b){
      int result[]= new int[8];
      for(int i=0; n>0; i++){
      int rem = n%b;
      n= n/b;
      result[i]= rem;
      }
      int size = result.length;
      for(int x=size-1; x>=0; x--){
        System.out.print(result[x]);
      }
      
     
      // write code here
   }
  }