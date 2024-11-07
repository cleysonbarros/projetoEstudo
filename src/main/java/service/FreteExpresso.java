package service;

import repository.Frete;

public class FreteExpresso implements Frete {

    @Override
    public double calcularFrete(double peso) {
        return peso * 15.0;
    }
}
