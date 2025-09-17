package exercicio2;

public class ThreadSoma implements Runnable{
    
    private int[] dados;
    public int resultado;
    private int positionEnd;
    private int positionInitial;

    public ThreadSoma(int[] dados, int positionInitial, int positionEnd){
        this.dados = dados;
        resultado = 0;
        this.positionEnd = positionEnd;
        this.positionInitial = positionInitial;
    }

    @Override
    public void run(){
        for(int i = positionInitial; i <= positionEnd; i++){
            resultado += dados[i];
            // ProcessUtil.atrasar(i);
        }
        System.out.println(resultado);

    }
}
