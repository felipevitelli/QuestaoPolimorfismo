package br.com.felipe.funcionarios;

public class Diretor extends Funcionario {

    private double aumento;

    public Diretor(String nome, double salarioMinimo, double aumento) {
        super(nome, salarioMinimo);
        this.aumento = aumento;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + aumento ;
    }
}
