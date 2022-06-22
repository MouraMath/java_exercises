package Exercises.ConditionalStructure;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double renda, imposto;


        System.out.println("Para calcularmos o valor devido de IRRF informe a renda: ");

        renda = in.nextDouble();

        if(renda<2000.0){
            imposto = 0.0;
        }
        else if(renda<=3000.0) {
            imposto = (renda -2000.0) * 0.075;
        }
        else if(renda<4500.0){
            imposto = (renda -3000.0) *0.15 + 1000 *0.075;
        }
        else{
            imposto = (renda - 4500.0) * 0.275 + 1500.0 * 0.15 + 1000.0 * 0.08;
        }
        if(imposto==0.0){
            System.out.println("Renda isenta de Imposto de Renda :)");
        }
        else{
            System.out.printf("O leão sorri. Imposto devido: R$ %.2f%n", imposto);
        }
    }
}
