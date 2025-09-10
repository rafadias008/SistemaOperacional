import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {
  
  public static void main(String[] args) {
    System.out.println("Cliente");
    DatagramSocket socket = null;

    String mensagem = "Ola Charles";
    byte[] m = mensagem.getBytes();
    int tamanho = mensagem.length();

    try{
      InetAddress endereco = InetAddress.getByName("10.209.9.152");
      int porta = 7890;

      DatagramPacket pacoteMensagem = new DatagramPacket(m, tamanho, endereco, porta);

      socket = new DatagramSocket();
      socket.send(pacoteMensagem);
      
    } catch(IOException e){
      System.out.println("Erro: " + e.getMessage());
    }
  }
}