package com.poo.classes;

import java.time.LocalDate;

public class Emprestimo {
 
 int dataEmp;
 LocalDate dataEmprestimo = LocalDate.now();
 
/*void pegarLivro(boolean pegar){
    
    if(pegar == true){
        
        System.out.println("Livro:" + " " + "Na data" + dataEmprestimo );
    } else{
        System.out.println("Você não tem livro na sua conta");
    }*/

    public int getdataEmp(){
        return dataEmp;
    }
    public void setdataEmp(int dataEmp){
        this.dataEmp = dataEmp;
    }
}



