package com.poo.classes;

public class Exemplar {
  int exemplarID;
  String nomeExemplar;
  int contator = 3;
  public Exemplar(int  exemplarID){
    this.exemplarID = exemplarID;
    this.exemplarID = contator;
    contator++;
 }







public int getexemplarID(){
    return exemplarID;
}
public void setexemplarId(int exemplarID){
    this.exemplarID = exemplarID;
}
public String getnomeExemplar(){
    return nomeExemplar;
}
public void setnomeExemplar(String nomeExemplar){
    this.nomeExemplar = nomeExemplar;
}


}
