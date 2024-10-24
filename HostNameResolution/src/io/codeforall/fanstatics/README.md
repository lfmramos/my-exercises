## Java Networking Utilities

This repository contains several Java classes demonstrating essential networking functionalities:

  * **HostNameResolution.java:** This class demonstrates how to resolve a hostname to its corresponding IP address using the `InetAddress` class.
  * **UDPHost.java:** This class implements a simple UDP server that listens for datagrams, converts them to uppercase, and sends them back to the sender.
  * **TCPServer.java:** This class implements a basic TCP server that listens for client connections on a specified port, reads messages sent by the client, and prints them to the console.
  * **TCPClient.java:** This class implements a simple TCP client that connects to a server on a specified hostname and port, reads user input from the console, and sends it to the server.

### Getting Started

**Prerequisites:**

  * Java Development Kit (JDK) installed on your system.
  * A text editor or IDE for Java development (e.g., Eclipse, IntelliJ IDEA)

### Host Name Resolution

  * `HostNameResolution.java` shows how to resolve a hostname (e.g., "[www.cnn.com](https://www.google.com/url?sa=E&source=gmail&q=https://www.cnn.com)") to its IP address.
  * You can modify the code to take a hostname as input and display the resolved IP address.

### UDP Server

  * `UDPHost.java` demonstrates a basic UDP server that listens on a specific port (default 5000) for datagrams.
  * Received datagrams are converted to uppercase and sent back to the sender.
  * To test this server, you'll need a separate tool or library capable of sending UDP datagrams (e.g., `netcat` on Linux/macOS).

### TCP Communication (Server & Client)

  * `TCPServer.java` implements a basic TCP server that listens for client connections and reads messages sent by the client.
  * Currently, the server doesn't send any responses, but you can modify it to implement functionalities like sending replies or handling different message formats.
  * `TCPClient.java` implements a simple TCP client that connects to a server on a specified hostname and port, reads user input, and sends it to the server.

**Running the Applications:**

1.  Clone this repository or download the source code files.
2.  Open a terminal or command prompt and navigate to the project directory.
3.  Compile the Java classes using a command like `javac *.java` (replace with your compiler command if needed).

**Running the Server:**

  * Open another terminal window and run the desired server (e.g., `java TCPServer.java` or `java UDPHost.java`).

**Running the Client:**

  * In the first terminal window, run the client with appropriate arguments (e.g., `java TCPClient.java localhost 8080` for TCP server on localhost port 8080).

**Note:** You can modify the port numbers used by both servers and clients by changing the respective `portNumber` variables in each class.

### Next Steps

  * Explore the code and functionalities of each class.
  * Modify the applications to suit your specific needs.
  * Implement server responses and more complex data exchange scenarios in the TCP communication example.
  * Consider adding error handling and exception handling for robust implementations.
  * Explore advanced networking libraries like Apache Commons Net for additional functionalities.

This repository provides a starting point for understanding and building various networking applications in Java. Feel free to experiment and customize the code for your learning and development purposes.