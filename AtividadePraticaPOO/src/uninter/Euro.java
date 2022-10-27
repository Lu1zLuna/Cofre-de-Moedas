package uninter;

public class Euro extends Moeda {

    //Construtor da classe
    public Euro(double value) {
        super(value);
    }

    @Override
    public String info() {
        return "\nMoeda: Euro\n" +
                "Valor: " + this.valor;
    }

    @Override
    public double converter() {
        double cotacaoReal = 5.28;
        double quantiaConvertida = this.valor * cotacaoReal;
        //Moeda conversaoReal = new Real(quantiaConvertida);
        return quantiaConvertida;
    }
}
