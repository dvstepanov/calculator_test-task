import java.util.Scanner;

public class Calculator {
    private static boolean flagRim = false;
    private static int result = 0;
    private static int number1 = 0;
    private static int number2 = 0;
    private static String operation;

    public static void main(String[] args){
        read();
        calculate(number1, number2, operation);
        printResult();
    }

    private static void read() {
        Scanner string = new Scanner(System.in);
        System.out.println("Введите два числа строго от 1 до 10 включительно и знак операции между ними. " +
                "Операция деления происходит с округление до целого числа!");
        String[] words = string.nextLine().split(" ");

       validation(words[0], words[2]);

        if (flagRim){
            words[0] = String.valueOf(RomanNumeral.romanToArabic(words[0]));
            words[2] = String.valueOf(RomanNumeral.romanToArabic(words[2]));
        }

        number1 = Integer.parseInt(words[0]);
        number2 = Integer.parseInt(words[2]);
        operation = words[1];

        try{
            if(!((number1 > 0) && (number1 <= 10) && (number2 > 0) && (number2 <= 10))){
                throw new Exception("Число должно быть строго от 1 до 10!");
            }
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
            System.exit(0);
        }
    }

    private static void validation(String num1, String num2) {
        if(num1.matches("^[IVX]+") & num2.matches("^[IVX]+")){
            flagRim = true;
        }
        try{
            if(num1.matches("^[IVX]+") ^ num2.matches("^[IVX]+")){
                throw new Exception("Числа должны быть одной системы исчисления!(Арабской или Римской)");
            }
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
            System.exit(0);
        }
    }

    public static void calculate(int number1, int number2, String operation) {
        switch(operation){
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                try {
                    result = number1 / number2;
                    break;
                }
                catch (ArithmeticException ex){
                    System.err.println("Деление на ноль!");
                    System.exit(0);
                }
            default:
                try{
                    throw new Exception("Неверный знак опереции!");
                }
                catch(Exception ex){
                    System.err.println(ex.getMessage());
                    System.exit(0);
                }
        }
    }

    private static void printResult() {
        if (flagRim) {
            System.out.println(RomanNumeral.arabicToRoman(result));
        } else {
            System.out.println(result);
        }
    }

}
