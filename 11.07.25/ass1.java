public class Main {
    public static void main(String[] args) {
        int sqdnumber = 234
        int sqdNumber_result = 0;

        while (sqdnumber > 0) {
            int digit = sqdnumber % 10;
            sqdNumber_result += digit * digit;
            sqdnumber /= 10;
        }

        System.out.println("Sum of squares of digits: " + sqdNumber_result);
    }
}