package Poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) throws InterruptedException {
		
	    List<String> lista = new ArrayList<>();
	    lista.add("DIVERTIDAMENTE");
    	lista.add("CAVALO DE GUERRA");
    	lista.add("PLANETA DOS MACACOS");
	    lista.add("GUERRA CIVIL");
	    lista.add("HOMEM DE FERRO/n");
	    Scanner imput = new Scanner(System.in);
	    
	    //Chamando a classe de filmes 
	    boolean operando = true;
	    while(operando) {
	    	//Chamando classe filme 
	         Filmes.exibirMenu();
	         int opcao = imput.nextInt();
	         imput.nextLine();
	         
	         //Mostrando as opcoes do menu principal
	         switch(opcao) {
	         
	         case 1: 
	        	 System.out.println("Digite o nomme do filme que deseja adicionar: ");
	        	 String nome = imput.nextLine();
	        	 lista.add(nome);
	        	 break;
	        	
	         case 2:
	        	 System.out.println(lista);
	        	 break;
	        	 
	         case 3:
	        	 System.out.println("Digite o nome do filme que você deseja remover: ");
	        	 String toRemove = imput.nextLine();
                 boolean removed = lista.remove(toRemove);
	        	 break;
	         }
	    }
	    imput.close();
	}
}
