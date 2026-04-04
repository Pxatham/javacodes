import java.util.*;
public class grade {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int a=sc.nextInt();
            if(a>=90){
                System.out.println("Your grade is A");
            }
            else if(a>=80){
                System.out.println("Your grade is B");
            }
            else if(a>=70){
                System.out.println("Your grade is C");
            }
            else if(a>=60)
            {
                System.out.println("Your grade is D");
            }
            else
            {
                System.out.println("Your grade is F");
            }
        sc.close();
    }
}
