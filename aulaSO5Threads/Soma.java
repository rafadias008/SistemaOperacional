public class Soma implements Runnable{
    
    private int[] dados;
    public int resultado;

    public Soma(int[] dados){
        this.dados = dados;
        resultado = 0;
    }

    @Override
    public void run(){
        for(int i = 0; i < dados.length; i++){
            resultado += dados[i];
            ProcessUtil.atrasar(i);
        }
        System.out.println(resultado);
    }
}
