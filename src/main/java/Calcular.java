import service.CalculadoraFretes;
import service.FreteExpresso;
import service.Pac;
import service.Sedex;

public class Calcular {

    public static void main(String[] args) {
        CalculadoraFretes calculadoraFretes = new CalculadoraFretes();

        double peso  = 10.00;

        calculadoraFretes.setFrete(new Sedex());
        System.out.println("Frete por Sedex: R$ " + calculadoraFretes.calcular(peso));


        calculadoraFretes.setFrete(new Pac());
        System.out.println("Frete por Pac: R$ " + calculadoraFretes.calcular(peso));


        calculadoraFretes.setFrete(new FreteExpresso());
        System.out.println("Frete por FreteExpresso: R$ " + calculadoraFretes.calcular(peso));
    }

}
