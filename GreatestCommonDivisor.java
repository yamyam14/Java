public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(20,16));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first >=10 && second >=10){
            int min = Math.abs(first -second);
            for(int i=min;i>=1;i--){
                int firstcheck = first %i ;
                int secondcheck = second %i;
                if(firstcheck  != 0 || secondcheck!=0 ){
                    continue;
                }
                return i;
            }
        }
        return -1;
    }

//    public static int getGreatestCommonDivisor(int first, int second) {
//        int n = first - 1;
//       if (first < 10 || second < 10) {
//           return -1;
//       }
//
//
//       for (int i=n; i<=1; i--); {
//            int firstCheck = 0;
//            int secondCheck = 0;
//           firstCheck = first%i;
//           secondCheck= second%n;
//        }
//
//    }

}
