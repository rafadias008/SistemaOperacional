import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.IOException;

public class Servidor {
    public static void main(String[] args){
        System.out.println("Servidor Online");
        DatagramSocket  socket = null;

        try{
            socket = new DatagramSocket(7890);
            
            while (true) {
                byte[] buffer = new byte[1000];
                DatagramPacket msg = new DatagramPacket(buffer, buffer.length);
                socket.receive(msg);
                System.out.println("Recebido: " + msg.getAddress().toString());
                System.out.println(new String(msg.getData()));
            }
        } catch (IOException e){
            System.out.println("IO: " + e.getMessage());
        }
        socket.close();
    }
}
