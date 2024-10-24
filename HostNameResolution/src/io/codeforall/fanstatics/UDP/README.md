## Simple UDP Server in Java

This repository contains a Java class named `UDPHost.java` that demonstrates a simple UDP server implementation.

**What is UDP?**

UDP (User Datagram Protocol) is a connectionless communication protocol that allows applications to send messages (datagrams) over a network without establishing a reliable connection. Unlike TCP, UDP doesn't guarantee delivery or order of messages, making it suitable for situations where speed and simplicity are more important than reliability.

**Functionality:**

* This UDP server listens on a specified port for incoming datagrams.
* When a datagram is received, the server converts it to a String, converts it to uppercase, and sends the modified data back to the sender's address and port.
* The server continues listening for new datagrams.

**Getting Started:**

**Prerequisites:**

* Java Development Kit (JDK) installed on your system.
* A text editor or IDE for Java development (e.g., Eclipse, IntelliJ IDEA)

**Running the Application:**

1. Clone this repository or download the source code file.
2. Open a terminal or command prompt and navigate to the project directory.
3. Compile the Java class using a command like `javac UDPHost.java` (replace with your compiler command if needed).
4. Run the server with `java UDPHost.java`. This will start the server listening on port 5000 (default).

**Sending a UDP Datagram (Client-side):**

You can use various tools or libraries on the client-side to send UDP datagrams to the server. Here's a general approach:

1. Choose a tool or library that supports sending UDP datagrams in your preferred language (e.g., `netcat` on Linux/macOS, Java libraries like Apache Commons Net).
2. Specify the server's hostname or IP address and port number (5000 in this case).
3. Send your message as a UDP datagram.
4. The server will receive the message, convert it to uppercase, and send it back.

**Note:** To test client functionality, you'll need a separate tool or application to send UDP datagrams to the server. This repository only provides the server implementation.

### Next Steps

* Explore libraries like Apache Commons Net for more advanced UDP communication in Java.
* Modify the server behavior to handle different message formats or perform custom operations on received data.
* Consider implementing timeout mechanisms for handling potentially lost messages.

This code provides a basic example of a UDP server in Java. You can adapt and extend it for various UDP-based communication applications.
