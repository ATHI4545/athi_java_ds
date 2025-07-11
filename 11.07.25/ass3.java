public class Main {
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 19;
        int iterations = 0;
        boolean isHappy = false;

        while (iterations < 10) {
            int result = sumOfSquares(number);
            if (result == 1) {
                isHappy = true;
                break;
            }
            number = result;
            iterations++;
        }

        if (isHappy) {
            System.out.println("The number is a HAPPY number!");
        } else {
            System.out.println("The number is NOT a happy number within 10 cycles.");
        }
    }
}