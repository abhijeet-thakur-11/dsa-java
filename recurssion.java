//import java.util.HashSet;

public class recurssion {
    /* 
      
      // fibonacci series using recursion
      public static void calcfib(int a , int b , int n){
      if(n==0){
      return ;
      }
      int c = a+b ;
      System.out.println(c);
      calcfib(b,c,n-1);
      }
     */
    /*
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
     */
    /*
      //Hanoi Tower
     * public static void hanoi(int n , String src , String helper , String dest ){
     * if (n==1){
     * System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
     * return;
     * }
     * hanoi(n-1 , src , dest , helper );
     * System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
     * hanoi(n-1 , helper , src , dest );
     * 
     * }
     *//*
        * // reverse the string using recursion
        * public static void revstr(String str , int ind){
        * if (ind == 0){
        * System.out.println(str.charAt(ind));
        * return;
        * }
        * System.out.println(str.charAt(ind));
        * revstr(str , ind-1);
        * }
        */
    /*
     * // First and last occurence of a letter in the string
     * public static int first = -1;
     * public static int last = -1;
     * 
     * public static void frstlst(String str, int idx , char element){
     * if(idx == str.length()){
     * System.out.println(first);
     * System.out.println(last);
     * return;
     * 
     * }
     * 
     * char curchar = str.charAt(idx);
     * if(curchar == element){
     * if (first == -1){
     * first = idx ;
     * }else {
     * last = idx ;
     * }frstlst(str , idx+1 , element);
     * }
     * }
     */
    /*
     * //to check array is sorted or not
     * 
     * public static boolean checksort(int arry[] , int idx ){
     * if(idx == arry.length - 1){
     * return true;
     * }
     * if(arry[idx]<arry[idx+1]){
     * return checksort(arry , idx+1);
     * }else{
     * return false;
     * }
     * }
     */
    /*
     * //move all the x to the end of the string
     * public static void moveallx(String str , int idx , int count ,String nwstr ){
     * 
     * if(idx == str.length()){
     * for (int i = 0 ; i<count ; i++){
     * nwstr = nwstr +'x';
     * 
     * }
     * System.out.println(nwstr);
     * return;
     * 
     * }
     * 
     * char curchar = str.charAt(idx);
     * if(curchar == 'x'){
     * count++;
     * moveallx(str , idx+1 ,count , nwstr);
     * }else{
     * nwstr = nwstr+curchar;
     * moveallx(str , idx+1, count , nwstr);
     * }
     * 
     * }
     */
    /*
     * //remove the duplicate from the string
     * public static boolean[] map = new boolean[26];
     * public static void removeduplicates(String str , int idx , boolean[] map ,
     * String nwstr){
     * if(idx == str.length()){
     * System.out.println(nwstr);
     * return;
     * }
     * char curchar = str.charAt(idx);
     * if(map[curchar - 'a' ] == true){
     * removeduplicates(str , idx +1 , map , nwstr);
     * 
     * }else{
     * nwstr+=curchar;
     * map[curchar-'a'] = true;
     * removeduplicates(str , idx+1 , map , nwstr);
     * }
     * 
     * }
     */
    /*
     * // subsequesnce of the string
     * public static void subsequence(String str , int idx , String nwstr){
     * if(idx==str.length()){
     * System.out.println(nwstr);
     * return;
     * }
     * char curchar = str.charAt(idx);
     * //to be
     * subsequence(str , idx+1 , nwstr+curchar);
     * //not to be
     * subsequence(str , idx+1 , nwstr);
     * }
     */
    /*
     * // unique subsequesnce of the string
     * public static void subsequence(String str , int idx , String nwstr ,
     * HashSet<String> set){
     * if(idx==str.length()){
     * if(set.contains(nwstr)){
     * return;
     * } else{
     * System.out.println(nwstr);
     * set.add(nwstr);
     * return;
     * }
     * char curchar = str.charAt(idx);
     * //to be
     * subsequence(str , idx+1 , nwstr+curchar , set);
     * //not to be
     * subsequence(str , idx+1 , nwstr , set);
     * }
     */
    /*
     * //print keypad combination
     * public static String[] keypad = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno"
     * , "pqrs" , "tuv" , "wxyz"};
     * public static void printcomb(String str , int idx , String comb){
     * if(idx == str.length()){
     * System.out.println(comb);
     * return;
     * }
     * char curchar = str.charAt(idx);
     * String mapping = keypad[curchar - '0'];
     * for ( int i = 0 ; i<mapping.length() ; i++){
     * printcomb(str , idx+1 , comb+mapping.charAt(i));
     * }
     * }
     */
    /*
     * 
     */

    // print all the solution where queen are safe
    

    public static void main(String[] args) {
    

    }

        // Recursion :- A function that calls itself
        // HashSet<String> set = new HashSet<>(); fpr uniques subsequence of the sting

        // Backtracking :- find all the possible solution of the problem and use one you
        // want

    }

