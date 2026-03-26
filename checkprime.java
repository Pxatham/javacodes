class checkprime {
    public static void main(String[] args) {

        int num = 7;
        int count = 0;

        for(int i = 1; i <= num; i++) {

            if(num % i == 0) { // check divisibility
                count++;       // increase if divisible
            }
        }

        if(count == 2) {  // prime has exactly 2 factors
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}