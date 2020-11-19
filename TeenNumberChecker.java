public class TeenNumberChecker {
    public static boolean hasTeen( int valA, int valB, int valC){
        if ((valA >= 13 && valA <= 19) || (valB >= 13 && valB <= 19) || (valC >= 13 && valC <= 19)){
            return true;
        } return false;
    }

    public static boolean isTeen(int valD){
        if (valD >= 13 && valD <=19){
            return true;
        } return false;
    }
}
