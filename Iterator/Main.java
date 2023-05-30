// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Vendas vendas = new Vendas();
        vendas.adicionarVenda(new Venda(1, 100.0));
        vendas.adicionarVenda(new Venda(2, 200.0));
        vendas.adicionarVenda(new Venda(3, 300.0));

        for (Venda venda : vendas) {
            System.out.println("Número: " + venda.getNumero() + ", Valor: " + venda.getValor());
        }
    }
}