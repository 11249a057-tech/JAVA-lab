import java.util.Scanner;
 class AgeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            String input = sc.nextLine();
            int age = Integer.parseInt(input);
            int result = age / 0;
            System.out.println("Result = " + result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter a valid numeric age.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
        sc.close();
    }
}