package Exercises.SequenciaStructure;

import java.util.Scanner;

//Inserting employee number, his workload, salary per hour and month
public class Practice5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int number;
        double workload, hourValue, salary;

        System.out.println("Hello! Please, tell us the employee number, his workload and his payment per hour: ");
        number = sc.nextInt();
        workload = sc.nextDouble();
        hourValue = sc.nextDouble();

        salary = workload * hourValue;

        System.out.println("Employee number " + number + " will receive: $" + salary);

        sc.close();
    }
}
