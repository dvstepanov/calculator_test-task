import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        boolean flagRim = false;
        int result = 0;
        int number1 = 0;
        int number2 = 0;

        Scanner string = new Scanner(System.in);
        System.out.println("Введите два чилса строго от 1 до 10 включительно и знак операции между ними. " +
                            "Операция деления происходит с округление до целого числа!");
        String[] words = string.nextLine().split(" ");

        if (words[0].matches("^[IVX]+") && words[2].matches("^[IVX]+")){
            flagRim = true;
            words[0] = String.valueOf(RomanNumeral.romanToArabic(words[0]));
            words[2] = String.valueOf(RomanNumeral.romanToArabic(words[2]));
        }

        number1 = Integer.parseInt(words[0]);
        number2 = Integer.parseInt(words[2]);

        try{
            if(!((number1 > 0) && (number1 <= 10) && (number2 > 0) && (number2 <= 10))){
                throw new Exception("Число должно быть строго от 1 до 10!");
            }
        }
        catch(Exception ex){

            System.err.println(ex.getMessage());
            main(args);
        }

        switch(words[1]){
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
                } catch (ArithmeticException ex){
                    System.err.println("Деление на ноль!");
                    return;
                }
            default:
                try{
                    throw new Exception("Неверный знак опереции!");
                }
                catch(Exception ex){
                    System.err.println(ex.getMessage());
                    return;
                }
        }

        if (flagRim) {
            System.out.println(RomanNumeral.arabicToRoman(result));
        }else {
            System.out.println(result);
        }
    }
}
