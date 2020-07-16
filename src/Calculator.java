import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        boolean flagRim = false;
        int result = 0;
        int number1 = 0;
        int number2 = 0;

        Scanner string = new Scanner(System.in);
        System.out.println("Ввод");
        String[] words = string.nextLine().split(" ");

        if (words[0].matches("^[IVX]+") && words[2].matches("^[IVX]+")){
            flagRim = true;
            words[0] = String.valueOf(RomanNumeral.romanToArabic(words[0]));
            words[2] = String.valueOf(RomanNumeral.romanToArabic(words[2]));
        }

        number1 = Integer.parseInt(words[0]);
        number2 = Integer.parseInt(words[2]);

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
                result = number1 / number2;
                break;
            default:
                System.out.println("Неверный знак операции");
        }

        if (flagRim) {
            System.out.println(RomanNumeral.arabicToRoman(result));
        }else {
            System.out.println(result);
        }


    }
}
