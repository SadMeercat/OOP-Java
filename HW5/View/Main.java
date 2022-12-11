package View;

import java.util.Scanner;

import Controller.Calculator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Примеры ввода в калькулятор:\r\n" +
        "a + b - для сложения\r\n"+
        "a - b - для вычитания\r\n"+
        "a * b - для умножения\r\n"+
        "a / b - для деления\r\n"+ 
        "a ** b - для возведения в степень\r\n"+
        "sqrt a - для получения квадратного корня\r\n");

        Scanner scanner = new Scanner(System.in);
        String exp = "";

        System.out.println("Введите выражение:");
        exp = scanner.nextLine();
        Calculator calc = new Calculator();
        System.out.println("Резульат:");
        System.out.println(calc.Result(exp));
    }
}
