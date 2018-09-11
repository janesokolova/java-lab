package com.company;
import java.util.Scanner;

public class Main {
    private static void printPrimes(long N) {
        int num = 2;
        while(num <= N) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(num);
            }
            num++;
        }
    }

    private static boolean checkPalindrom(String word) {
        String reverse = "";

        int length = word.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + word.charAt(i);

        if (word.equals(reverse))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose what you want to do:\n1. Print prime numbers.\n2. Check if word is palindrom.");
        String option = keyboard.nextLine();
        switch (option) {
            case "1":
                System.out.println("Input max prime");
                long maxPrime = keyboard.nextLong();
                printPrimes(maxPrime);
                return;
            case "2":
                System.out.println("Input word to check");
                String word = keyboard.nextLine();
                System.out.println(checkPalindrom(word));
                return;
            default:
                System.out.println("Wrong option, try one more time");
        }
    }
}
