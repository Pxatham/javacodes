class sumeven {
    public static void main(String[] args) {

        int n = 10;
        int sum = 0;

        for(int i = 1; i <= n; i++) {

            if(i % 2 == 0) {  // check even
                sum = sum + i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}