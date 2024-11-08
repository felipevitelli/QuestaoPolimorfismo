package br.com.felipe.funcionarios;

public class Gerente extends Funcionario{

    private double aumento;

    public Gerente(String nome, double salarioMinimo, double aumento) {
        super(nome, salarioMinimo);
        this.aumento = aumento;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + aumento ;
    }
}
