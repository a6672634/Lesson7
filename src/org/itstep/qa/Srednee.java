package org.itstep.qa;

import java.util.Scanner;

public class Srednee {
    public static void main(String[] args) {
        //Ввести два действительных положительных числа. Вывести среднее арифмитическое и среднее геометрическое
        //этих чисел
        Scanner scanner = new Scanner(System.in);
        double ar=0;
        double ge=0;
        System.out.println("Ввести действительное положительное число 1");
        double chislo1 = scanner.nextInt();
        System.out.println("Ввести действительное положительное число 2");
        double chislo2 = scanner.nextInt();
        System.out.println("Действительное положительное " + chislo2 );
        if (chislo1 > 0 & chislo2 > 0) {
            ar = (chislo1 + chislo2)/2;
            ge = Math.sqrt(chislo1*chislo2);

        }

        System.out.println("Среднеарифметическое" + ar);
        System.out.println("Среднегеометрическое" + ge);
    }

}
