public class Exemplo {

    public static void main(String[] args){
        
        System.out.println("Criando Threads");

        Hello h1 = new Hello();
        Thread t1  = new Thread(h1);

        Hello h2 = new Hello();
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
    }
}