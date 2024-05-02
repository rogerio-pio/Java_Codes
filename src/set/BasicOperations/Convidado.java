package set.BasicOperations;

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
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", CodigoConvite=" + CodigoConvite +
                '}';
    }
}
