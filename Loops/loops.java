import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int range = scanner.nextInt();
        // int i = 1;
        // while (i <= range) {
        // System.out.print(i + " ");
        // i++;
        // }

        // System.out.println("\nthe loops is complete");

        // int i = 0;
        // while (i < 4) {
        // System.out.println("* * * *");
        // i++;
        // }

        // for (int i = 0; i < 4; i++) {
        // System.out.println("* * * *");
        // }

        // int n = scanner.nextInt();
        // while (n > 0) {
        // int lastDigit = n % 10;
        // System.out.print(lastDigit);
        // n /= 10;
        // }
        // System.out.println();

        // int n = scanner.nextInt();
        // int rev = 0;
        // while (n > 0) {
        // int lastDigit = n % 10;
        // rev = rev * 10 + lastDigit;
        // n /= 10;

        // }
        // System.out.println("Reversed number: " + rev);

        // for (int i = 1; i < 10; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("i'm out of the loop.");

        // do {
        // System.out.println("Enter Your No : ");
        // int input = scanner.nextInt();
        // if (input % 10 == 0) {
        // break;
        // }

        // } while (true);

        // int i = 1;
        // while (i <= 10) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // i++;
        // }

        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // todo If the number is prime or not. 
        // int n = scanner.nextInt();
        // if (n == 2) {
        //     System.out.println("n is prime");
        // } else {
        //     boolean isPrime = true;
        //     for (int i = 2; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             isPrime = false;
        //         }
        //     }
        //     if (isPrime == true) {
        //         System.out.println("n is Prime.");
        //     } else {
        //         System.out.println("N is Not Prime.");
        //     }
        // }

        // ?        Question 1:
        // int n = scanner.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.err.println(n + " x " + i + " = " + n * i);
        // }

        // ?        Question 2;
        // int interger;
        // int choice;
        // int even = 0;
        // int odd = 0;
        // do {
        //     System.out.println("Enter the number :");
        //     interger = scanner.nextInt();
        //     if (interger % 2 == 0) {
        //         even += interger;
        //     } else {
        //         odd += interger;
        //     }

        //     System.out.println("Please Enter 1 to Continue or 0 to Stop.");
        //     choice = scanner.nextInt();
        // } while (choice == 1);

        // System.out.println("Sum of Even Numbers: " + even);
        // System.out.println("Sum of Odd Numbers: " + odd);

        // ?        Question 3:
        // int num;
        // num = scanner.nextInt();
        // int factorial = 1;
        // for (int i = 1; i <= num; i++) {
        //     factorial *= i;
        // }
        // System.out.println("Factorial is :" + factorial);


        //  !       PATTERN (I)
        // for (int line = 1; line <= 4; line++) {
        //     for (int star = 1; star <= line; star++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 7;
        // for (int i = 1; i <= n; i++) {
        //     for (int s = 1; s <= n - i + 1; s++) {
        //         System.out.print("x ");
        //     }
        //     System.out.println();
        // }

        // int n = 7;
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // char ch = 'A';

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(ch );
        //         ch++;
        //     }
        //     System.out.println();
        // }
    }
}