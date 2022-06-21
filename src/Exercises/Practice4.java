package Exercises;

import java.util.Scanner;

//calculating the difference of products A*B - C*D
public class Practice4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0, c = 0, d =0, diff;


        System.out.println("Welcome! Please, insert 4 different numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diff = (a*b - c*d);

        System.out.println("Difference = " + diff);

            sc.close();

    }
}
