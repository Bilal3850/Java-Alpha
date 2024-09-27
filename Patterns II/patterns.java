import java.util.*;

public class patterns {

    public static void rectangle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print(" * ");
                } else {
                    System.err.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void rotatedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rotatedNumTri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void increasingNoTri(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void triangle_0_1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // Spaces ---
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("   ");
            }
            // stars *
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // 2nd Half
        for (int i = n; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // Spaces ---
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("   ");
            }
            // stars *
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    } // solid Rombas

    public static void Rombas(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            // print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            // print *
            for (int j2 = 1; j2 <= n; j2++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Hollow Rhombus
    public static void hollow_Rombus(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print( i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicNoTri(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Num
            // Desending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Assending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // rectangle(5, 5);
        // rotatedTriangle(8);
        // rotatedNumTri(5);
        // increasingNoTri(5);
        // triangle_0_1(5);
        // butterfly(5);
        // Rombas(9);
        // hollow_Rombus(7);
        // diamond(5);
        // numberPyramid(5);
        palindromicNoTri(6);
    }
}