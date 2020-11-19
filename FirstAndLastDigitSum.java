public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));//
        System.out.println(sumFirstAndLastDigit(257));//

    }

    public static int sumFirstAndLastDigit(int number) {
            int firstDigit = 0, lastDigit = 0;

            if (number < 0) return -1;
            if (number < 10) {
                firstDigit = number;
                lastDigit = number;

                return firstDigit + lastDigit;
            }

            lastDigit = number % 10;

            while (number > 0) {

                number /= 10;

                if (number < 10) {
                    firstDigit = number;
                    break;
                }
            }

            return lastDigit + firstDigit;
    }
}

