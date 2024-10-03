import java.util.ArrayList;
import java.util.List;

class Ensalamento {
    List<Curso> cursos = new ArrayList<>();
    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professores = new ArrayList<>();
    List<Turma> turmas = new ArrayList<>();

    public Ensalamento() {
        inicializarDados();
    }

    private void inicializarDados() {
        // Cursos
        Curso ti = new Curso("TI");
        Curso adm = new Curso("ADM");
        cursos.add(ti);
        cursos.add(adm);

        // Disciplinas
        Disciplina poo = new Disciplina("POO", ti);
        Disciplina estruturaDados = new Disciplina("Estrutura de Dados", ti);
        Disciplina bi = new Disciplina("BI", adm);

        // Professores
        professores.add(new Professor("Mia", poo));
        professores.add(new Professor("Saulo", estruturaDados));
        professores.add(new Professor("Paula", bi));

        // Alunos
        alunos.add(new Aluno("Alfredo", ti));
        alunos.add(new Aluno("Amélia", ti));
        alunos.add(new Aluno("Ana", adm));
        alunos.add(new Aluno("Bruno", ti));
        alunos.add(new Aluno("Bentinho", adm));
        alunos.add(new Aluno("Capitú", ti));
        alunos.add(new Aluno("Debra", ti));
        alunos.add(new Aluno("Ian", adm));
        alunos.add(new Aluno("Iracema", ti));
        alunos.add(new Aluno("Joelmir", adm));
        alunos.add(new Aluno("Julieta", ti));
        alunos.add(new Aluno("Luana", adm));
        alunos.add(new Aluno("Luciana", ti));
        alunos.add(new Aluno("Majô", adm));
        alunos.add(new Aluno("Maria", adm));
        alunos.add(new Aluno("Norberto", ti));
        alunos.add(new Aluno("Paulo", adm));
        alunos.add(new Aluno("Romeu", adm));
        alunos.add(new Aluno("Wendel", ti));
        alunos.add(new Aluno("Zoey", ti));

        // Turmas
        Turma turmaPoo = new Turma(professores.get(0), poo);
        Turma turmaEstruturaDados = new Turma(professores.get(1), estruturaDados);
        Turma turmaBI = new Turma(professores.get(2), bi);

        // Adicionar alunos às turmas
        for (Aluno aluno : alunos) {
            if (aluno.curso.nome.equals("TI")) {
                turmaPoo.adicionarAluno(aluno);
                turmaEstruturaDados.adicionarAluno(aluno);
            } else if (aluno.curso.nome.equals("ADM")) {
                turmaBI.adicionarAluno(aluno);
            }
        }

        // Adicionar turmas à lista de turmas
        turmas.add(turmaPoo);
        turmas.add(turmaEstruturaDados);
        turmas.add(turmaBI);
    }

    public void executarEnsalamento() {
        for (Turma turma : turmas) {
            turma.exibirInformacoes();
            System.out.println();
        }
    }
}