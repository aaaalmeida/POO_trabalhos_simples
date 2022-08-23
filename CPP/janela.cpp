#include <iostream>
using namespace std;

class Janela {
  public:
  string tipoVidro;
  bool aberto;

  void abrir(){
    if(!aberto){
    cout << "Estou abrindo a janela" << endl;
    aberto = true;
    } else
      cout << "Janela ja esta aberta" << endl;
  }
  
  void fechar(){
    if(aberto){
      cout << "Estou fechando a janela" << endl;
      aberto = false;
    } else
      cout << "Janela ja esta fechada" << endl;
  }  

  void info(){
    cout << "Tipo de vidro: " << tipoVidro << endl;
    cout << "Esta aberta? " << (aberto?"sim":"não") << endl;
  }
};

int main(int argc, char **argv){
  Janela janelinhaDoBanheiro;

  janelinhaDoBanheiro.tipoVidro = "blindado"; // unico tipo de vidro que consegui pensar
  janelinhaDoBanheiro.abrir();
  janelinhaDoBanheiro.info();
  janelinhaDoBanheiro.abrir();
  janelinhaDoBanheiro.fechar();
  janelinhaDoBanheiro.info();
  janelinhaDoBanheiro.fechar();

  return 0;
}
