package com.company;
import java.util.Scanner;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Для того чтобы выбрать калькулятор нажмите - 1, для того чтобы выбрать массив нажмите - 2:");
        int selectTask = in.nextInt();
        switch (selectTask) {
            case 1: {
                System.out.println("Введите первое число:");
                double a = in.nextDouble();
                System.out.println("Введите второе число:");
                double b = in.nextDouble();
                double sum = a + b;
                double sub = a - b;
                double mult = a * b;
                double div = a / b;
                String operator;
                System.out.println("Выберите действие: +, -, * или /");
                operator = in.next();
                if (operator.equals("+")) {
                    System.out.printf("Результат сложения: " + "%.4f", sum);
                }
                if (operator.equals("-")) {
                    System.out.printf("Результат вычитания: " + "%.4f", sub);
                }
                if (operator.equals("*")) {
                    System.out.printf("Результат умножения:" + "%.4f", mult);
                }
                if (operator.equals("/")) {
                    System.out.printf("Результат деления:" + "%.4f", div);

                }
                break;
            }
            case 2: {
                System.out.println("Введите количество строк: ");
                int size = in.nextInt();
                String[] list = new String[size];
                System.out.println("Введите слово в каждую строку:");
                for (int i = 0; i < size; i++) {
                    list[i] = in.next();
                }
                int maxWorld = 0;
                for (int i = 0; i < list.length; i++) {
                    if (list[i].length() > maxWorld) {
                        maxWorld = list[i].length();
                    }
                }
                for (int i = 0; i < list.length; i++) {
                    if (list[i].length() == maxWorld) {
                        System.out.println("Самое длинное слово в списке:" + list[i]);
                    }
                }
                break;
            }
            default:System.out.println("Вы ввели не верное значение.");
        }
    }
}