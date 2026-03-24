public class pyr {
    public static void main(String []args){
        int n=4;
        //outer loop for verticle 
        for(int i=1;i<=n;i++){
            // inner loop for space print 
            for(int k=1;k<=n-i;k++){
                 System.out.print(" ");
            }
            // inner loop for star print 
            for(int j=1;j<=i  ;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

