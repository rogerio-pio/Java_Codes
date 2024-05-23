package map.Ordenacao;

import java.util.Map;
import java.util.Comparator;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "{"+ titulo + '\'' + autor + '\''+ preco + '}' + "\n";
    }
}

class ComparatorPreco implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro>  l1, Map.Entry<String, Livro>  l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}
