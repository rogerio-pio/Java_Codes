package set.BasicOperations;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int CodigoConvite;

    public Convidado(String nome, int CodigoConvite){
        this.CodigoConvite = CodigoConvite;
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public int getCodigoConvite(){
        return CodigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", CodigoConvite=" + CodigoConvite +
                '}';
    }
}
