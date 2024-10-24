package io.codeforall.fanstatics.TCP.TCPServer;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {

        // Define the hostname or IP address of the server to connect to
        String hostname = "localhost";
        // Define the port number to connect on the server
        int portNumber = 8080;

        // Create a socket connection to the server on the specified hostname and port
        Socket clientSocket = new Socket( hostname, portNumber);
        System.out.println("Connected to server: " + clientSocket.getRemoteSocketAddress());

        // Create a writer to send data to the server
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        // Create a reader to read user input from the console
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            // Read a line of text from the user and send the message to the server
            out.println(in.readLine());
        }
    }
}