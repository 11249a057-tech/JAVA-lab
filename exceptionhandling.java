import java.util.Scanner;
 class RailwayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] trainCodes = {"TR101", "TR102", "TR103", "TR104"};
        try {
            System.out.print("Enter the index value: ");
            int index = sc.nextInt();
            System.out.println("Train Code: " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: Invalid index value!");
        }
        sc.close();
    }
}