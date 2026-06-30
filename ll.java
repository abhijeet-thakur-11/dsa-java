import java.util.*;

import org.w3c.dom.Node;
public class ll {
    Node head; // creating head
    Node next;

    private int size; //to track the size without iterating 
    
    //assigning the size to be zero at the starting 
    ll(){
        this.size = 0;
    }

    
    class Node{
        String data ;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++; // whenever a new node is created the size will be increased by 1
        }
    }
    

    // add at first postionof the linked list 
    public void addfirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add at the last position of the linked list
    public void addlast(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode = currnode.next;
            
        }
        currnode.next = newnode;
    }

    //print linked list 
    public void printlist(){
        if (head == null){
            System.out.println("linked list is empty");
            return;
        }
        Node currnode = head ; 
        while (currnode != null){
            System.out.print(currnode.data + " --> ");
            currnode = currnode.next;
        }
        System.out.println("null");
    }

    //delete first nodein linked list 
    public void deletefirst(){
        if (head == null){
            System.out.println("Linked list is empty");
            return;
        }
        size--; // whenever a node is deleted the size will be decreased by 1
        head = head.next;
    }

    // delete last 
    public void deletelast(){
        if( head == null){
            System.out.println("linked list is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        size--; // whenever a node is deleted the size will be decreased by 1
        Node secondlast = head ;
        Node lastnode = head.next;
        while (lastnode.next != null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    //to tarack the size of the linked list 
    public int getsize(){
        return size;
    }


  //revrse a linked list using iterative approach
  public void reverseiterate(){
    if(head == null || head.next == null){
        return;
    }
   
    Node prevnode = head;
    Node currnode = head.next;
    while(currnode != null){
        Node nextnode = currnode.next;
        currnode.next = prevnode;

        //update 
        prevnode = currnode;
        currnode = nextnode;
    }
    head.next = null;
    head = prevnode; 

  }

    public static void main(String[] args){
      
      //can also use the addfirst , addlast without writing the whole fucton (inbuilt)
      LinkedList<String> list = new LinkedList<String>();
      list.addFirst("a");
      list.addLast("is");
      list.add("list"); // by default new node is added at the last position 
      System.out.println(list);

      System.out.println(list.size());// will tells the size (inbuilt)

      //to print the linked list
      for (int i = 0 ; i<list.size() ; i++){
        System.out.print(list.get(i) + " -->  ");
      }
      System.out.println("null");

      // to remove the first and last using inbuilt fuctions
      list.removeFirst();
      System.out.println(list);

      list.removeLast();
      System.out.println(list);

      //can remove aparticular indexed node 
      //list.remove(1);
      //System.out.println(list);

    
      //reversing a Linked list using iterative approach 
      ll list1 = new ll();
      list1.addfirst("1");
      list1.addfirst("2");
      list1.addfirst("3");
      list1.addfirst("4");
      list1.printlist();
      
      list1.reverseiterate();
      list1.printlist();
    }
}
