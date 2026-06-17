import java.util.Arrays;

import java.util.Scanner;

public class Basics {
    public static void printjava() {
        System.out.println("Hello Java this side ");
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        // int a = 5;
        // int b = 15;
        String name = "Alice";
        // int sum = a + b;
        // System.out.println(name.length());

        // string

        Scanner sc = new Scanner(System.in);
        String Fullname =sc.nextLine();
        System.out.println("Full Name is " + Fullname + " ");
        
        // concatination
        String name1 = " perry";
        String name2 = " the platypus";
        String name3 = name + name1 + name2;
        // System.out.println(name3);

        // CharAt
        // System.out.println(name.charAt(4));
        // System.out.println(name3.charAt(0));

        // length
        // System.out.println(name3.length());

        // replace
        // String name4 = name3.replace("a", "q");
        // System.out.println(name4);
        // System.out.println(name3);

        // substring
        // System.out.println(name3.substring(5,10));

        //Compare two strings 
        /*String str1 = "Hello";
        String str2 = "World";
        if (str1.compareTo(str2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }*/
       StringBuilder sb = new StringBuilder("Tony");
       sb.setCharAt(0,'p');
       System.out.println(sb);
       sb.insert(0 , "k");
       System.out.println(sb);
       sb.delete(0,1);
       System.out.println(sb);
    
       

        // Arrays
        // int[] marks = {90,94,0};
        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 94;

        // System.out.println(marks);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]); default value will be 0

        // System.out.println(marks.length);

        // System.out.println(marks[0]);
        // Arrays.sort(marks); (after writing this the array will become sorted)
        // System.out.println(marks[0]);

        // 2-D Arrays

        // int[][] finalmarks = { { 89, 94, 88 }, { 85, 90, 92 } };
       /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns:");
        int column = sc.nextInt();


        int[][] finalmarks = new int[row][column];
        for(int i=0 ; i<row ; i++){
            for(int j =0 ; j<column ; j++){
                finalmarks[i][j] = sc.nextInt();
            }
        }
        for(int i =0 ; i<row ; i++){
            for(int j =0 ; j<column ; j++){
                System.out.print(finalmarks[i][j] + " " );
            }
            System.out.println();
        }*/

        // System.out.println(finalmarks[1][2]);
        // System.out.println(finalmarks[0]);

        // Casting :- converting from one data type to another

        // implicit casting
        // double price = 100.00;
        // double finalprice = price + 20 ;
        // System.out.println(finalprice);

        // Explicit Casting :- numbers after decimal gets ignored
        // int p = 100;
        // int fp = p + (int)20.99;
        // System.out.println(fp);

        // operators

        int a = 10;
        int b = 7;
        int add = a + b;
        int subs = a - b;
        int mult = a * b;
        int div = a / b;
        int mod = a % b;
        int inc = a++;
        int dec = b--;
        // System.out.println(add);
        // System.out.println(subs) ;
        // System.out.println(div);
        // System.out.println(mult);
        // System.out.println(mod);
        // System.out.println(inc);
        // System.out.println(dec);

        // Maths operators

        // System.out.println(Math.max(a,b));
        // System.out.println(Math.min(a,b));

        // Taking inputs
        //Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your Age:");
        // int Age = sc.nextInt();
        // System.out.println(Age);

        // System.out.println("Enter Your Name :");
        // String Name = sc.next();
        // System.out.println(Name);

        // System.out.println("Enter Your full Name:");
        // String Name = sc.nextLine();
        // System.out.println(Name);

        // Conditional Statement

        // int Age = 17;
        // if(Age>18)
        // System.out.println("Can vote'");
        // else
        // System.out.println("Can't Vote");

        int c = 50;
        int d = 80;
        // if(c < 40 && d>40)
        // System.out.println("it will work only if both condtions are true");
        // else
        // System.out.println("One of the conditon is not true ");

        // if(c<40 || d>40)
        // System.out.println("It will work if either of the condtions are true ");
        // else
        // System.out.println("I don't know what will happen");

        // Switch
        // int day = 1;
        // switch(day){
        // case 1 : System.out.println("Today is monday");
        // break;
        // case 2 : System.out.println("Today is tuesday");
        // break;
        // case 3 : System.out.println("Today is wednesday");
        // break;
        // case 4 : System.out.println("Today is thursday");
        // break;
        // case 5 : System.out.println("Today is friday");
        // break;
        // case 6 : System.out.println("Today is saturday");
        // break;
        // case 7 : System.out.println("Today is sunday");
        // break;
        // default : System.out.println("Invalid day");

        // Loops

        // for(int i = 0 ; i<50 ; i++){
        // System.out.println(i);
        // }

        // int i = 1;
        // while(i<= 20){
        // System.out.println(i);
        // i=i+2;
        // }

        // Exceptional Handling
        // int[] marks1 = {85 , 98 , 93};
        // try{
        // System.out.println(marks1[6]);

        // } catch(Exception exception){

        // }
        // System.out.println("Exception handeled Successfully");

        // Methods and Functions
        // check the above part of the code
        for (int i = 0; i < 5; i++) {
            // printjava();
        }
        int a1 = 93;
        int b1 = 86;
        // add(a1,b1);

    }

}
