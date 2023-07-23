package src.main;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Please input: ");
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            input = scanner.nextLine();
            System.out.println(input);
        } while (!input.equals("quit"));
        scanner.close();
    }
}
