package exercicio1;

public class Main {
    
    public static void main(String[] args) throws InterruptedException{

        Exercicio1Thread ext = new Exercicio1Thread("Ola",1);
        Exercicio1Thread ext2 = new Exercicio1Thread("Bem vindo", 2);
        Thread t1 = new Thread(ext);
        Thread t2 = new Thread(ext2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
