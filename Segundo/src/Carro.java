//Estrutura de uma Classe, objeto de estudo para POO.

class Carro {
    String cor, modelo;
    int capacTanque;

    // Método Construtor da classe Carro.
    Carro(){

    }
    Carro(String cor, String modelo,int capacTanque){
        this.cor=cor;
        this.modelo=modelo;
        this.capacTanque=capacTanque;

    }
    /*Métodos Set/Get para a Classe Carro
     */
    void setCor(String cor) {
        this.cor = cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setCapacTanque(int capacTanque) {
        this.capacTanque = capacTanque;
    }

    String getCor() {
        return cor;
    }

    String getModelo() {
        return modelo;
    }

    int getCapacTanque() {
        return capacTanque;
    }
    //Método que retorna o cálculo para encher o tanque de combustivel.

    double totalValorTanque(double valorCombustivel){
        return capacTanque*valorCombustivel;
    }
}
