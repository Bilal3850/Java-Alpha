import java.util.*;

public class Function {

    public static void name(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void calculateSum(int a, int b) {

        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }

    public static int product(int a, int b) {

        int product = a * b;
        System.out.println("Product is : " + product);
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        // System.out.println(f);
        return f;
    }

    public static int biocoeff(int n, int r) {
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n - r);
        int biocoeff = fac_n / (fac_r * fac_nmr);
        return biocoeff;

    }

    // FUNCTION OVERLOADING // * Mult Func with the Same Name But Different
    // Parameter
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float sum(float a, float b, float c) {
        float sum = a + b + c;
        return sum;
    }

    //          Prime or Not

    public static boolean isPrime(int n) {
        boolean prime = true;
        if (n == 2) {
            System.out.println("prime.");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                }                
            }
            // if (prime == true) {
            //     System.out.println("Prime.");
            // } else {
            //     System.out.println("Not Prime.");
            // }
        }

        return prime;
    }

    // public static void primeInRange(int n) {
    //     for (int i = 2; i <= n; i++) {
    //         if (isPrime(i)) {
    //             System.out.print(i + " ");
    //         }
    //     }
    // }

    /***************************************************************************************************/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // calculateSum(num1, num2);
        // name("Muhammd Bilal");
        // name("Imrando");

        // int p1 = sc.nextInt();
        // int p2 = sc.nextInt();
        // product(p1 , p2);

        // factorial(4);

        // System.out.println(biocoeff(4, 2));

        // System.out.println(sum(10, 20));
        // System.out.println(sum(10, 20, 20));

        // isPrime(1673);

        primeInRange(100);

    }
}