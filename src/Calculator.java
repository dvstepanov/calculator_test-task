import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ввод");
        String string = s.nextLine();
        String[] words = string.split(" ");

       /* System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);*/

        switch(words[1]){
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


    }
}
