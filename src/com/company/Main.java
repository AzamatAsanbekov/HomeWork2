package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите имя: ");
        String name = scanner.nextLine();

        System.out.print("ведите возраст");
        int age = scanner.nextInt();
        System.out.print("введите температуру: ");
        int temperature = scanner.nextInt();

        String notExceet = "Не выходит гулять";
        String exceet = " Выходит гулять";

        if (age > 0 && age <= 20 && temperature > 0 && temperature < 28) {
            System.out.println(name + " " + exceet);
        }else if (age > 20 && age <= 45 && temperature > -20 && temperature < 35) {
            System.out.println(name + " " + exceet);
        } else if (age > 45 && age < 100 && temperature > - 10 && temperature < 25  ){
            System.out.println(name + " " + exceet);
        } else {
            System.out.println(name + " " + notExceet);
        }
    }
}
