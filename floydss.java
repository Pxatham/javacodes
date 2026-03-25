public class floydss {
    public static void main(String[] args) {

        int n = 4;      // number of rows
        int num = 1;    // number to print

        for(int i = 1; i <= n; i++) {   // rows
            for(int j = 1; j <= i; j++) {   // columns
                System.out.print(num + " ");
                num++;   // increase number each time
            }
            System.out.println(); // move to next line
        }
    }
}
