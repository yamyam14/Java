public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(120));
    }

    public static boolean isPalindrome (int number){
        int reverse = 0;
        int number2 = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse*10) + lastDigit;
            number /= 10;
        }
        return number2 == reverse;
    }
}
