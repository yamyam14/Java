public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(-525600);

    }

    public static void printYearsAndDays( long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long calculatedDays = minutes / 60 / 24;
            long calculatedYears = calculatedDays / 365;
            calculatedDays = calculatedDays % 365;
            System.out.println(minutes + " min = " + calculatedYears + " y and " + calculatedDays + " d");
        }
    }
}
