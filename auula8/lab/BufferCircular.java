package lab;

public class BufferCircular{

    private static final int BUFFER_SIZE = 5;
    private int[] buffer; //buffer de dados
    private int in, out;
    private int contador; // variavel perigosa
    
    public BufferCircular(){
        in = 0;
        out = 0;
        buffer = new int[BUFFER_SIZE];
        contador = 0;
    }

    public void inserir(int item){
        int cicloEspera = 0;

        while(contador == BUFFER_SIZE){
            System.out.print(cicloEspera++ + "do produtor\r");
            ; //espera ocupadada
        }
        buffer[in] = item;
        in = (in + 1) % BUFFER_SIZE;
        contador++;
        System.out.print("\nProdutor: contador: " + contador);
    }

    public int remover(){
        cicloEspera = 0;
        
        while(contador == 0){
            System.out.print(cicloEspera++ + "do Consumidor\r");
            ; // espera ocupada
        }
        int valor = buffer[out];
        out = (out + 1) % BUFFER_SIZE;
        contador--;
        System.out.print("\nConsumidor: Contador: " + contador);
        return valor;
    }
}