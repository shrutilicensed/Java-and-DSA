package LinkedListQuestions;

public class initialiseALinkedList {
  public static void main(String[] args) {
    
  }
  int size;
  Node head;
  Node tail;

  // inner or nested class
  class Node{
    int data;
    Node next;
  }

  public void addFirst(){
    Node newNode = new Node();
    if(size ==0){
      newNode = head;
      newNode = tail;
      size++;
    }
    else{
      newNode.next = head;
      System.out.println(newNode);
      head = newNode;
      size++;
    }
    
  }
}
