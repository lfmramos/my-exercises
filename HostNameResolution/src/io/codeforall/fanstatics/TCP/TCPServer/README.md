## TCP Communication in Java (Client & Server)

This repository contains two Java classes that demonstrate basic TCP communication:

* `TCPServer.java`: This class implements a simple TCP server that listens for incoming connections on a specified port, reads messages sent by a client, and prints them to the console.
* `TCPClient.java`: This class implements a simple TCP client that connects to a server on a specified hostname and port, reads user input from the console, and sends it to the server.

### Getting Started

**Prerequisites:**

* Java Development Kit (JDK) installed on your system.
* A text editor or IDE for Java development (e.g., Eclipse, IntelliJ IDEA)

**Running the Application:**

1. Clone this repository or download the source code files.
2. Open a terminal or command prompt and navigate to the project directory.
3. Compile the Java classes using a command like `javac TCPServer.java TCPClient.java` (replace with your compiler command if needed).
4. **Run the Server:** Open another terminal window and run the server with `java TCPServer.java`. This will start the server listening on port 8080 (default).
5. **Run the Client:** In the first terminal window, run the client with `java TCPClient.java`. This will connect to the server running on localhost (port 8080 by default).
6. Type messages in the client terminal window and press Enter. The messages will be sent to the server and printed on the server console.

**Note:** You can modify the port number used by both server and client by changing the `portNumber` variable in each class.

### Functionality

* The server waits for a client connection on the specified port.
* Once a client connects, the server continuously reads messages sent by the client and prints them to the console.
* The client prompts the user for input and sends any entered message to the server.

**Note:** This is a basic example and currently does not implement any response mechanism from the server to the client. 

### Next Steps

* You can modify the code to implement server responses by creating a `PrintWriter` object on the server side and sending replies to the client.
* Modify the application to handle more complex data exchange scenarios.
* Consider adding error handling and exception handling for a robust implementation.

This repository provides a starting point for understanding and building basic TCP communication applications in Java. Feel free to explore and customize the code for your specific needs.
