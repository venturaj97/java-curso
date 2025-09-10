import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 2;
        ArrayList<Integer> idades = new ArrayList<>(); // isso é tipagem de coleções

        idades.add(20);
        idades.add(30);
        System.out.println(idades.get(1)); //saida 30


        for (int i = 0; i < n; i++){
            System.out.println(i); // O(n)
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(i + j); // O(n2) ao quadrado
            }
        }

    }
}