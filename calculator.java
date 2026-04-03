import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // choose operation
        System.out.println("1.Add  2.Sub  3.Mul  4.Div");
        int choice = sc.nextInt();

        // switch case
        switch(choice) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;

            case 2:
                System.out.println("Sub = " + (a - b));
                break;

            case 3:
                System.out.println("Mul = " + (a * b));
                break;

            case 4:
                System.out.println("Div = " + (a / b));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}