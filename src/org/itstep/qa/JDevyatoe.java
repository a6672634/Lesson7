package org.itstep.qa;

import java.util.Scanner;

public class JDevyatoe {
    public static void main(String[] args) {
        //Ввести катеты прямоугольного треугольника. Вывести его гипотенузу и площадь.
        Scanner scanner = new Scanner(System.in);
        double s;
        double g;
        System.out.println("Введите катет 1");
        double cat1 = scanner.nextDouble();
        System.out.println("Введите катет 2");
        double cat2 = scanner.nextDouble();
        g = Math.sqrt (cat1*cat1) + (cat2*cat2);
        s = (cat1 * cat2)/2;
        System.out.println("Гипотенуза" + g);
        System.out.println("Площадь" + s);
    }
}
