# Multi-threaded Chat Server

A robust Java-based chat server implementation supporting multiple concurrent client connections, private messaging, and various chat commands. The server utilizes thread pooling for efficient resource management and thread safety mechanisms for concurrent operations.

## Features

- Multi-client support using thread pooling
- Private messaging system
- Username management
- Real-time broadcasting
- Command-based interaction
- Thread-safe operations
- Graceful shutdown handling

## Architecture

### Components

1. **Server (Server.java)**
   - Manages the main server socket
   - Handles client connection acceptance
   - Maintains thread pool for client handlers
   - Manages graceful shutdown

2. **Server Worker (ServerWorker.java)**
   - Handles individual client connections
   - Processes client commands
   - Manages message broadcasting
   - Handles private messaging

3. **Main Application (Main.java)**
   - Application entry point
   - Server initialization

### Technical Specifications

- Default Port: 8080
- Thread Pool Size: 10 threads
- Connection Type: TCP/IP
- Character Encoding: UTF-8

## Available Commands

| Command | Description | Usage |
|---------|-------------|--------|
| `/w` | Send private message | `/w <username> <message>` |
| `/h` | Show help menu | `/h` |
| `/c` | Change username | `/c` |
| `/l` | List connected users | `/l` |
| `/q` | Quit chat | `/q` |

## Implementation Details

### Thread Management
- Uses `ExecutorService` for thread pooling
- Fixed thread pool size of 10 concurrent connections
- Implements proper thread shutdown procedures

### Concurrency Handling
- Synchronized access to shared resources
- Thread-safe client list management
- Atomic operations for critical sections

### Communication Protocol
- Text-based messaging
- Command-prefix based operation
- Broadcast and private messaging support

## Getting Started

### Prerequisites
- Java 8 or higher
- Network connectivity

### Running the Server

1. Compile the source files:
```bash
javac io/codeforall/fanstatics/*.java
```

2. Run the server:
```bash
java io.codeforall.fanstatics.Main
```

The server will start listening on port 8080.

### Connecting Clients

Clients can connect to the server using any TCP client (like Telnet or a custom client application) on port 8080.

Example using Telnet:
```bash
telnet localhost 8080
```

## Error Handling

The server implements comprehensive error handling for:
- Connection failures
- Client disconnections
- Runtime exceptions
- Resource cleanup

## Security Considerations

- Basic input validation
- Synchronized resource access
- Proper resource cleanup
- Connection timeout handling

## Performance

- Efficient thread pooling
- Optimized resource usage
- Scalable to multiple concurrent connections
- Low memory footprint

## Limitations

- Fixed thread pool size
- Basic text-based protocol
- No persistent message history
- No SSL/TLS encryption
- No authentication mechanism

## Future Improvements

1. Add SSL/TLS support
2. Implement user authentication
3. Add message persistence
4. Support for file transfers
5. Implement room-based chat
6. Add connection timeouts
7. Implement message history
8. Add admin commands
9. Support for rich text messages
10. Add logging system

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request

## Development Guidelines

- Follow Java coding conventions
- Add appropriate documentation
- Include unit tests for new features
- Maintain thread safety
- Handle exceptions appropriately
