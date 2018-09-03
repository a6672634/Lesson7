package org.itstep.qa;

import java.util.Scanner;

public class BVtoroe {
    public static void main(String[] args) {
        //Пользователь вводит целое число. Если число четное, то прибавить к нему 2,
        //а если нечетное, то 1. Вывести результат
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int celoe = scanner.nextInt();
        if (celoe % 2 == 0) {
            System.out.println("Четно к нему +2" + (celoe + 2));

        } else {
            System.out.println("Нечетное к нему 1" + (celoe +1));
        }
    }
}