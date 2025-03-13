package entity;

import interfaces.Pagamento;

import java.util.ArrayList;

public class Organizacao implements Pagamento {
    private String nome;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    public Organizacao() {
    }

    public Organizacao(String nome, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
        this.nome = nome;
        this.alunos = alunos;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    //Método para gerar um relatório dos alunos cadastrados
    public String relatorioAlunos(){
        String resultado = "";
        for(Aluno aluno : alunos){
            resultado += aluno.toString() + "\n";
        }
        return resultado;
    }

    @Override
    public String realizarPagamento(){
        return "Pagamento foi efetuado com sucesso!";
    }
}
