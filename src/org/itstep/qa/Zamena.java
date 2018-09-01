package org.itstep.qa;

import java.util.Scanner;
// вывести два числа и поменять их, а портом вывести оба значения.
public class Zamena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Переменная 1");
        int first = scanner.nextInt();
        System.out.println("Переменная 2");
        int second = scanner.nextInt();
        System.out.println("Первое с заменой " + second + " Второе с заменой " + first);
        System.out.println("Первое без замены " + first + " Второе без замены " + second);

        System.out.println("---------------------------");
        int z;
        System.out.println(" Переменная 1 ");
        int x = scanner.nextInt();
        System.out.println(" Переменная 2 ");
        int y= scanner.nextInt();
        System.out.println(" Число = " + x + " Число = " + y);
        z=x;
        x=y;
        y=z;
        System.out.println(" Число = " + x + " Число = " + y);
    }

}
