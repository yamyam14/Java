public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(7));
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        if (number>0) {
            for (int i=1; i<=number-1; i++){
                int remainder = number%i;
                if (remainder==0){
                    sum= sum + i;
                }
            } return number == sum;
        } return false;
    }
}
