public class prime {
    public static void main(String[] args){
        int num=37;
        boolean isprime = true;
        if(num <= 1) {
            isprime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        System.out.print(isprime);
    }
}
