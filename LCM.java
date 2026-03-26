class LCM {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;

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