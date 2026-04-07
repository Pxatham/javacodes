import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;

        // loop to add digits
        while(n != 0){
            sum = sum + (n % 10); // add last digit
            n = n / 10;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}