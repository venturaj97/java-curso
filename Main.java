public class Main {
    public static void main(String[] args) { //objeto
        Pessoa p = new Pessoa(); // usando a palavra new, aqui eu crio um objeto do tipo pessoa
        p.nome = "João"; // aqui e embaixo eu manipulo ele do jeito que eu quiser
        p.idade = 28;
        System.out.println(p.nome);
        System.out.println(p.idade);
        System.out.println("Meu nome é " + p.nome + " e tenho " + p.idade + " anos de !");
    }
}