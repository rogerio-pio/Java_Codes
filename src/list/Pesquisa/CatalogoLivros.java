package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> catalogo;

    public CatalogoLivros(){
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        catalogo.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaPesquisa = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    listaPesquisa.add(livro);
                }
            }
            return listaPesquisa;
        }else {
            throw new RuntimeException("Catalogo vazio");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> PesquisaAno = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for(Livro livro: catalogo){
                int ano = livro.getAnoPublicacao();
                if(anoInicial <= ano  && ano<= anoFinal){
                    PesquisaAno.add(livro);
                }
            }
            return PesquisaAno;
        }
        else {
            throw new RuntimeException("Catalogo vazio");
        }
    }

    public Livro pesquisarPorTitulo(String titulo){
        if(!catalogo.isEmpty()){
            Livro livroPesquisado = null;
            for(Livro livro : catalogo){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPesquisado = livro;
                }
            }
            return livroPesquisado;
        }else {
            throw new RuntimeException("Catalogo Vazio!");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("1984", "George Orwell", 1899);
        catalogo.adicionarLivro("Vitoria", "Pio", 1999);
        System.out.println("Pesquisa autor: " + catalogo.pesquisarPorAutor("George Orwell"));
        System.out.println("Pesquisa ano: " + catalogo.pesquisarPorIntervaloAnos(1800,1900));
        System.out.println("Pesquisa ano: " + catalogo.pesquisarPorIntervaloAnos(1800,1999));
        System.out.println("Pesquisa titulo: " + catalogo.pesquisarPorTitulo("Vitoria"));
    }
}
