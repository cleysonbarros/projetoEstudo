package service;

import repository.Frete;

public class Pac implements Frete {

    @Override
    public double calcularFrete(double peso) {
        return peso * 5.0;
    }
}
