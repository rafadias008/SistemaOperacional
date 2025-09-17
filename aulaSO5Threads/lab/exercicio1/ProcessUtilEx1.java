package exercicio1;

public class ProcessUtilEx1 {
    public static void atrasar(int tempo){
        int tempoAtraso = tempo * 1000;
        try{
            Thread.sleep(tempoAtraso);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
