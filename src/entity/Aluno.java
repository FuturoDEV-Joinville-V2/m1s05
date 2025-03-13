package entity;

public class Aluno extends Usuario{
    private String nome;
    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String exibirDetalhes(){
        return String.format("Nome do entity.Aluno: %s\nMatrícula do entity.Aluno: %s", nome, matricula);
    }
}
