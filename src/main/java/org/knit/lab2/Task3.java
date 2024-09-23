package org.knit.lab2;
import java.util.Scanner;

public class Task3 {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String input;

        while (true) {
            System.out.print("Введите первое число или 'exit' для выхода: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            double num1 = Double.parseDouble(input);

            System.out.print("Введите оператор (+, -, *, /): ");
            String operator = scanner.nextLine();

            System.out.print("Введите второе число: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = 0;
            boolean validOperator = true;

            if (operator.equals("+")) {
                result = calculator.add(num1, num2);
            } else if (operator.equals("-")) {
                result = calculator.subtract(num1, num2);
            } else if (operator.equals("*")) {
                result = calculator.multiply(num1, num2);
            } else if (operator.equals("/")) {
                if (num2 == 0){
                    validOperator = false;
                    System.out.println("Ошибка: Деление на ноль невозможно.");
                }
                result = calculator.divide(num1, num2);
            } else {
                validOperator = false;
                System.out.println("Ошибка: Неверный оператор.");
            }

            if (validOperator) {
                System.out.println("Результат: " + result);
            }
        }

        scanner.close();
    }
}


