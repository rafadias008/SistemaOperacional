public class Main {
    public static void main(String[] args){

       int[] dados = new int[]{1,1,1,1,1,1,1,1,1,1};
       int resultado = 0;

       Soma s1 =  new Soma(dados);
       Thread t1 = new Thread(s1);

       Soma s2 = new Soma(dados);
       Thread t2 = new Thread(s2);

       t1.start();
       t2.start();
    }
}
