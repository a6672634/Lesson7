package org.itstep.qa;
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        // Составить программу для ввода с консоли имени и возраста человека и вывода на консоль строки вида:
        // "Ваше имя ИМЯ , вам NN лет"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int vozrast = scanner.nextInt();
        System.out.println(" Вам " +vozrast + "лет");
      }

}
