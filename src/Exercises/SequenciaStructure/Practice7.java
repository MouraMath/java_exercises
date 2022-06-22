package Exercises.SequenciaStructure;

import java.util.Scanner;

// calculating geometrical forms area
public class Practice7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double triangleArea, circleArea, trapezeArea, squareArea, rectangleArea;

        System.out.println("Hi! Please insert 3 numbers: ");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangleArea = a*c/ 2.0;
        circleArea = 3.14159 * c * c;
        trapezeArea = (a+b) / 2.0 *c;
        squareArea = b*b;
        rectangleArea = a*b;

        System.out.printf("Triangle area: %.3f%n", triangleArea);
        System.out.printf("Circle area: %.3f%n", circleArea);
        System.out.printf("Trapeze area: %.3f%n", trapezeArea);
        System.out.printf("Square area: %.3f%n", squareArea);
        System.out.printf("Rectangle area: %.3f%n", rectangleArea);

        System.out.println("Thank you for helping!");

        sc.close();

    }
}
