public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        } return Math.round(kilometersPerHour/1.609);
    }
    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour<0) {
            System.out.println("Invalid Value");
        } else System.out.println(kilometersPerHour + " km/hr = " + milesPerHour+ " mi/hr");

    }
}
