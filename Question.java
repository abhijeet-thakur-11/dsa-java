import java.util.Scanner;

public class Question {
    public static void main(String[] args0) {

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter Your Budget:");
        //int Budget = sc.nextInt();
        //int pen = 10;
        //int notebook = 50;

        //if (Budget == pen + notebook || Budget > pen + notebook)
          //  System.out.println("You can buy both");
        //else if (Budget >= pen && Budget < notebook)
            //System.out.println("You can buy only pen");
        //else if (Budget >= notebook && Budget < pen + notebook)
            //System.out.println("You can buy only notebook");
        //else
            //System.out.println("You can't buy anything");




        //int num = 0;
        //do{
          //  Scanner sc = new Scanner(System.in);
            //System.out.println("enter the number:");
            //num = sc.nextInt();
            //System.out.println(num);
        //}
        //while(num>0);

        //Mini Project 
         int mynum= (int)(Math.random()*100);
         Scanner sc = new Scanner(System.in);
         int usernum = 0;

         do{
             System.out.println("Guess the number between 1 to 100");
             usernum = sc.nextInt();
           
            if(usernum == mynum){
                System.out.println("You guessed the number correctly");
                break;
            }else if (usernum>mynum){
                System.out.println("Your number is greater than the acual number");

            }else if (usernum<mynum){
                System.out.println("Your number is smaller than the acual number");
            }
        } while(usernum>0);
         System.out.print("My number was :");
         System.out.println(mynum);
         

            

         

    }

}
