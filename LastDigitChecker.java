public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(8));

    }

    public static boolean hasSameLastDigit(int valA, int valB, int valC) {
        if (isValid(valA) && isValid(valB) && isValid(valC)){
            return (valA%10 == valB%10) || (valB%10 == valC%10) || (valA%10 == valC%10);
        } return false;
    }

     public static boolean isValid(int valX) {
        return valX >= 10 && valX <= 1000;
     }

}
