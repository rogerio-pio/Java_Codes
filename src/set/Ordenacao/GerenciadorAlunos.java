package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAlunos;

    public GerenciadorAlunos(){
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        setAlunos.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        if (!setAlunos.isEmpty()){
            for (Aluno a : setAlunos){
                if (a.getMatricula() == matricula){
                    alunoRemover = a;
                    break;
                }
            }
            setAlunos.remove(alunoRemover);
        }else {
            throw new RuntimeException("Lista de alunos vazia!");
        }
    }
    public void exibirAlunosPorNome(){
        Set<Aluno> setNome = new TreeSet<>(setAlunos);
        if(!setAlunos.isEmpty()){
            System.out.println(setNome);
        }else {
            throw new RuntimeException("Lista de alunos vazia!");
        }
    }
    public void exibirAlunosPorNota(){
        Set<Aluno> setNota = new TreeSet<>(new ComparatorNota());
        if (!setAlunos.isEmpty()){
            setNota.addAll(setAlunos);
            System.out.println(setNota);
        }else {
            throw new RuntimeException("Lista de alunos vazia!");
        }
    }
    public void exibirAlunos(){
        System.out.println(setAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(123456L);
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
