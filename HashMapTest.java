import java.util.HashMap;

public class HashMapTest {
    //Tempo de execução: 51ms
    private static final int TAMANHO = 1000000;

    public static void main(String[] args) {

        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

        for (int i = 1; i <= TAMANHO; i++) {
            mapa.put(i, new Produto(i, "Produto" + i, i*20.00));
        }
        long inicio = System.currentTimeMillis();


        for (int qtd = 0; qtd < TAMANHO; qtd++) {
            Produto p = mapa.get(qtd);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (fim - inicio)+"ms");
    }
}
