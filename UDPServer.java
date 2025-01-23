import java.net.*;

    public class UDPServer {
        public static void main(String[] args) {
            try (DatagramSocket socket = new DatagramSocket(5000)) {
                byte[] buffer = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

                System.out.println("Server is waiting for a client...");
                socket.receive(packet);

                String clientMessage = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Client: " + clientMessage);

                String response = "Hello from the server!";
                byte[] responseData = response.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(
                        responseData, responseData.length, packet.getAddress(), packet.getPort());
                socket.send(responsePacket);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
