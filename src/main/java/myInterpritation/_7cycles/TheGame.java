package myInterpritation._7cycles;

import java.util.Scanner;

public class TheGame {
    public static void main(String[] args) {
        int prog, user;

        final int i = 20;

        prog = (int) (Math.random() * i) + 1;

        System.out.println("загадано число: " + prog);
        System.out.println("Я загадала число от 1 до " + i + ", отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);

        if (input.hasNextInt()) {
            do {
                user = input.nextInt();
                if (user == prog) {
                    System.out.println("Вы угадали!");
                } else {
                    if (user > 0 && user <= i) {
                        System.out.print("Вы не угадали! ");
                        if (prog < user) {
                            System.out.println("Моё число меньше.");
                        } else {
                            System.out.println("Моё число больше.");
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
            } while (user != prog);
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("До свиданья!");
    }
}