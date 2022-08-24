import java.util.Scanner;

public class Cachorro {
    private boolean acordado;
    private String nome;

    public Cachorro(){}
    public Cachorro(String n){
        this.nome = n;
    }

    public void brincar() {
        if (acordado)
            System.out.printf("%s brinca com voce! Au Au :3\n", nome);
        else
            System.out.printf("%s esta dormindo agora, brinque com ele depois.\n", nome);
    }

    public void acordar() {
        if (!acordado) {
            System.out.printf("%s acaba de acordar\n", nome);
            acordado = true;
        } else
            System.out.printf("%s ja esta acordado\n", nome);
    }

    public void dormir() {
        if (acordado) {
            System.out.printf("%s foi dormir\n", nome);
            acordado = false;
        } else
            System.out.printf("%s ja esta dormindo\n", nome);
    }

    public static void main(String aaaaaa[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do cachorro: ");
        String nome = leitor.nextLine();
        
        Cachorro cachorro = new Cachorro(nome);
        cachorro.brincar();
        cachorro.acordar();
        cachorro.brincar();
        cachorro.dormir();
        cachorro.brincar();
    }
}
