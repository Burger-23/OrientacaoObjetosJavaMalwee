package br.com.carroturbo;

import java.util.ArrayList;
import java.util.List;

public class LojadeCarros {

	public static void main(String[] args) {

		List<Carro> listacarro = new ArrayList<Carro>();
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();
		
		
		carro1.setMarca("Volkswagen");
		carro1.setModelo("Gol Quadrado Turbo");
		carro1.setAno(93);
		carro1.setQtdPortas(2);
		
		carro2.setMarca("Volkswagen");
		carro2.setModelo("Voyage");
		carro2.setAno(82);
		carro2.setQtdPortas(2);
		
		carro3.setMarca("Chevrolet");
		carro3.setModelo("Opala Diplomata");
		carro3.setAno(92);
		carro3.setQtdPortas(4);
		
		carro4.setMarca("Chevrolet");
		carro4.setModelo("Chevette Tubarão");
		carro4.setAno(74);
		carro4.setQtdPortas(2);
		
		carro5.setMarca("Volkswagen");
		carro5.setModelo("Tiguan");
		carro5.setAno(2020);
		carro5.setQtdPortas(4);
		
		listacarro.add(carro1);
		listacarro.add(carro2);
		listacarro.add(carro3);
		listacarro.add(carro4);
		listacarro.add(carro5);
		
		
		System.out.println("-------------------------");
		System.out.println("|--CARROS--CADASTRADOS--|");
		System.out.println("-------------------------");
		for(Carro people : listacarro) {
			System.out.println("\n");

			
			System.out.print("Marca: ");
			System.out.println(people.getMarca());
			
			System.out.print("Modelo: ");
			System.out.println(people.getModelo());
			
			System.out.print("Ano: ");
			System.out.println(people.getAno());
			
			System.out.print("Quantidade de portas: ");
			System.out.println(people.getQtdPortas()); 
			
			System.out.println("\n");

			System.out.println("-------------------------");

			
		}
		

	}

}