package LinkedListQuestions;
import java.util.*;

public class initialiseLL {
  Node head;
  public static void main(String[] args) {

    //  Node head;
    initialiseLL LL= new initialiseLL();
    Scanner scan = new Scanner(System.in);

    LL.head = new Node(1);
    Node.second= new Node(2);
    Node.third = new Node(3);

    LL.head.next = second;
    second.next = third; 

    LL.printLl();
  }

  public class Node{
    int data;
    Node next;

    Node(int data){
      this.data= data;
      this.next = null;
    }
  }

  public void printLl(){
    Node n = head;
    while(n != null){
      System.out.println(n.data + "");
      n = n.next;
    }
  }

}



