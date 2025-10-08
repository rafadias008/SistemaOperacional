package lab;

public class Consumidor implements Runnable{

    private BufferCircular buffer;

    public Consumidor(BufferCircular buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        while(true){
            ProcessUtil.atrasar(2);
            buffer.remover();
        }
    }
}