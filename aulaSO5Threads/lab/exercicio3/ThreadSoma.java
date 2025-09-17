package exercicio3;

public class ThreadSoma implements Runnable{
     
    private int[][]dados;
    public int resultado;
    private int positionEnd;
    private int positionInitial;
    private int linha;

    public ThreadSoma(int[][] dados,int linha, int positionInitial, int positionEnd){
        this.dados = dados;
        resultado = 0;
        this.positionEnd = positionEnd;
        this.positionInitial = positionInitial;
        this.linha = linha;
    }

    @Override
    public void run(){
        
        for(int j = positionInitial; j <= positionEnd; j++){
            resultado += dados[linha][j];
            // ProcessUtil.atrasar(1);
        }
       
        System.out.println(resultado);

    }
}
