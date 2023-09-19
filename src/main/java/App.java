package src.main.java;

import java.io.IOException;
import java.util.Scanner;

public class App {
    


    public static void main(String[] args) throws IOException {
       
        System.out.println("Welcome to H_A_N_G_M_A_N \nPress 1 to start the game \nPress 0 to exit the game \n");
        
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        // switch(input) {
        //     case 0 -> System.out.println("Bye");
        //     case 1 -> System.out.println("Let's go");
        //     default -> System.out.println("HA, YOU SUCK");
        // }
        scanner.close();
    }
}