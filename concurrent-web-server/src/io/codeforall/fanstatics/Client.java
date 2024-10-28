package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {

    Socket clientSocket2;
    public Client(Socket clientSocket) {
        this.clientSocket2 = clientSocket;
        System.out.println("execute Dispatch");
    }

    @Override
    public void run() {
        // Create a writer to send data to the server
        try {
            PrintWriter out = new PrintWriter(clientSocket2.getOutputStream(), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Create a reader to read user input from the console
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I am in a new thread");
    }
}
