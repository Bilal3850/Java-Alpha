import java.util.*;

public class Question {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question    1
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int sum = a + b + c;
        // float Avg = sum / 3;
        // System.out.println("The Average of Three No is " + Avg);

        // Question     2
        // float Area = a * a;
        // System.out.println("Area of Square is " + Area);

        // Question     3
        float pencile = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pen + eraser + pencile;
        System.out.println("Total Cost of the Three items is " + total);
        
        // you Can add total 18% GST.
        float tax = total + (0.18f * total);
        System.out.println("Bill with 18% GST ; " + tax);


    }
}