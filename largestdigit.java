class largestdigit {
    public static void main(String[] args) {

        int num = 53821;
        int max = 0;   // store largest digit

        while(num != 0) {

            int digit = num % 10; // get last digit

            if(digit > max) {
                max = digit;      // update max
            }

            num = num / 10;       // remove last digit
        }

        System.out.println("Largest digit = " + max);
    }
}