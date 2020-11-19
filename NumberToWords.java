public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
    }
    public static void numberToWords(int number) {

        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        int num = reverse(number);

        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }


        int count2 = getDigitCount(num);
        int count1 = getDigitCount(number);
        int difference = count1 - count2;
        while (num >= 0) {
            int lastDigit = num % 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            num /= 10;
            if (num == 0) {
                break;
            }
        }

        if (difference > 0) {
            for (int i = 0; i < difference; i++) {
                System.out.println("Zero");
            }
        }


    }

    public static int reverse(int number) {
        int result = 0;
        String resultStr = "";
        if (number < 0) {
            String strNum = "" + Math.abs(number);

            for (int i = strNum.length() - 1; i >= 0; i--) {
                resultStr += strNum.charAt(i);


            }
        } else {
            String strNum = "" + number;
            for (int i = strNum.length() - 1; i >= 0; i--) {
                resultStr += strNum.charAt(i);
            }
        }
        if (number < 0) {
            result = -1 * Integer.parseInt(resultStr);
        } else {
            result = Integer.parseInt(resultStr);
        }
        return result;

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;

        while (number > 0) {
            int check = number % 10;
            count++;
            number /= 10;
        }

        return count;

    }
}
