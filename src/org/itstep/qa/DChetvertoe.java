package org.itstep.qa;

import java.util.Random;
import java.util.Scanner;

public class DChetvertoe {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(20 + 1);
        int counter = 0;
        do{
            int guessedNumber = 0;
            if(scanner.hasNextInt()){
              guessedNumber = scanner.nextInt();
                if(number > guessedNumber){
                    System.out.println("Grater");
                    counter++;
                }
                else if(number < guessedNumber){
                    System.out.println("Less");
                    counter++;
                }
                else{
                    System.out.println("You win!");
                    break;
                }
            }else{
                scanner.next();
                System.out.println("Please try again:");
            }
            if(counter == 5){
                System.out.println("You loose!");
                break;
            }

        }while(true);
    }
}
