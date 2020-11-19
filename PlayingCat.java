public class PlayingCat {

    public static void main(String[] args) {
        isCatPlaying(true,10);
        isCatPlaying(false,36);
        isCatPlaying(false,35);

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer){
            if (temperature>=25 && temperature<=45){
                System.out.println("TRUE");
                return true;
            }
            System.out.println("FALSE");
            return false;
        }
        else {
            if (temperature>=25 && temperature<=35){
                System.out.println("TRUE");
                return true;
            }
            System.out.println("FALSE");
            return false;
        }
    }
}
