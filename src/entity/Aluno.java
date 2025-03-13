package entity;

public class Aluno extends Usuario{
    private String turma;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, String login, String senha, String turma) {
        super(nome, matricula, login, senha);
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return String.format("%s - Turma: %s", super.toString(), turma);
    }
}
