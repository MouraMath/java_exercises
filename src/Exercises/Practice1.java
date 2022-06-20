package Exercises;

import java.util.Locale;

//concateneting elements with printf
public class Practice1 {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        String price = ", which price is $";

        System.out.println("Products: ");
        System.out.println(product1 + price +price1);
        System.out.println(product2 + price + price2);
        System.out.println();
        System.out.println("Record: " +age+ " years old, code " +code+ " and gender: " + gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

    }

}



