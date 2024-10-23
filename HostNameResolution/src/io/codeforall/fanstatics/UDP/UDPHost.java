package io.codeforall.fanstatics.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPHost {
    public static void main(String[] args) throws IOException {

        // Define the port to listen on (client sends data here)
        int foreignPort = 5000;
        String receivedData;

        // Create a buffer to hold received data (1024 bytes)
        byte[] recvBuffer = new byte[1024];

        // Create a UDP socket to listen on the specified port
        DatagramSocket socket = new DatagramSocket(foreignPort);

        try {
            // Create a DatagramPacket to receive data
            DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
            // Receive data from the network
            socket.receive(receivePacket);

            // Extract received data and convert it to a String (uppercase)
            receivedData = new String(receivePacket.getData(), 0, receivePacket.getLength()).toUpperCase();
            System.out.println(receivedData);

            // Convert the received data back to bytes for sending
            byte[] sentData = receivedData.getBytes();

            // Create a DatagramPacket to send data back to the client (using received address and port)
            DatagramPacket sendPacket = new DatagramPacket(sentData, sentData.length, receivePacket.getAddress(), receivePacket.getPort());
            // Send the data back to the client
            socket.send(sendPacket);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // Close the socket to release resources
        socket.close();
    }
}
