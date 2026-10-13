package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner scanner = new Scanner(System.in);
        
        Socket s = new Socket("127.0.0.1", 3000);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        do{
            System.out.println("Scrivi il primo numero:");
            
            String input = scanner.nextLine(); 

            if(input.equals("exit")) {
                out.println("!");
                break;
            }

            out.println(input);

            System.out.println("Scrivi l'operatore:");
            
            input = scanner.nextLine(); 

            out.println(input);

            System.out.println("Scrivi il secondo numero:");
            
            input = scanner.nextLine(); 

            out.println(input);

            System.out.println(in.readLine());
        } while (true);
    }
}