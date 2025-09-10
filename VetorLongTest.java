public class VetorLongTest {

    private static final int TAMANHO = 100000; //criando uma constante

    public static void main(String[] args) {
        long[] vetor = new long[TAMANHO];

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                vetor[i] += j;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução: "+(endTime - startTime)+"ms"); //vendo quanto tempo leva a execução do algoritmo
    }
}
