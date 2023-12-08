## Sample JMX/MBean Server and Client
This repository contains a sample application demonstrating the usage of Java Management Extensions (JMX) with a custom MBean server and a corresponding client. The server includes a command and a probe feature, showcasing basic JMX functionalities.

### Prerequisites
Ensure you have the following installed:
- JDK 1.8 or higher
- Maven 3.6.3 or higher

### Compilation
To compile the project, navigate to the root directory of the project and run:
```bash
mvn package
```
This will generate the `mbean-app-1.0-SNAPSHOT.jar` in the `./target` directory.

### Running the Server
To start the JMX server, use the following command:
```bash
java -cp ./target/mbean-app-1.0-SNAPSHOT.jar com.mbean.app.JMXServer
```
This command starts the JMX server which hosts the custom MBean.

### Running the Client
To connect to the server with the client application, use:
```bash
java -cp ./target/mbean-app-1.0-SNAPSHOT.jar com.mbean.app.JMXClient <port>
```
Replace `<port>` with the server's port, which can be retrieved using tools like `jconsole`.

### Known Issue
There is a known issue with the client application:

- Client Connection Failure: The client fails to connect to the server. This issue is under investigation, and any contributions to resolving it are welcome.

### Contributing
Feel free to fork this repository and submit pull requests with enhancements or fixes. For major changes, please open an issue first to discuss what you would like to change.

### License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
