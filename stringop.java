import java.util.Scanner;
 class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Length
        System.out.println("Length: " + str.length());
        // Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());
        // Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());
        // Reverse
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);
        // Palindrome Check
        if (str.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        sc.close();
    }
}