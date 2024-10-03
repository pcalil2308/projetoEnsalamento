class Aluno extends Pessoa {
    Curso curso;

    public Aluno(String nome, Curso curso) {
        super(nome);
        this.curso = curso;
    }
}