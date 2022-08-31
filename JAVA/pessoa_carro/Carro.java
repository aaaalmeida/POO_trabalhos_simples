package pessoa_carro;

public class Carro{
    private boolean ligado = false;
    private String modelo;
    private int velocidade = 0;
    
    public Carro(){}
    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }

    public void mostraInfo(){
        System.out.println("Modelo: " + modelo + "\nVelocidade: " + velocidade + "\n");
    }

    public void ligar(){
        if(ligado){
            System.out.println("Carro ja esta ligado");
            return;
        }
        ligado = true;
    }

    public void desligar(){
        if(!ligado)
            System.out.println("Carro ja esta desligado");
        
        else if(velocidade > 0)
            System.out.println("Pare o carro antes de desligar");
        
        else ligado = false;
    }

    public void acelerar(){
        if(!ligado){
            System.out.println("Ligue o carro antes de acelerar");
            return;
        }
        else if(velocidade>=140){
            System.out.println("O carro ja esta na velocidade limite");
            return;
        }
        velocidade+=20;
        System.out.println("O carro acelera para a velocidade " + velocidade + "km/h");
    }
    
    public void frear(){
        if(!ligado || velocidade<=0){
            System.out.println("O carro ja esta parado");
            return;
        }
        velocidade-=20;
        System.out.println("O carro diminui para a velocidade " + velocidade + "km/h");
    }
}

