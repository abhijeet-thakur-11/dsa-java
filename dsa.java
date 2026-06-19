public class dsa {
    
    // fibonacci series using recursion
    public static void calcfib(int a , int b , int n){
        if(n==0){
            return ;
        }
        int c = a+b ;
        System.out.println(c);
        calcfib(b,c,n-1);
    } 
    
    //print x^n(stack height = n)
    public static int calcpower(int x , int n){
        if(n==0){
            return 1;
        }if (x==0){
            return 1;
        }
        int xpowernm1 = calcpower(x , n-1);
        int xpowern = x*xpowernm1;
        return xpowern;

    }

    //Hanoi Tower
    public static void hanoi(int n , String src , String helper , String dest ){
        if (n==1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        hanoi(n-1 , src , dest , helper );
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        hanoi(n-1 , helper , src , dest );

    }

    // reverse the string using recursion 
    public static void revstr(String str , int ind){
        if (ind == 0){
            System.out.println(str.charAt(ind));
            return;
        }
        System.out.println(str.charAt(ind));
        revstr(str , ind-1);
    }
    
    
    public static void main(String[] args) {
        
        // Recursion :- A function that calls itself
        int n = 3;
        //hanoi(n , "s", "h" , "d");
        String str = "Abhijeet thaur";

        revstr(str,str.length()-1);





    }
    
}
