package org.itstep.qa;
import java.util.Scanner;
public class APervoe {
    public static void main(String[] args) {
        // Составить программу для ввода с консоли  возраста человека и вывода на консоль строки вида:
        // "Вам NN лет"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int vozrast = scanner.nextInt();
        System.out.println(" Вам " +vozrast + " лет");
      }

}
