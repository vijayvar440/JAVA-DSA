public class linkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size =0;;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }




   public void addMiddle(int idx, int data){

    if(idx == 0){
        addFirst(data);
        return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;


    while (i<idx-1){
        temp = temp.next;
        i++;
    }

    newNode.next  = temp.next;
    temp.next = newNode;
   }

   public int removeFirst(){

    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;    
    }else if(size == 1){
        int val = head.data;
        head = tail =  null;
        size = 0;
        return val;
    }

    int val = head.data;
    head = head.next;
    return val;

   }

  public int removeLirst() {
    if (head == null) {
        System.out.println("LL is Empty");
        return Integer.MIN_VALUE;
    } else if (head.next == null) {
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }

    Node prev = head;

    while (prev.next != tail) {
        prev = prev.next;
    }

    int val = tail.data;
    prev.next = null;
    tail = prev;
    size--;

    return val;
}




public int inteSerch(int key){
    Node temp  = head;
    int i = 0;

    while(temp != null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    }

    return -1;
}






public int helper(Node head, int key){
    if(head ==  null){
        return -1;
    }
    if(head.data == key){
        return 0;
    }

    int idx = helper(head.next, key);
    if(idx == -1){
        return -1;
    }
    return idx+1;
}
public int recSearch(int key){
    return helper(head,key);
}





    public static void main(String[] args) {

        linkedList ll = new linkedList();

        ll.printLL();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);


    
        ll.printLL();

        // ll.removeFirst();
        // ll.printLL();

        // ll.removeLirst();
        // ll.printLL();
        // System.out.println(size);

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        


    }
}