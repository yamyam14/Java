public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(9);
    }
    public static void printSquareStar(int number) {

        if (number < 5) {

            System.out.println("Invalid Value");

        } else {

            String text = "";

            for (int row = 1; row <= number; row++) {

                for (int column = 1; column <= number; column++) {

                    if (row == 1 || row == number) {

                        text += "*";

                    } else {

                        if ((row == column) || (column == (number - row + 1)) || column == 1 || column == number) {

                            text += "*";

                        } else {

                            text += " ";

                        }

                    }

                }

                System.out.println(text);

                text = "";

            }

        }

    }
}
