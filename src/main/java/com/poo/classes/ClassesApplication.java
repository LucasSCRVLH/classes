package com.poo.classes;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		

		Funcionario yuri = new Gerente("Yuri", "153.874.441-37", "yuri.yuri"," YuYu123", 3912, 1 );

		//Funcionario aline = new Atendente("Aline", "190.321.233-22", "aline.aline", "AlAl123", 1455);//

		boolean sair = false;

		while(!sair){
			
			System.out.println("1-Imprimir");
			System.out.println("2-Sair");
			System.out.println("Escolha uma opção");
			int opcao = sc.nextInt();

			switch (opcao) {
				case 1: 
					if(yuri instanceof Gerente){
						Gerente yuriCast = (Gerente) yuri;
						yuriCast.contraCheque();
					} else{
						System.out.println("Apenas gerentes podem imprimir contracheques");
					}
					break; 
					case 2: sair = true;
					System.out.println("Saindo...");
			
				default: System.out.println("Opção inválida");
					break;
			}
			sc.close();
		}


	
	
	
	
	}
		
	





}
