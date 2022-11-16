import java.util.Scanner;

public class FizzBuzzTranslate {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numberInput = enterIntegerNumber();
        System.out.println(FizzBuzzTranslate.getFizzBuzzFirst(numberInput));
        System.out.println(FizzBuzzTranslate.getFizzBuzzAdvanced(numberInput));
        System.out.println(FizzBuzzTranslate.readNumber(numberInput));
    }

    private static int enterIntegerNumber() {
        System.out.println("Enter the integer: ");
        int numberInput = sc.nextInt();
        while (numberInput < 0 || numberInput >= 100) {
            System.out.println("The integer is not valid. Please enter it again");
            numberInput = sc.nextInt();
        }
        return numberInput;
    }

    public static String getFizzBuzzFirst(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            return "Fizz";
        } else if (number % 3 != 0 && number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "FizzBuzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static String getFizzBuzzAdvanced(int number) {
        int tys = number / 10;
        int unit = number % 10;
        if (tys == 3 || unit == 3) {
            return "Fizz";
        } else if (tys == 5 || unit == 5) {
            return "Buzz";
        } else {
            return "";
        }
    }

    public static String readNumber(int number) {
        int tys = number / 10;
        int unit = number % 10;
        String numString = "";
        if (number < 10) {
            switch (number) {
                case 1 -> numString += "one";
                case 2 -> numString += "two";
                case 3 -> numString += "three";
                case 4 -> numString += "four";
                case 5 -> numString += "five";
                case 6 -> numString += "six";
                case 7 -> numString += "seven";
                case 8 -> numString += "eight";
                case 9 -> numString += "nine";
            }
        } else if (number < 20) {
            switch (number) {
                case 10 -> numString += "ten";
                case 11 -> numString += "eleven";
                case 12 -> numString += "twelve";
                case 13 -> numString += "thirteen";
                case 14 -> numString += "fourteen";
                case 15 -> numString += "fifteen";
                case 16 -> numString += "sixteen";
                case 17 -> numString += "seventeen";
                case 18 -> numString += "eighteen";
                case 19 -> numString += "nineteen";
            }
        } else if (number < 100) {
            switch (tys) {
                case 2 -> numString += "twenty";
                case 3 -> numString += "thirty";
                case 4 -> numString += "forty";
                case 5 -> numString += "fifty";
                case 6 -> numString += "sixty";
                case 7 -> numString += "seventy";
                case 8 -> numString += "eighty";
                case 9 -> numString += "ninety";
            }
            switch (unit) {
                case 1 -> numString += " one";
                case 2 -> numString += " two";
                case 3 -> numString += " three";
                case 4 -> numString += " four";
                case 5 -> numString += " five";
                case 6 -> numString += " six";
                case 7 -> numString += " seven";
                case 8 -> numString += " eight";
                case 9 -> numString += " nine";
            }
        }
        return numString;
    }
}

