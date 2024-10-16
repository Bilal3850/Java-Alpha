import java.util.*;

public class strings {

    //              Palindrome
    public static boolean Palindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length()-1;
            if (str.charAt(i) != str.charAt(n - i)) {
                System.out.println("Not a Palindrome");
                return false;
            }
        }

        System.out.println("Palindrome");
        return true;
    }

    // ******************************************************** //
    
    //              Find shortest Distance in E W N S
    
    public static float getShortestDistance(String path) {
        
        int x = 0 , y = 0;
        
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        
        int Xsquare = x * x;
        int Ysquare = y * y;
        return (float)Math.sqrt(Xsquare + Ysquare);
    }
    
    // ******************************************************** //
    
    //              Substring
    
    public static String subString(String str, int sI, int eI) {
        String subSt = "";
        for (int i = sI; i < eI; i++) {
            subSt += str.charAt(i);
        }
        return subSt;
    }
    
    // ******************************************************** //

    //              Compare Strings Which one is Greater

    public static void compareStrings(String arr[]) {
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }


    // ******************************************************** //

    //              
    
    // ******************************************************** //
    // ******************************************************** //
    // ******************************************************** //


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String str = "Hello World";

        // for (int i = 0; i < str.length(); i++) {
        //     System.out.print(str.charAt(i) + " ");
        // }
        // System.out.println();
        
        // String str1 = new String("Bilal");
        // String str2 ;
        // str2 = sc.nextLine();

        // System.out.println(str.charAt(1));
        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str.length());

        //              Palindrome

        // String word = "racecar";
        // System.out.println(Palindrome(word));

        //              Find shortest Distance in E W N S
        
        // String Direction = "EEEEN";
        // System.out.println(getShortestDistance(Direction));

        //              Substring

        // String string = "HelloWorld";
        // java string method (substring)
        // System.out.println(string.substring(0, 5));
        // Through Function
        // System.out.println(subString(string, 0, 5));
        
        // String string = "HelloWorld";
        // String string2 = "HelloWorld";
        // String string3 = new String("HelloWorld");
        // if (string == string2) {
        //     System.out.println("==");
        // } else {
        //     System.out.println("!=");
        // }
        // if (string.equals(string3)) {                    // * .Equals(string3) */
        //     System.out.println("==");
        // } else {
        //     System.out.println("!=");
        // }

        // * Compare Strings with another Strings *//
        
        // String fruit[] = {"apple", "banana", "graps"};
        // compareStrings(fruit);
        
        
        

    }
}
