package entity;

import java.util.ArrayList;

public class Organizacao {
    private String nome;
    private ArrayList<Aluno> alunos;

    public Organizacao() {
    }

    public Organizacao(String nome, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
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

    //Método para gerar um relatório dos alunos cadastrados
    public String relatorioAlunos(){
        String resultado = "";
        for(Aluno aluno : alunos){
            resultado += aluno.exibirDetalhes() + "\n";
        }
        return resultado;
    }
}
