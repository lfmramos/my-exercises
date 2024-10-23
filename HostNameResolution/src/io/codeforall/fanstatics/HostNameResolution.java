package io.codeforall.fanstatics;

import java.io.IOException;
import java.net.InetAddress; // Import statement for working with internet addresses
import java.net.UnknownHostException;

public class HostNameResolution {
    public static void main(String[] args) {

        String host = "www.amazon.es"; // Define the hostname to resolve

        try{
            // Attempt to get the internet address for the given hostname
            InetAddress address = InetAddress.getByName(host);
            // Print the resolved IP address
            System.out.println(address.getHostAddress());
            // Print the resolved hostname (may be different from the original)
            System.out.println(address.getHostName());

            // Check if the address is reachable within a 5-second timeout
            boolean reachable = address.isReachable(5000);

            if(reachable){
                System.out.println("yay, I've reached the destination.");
            } else {
                System.out.println("Nope, deu merda.");
            }

        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}