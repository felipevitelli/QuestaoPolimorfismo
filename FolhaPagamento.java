package br.com.felipe.funcionarios;

public class FolhaPagamento {

    public void calcularFolhaPagamento(Funcionario[] funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + " - Salário: R$" + funcionario.calcularSalario());
        }
    }
}

