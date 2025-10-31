package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        
        // БАГ-ФИКС: обработка пустого ввода
        if (name.trim().isEmpty()) {
            name = "World";
        }
        
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}