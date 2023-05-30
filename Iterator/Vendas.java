// Classe que contém a lista de vendas
class Vendas implements Iterable<Venda> {
    private List<Venda> vendas;

    public Vendas() {
        this.vendas = new ArrayList<>();
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    @Override
    public Iterator<Venda> iterator() {
        return new VendasIterator(vendas);
    }
}