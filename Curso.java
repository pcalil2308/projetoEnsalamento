import java.util.ArrayList;
import java.util.List;

class Curso {
    String nome;
    List<Disciplina> disciplinas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}