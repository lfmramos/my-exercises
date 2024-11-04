# Simple Java Web Server

A lightweight HTTP web server implementation in Java that supports serving static HTML files and images. The server handles basic HTTP GET requests and provides appropriate responses based on the requested resources.

## Features

- HTTP/1.0 protocol support
- Static file serving (HTML and images)
- Multi-threaded client handling
- Proper HTTP response headers
- Custom 404 error page
- Logging system
- Content type detection
- File streaming capabilities

## Technical Specifications

- Default Port: 8085
- Protocol: HTTP/1.0
- Supported Methods: GET
- Document Root: `www/`
- Supported File Types:
  - HTML (.html)
  - Images (.jpg, .png, .ico)
- Character Encoding: UTF-8

## Components

### WebServer
- Main server component
- Handles incoming connections
- Routes requests to appropriate handlers
- Manages server lifecycle

### Client
- Handles individual client connections
- Runs in separate threads
- Manages client I/O operations

### HttpHelper
- Generates HTTP response headers
- Handles different HTTP status codes
- Manages content type headers
- Provides content length information

### HttpMedia
- Handles file type detection
- Validates supported media types
- Manages file extensions

## HTTP Status Codes Supported

| Code | Description |
|------|-------------|
| 200 | OK - Document Follows |
| 400 | Bad Request |
| 404 | Not Found |
| 405 | Method Not Allowed |
| 415 | Unsupported Media Type |

## Getting Started

### Prerequisites
- Java 8 or higher
- Available port (default: 8085)
- Write permissions for logging

### Directory Structure
```
project-root/
├── src/
│   └── io/
│       └── codeforall/
│           └── fanstatics/
│               ├── WebServer.java
│               ├── Client.java
│               ├── HttpHelper.java
│               └── HttpMedia.java
└── www/
    ├── index.html
    ├── 404.html
    └── images/
```

### Running the Server

1. Compile the source files:
```bash
javac io/codeforall/fanstatics/*.java
```

2. Run the server (optional port parameter):
```bash
java io.codeforall.fanstatics.WebServer [PORT]
```

## Implementation Details

### Request Processing
1. Accept client connection
2. Parse HTTP headers
3. Validate request method (GET only)
4. Check resource existence
5. Determine content type
6. Send appropriate headers
7. Stream file content
8. Close connection

### Threading Model
- Main thread handles server socket
- Each client request runs in a separate thread
- Thread creation per connection

### Error Handling
- Invalid requests
- Missing resources
- Unsupported media types
- Connection issues
- I/O exceptions

### Logging
- Uses Java's built-in logging
- Logs connection details
- Records error conditions
- Provides debug information

## Security Considerations

- Limited to GET requests
- Basic input validation
- Resource path validation
- Proper resource cleanup
- Connection timeout handling

## Limitations

- Single-threaded server operation
- HTTP/1.0 protocol only
- No connection persistence
- Limited file type support
- No virtual hosting
- No SSL/TLS support

## Future Improvements

1. HTTP/1.1 support
2. Connection keep-alive
3. Thread pooling
4. Additional HTTP methods
5. MIME type configuration
6. Virtual hosts support
7. SSL/TLS implementation
8. Request/response compression
9. Cache control
10. Basic authentication

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request

## Development Guidelines

- Follow Java coding conventions
- Add appropriate documentation
- Include error handling
- Maintain thread safety
- Follow HTTP specifications
