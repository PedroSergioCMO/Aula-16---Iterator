// Classe do iterador
class VendasIterator implements Iterator<Venda> {
    private List<Venda> vendas;
    private int posicao;

    public VendasIterator(List<Venda> vendas) {
        this.vendas = vendas;
        this.posicao = 0;
    }

    @Override
    public boolean hasNext() {
        return posicao < vendas.size();
    }

    @Override
    public Venda next() {
        if (hasNext()) {
            Venda venda = vendas.get(posicao);
            posicao++;
            return venda;
        } else {
            throw new java.util.NoSuchElementException();
        }
    }
}
