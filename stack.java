import java.util.*;

public class stack {

    /*
     * // for ArrayList implementation of Stack
     * static class Stack {
     * static ArrayList<Integer> list = new ArrayList<>();
     * 
     * public static boolean isEmpty() {
     * if (list.size() == 0) {
     * return true;
     * }
     * return false;
     * }
     * 
     * // push function
     * public static void push(int data) {
     * list.add(data);
     * 
     * }
     * 
     * // pop function
     * public static int pop() {
     * if (list.isEmpty()) {
     * return -1;
     * }
     * int top = list.get(list.size() - 1);
     * list.remove(list.size() - 1);
     * return top;
     * }
     * 
     * // peek function
     * public static int peek() {
     * if (list.isEmpty()) {
     * return -1;
     * }
     * int top = list.get(list.size() - 1);
     * return top;
     * }
     * }
     */

    /*
     * // for Linked List implementation of the Stack
     * public static class Node {
     * int data;
     * Node next;
     * 
     * public Node(int data) {
     * this.data = data;
     * next = null;
     * }
     * }
     * 
     * static class Stack {
     * public static Node head;
     * 
     * public static boolean isempty() {
     * return head == null;
     * }
     * 
     * //to push the element in the stack
     * public static void push(int data) {
     * Node newnode = new Node(data);
     * if (isempty()) {
     * head = newnode;
     * return;
     * }
     * newnode.next = head;
     * head = newnode;
     * }
     * 
     * //to pop the element at the top in the stack
     * public static int pop(){
     * if(isempty()){
     * return -1;
     * }
     * int top = head.data;
     * head = head.next;
     * return top;
     * }
     * 
     * //to peek the element at the top of the stack
     * public static int peek(){
     * if(isempty()){
     * return -1;
     * }
     * return head.data;
     * }
     * }
     */

    // pushing new element at the bottom of the stack
     
    public static void pushbottom(int data , Stack<Integer> s ){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushbottom(data , s);
        s.push(top);
    }
     
    
    //reverse a stack
    public static void revstack(Stack<Integer> s){
        if (s.isEmpty()){
            return ;
        }
        int top = s.pop();
        revstack(s);
        pushbottom(top , s);
    }
    
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>(); // for usin inbuilt functions of stack 
        // Stack s = new Stack(); //for Arraylist and linkedlist only
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        //pushbottom(4 , s);

        revstack(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
