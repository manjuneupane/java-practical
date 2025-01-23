import java.io.*;
import java.net.*;

    public class TCPClient {
        public static void main(String[] args) {
            try (Socket socket = new Socket("localhost", 5000)) {
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                out.println("Hello from the client!");
                String serverMessage = in.readLine();
                System.out.println("Server: " + serverMessage);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

