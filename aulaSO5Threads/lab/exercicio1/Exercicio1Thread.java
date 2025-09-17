package exercicio1;

public class Exercicio1Thread implements Runnable{

    String msg;
    int tempo;

    public Exercicio1Thread(String msg, int tempo){
        this.msg = msg;
        this.tempo = tempo;
    }

    @Override
    public void run(){
        for(int i = 0; i <= 10;i++){
            System.out.println(msg);
            ProcessUtilEx1.atrasar(tempo);
        }
    }
}
