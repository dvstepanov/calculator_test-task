import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

      /*  boolean flagRim = false;

        Scanner s = new Scanner(System.in);
        System.out.println("Ввод");
        String string = s.nextLine();
        String[] words = string.split(" ");

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);

        if (words[0].matches("^[IVX]+") && words[2].matches("^[IVX]+")){
            System.out.println("rim");
        }
*/
        System.out.println(RomanNumerals.toInt("VII"));

      /*  switch(words[1]){
            case "+":
                System.out.println(Integer.parseInt(words[0]) + Integer.parseInt(words[2]));
                break;
            case "-":
                System.out.println(Integer.parseInt(words[0]) - Integer.parseInt(words[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(words[0]) * Integer.parseInt(words[2]));
                break;
            case "/":
                System.out.println(Integer.parseInt(words[0]) / Integer.parseInt(words[2]));
                break;
            default:
                System.out.println("Неверный знак операции");
        }

*/
    }
}
