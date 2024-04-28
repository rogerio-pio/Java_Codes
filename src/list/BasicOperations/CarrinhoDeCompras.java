package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco){
        Item item = new Item(nome, quantidade, preco);

        carrinho.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        if(!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itemRemover.add(item);
                }
            }
            carrinho.removeAll(itemRemover);
        }else {
            System.out.println("Carrinho vazio!");
        }
    }

    public void calcularValorTotal() {
        double total = 0.0;
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                double totalItem = (item.getPreco() * item.getQuantidade());
                total += totalItem;
            }
            System.out.println("Total: " + total);
        }else {
            System.out.println("Carrinho vazio!");
        }
    }

    public void exibirItens(){
        if(!carrinho.isEmpty()) {
            System.out.println(carrinho);
        }else {
            System.out.println("Carrinho vazio!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("esponja", 2, 1.5);
        carrinho.adicionarItem("cafe", 2, 8.5);

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        carrinho.removerItem("esponja");
        carrinho.removerItem("cafe");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();


    }
}
