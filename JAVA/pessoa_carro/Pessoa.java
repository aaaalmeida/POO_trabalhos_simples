package pessoa_carro;

public class Pessoa{
    private String nome;
    private int idade;
    private boolean habilitacao = false;
    private Carro carro;
    
    public Pessoa(){}
    public Pessoa(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;    
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    private void setCarro(Carro carro){ //perguntar pra josimar
        this.carro = carro;
    }
    private void isHabilitacao(boolean habilitacao){    // 
        this.habilitacao = habilitacao;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public boolean getHabilitacao(){
        return habilitacao;
    }


    public void recebeHabilitacao(){    //
        if(idade>=18)
            habilitacao = true;
        else
            System.out.println(getNome() + " ainda não pode tirar a habilitação");
    }
    public void recebeCarro(Carro carro){
        System.out.println(getNome() + " recebe o carro " + carro.getModelo());
        setCarro(carro);
    }

    public void passear(){
        if(this.carro == null)
            System.out.println(getNome() + " ainda não tem um carro por isso vai passear a pé");
        else if(!this.habilitacao)
            System.out.println(getNome() + " tem carro mas ainda não tirou a habilitação, por isso vai passear a pé");
        else {
            System.out.println(getNome() + " tem carro e habilitação então vai passear de carro");

            carro.ligar();
            carro.acelerar();
            carro.acelerar();
            carro.acelerar();
            carro.acelerar();
            carro.frear();
            carro.frear();
            carro.frear();
            carro.frear();
            carro.desligar();
            System.out.println(getNome() + " acabou o passeio");
        }
    }

}
