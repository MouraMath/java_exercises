package Exercises.SequenciaStructure;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int code1, number1, code2, number2;
        double value1, value2, total;

        System.out.println("Hi! Please, insert the code and value of item 1 and also how many item do you want: ");
        code1 = sc.nextInt();
        value1 = sc.nextDouble();
        number1 = sc.nextInt();
        System.out.println("Thank you! Now, insert the code and value of item 2 and also how many item do you want: ");
        code2 = sc.nextInt();
        value2 = sc.nextDouble();
        number2 = sc.nextInt();

        total = value1 * number1 + value2 * number2;
        System.out.println("Total bill: $" + total);

        sc.close();
    }
}
