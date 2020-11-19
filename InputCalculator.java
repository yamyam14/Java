import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        double average = 0;

        while (true) {

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int number = scanner.nextInt();
                sum = sum + number;
                counter ++;
                average = (double)sum/counter;
            } else {

                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));

        scanner.close();
    }
}
