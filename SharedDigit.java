public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,43));
    }

    public static boolean hasSharedDigit(int valA, int valB) {
            if ((valA<10) || (valB<10) || (valA>99) || (valB>99)){
                return false;
            }
            while (valA != 0){
                int digit = valA % 10;
                int num = valB;
                while (num != 0){
                    if ((num % 10) == digit){
                        return true;
                    }
                    num /= 10;
                }
                valA /= 10;
            }
            return false;
    }
}

