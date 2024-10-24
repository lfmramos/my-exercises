package io.codeforall.fanstatics;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServer {

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

        String browserMessage = in.readLine(); // receive message and transform to String.

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        OutputStream outputStream = clientSocket.getOutputStream();

        if (browserMessage.contains("index.html")) {

            StringBuilder fileContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader("src/io/codeforall/fanstatics/index.html"));

            // Transform content to String
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            String fileStr = new String(fileContent);
            byte[] file = fileStr.getBytes();

            //header
            String headerStr = new String("HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: " + file.length + "\r\n" +
                    "\r\n");

            System.out.println(headerStr);
            System.out.println(file);

            out.println(headerStr);
            outputStream.write(file, 0, file.length);

        } else if (browserMessage.contains("favicon.ico")) {
            System.out.println("favicon");

            StringBuilder fileContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader("src/io/codeforall/fanstatics/favicon.ico"));

            // Transform content to String
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            String fileStr = new String(fileContent);
            byte[] file = fileStr.getBytes();

            //header
            String headerStr = new String("HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: image/ico \r\n" +
                    "Content-Length: " + file.length + "\r\n" +
                    "\r\n");

            System.out.println(headerStr);
            System.out.println(file);

            out.println(headerStr);
            outputStream.write(file, 0, file.length);


        } else if (browserMessage.contains("logo.png")) {
            System.out.println("logo");
            StringBuilder fileContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader("src/io/codeforall/fanstatics/logo.png"));

            // Transform content to String
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            String fileStr = new String(fileContent);
            byte[] file = fileStr.getBytes();

            //header
            String headerStr = new String("HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: image/png \r\n" +
                    "Content-Length: " + file.length + "\r\n" +
                    "\r\n");

            System.out.println(headerStr);
            System.out.println(file);

            out.println(headerStr);
            outputStream.write(file, 0, file.length);

        } else {
            System.out.println("404");
            StringBuilder fileContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader("src/io/codeforall/fanstatics/404.html"));

            // Transform content to String
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            String fileStr = new String(fileContent);
            byte[] file = fileStr.getBytes();

            //header
            String headerStr = new String("HTTP/1.0 404 Not Found\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: " + file.length + "\r\n" +
                    "\r\n");

            System.out.println(headerStr);
            System.out.println(file);

            out.println(headerStr);
            outputStream.write(file, 0, file.length);

        }




/*        while (true) {
            // Wait for a message from the client
            System.out.println("Waiting for message from client...");
            String messageInTheTerminal = in.readLine();

            // Check if the message is empty or null (client might have disconnected)
            if (messageInTheTerminal.isEmpty() || messageInTheTerminal != null) {
                serverSocket.close();
            }
            // Print the received message
            System.out.println(messageInTheTerminal);
        }*/
    }
}

