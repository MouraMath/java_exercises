package Exercises;

//exercise scanner in

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        System.out.println("Iremos somar 2 valores e depois exibir o resultado");
        System.out.println("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.println("Agora digite o segundo valor: ");
        int b = sc.nextInt();
        int soma = a+b;
        System.out.println("O resultado da soma é: " +soma);
        System.out.println("Congratz!");

        sc.close();

    }

}
