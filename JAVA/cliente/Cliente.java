import java.util.Scanner;
public class Cliente{
    private int codigo;
    private String nome;
    private double limiteCredito;
    private boolean especial;

    public Cliente(){
        this.limiteCredito = 0;
        this.especial = false;
    }
    public Cliente(int codigo){
        this.codigo = codigo;
        this.limiteCredito = 0;
        this.especial = false;
    }
    public Cliente(String nome, int codigo){
        this.codigo = codigo;
        this.nome = nome;
        this.limiteCredito = 0;
        this.especial = false;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    private void setLimite(double limite){  ////////
        this.limiteCredito += limite;
    }
    private void setEspecial(boolean especial){ ////////
        this.especial = especial;
    }

    public String getNome(){
        return this.nome;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public double getLimite(){
        return this.limiteCredito;
    }
    public boolean getEspecial(){
        return this.especial;
    }

    // public void aumentarLimite(){
    //     if(getEspecial()){
    //         System.out.println(getNome()+" aumentou o limite do cartão de R$"+getLimite()+" para R$ "+(getLimite()+200));
    //         setLimite(200);
    //         return;
    //     }
    //     System.out.println(getNome()+" não é cliente especial logo não pode aumentar seu limite");
    // }
    public void aumentarLimite(Scanner leitor){
        if(getEspecial()){
            System.out.printf("Digite o valor aumentado no limite do cartão: ");
            double qtd = leitor.nextDouble();
            System.out.println(getNome()+" aumentou o limite do cartão de R$"+getLimite()+" para R$ "+(getLimite()+qtd));
            setLimite(qtd);
            return;
        }
        System.out.println(getNome()+" não é cliente especial logo não pode aumentar seu limite");
    }

    public void diminuirLimite(Scanner leitor){
        if(getEspecial()){
            double qtd;
            do{
            System.out.printf("Digite o valor a ser reduzido do limite do cartão: ");
            qtd = leitor.nextDouble();
                if(qtd<=getLimite()){
                System.out.println(getNome()+" diminuiu o limite do cartão de R$ "+getLimite()+" para R$ "+(getLimite()-qtd));
                setLimite(qtd);
            }
            else
                System.out.println("Limite não pode ser um valor negativo");
        }while(qtd>getLimite());
            return;
        }
        System.out.println("Limite do cartão ja é R$ 0");
    }

    public void virarEspecial(){
        System.out.println(getNome()+" agora é um cliente especial");
        setEspecial(true);
    }
    public void deixarEspecial(){
        System.out.println(getNome()+" não é mais um cliente especial");
        setEspecial(false);
        this.limiteCredito = 0; // não sei se transformar um atributo assim é seguro,
        // perguntar depois
    }

    public static void main(String []args){
        Scanner leitor = new Scanner(System.in);
        Cliente cliente = new Cliente("Camila", 22);
        cliente.virarEspecial();
        cliente.aumentarLimite(leitor);
        cliente.aumentarLimite(leitor);
        cliente.diminuirLimite(leitor);
        cliente.deixarEspecial();
    }
}
