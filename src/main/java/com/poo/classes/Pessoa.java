package com.poo.classes;


public abstract class Pessoa {
private static int contadorPessoa = 0;
String pessoa;
private int rg;
private String nome;
private String cpf;
//private Endereco endereco;
private int pessoaId;
private int enderecoId;

    public Pessoa(String nome, String cpf, int enderecoId) {
        this.nome = nome;
        this.cpf = cpf;
       this.enderecoId = enderecoId;
        pessoaId = contadorPessoa ;
        contadorPessoa++;

    }


    public String getPessoa() {
        return pessoa;
    }


    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }


    public int getRg() {
        return rg;
    }


    public void setRg(int rg) {
        this.rg = rg;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf.substring(0, 3) + "." +
        cpf.substring(3, 6) + "." +
        cpf.substring(6, 9) + "-" +
        cpf.substring(9, 11);
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
        if (cpf != null && cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("Cpf deve conter 11 numeros");
        }
    
    
    }


    public int getenderecoId() {
        return enderecoId;
    }


    public void setEndereco(int enderecoId) {
        this.enderecoId = enderecoId;
    }


    public int getPessoaId() {
        return pessoaId;
    }


    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }


}
