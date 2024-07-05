package com.poo.classes;

public class Autor {
 String nomeAutor;
 int idAutor;
 static int contator = 1;


 public Autor( String nomeAutor){
    this.nomeAutor = nomeAutor;
    this.idAutor = contator;
    contator++;


 }
 
    public String getnomeAutor(){
    return nomeAutor;
 }
    public void setnomeAutor(String nomeAutor){
        this.nomeAutor = nomeAutor;
    }
 
}
