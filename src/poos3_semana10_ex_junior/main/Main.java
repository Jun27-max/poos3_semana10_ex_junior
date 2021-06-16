package poos3_semana10_ex_junior.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



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
		pessoas.sort(Comparator.comparing(Pessoa::getIdade));
		pessoas.forEach(System.out::println);
		
		System.out.println();
		
		pessoas.sort(Comparator.comparing(Pessoa::getIdade).reversed());
		pessoas.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Por nome e idade:");
		Comparator<Pessoa> pessoaIdadeComparator = Comparator.comparing(
				Pessoa::getIdade).thenComparing(Pessoa::getNome);
		
		pessoas.sort(pessoaIdadeComparator);
		pessoas.forEach(System.out::println);
		
		
		
		
		

	}

}
