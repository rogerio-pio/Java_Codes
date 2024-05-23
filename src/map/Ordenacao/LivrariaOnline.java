package map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline(){
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if(!livros.isEmpty()){
            for (Map.Entry<String, Livro> entry : livros.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    livros.remove(entry.getKey());
                    break;
                }
            }
        }else {
            throw new RuntimeException("Lista de livros vazia!");
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        if (!livros.isEmpty()){
            List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livros.entrySet());
            Collections.sort(livrosParaOrdenar, new ComparatorPreco());
            Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

            for (Map.Entry<String, Livro> entry : livrosParaOrdenar){
                livrosOrdenados.put(entry.getKey(), entry.getValue());
            }
            System.out.println(livrosOrdenados);
        }else {
            throw new RuntimeException("Lista de livros vazia!");
        }
    }

    public Set<Livro> pesquisarLivrosPorAutor(String autor){
        Set<Livro> livrosAutor = new HashSet<>();
        if (!livros.isEmpty()){
            for (Map.Entry<String, Livro> entry : livros.entrySet()){
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(entry.getValue());
                }
            }
            return livrosAutor;
        }else {
            throw new RuntimeException("Lista de livros vazia!");
        }
    }

    public Livro obterLivroMaisCaro(){
        double maisCaro = 0d;
        Livro livroCaro = null;
        if (!livros.isEmpty()){
            for (Map.Entry<String, Livro> entry : livros.entrySet()){
                if (maisCaro < (entry.getValue().getPreco())){
                    maisCaro = entry.getValue().getPreco();
                    livroCaro = entry.getValue();
                }
            }
            return livroCaro;

        }else {
            throw new RuntimeException("Lista de livros vazia!");
        }
    }
    public Livro obterLivroMaisBarato(){
        double maisBarato = Double.MAX_VALUE;
        Livro livroBarato = null;
        if (!livros.isEmpty()){
            for (Map.Entry<String, Livro> entry : livros.entrySet()){
                if (maisBarato > (entry.getValue().getPreco())){
                    maisBarato = entry.getValue().getPreco();
                    livroBarato = entry.getValue();
                }
            }
            return livroBarato;

        }else {
            throw new RuntimeException("Lista de livros vazia!");
        }
    }

    @Override
    public String toString() {
        return "{" + livros + '}';
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z","1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6","Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        String autorPesquisa = "Josh Malerman";
        System.out.println("Livros desse autor: " + livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));

        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livros);
    }
}
