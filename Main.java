package br.com.felipe.polimorfismo.main;

import br.com.felipe.funcionarios.Diretor;
import br.com.felipe.funcionarios.Funcionario;
import br.com.felipe.funcionarios.Gerente;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = {
                new Funcionario("João", 3000),
                new Gerente("Maria", 5000, 2000),
                new Diretor("Felipe", 7000, 5000)
        };

        FolhaPagamento folha = new FolhaPagamento();
        folha.calcularFolhaPagamento(funcionarios);
    }
}
