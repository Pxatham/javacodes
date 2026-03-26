class countdigits {
    public static void main(String[] args) {

        int num = 12345;  // number
        int count = 0;    // digit counter

        while(num != 0) {   // loop until number becomes 0
            num = num / 10; // remove last digit
            count++;        // increase counter
        }

        System.out.println("Digits = " + count);
    }
}