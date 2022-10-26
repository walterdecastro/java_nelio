package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//List não aceita tipos primitivos, apenas classe(tipos referência)
		//Exemplo: List<int> list;
		List<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("Paul");
		list.add("George");
		list.add("Ringo");
		list.add("Molly");
		list.add("Jude");
		list.add(2, "Desmond");
		/*
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		for (String x : list) {
			System.out.println(x);
		}
		String tam = "Tamanho da list: ";
		System.out.println(tam + list.size());
		for (int i=0; i<tam.length() + 1; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		//list.remove("Desmond");
		list.removeIf(x -> x.charAt(3) == 'l');
		for (String x : list) {
			System.out.println(x);
		}
		tam = "Tamanho da list: ";
		System.out.println(tam + list.size());
		for (int i=0; i<tam.length() + 1; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		System.out.println("Index of Desmond: " + list.indexOf("Desmond"));
		
		tam = "Tamanho da list: ";
		for (int i=0; i<tam.length() + 2; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		tam = "Tamanho da list: ";
		for (int i=0; i<tam.length() + 2; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
