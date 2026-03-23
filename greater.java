import java.util.*;
public class greater {
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.print("a is qual to b");
        }
        else{
            if(a>b){
                System.out.print("a is greater than b");
            }
            else{
                System.out.print("a is smaller than b");
            }
        }
    }
}
