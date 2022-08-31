package pessoa_carro;
public class CarroPessoa{
    public static void main(String []args){
        Pessoa pessoa = new Pessoa(22, "Camila");
        Carro carro = new Carro("Fox");


        pessoa.passear();
        pessoa.recebeCarro(carro);
        pessoa.passear();
        pessoa.recebeHabilitacao();
        pessoa.passear();
    }
}