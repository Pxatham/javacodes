import java.util.Scanner;
class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks 1 ");
        int a=sc.nextInt();
        System.out.println("Enter your marks 2 ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;  // start from bigger number

        while(true) {

            if(max % a == 0 && max % b == 0) {
                System.out.println("LCM = " + max);
                break;   // stop loop
            }

            max++;  // check next number
        }
    }
}