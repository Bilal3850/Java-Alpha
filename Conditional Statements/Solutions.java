import java.util.*;

public class Solutions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //? Question 1
        // int num = sc.nextInt();
        // if (num > 0) {
        //     System.out.println("Number is Positive.");
        // } else {
        //     System.out.println("Number is Negative.");
        // }
        

        //? Question 2
        // double temp = 103.5;
        // if (temp > 100) {
        //     System.out.println("You have fewer.");
        // } else {
        //     System.out.println("You Don't have fewer.");
        // }
        

        //? Question 3
        // int num = sc.nextInt();
        // switch (num) {
        //     case 1: System.out.println("Monday");
        //         break;
        //     case 2: System.out.println("Tuesday");
        //         break;
        //     case 3: System.out.println("Wednesday");
        //         break;
        //     case 4: System.out.println("Thursday");
        //         break;
        //     case 5: System.out.println("Friday");
        //         break;
        //     case 6: System.out.println("Saturday");
        //         break;
        //     case 7: System.out.println("Sunday");
        //         break;
        //     default: System.out.println("There is nothing");
        //         break;
        // }

        //? Question 4
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
            

    }
}