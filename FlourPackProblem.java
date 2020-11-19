public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(-3,2,12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        return (bigCount*5) + (smallCount) >= goal;
        if(smallCount+(bigCount*5)<goal){
            return false;
        }
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        return (goal%5<=smallCount);
    }
}
