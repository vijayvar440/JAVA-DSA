import java.util.LinkedList;

import corejava.Arreys.arrey_first.reavars;
import corejava.PATTERNS.PATTERN1.number;

public  class linkedList {
    public static  class Node {
        int date;
        node next;

        public  Node (int data){
            this.date =  data;
            this.next =  null; 
        }
    }


    public  static  Node head;
    public  static  Node tail;

    public void  addFirst(int data){
        Node newNode =  new Node(data);

        if (head==null) {
            head = tail = newNode;

            return ;
            
        }

        // new node next =  head 

        newNode.next  = head  ;  //link

        // head =  newNode

        head =  newNode;

    }

    public  void  addLast(int data){
        Node newNode =  new  Node(data);

        if (head==null) {
            head = tail = newNode;
            return ;
            
        }

        tail.next = newNode;
        tail = newNode;
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
    
}