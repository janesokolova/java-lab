package com.company;
import java.util.Scanner; // for using input from console

public class Main { 
    private static void printPrimes(long N) { // algorithm for check prime number and input it
        int num = 2;
        while(num <= N) { // before number, which was entered from keyboard
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) { // effectife algorithm for check prime number
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(num); // output prime number
            }
            num++;
        }
    }

    private static boolean checkPalindrom(String word) { // algorithm for check if a word is palindrom
        String reverse = ""; // empty string

        int length = word.length(); // number of characters of the entered word

        for ( int i = length - 1; i >= 0; i-- ) // start to check the word from the end to the start
            reverse = reverse + word.charAt(i);

        if (word.equals(reverse)) 
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose what you want to do:\n1. Print prime numbers.\n2. Check if word is palindrom.");
        String option = keyboard.nextLine(); // input from console the type of program
        switch (option) {
            case "1": // case with algorithm for check private number
                System.out.println("Input max prime");
                long maxPrime = keyboard.nextLong(); // input "N" number
                printPrimes(maxPrime); // call to method "printPrimes"
                return;
            case "2":
                System.out.println("Input word to check"); // case with algorithm for check to palindrom
                String word = keyboard.nextLine(); // input "Word" 
                System.out.println(checkPalindrom(word)); // output the bool result of the method "check Palindrom"
                return;
            default:
                System.out.println("Wrong option, try one more time"); // do this case if other case don't use
        }
    }
}
