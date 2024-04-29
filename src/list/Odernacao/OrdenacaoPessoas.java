package list.Odernacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        listaPessoas.add(pessoa);
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaIdade = new ArrayList<>(listaPessoas);

        if(!listaPessoas.isEmpty()){
            Collections.sort(listaIdade);
            return listaIdade;
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaAltura = new ArrayList<>(listaPessoas);
        if(!listaPessoas.isEmpty()){
            Collections.sort(listaAltura, new ComparatorPorAltura());
            return listaAltura;
        }else {
            throw new RuntimeException("Lista Vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();

        listaPessoas.adicionarPessoa("Pio", 19, 1.84);
        listaPessoas.adicionarPessoa("Gabi", 18, 1.60);
        listaPessoas.adicionarPessoa("Pedro", 9, 1.95);
        System.out.println("Lista ordenada idade: " + listaPessoas.ordenarPorIdade());
        System.out.println("Lista ordenada altura: " + listaPessoas.ordenarPorAltura());
    }
}
