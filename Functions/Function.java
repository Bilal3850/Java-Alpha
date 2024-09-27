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

    // Prime or Not

    // public static void primeInRange(int n) {
    //     for (int j = 2; j <= n; j++) {
    //         boolean prime = true;
    //         for (int i = 2; i <= Math.sqrt(n); i++) {
    //             if (n % i == 0) {
    //                 prime = false;
    //                 break;
    //             }
    //         }
    //         if (prime) {
    //             System.out.print(j + " ");
    //         }
            
    //     }
    //     System.out.println();
    // }

    public static void printPrimeInRange(int n) {
        // System.out.println("Prime numbers between " " and " + n + " are:");
        
        for (int number = 1; number <= n; number++) {
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false; // 0 and 1 are not prime
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Not prime if divisible by any number other than 1 and itself
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // New line after printing all primes
    }

    // public static void primeInRange(int n) {
    // for (int i = 2; i <= n; i++) {
    // if (isPrime(i)) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    //      BINARY TO DECIMAL NO;
    public static void biToDec(int myNum) {
        int dec = 0;
        int pow = 0;
        int byNum = myNum;
        while (myNum > 0) {
            int lastDig = myNum % 10;
            dec = dec + (lastDig * (int)Math.pow(2, pow));
            pow++;
            myNum = myNum / 10;
        }

        System.out.println("Decimal of " + byNum + " = " + dec);
    }

    public static void decToBi(int n) {
        int myNum = n;
        int binNum = 0;
        for (int pow = 0; n > 0; pow++) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            n /= 2;
        }
        System.out.println("Binary of " + myNum + " = " + binNum);
    }
    

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

        // printPrimeInRange(100);

        biToDec(1101);
        decToBi(13);

    }
}