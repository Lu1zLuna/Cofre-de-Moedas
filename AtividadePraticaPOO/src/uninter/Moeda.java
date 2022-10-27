package uninter;

import java.util.Objects;

public abstract class Moeda {
    
    //Construtor da classe mãe
    public Moeda(double value) {
        valor = value;
    }
    
    //Campo
    protected double valor;


    //Método para exibir informação
    abstract public String info();
	
    //Método de conversão
    abstract public double converter();
    
    //Método equals compara se já existe algum objeto igual na memória
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moeda other = (Moeda) obj;
        return Objects.equals(valor, other.valor);
    }
}
