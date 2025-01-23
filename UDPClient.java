import java.net.*;

    public class UDPClient {
        public static void main(String[] args) {
            try (DatagramSocket socket = new DatagramSocket()) {
                InetAddress address = InetAddress.getByName("localhost");
                String message = "Hello from the client!";
                byte[] buffer = message.getBytes();

                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);
                socket.send(packet);

                byte[] responseBuffer = new byte[1024];
                DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);
                socket.receive(responsePacket);

                String serverMessage = new String(responsePacket.getData(), 0, responsePacket.getLength());
                System.out.println("Server: " + serverMessage);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

