package br.com.felipe.funcionarios;

public class Funcionario {

    private String nome;
    private double salarioMinimo;

    public Funcionario(String nome, double salarioMinimo) {
        this.nome = nome;
        this.salarioMinimo = salarioMinimo;
    }

    //POLIMORFISMO
    public double calcularSalario() {
        return salarioMinimo;
    }

    public String getNome() {
        return nome;
    }
}
