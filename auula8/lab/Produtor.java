package lab;

public class Produtor implements Runnable{

    private BufferCircular buffer;

    @Override
    public void run(){
        int dado = 0;
        while(true){
            ProcessUtil.atrasar(2);
            buffer.inserir(dado);
        }
    } 
}