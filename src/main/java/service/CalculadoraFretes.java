package service;

import repository.Frete;

public class CalculadoraFretes {

    private Frete frete;

    public double calcular(double pese){
        return  frete.calcularFrete(pese);
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
