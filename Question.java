import java.util.Scanner;

public class Question {
    public static void main(String[] args0) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Budget:");
        int Budget = sc.nextInt();
        int pen = 10;
        int notebook = 50;

        if (Budget == pen + notebook || Budget > pen + notebook)
            System.out.println("You can buy both");
        else if (Budget >= pen && Budget < notebook)
            System.out.println("You can buy only pen");
        else if (Budget >= notebook && Budget < pen + notebook)
            System.out.println("You can buy only notebook");
        else
            System.out.println("You can't buy anything");

    }

}
