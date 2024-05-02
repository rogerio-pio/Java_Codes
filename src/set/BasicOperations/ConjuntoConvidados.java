package set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> ConjuntoConvidado;

    public ConjuntoConvidados(){
        this.ConjuntoConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        ConjuntoConvidado.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado aux = null;
        if(!ConjuntoConvidado.isEmpty()){
            for (Convidado c : ConjuntoConvidado){
                if(c.getCodigoConvite() == codigoConvite){
                    aux = c;
                    break;
                }
            }
            ConjuntoConvidado.remove(aux);
        }else{
            throw new RuntimeException("Conjunto vazio!");
        }
    }

    public void contarConvidados(){
        if(!ConjuntoConvidado.isEmpty()){
            System.out.println(ConjuntoConvidado.size());
        }else{
            throw new RuntimeException("Conjunto vazio!");
        }
    }

    public void exibirConvidados(){
        if(!ConjuntoConvidado.isEmpty()){
            System.out.println(ConjuntoConvidado);
        }else {
            throw new RuntimeException("Conjunto vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        conjunto.adicionarConvidado("Pio", 19);
        conjunto.adicionarConvidado("Henry", 20);
        conjunto.adicionarConvidado("Alex", 18);

        conjunto.exibirConvidados();
        conjunto.contarConvidados();

        conjunto.removerConvidadoPorCodigoConvite(20);
        conjunto.contarConvidados();
        conjunto.exibirConvidados();
    }
}
