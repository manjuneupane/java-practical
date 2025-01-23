import java.io.*;
import java.net.*;

    public class TCPServer {
        public static void main(String[] args) {
            try (ServerSocket serverSocket = new ServerSocket(5000)) {
                System.out.println("Server is waiting for a client...");
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                String clientMessage = in.readLine();
                System.out.println("Client: " + clientMessage);

                out.println("Hello from the server!");

                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

