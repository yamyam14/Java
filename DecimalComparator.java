public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.123,1.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double valA, double valB) {
        long convertedA = (int)(valA * 1000);
        long convertedB = (int)(valB * 1000);
        return convertedA == convertedB;
    }
}


//String strDouble = String. format("%. 2f"