package service;

import repository.Frete;

public class Sedex implements Frete {

    @Override
    public double calcularFrete(double peso) {
        return peso * 10.0;
    }
}
