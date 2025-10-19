package items;

public class Burger implements ItemCombo{
    private final String nome;
    private final double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("= %-15s %12s%.2f)", nome, "(R$ ",preco);
    }
}
