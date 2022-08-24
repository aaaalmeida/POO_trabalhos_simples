#include <iostream>
using namespace std;

class Carro{
private:
    bool ligado = false;
    double velocidade = 0;
    string modelo;

public:
    Carro(){}
    Carro(string tipo){
        modelo=tipo;
    }

    void ligar(){
        if (!ligado)
        {
            cout << "Voce ligou o carro " << modelo << endl;
            ligado = true;
        }
        else
            cout << "O carro ja esta ligado" << endl;
    }

    void desligar(){
        if (!ligado)
            cout << "O carro ja esta desligado" << endl;
        else if (ligado && velocidade==0)
        {
            cout << "Voce desligou o carro" << endl;
            ligado = false;
        }
        else 
            cout << "Desacelere o carro para desligar" << endl;
    }

    void acelerar(){
        if (!ligado)
            cout << "Ligue o carro antes de acelerar" << endl;
        else if (velocidade >= 0 && velocidade < 100)
        {
            velocidade += 20;
            cout << "Voce acelerou o carro, velocidade atual " << velocidade << "km/h." << endl;
        }
        else
            cout << "O carro ja esta muito rapido" << endl;
    }

    void frear(){
        if (!ligado || velocidade <= 0)
            cout << "O carro ja esta parado" << endl;
        else
        {
            velocidade -= 20;
            cout << "Voce desacelerou o carro, velocidade atual " << velocidade << "km/h." << endl;
        }
    }
};

int main(){
    Carro carro("Opala");
    carro.ligar();
    carro.acelerar();
    carro.acelerar();
    carro.acelerar();
    carro.frear();
    carro.frear();
    carro.frear();
    carro.desligar();

    return 0;
}
