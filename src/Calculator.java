import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        boolean flagRim = false;
        int result = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ввод");
        String string = s.nextLine();
        String[] words = string.split(" ");

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);

        if (words[0].matches("^[IVX]+") && words[2].matches("^[IVX]+")){
            System.out.println("rim");
            flagRim = true;
            words[0] = String.valueOf(RomanNumeral.romanToArabic(words[0]));
            words[2] = String.valueOf(RomanNumeral.romanToArabic(words[2]));

        }

        System.out.println(RomanNumeral.romanToArabic("MMXVIII"));
        System.out.println(RomanNumeral.arabicToRoman(2018));

        switch(words[1]){
            case "+":
                result = Integer.parseInt(words[0]) + Integer.parseInt(words[2]);
                break;
            case "-":
                result = Integer.parseInt(words[0]) - Integer.parseInt(words[2]);
                break;
            case "*":
                result = Integer.parseInt(words[0]) * Integer.parseInt(words[2]);
                break;
            case "/":
                result = Integer.parseInt(words[0]) / Integer.parseInt(words[2]);
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
