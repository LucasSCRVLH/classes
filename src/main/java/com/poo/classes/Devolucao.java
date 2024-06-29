package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {
    int dataDev;
    int exemplarId;
    LocalDate dataDevolucao = LocalDate.now();

    void entregaLivro(boolean devolve) {

        /*
         * Emprestimo ep = new Emprestimo();
         * 
         * if(devolve == true){
         * 
         * System.out.println("Livro:" + " " + "Na data" + dataDevolucao );
         * } else{
         * System.out.println("Você ainda não devolveu" + ep.dataEmprestimo);
         * 
         * }
         */

    }

    public int getdataDev() {
        return dataDev;
    }

    public void setdataDev(int dataDev){
    this.dataDev = dataDev;
}   
    public int getexemplarId(){
        return exemplarId;
    }

    public void setexemplarId(int exemplarId){
        this.exemplarId = exemplarId;
    }


}
