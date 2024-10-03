import java.util.ArrayList;
import java.util.List;

class Turma {
    Professor professor;
    Disciplina disciplina;
    List<Aluno> alunos = new ArrayList<>();

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirInformacoes() {
        System.out.println("Turma de " + disciplina.nome);
        System.out.println("Professor: " + professor.nome);
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(" - " + aluno.nome + " (" + aluno.curso.nome + ")");
        }
    }
}