package Exercises.SequenciaStructure;

import java.util.Scanner;

//calculating a circle's radius
public class Practice3 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        double r, a, pi = 3.14159;

        System.out.println("Hello!");
        System.out.println("Please insert the circle's radius:");
        r = sc.nextDouble();

        a = pi * r * r;

        System.out.printf("A = %.4f%n", a);

        sc.close();

    }

}
