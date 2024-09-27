import java.util.*;

public class SolutionFun{

    // ? Question 1: Write a Java method to compute the average of three numbers

    public static int avg(int a, int b, int c) {
        int average = (a + b + c)/3;
        System.out.println("Average of the Three Numbers is : " + average);
        return average;
    }

    // ? Question 2: Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

    public static boolean even(int num) {
        
        if (num % 2 == 0) {
            System.out.println("Number is Even.");
            return true;
        } else {
            System.err.println("Number is Odd");
            return false;
        }
        
    }

    // ? Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)

    public static void palindrome(int num) {
        int original = num;
        int reverse = 0;
        int temp = original;
        while (temp != 0) {
            int lastdigit = temp % 10;
            reverse = reverse * 10 + lastdigit;
            temp /= 10;
        }
        if (reverse == original) {
            System.out.println("The Number is Palindrome.");
        } else {
            System.out.println("The Number is Not a Palindrome.");
        }
    }

    // ?  Question 5

    public static void sumDigit(int num) {
        int oriNum = num;
        int sum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            sum += lastdigit;
            num /= 10;
        }
        System.out.println("The sum of Integer Digit " + oriNum + " is : " + sum);
    }
    
    public static void main(String[] args) {
        // avg(13, 89, 60);

        // even(13);
        // palindrome(1523421);
        // sumDigit(12);
    }
}