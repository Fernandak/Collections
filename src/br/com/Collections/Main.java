package br.com.Collections;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner  sc =  new Scanner(System.in);

		ArrayList<ControleEstoque> estoque =  new  ArrayList<>();

		System.out.println("Quantos produtos voce quer adicionar? ");
		int quantidadeP = sc.nextInt();
		sc.nextLine();

		for (int i=0; i< quantidadeP; i++) {
			System.out.println("Nome do produto: ");
			String nomep = sc.next();
			sc.nextLine();

			System.out.println("Preço produto:");
			int precop = sc.nextInt();

			System.out.println("Descrição produto:");
			String descricaop = sc.next();
				
			estoque.add( new ControleEstoque (nomep, precop, descricaop));
		
		}
				
		for (ControleEstoque i: estoque) {
			System.out.println(i.toString());
			System.out.println("Produto adicionado com sucesso!!");
		}
		
		sc.close();
	}
}

