package uninter;

public class Real extends Moeda {

    //Construtor da classe
    public Real(Double value) {
        super(value);
    }

    @Override
    public String info() {
        return "\nMoeda: Real\n" +
               "Valor: " + this.valor;
    }

    @Override
    public double converter() {
        //Moeda conversaoReal = new Real(this.valor);
        //return conversaoReal;
        return this.valor;
    }
}
