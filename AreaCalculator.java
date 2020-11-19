public class AreaCalculator {

    public static void main(String[] args) {
        area(-4);
        area(5,-6);

    }

    public static double area (double radius){
        if (radius<0){
            System.out.println("Invalid Value");
            return -1.0;
        }
        double area = radius * radius * Math.PI;
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        return area;
    }

    public static double area ( double x, double y){
        if (x<0 || y<0) {
            System.out.println("Invalid Value");
            return -1.0;
        }
        double area =  x * y;
        System.out.println("The area of a rectangle with sides " + x + " and " + y + " is " + area);
        return area;
    }
}
