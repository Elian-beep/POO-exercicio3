package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = sc.nextLine();
		aluno1.n1 = sc.nextDouble();
		aluno1.n2 = sc.nextDouble();
		aluno1.n3 = sc.nextDouble();
		double gradeFinal = aluno1.gradeFinal();
		
		System.out.printf("GRADE FINAL %.2f\n", gradeFinal);
		
		if(gradeFinal>=60) {
			System.out.println("PASSOU");
		}else {
			System.out.println("FALHOU");
			System.out.printf("FALTOU %.2f PONTOS", 60-gradeFinal);
		}
		
		sc.close();

	}

}
