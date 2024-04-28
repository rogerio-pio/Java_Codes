package list.BasicOperations;

public class Item {
    private int quantidade;
    private String nome;
    private double preco;

    public Item(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return " +Nome: "+ nome + " - quantidade: "+quantidade + " - preço: R$"+ preco+"\n";
    }
}
