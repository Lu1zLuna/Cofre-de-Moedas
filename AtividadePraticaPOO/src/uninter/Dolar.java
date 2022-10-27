package uninter;

public class Dolar extends Moeda {

    public Dolar(double value) {
        super(value);
    }

    @Override
    public String info() {
        return "\nMoeda: Dólar\n" +
                "Valor: " + this.valor;
    }

    @Override
    public double converter() {
        double cotacaoReal = 5.29;
        double quantiaConvertida = this.valor * cotacaoReal;
        //Moeda conversaoReal = new Real(this.valor);
        return quantiaConvertida;
    }
}
