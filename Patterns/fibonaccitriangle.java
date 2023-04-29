import java.util.*;
public class fibonaccitriangle {
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int numoflines= scan.nextInt();
    scan.close();
		int firstnum=0;
		int secondnum=1;
		int temp=0;
		System.out.println(firstnum+ "");
		System.out.print(secondnum+ "");

    for(int x=1; x<=numoflines; x++){
      for(int i=2; i<i+x; i++){
        temp= firstnum+secondnum;
        firstnum= secondnum;
        secondnum= temp;
        
      System.out.print(secondnum+ "");
  
    }
		System.out.println();
		}
    }
}