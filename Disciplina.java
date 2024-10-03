class Disciplina {
    String nome;
    Curso curso;

    public Disciplina(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
        curso.adicionarDisciplina(this);
    }
}