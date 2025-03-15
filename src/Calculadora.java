import exception.CalculadoraException;

public class Calculadora {

    public double divisao(double valor1, double valor2) throws CalculadoraException {
        if(valor2 == 0){
            throw new CalculadoraException("Não é possível dividir por 0!");
        }
        return valor1 / valor2;
    }
}
