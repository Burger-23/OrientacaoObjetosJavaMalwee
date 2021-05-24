package br.com.carroturbo;

public class LojadeCarros {

	public static void main(String[] args) {

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
		
		
		System.out.println("----------");
		System.out.println("|1º Carro|");
		System.out.println("----------");
		System.out.println(carro1.getMarca()); 
		System.out.println(carro1.getModelo());
		System.out.print("Ano: ");
		System.out.println(carro1.getAno());
		System.out.print("Quantidade de portas: ");
		System.out.println(carro1.getQtdPortas());
		
		System.out.print("\n");
		
		System.out.println("----------");
		System.out.println("|2º Carro|");
		System.out.println("----------");
		System.out.println(carro2.getMarca()); 
		System.out.println(carro2.getModelo());
		System.out.print("Ano: ");
		System.out.println(carro2.getAno());
		System.out.print("Quantidade de portas: ");
		System.out.println(carro2.getQtdPortas());
		
		System.out.print("\n");

		System.out.println("----------");
		System.out.println("|3º Carro|");
		System.out.println("----------");
		System.out.println(carro3.getMarca()); 
		System.out.println(carro3.getModelo());
		System.out.print("Ano: ");
		System.out.println(carro3.getAno());
		System.out.print("Quantidade de portas: ");
		System.out.println(carro3.getQtdPortas());
		
		System.out.print("\n");
		
		System.out.println("----------");
		System.out.println("|4º Carro|");
		System.out.println("----------");
		System.out.println(carro4.getMarca()); 
		System.out.println(carro4.getModelo());
		System.out.print("Ano: ");
		System.out.println(carro4.getAno());
		System.out.print("Quantidade de portas: ");
		System.out.println(carro4.getQtdPortas());
		
		System.out.print("\n");

		System.out.println("----------");
		System.out.println("|5º Carro|");
		System.out.println("----------");
		System.out.println(carro5.getMarca()); 
		System.out.println(carro5.getModelo());
		System.out.print("Ano: ");
		System.out.println(carro5.getAno());
		System.out.print("Quantidade de portas: ");
		System.out.println(carro5.getQtdPortas());

		
		
	}

}
