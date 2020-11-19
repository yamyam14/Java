

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        getDaysInMonth(-1,2020);
        getDaysInMonth(1,-2020);

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } return false;
    }

    public static int getDaysInMonth (int month, int year) {
        int numberOfDays = 0;
        String message = "";

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
//            System.out.println("Invalid value");
            return -1;
        }
        else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    numberOfDays = 31;
                    break;
                case 2:
                    if (isLeapYear(year)) { numberOfDays = 29;
                    } else { numberOfDays = 28;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    numberOfDays = 30;
                    break;
            }return numberOfDays;

//            switch (month){
//                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
////                    System.out.println("January has 31 days in year " + year);
//                    numberOfDays=31;
//                    break;
//                case 2:
//                    if (isLeapYear(year)){
////                        System.out.println("February has 29 days in year " + year);
//                        numberOfDays= 29;
//                    } else{
////                    System.out.println("February has 28 days in year " + year);
//                    numberOfDays = 28;}
//                    break;
////                case 3:
//////                    System.out.println("March has 31 days in year " + year);
////                    numberOfDays= 31;
////                    break;
//                case 4: case 6: case 9: case 11:
////                    System.out.println("April has 30 days in year " + year);
//                    numberOfDays = 30;
//                    break;
////                case 5:
//////                    System.out.println("May has 31 days in year " + year);
////                    numberOfDays = 31;
////                    break;
////                case 6:
//////                    System.out.println("June has 30 days in year " + year);
////                    numberOfDays = 30;
////                    break;
////                case 7:
//////                    System.out.println("July has 31 days in year " + year);
////                    numberOfDays = 31;
////                    break;
////                case 8:
//////                    System.out.println("August has 31 days in year " + year);
////                    numberOfDays = 31;
////                    break;
////                case 9:
//////                    System.out.println("September has 30 days in year " + year);
////                    numberOfDays = 30;
////                    break;
////                case 10:
//////                    System.out.println("October has 31 days in year " + year);
////                    numberOfDays = 31;
////                    break;
////                case 11:
//////                    System.out.println("November has 30 days in year " + year);
////                    numberOfDays = 30;
////                    break;
////                case 12:
//////                    System.out.println("December has 31 days in year " + year);
////                    numberOfDays = 31;
////                    break;
//            } return numberOfDays;
        }
    }
}

