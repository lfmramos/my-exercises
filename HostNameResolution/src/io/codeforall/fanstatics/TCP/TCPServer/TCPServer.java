package io.codeforall.fanstatics.TCP.TCPServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {

        // Define the port number to listen on (clients connect here)
        int portNumber = 8080;

        // Create a server socket to listen for incoming connections on the specified port
        ServerSocket serverSocket = new ServerSocket(portNumber);
        System.out.println("Server is listening on port " + portNumber + "...");
        System.out.println("Waiting for connection...");
        // Wait for a client to connect
        Socket clientSocket = serverSocket.accept();
        System.out.println("Connection accepted from: " + clientSocket.getRemoteSocketAddress());

        // Create a reader to receive data from the client
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while(true) {
            // Wait for a message from the client
            System.out.println("Waiting for message from client...");
            String messageInTheTerminal = in.readLine();

            // Check if the message is empty or null (client might have disconnected)
            if(messageInTheTerminal.isEmpty() || messageInTheTerminal != null) {
                serverSocket.close();
            }
            // Print the received message
            System.out.println(messageInTheTerminal);
        }
    }
}