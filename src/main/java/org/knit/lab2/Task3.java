package org.knit.lab2;
import java.util.Scanner;

public class Task3 {
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            String a = scanner.nextLine();
            if (a == "exit") {
                System.out.println("Выход из системы");
                break;
            }

            System.out.print("Введите оператор: ");
            String operand = scanner.nextLine();
            if (operand == "exit") {
                System.out.println("Выход из системы");
                break;
            }

            System.out.print("Введите второе число: ");
            String b = scanner.nextLine();
            if (b == "exit") {
                System.out.println("Выход из системы");
                break;
            }

//            double first = (double) a;
//            double second = (double) b;
//            Calculator calculator = new Calculator(double a, );
//            if (operand == "+") {
//                C
//            }
        }
    }
}

