package poos3_semana10_ex_junior.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import poos3_semana10_ex_junior.entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Pessoa("Dênis", 37));
		pessoas.add(new Pessoa("Ana", 37));
		pessoas.add(new Pessoa("Joseane", 36));
		pessoas.add(new Pessoa("Marcos", 35));
		pessoas.add(new Pessoa("Marcelo", 31));
		pessoas.add(new Pessoa("Ruy", 55));
		pessoas.add(new Pessoa("Junior", 39));
		pessoas.add(new Pessoa("Carlos", 26));
		pessoas.add(new Pessoa("Ana", 26));
		pessoas.add(new Pessoa("Jurema", 26));
		pessoas.add(new Pessoa("Francisco", 27));
		pessoas.add(new Pessoa("Marina", 39));
		
		//Ordenando pela idade
		System.out.println("Por idade:");
		List<Pessoa>  idade = pessoas.stream()
				.sorted(Comparator.comparingInt(Pessoa::getIdade))
				.collect(Collectors.toList());
		
		idade.forEach(System.out::println);
		
		System.out.println();
		
		List<Pessoa>  idadeRev = pessoas.stream()
				.sorted(Comparator.comparingInt(Pessoa::getIdade).reversed())
				.collect(Collectors.toList());
		
		idadeRev.forEach(System.out::println);
		
		System.out.println();
		
		//Ordenar pela idade e nome
		System.out.println("Por nome e idade:");
		List<Pessoa>  nome = pessoas.stream().sorted((p1,p2) ->{
			if(p1.getIdade() == p2.getIdade())
				return p1.getNome().compareTo(p2.getNome());
			else if(p1.getIdade()>p2.getIdade())
				return 1;
			else return -1;
		}).collect(Collectors.toList());
				
		
		nome.forEach(System.out::println);
		

	}

}
