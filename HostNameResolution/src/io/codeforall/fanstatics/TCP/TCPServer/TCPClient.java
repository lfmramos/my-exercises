package io.codeforall.fanstatics.TCP.TCPServer;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        String hostname = "localhost";
        int portNumber = 8080;

        Socket clientSocket = new Socket( hostname, portNumber);

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            out.println(in.readLine());
        }
    }
}
