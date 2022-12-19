package ui;

import java.util.Scanner;

import Controller.Calculator;

public class ConsoleUI implements View {

    private Calculator calculator;
    private Scanner scanner;

    public ConsoleUI(){
        this.scanner = new Scanner(System.in);
        print(getInstructions());
    }

    @Override
    public void setCalculator() {
        this.calculator = new Calculator();
        
    }

    @Override
    public void start() {
        String myExp = scan();
        print(calculator.takeResult(myExp));

    }

    @Override
    public void print(String text) {
        System.out.println(text);
        
    }

    private String scan(){
        System.out.println("Введите выражение:");
        return scanner.nextLine();
    }

    public String getInstructions(){
        return "Примеры ввода в калькулятор:\r\n" +
        "a + b - для сложения\r\n"+
        "a - b - для вычитания\r\n"+
        "a * b - для умножения\r\n"+
        "a / b - для деления\r\n"+ 
        "a ** b - для возведения в степень\r\n"+
        "sqrt a - для получения квадратного корня\r\n";
    }
}
