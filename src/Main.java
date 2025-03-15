import entity.Aluno;
import entity.Organizacao;
import entity.Professor;
import entity.Usuario;
import exception.CalculadoraException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        ArrayList<Professor> dbprofessores = new ArrayList<>();
        int option = 0;

        while(option!=2){
            System.out.println("1. CADASTRO\n" +
                    "2. SAIR\n");
            option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1:
                    System.out.println("1. PROFESSOR\n" +
                            "2. ALUNO\n" +
                            "3. VOLTAR");
                    int option2 = scan.nextInt();
                    scan.nextLine();
                    switch (option2){
                        case 1:
                            System.out.println("Nome: ");
                            String nome = scan.nextLine();
                            System.out.println("Matricula: ");
                            String matricula = scan.nextLine();
                            System.out.println("Login: ");
                            String login = scan.nextLine();
                            System.out.println("Senha: ");
                            String senha = scan.nextLine();
                            System.out.println("Salario: ");
                            double salario = scan.nextDouble();
                            scan.nextLine();

                            dbprofessores.add(new Professor(nome, matricula, login, senha, salario));

                            System.out.println("Professor cadastrado com sucesso!\n" +
                                    "Tecle ENTER para continuar...");
                            scan.nextLine();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Até Logo!");
                default:
                    System.out.println("Opção Inválida!");
            }
        }




        Organizacao organizacao = new Organizacao();

        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno01);
        alunos.add(aluno02);

        organizacao.setAlunos(alunos);

        System.out.println(organizacao.relatorioAlunos());

        Professor pf = new Professor("Davi Saldanha", "10020", "dsaldanha", "123d", 2000);
        System.out.println(pf.toString());


        /*--------------------------------------------------------------------------------------------------------------*/

        try{
            Calculadora calc =  new Calculadora();
            calc.divisao(10, 0);
        }catch (CalculadoraException e){
            System.out.println(new Date() + " [ERROR]: " + e.getMessage());
        }

        System.out.println("Executado!");

    }
}
