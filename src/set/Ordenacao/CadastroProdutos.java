package set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> setProdutos;

    public CadastroProdutos(){
        this.setProdutos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        setProdutos.add(new Produto(cod, nome, preco, quantidade));
    }
    public void exibirProdutosPorNome(){
        Set<Produto> produtosNome = new TreeSet<>(setProdutos);
        if(!setProdutos.isEmpty()){
            System.out.println(produtosNome);
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public void exibirProdutosPorPreco(){
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPreco());
        if(!setProdutos.isEmpty()){
            produtosPreco.addAll(setProdutos);
            System.out.println(produtosPreco);
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        CadastroProdutos setProdutos = new CadastroProdutos();

        setProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        setProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        setProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        setProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        setProdutos.exibirProdutosPorNome();
        setProdutos.exibirProdutosPorPreco();
    }
}
