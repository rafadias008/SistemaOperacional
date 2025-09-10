import java.io.IOException;
import java.lang.runtime.SwitchBootstraps;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ServidorCalculo {
    public static void main(String[] args){
        System.out.println("Servidor UDP Online");
        DatagramSocket  socket = null;
        StringBuilder numerosEncontrados = new StringBuilder();

        try{
            socket = new DatagramSocket(7890);
            int soma = 0;
            while (true) {
                LocalDateTime agora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String dataFormatada = formatter.format(agora);
                
                byte[] buffer = new byte[1000];

                DatagramPacket msg = new DatagramPacket(buffer, buffer.length);
                socket.receive(msg);
                
                System.out.println("Recebido: " + msg.getAddress().toString());
                System.out.println(new String(msg.getData()));

                
                String nova_resposta = "Data/Horario: " + dataFormatada;
                System.out.println(nova_resposta);
                DatagramPacket resposta = new DatagramPacket(nova_resposta.getBytes(),
                                                             nova_resposta.length(),
                                                             msg.getAddress(),
                                                             msg.getPort());
                socket.send(resposta);
                System.out.println("Resposta Enviada para: " + msg.getAddress().toString() + "\n");

            }
        } catch (IOException e){
            System.out.println("IO: " + e.getMessage());
        }
        socket.close();
    }
}
