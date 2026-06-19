import java.util.Scanner;
public class overload {
    public void compare(int a, int b){
        if(a>b) System.out.print(a + " is greater than " + b);
        else if(b>a) System.out.print(b + " is greater than " + a);
        else System.out.print("Both are equal");
    }
    public void compare(char a, char b){
        if((int)a>(int)b) System.out.print(a + " is greater than " + b);
        else if((int)b>(int)a) System.out.print(b + " is greater than " + a);
        else System.out.print("Both are equal");
    }
    public void compare(String a, String b){
        if(a.length()>b.length()) System.out.print(a + " is greater than " + b);
        else if(b.length()>a.length()) System.out.print(b + " is greater than " + a);
        else System.out.print("Both are of equal length");
    }
    public static void main(String[] args) {
        overload obj = new overload();
        
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // --- 1. Integer Input ---
        System.out.println("--- Compare Integers ---");
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt(); // Reads an integer
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        obj.compare(num1, num2); 

        // --- 2. Character Input ---
        System.out.println("\n--- Compare Characters ---");
        System.out.print("Enter first character: ");
        // Scanner doesn't have a nextChar(), so we read a string and grab the first letter
        char char1 = scanner.next().charAt(0); 
        System.out.print("Enter second character: ");
        char char2 = scanner.next().charAt(0);
        obj.compare(char1, char2);

        // --- 3. String Input ---
        System.out.println("\n--- Compare Strings ---");
        System.out.print("Enter first string: ");
        String str1 = scanner.next(); // Reads a single word
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        obj.compare(str1, str2);

        // Always close the scanner when you're done with it
        scanner.close();
    }
}