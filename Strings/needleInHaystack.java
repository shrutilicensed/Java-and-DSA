package Strings;
import java.util.*;
public class needleInHaystack {
  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // String haystack = scan.nextLine();
    // String needle = scan.nextLine();
    String haystack = "sadbutsad";
    String needle = "sad";
    // scan.close();
    System.out.println(strStr(haystack, needle));
  }
  public static int strStr(String haystack, String needle) {
      int lenHay = haystack.length();
      int lenNeed= needle.length();
      int flag=-1;
      int j=0;
      
      for(int i=0; i<lenHay; i++){
         if(haystack.charAt(i)== needle.charAt(0))
         {
             for( ; j<lenNeed; j++){
                 if(haystack.charAt(i+j)==needle.charAt(j)){
                     flag = i;
                 } }
         }
     }
     return flag;
}
}
