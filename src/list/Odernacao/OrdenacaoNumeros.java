package list.Odernacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> listaNumeros;

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public OrdenacaoNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> listaCrescente = new ArrayList<>(listaNumeros);
        if(!listaCrescente.isEmpty()){
            Collections.sort(listaCrescente);
            return listaCrescente;
        }else{
            throw new RuntimeException("Lista vazia!");
        }
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> listaDecrescente = new ArrayList<>(listaNumeros);
        if(!listaNumeros.isEmpty()){
            listaDecrescente.sort(Collections.reverseOrder());
            return listaDecrescente;
        }else{
            throw new RuntimeException("Lista vazia!");
        }
    }


    public void exibirLista(List<Integer> lista){
        if(!lista.isEmpty()){
            System.out.println(lista);
        }else {
            throw new RuntimeException("lista vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros lista = new OrdenacaoNumeros();
        lista.adicionarNumero(9);
        lista.adicionarNumero(39);
        lista.adicionarNumero(29);
        lista.adicionarNumero(19);
        lista.adicionarNumero(90);

        lista.exibirLista(lista.getListaNumeros());

        lista.exibirLista(lista.ordenarAscendente());
        lista.exibirLista(lista.ordenarDescendente());


    }
}
