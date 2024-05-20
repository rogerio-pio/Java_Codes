package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        if (!estoqueProdutosMap.isEmpty()){
            System.out.println(estoqueProdutosMap);
        }else {
            System.out.println("Estoque vazio!");
        }
    }
    public double calcularValorTotalEstoque(){
        double total = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                total += (p.getPreco() * p.getQuantidade());
            }
            return total;
        }else {
            throw new RuntimeException("Estoque vazio!");
        }
    }

    public Produto obterProdutoMaisCaro(){
        double maisCaro = 0d;
        Produto caro = null;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if(maisCaro < p.getPreco()){
                    maisCaro = p.getPreco();
                    caro = p;
                }
            }
            return caro;
        }else {
            throw new RuntimeException("Estoque vazio!");
        }
    }

    public Produto obterProdutoMaisBarato(){
        double maisbarato = 0d;
        Produto barato = null;
        int aux = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                aux +=1;
                if (aux == 1){
                    maisbarato = p.getPreco();
                }
                if (maisbarato > p.getPreco()){
                    maisbarato = p.getPreco();
                    barato = p;
                }
            }
            return barato;
        }else {
            throw new RuntimeException("Estoque vazio!");
        }
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto maiorProduto = null;
        double maior = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (maior < (p.getPreco() * p.getQuantidade())){
                    maior = (p.getPreco() * p.getQuantidade());
                    maiorProduto = p;
                }
            }
            return maiorProduto;
        }else {
            throw new RuntimeException("Estoque vazio!");
        }
    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
