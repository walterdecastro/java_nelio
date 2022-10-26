package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a" + " pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Pessoa(name, age, height);
		}
		
		double sumH = 0.0;
		for (int i=0; i<vect.length; i++) {
			sumH += vect[i].getHeight();
		}
		
		System.out.println();
		double med = sumH / n;
		System.out.printf("Altura média: %.2f", med);
		System.out.println();
		
		
		double perc = 0.0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge()<16) {
				perc += 1;
			}
		}
		System.out.println("Pessoas com menos de 16 anos: " + perc / n * 100 + "%");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge()<16) {
				System.out.print("Nome: ");
				System.out.println(vect[i].getName());
			}
		}
		
		
		
		sc.close();
	}

}
