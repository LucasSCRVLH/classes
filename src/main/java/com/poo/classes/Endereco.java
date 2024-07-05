package com.poo.classes;
public class Endereco {
String nomeRua;
String bairro;
int numeroLog;
int cep;
private int enderecoID;

private static int contadorEndereco = 0;



public Endereco(int cep) {
    this.cep = cep;
    enderecoID = contadorEndereco;
    contadorEndereco++;
 }




public String getnomeRua(){
    return nomeRua;
}
public void setnomeRua(String nomeRua){
    this.nomeRua = nomeRua;
}

public String getbairro(){
    return bairro;
}
public void setbairro(String bairro){
    this.bairro = bairro;
}

public int getnumeroLog(){
    return numeroLog;
}
public void setnumeroLog(int numeroLog){
    this.numeroLog = numeroLog;
}

public int getcep(){
    return cep;
}
public void setcep(int cep){
    this.cep = cep;
}

public int getEnderecoID() {
    return enderecoID;
}

public void setEnderecoID(int enderecoID) {
    this.enderecoID = enderecoID;
}

}
