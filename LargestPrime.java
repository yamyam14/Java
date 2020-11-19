public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number){
        if(number <= 1 ) {
            return -1;
        }

        int n = 2;
        int largestPrime = 2;
        boolean isPrime = true;

        while(n <= number){
            if((number % n) == 0){
                for(int i = 2; i < n; i++){
                    if((n % i) == 0){
                        isPrime = false;
                    }
                }

                if(isPrime){
                    largestPrime = n;
                }
            }
            n += 1;
        }

        return largestPrime;
    }

//    public static int getLargestPrime(int number) {
//        if (number > 0) {
//            for (int factor=number; factor>=1; factor--) {
//                if (number%factor == 0) {
//                    for (int i=1; i<=factor; i++){
//                        if (factor%i==0){
//                            continue;
//                        } return factor;
//                    }
//                }
//            }
//        } return -1;
//
//    }
}
