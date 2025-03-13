import entity.Aluno;
import entity.Organizacao;
import entity.Professor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Organizacao organizacao = new Organizacao();

        Aluno aluno01 = new Aluno("Carlos André", "100020");
        Aluno aluno02 = new Aluno("Maria Clara", "100021");

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno01);
        alunos.add(aluno02);

        organizacao.setAlunos(alunos);

        System.out.println(organizacao.relatorioAlunos());

        Professor pf = new Professor("Davi Saldanha", "10020", "dsaldanha", "123d", 2000);
        System.out.println(pf.toString());
    }
}
