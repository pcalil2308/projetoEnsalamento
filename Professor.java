class Professor extends Pessoa {
    Disciplina disciplina;

    public Professor(String nome, Disciplina disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }
}