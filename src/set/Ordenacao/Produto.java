package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long cod;
    private double preco;
    private int qtd;

    public Produto(long cod, String nome, double preco, int qtd){
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }
    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public String toString() {
        return '{'+ "nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", qtd=" + qtd + '}' + '\'';
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}