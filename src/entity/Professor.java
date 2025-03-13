package entity;

public class Professor extends Usuario{
    private double salario;

    public Professor(){
    }

    public Professor(String nome, String matricula, String login, String senha, double salario){
        super(nome, matricula, login, senha);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}