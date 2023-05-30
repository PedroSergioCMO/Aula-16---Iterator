import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Classe de venda
class Venda {
    private int numero;
    private double valor;

    public Venda(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }
}