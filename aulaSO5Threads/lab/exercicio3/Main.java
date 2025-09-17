package exercicio3;

public class Main {
    
    public static void main(String[] args) throws InterruptedException{

       int[][] dados = new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
       int resultado = 0;

       ThreadSoma s1 =  new ThreadSoma(dados,0,0,3);
       Thread t1 = new Thread(s1);

       ThreadSoma s2 = new ThreadSoma(dados,1,0,3);
       Thread t2 = new Thread(s2);

       ThreadSoma s3 =  new ThreadSoma(dados,2,0,3);
       Thread t3 = new Thread(s3);

       ThreadSoma s4 = new ThreadSoma(dados,3,0,3);
       Thread t4 = new Thread(s4);

       t1.start();
       t2.start();
       t3.start();
       t4.start();
       t1.join();
       t2.join();
       t3.join();
       t4.join();

       System.out.println(s1.resultado + s2.resultado + s3.resultado + s4.resultado);
    }
}