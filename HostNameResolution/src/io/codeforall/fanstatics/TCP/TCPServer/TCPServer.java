package io.codeforall.fanstatics.TCP.TCPServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {

        int portNumber = 8080;
        ServerSocket serverSocket = new ServerSocket(portNumber);
        System.out.println("Waiting for connection...");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Connection accepted.");
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while(true) {

            System.out.println("Waiting for message from client...");
            String messageInTheTerminal = in.readLine();
            System.out.println(messageInTheTerminal);

            if(messageInTheTerminal.isEmpty() || messageInTheTerminal != null) {
                serverSocket.close();
            }
        }
    }
}
