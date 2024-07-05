package com.poo.classes;

public abstract class Funcionario  extends Pessoa{
private double salario;

    private String login;
    private String senha;

    public Funcionario(String nome, String cpf,  String login, String senha,  double salario, int enderecoId){
        super(nome, cpf, enderecoId);
        this.salario = salario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
        public abstract void contraCheque();
    
        public abstract boolean autentica(String login, String senha);


}
