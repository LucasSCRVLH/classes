package com.poo.classes;

public class Livro {
String nomeLivro;
String autor;
int idLivro;
static int contator =2;

public Livro(String nomeLivro, String autor){
    this.nomeLivro =  nomeLivro;
    this.idLivro = contator;
    contator++;
 }





public String getnomeLivro(){
    return nomeLivro;
}
public void setnomeLivro(String nomeLivro){
    this.nomeLivro = nomeLivro;
}
public String getautor(){
    return autor;
}
public void setautor(String autor){
    this.autor = autor;
}


}
