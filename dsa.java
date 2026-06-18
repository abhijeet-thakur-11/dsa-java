public class dsa {

    public static void calcfib(int a , int b , int n){
        if(n==0){
            return ;
        }
        int c = a+b ;
        System.out.println(c);
        calcfib(b,c,n-1);
    }    
    public static void main(String[] args) {
        int a = 0;
        int b =1;
        int n= 15;
        System.out.println(a);
        System.out.println(b);
        calcfib(a,b,n-2);
       
        // Recursion :- A function that calls itself

    
    }
    
}
