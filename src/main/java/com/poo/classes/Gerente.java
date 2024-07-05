package com.poo.classes;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, String login, String senha, double salario, int enderecoId) {
        super(nome, cpf, login, senha, salario, enderecoId);
    }
    @Override


public void contraCheque(){
    System.out.println("Impressão de contracheque para Gerente: ");
    System.out.println("Salário Base: " + getSalario());

double fgts = getSalario() * 0.1;
double inss = getSalario() * 0.12;
System.out.println("FGTS: " + fgts);
System.out.println("INSS: " + inss);
}
    @Override
    public boolean autentica(String login, String senha){
    return this.getLogin().equals(login) && this.getSenha().equals(senha);
    }


}
