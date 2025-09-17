package exercicio2;

public class Main {
    
    public static void main(String[] args) throws InterruptedException{

       int[] dados = new int[]{1,2,3,4,5,6,7,8,9,10};
       int resultado = 0;

       ThreadSoma s1 =  new ThreadSoma(dados,0,4);
       Thread t1 = new Thread(s1);

       ThreadSoma s2 = new ThreadSoma(dados,5,9);
       Thread t2 = new Thread(s2);

       t1.start();
       t2.start();
       t1.join();
       t2.join();

       System.out.println(s1.resultado + s2.resultado);
    }
}
