package testes;

import java.util.Scanner;

import negocio.Professor;


public class TestaProfessor {
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Professor professor = new Professor ();
		
		String nome;
		System.out.printf("Informe o seu nome: ");		
		professor.nome = ler.nextLine();		
	
		int matricula;
		System.out.printf("Informe a sua matr�cula: ");		
		professor.matricula = ler.nextInt();		
//	
		float salario;
		System.out.printf("Informe o seu sal�rio: ");		
		professor.salario = ler.nextFloat();		
	
//		boolean temporario;
//		System.out.printf("Informe se � um professor tempor�rio: ");		
//		temporario = ler.nextBoolean();
//		
//		System.out.println("Nome: " + nome);
//		System.out.println("Matr�cula: " + matricula);
//		System.out.println("Sal�rio: " + salario);
//		System.out.println("Tempor�rio? " + (temporario ? "Sim" : "N�o"));
		
		int tempExp;
		System.out.printf("Informe o seu tempo de experi�ncia: ");		
		professor.tempExp = ler.nextInt();
//		
		int disciplina;
		System.out.printf("Informe a quantidade de disciplinas: ");		
		professor.disciplina = ler.nextInt();
		
		float bonus;
		System.out.printf("Informe o seu bonus: ");		
		professor.bonus = ler.nextFloat();
		
		float gratificacao;
		System.out.printf("Informe a sua gratifica��o: ");		
		professor.gratificacao = ler.nextFloat();
		
		float desconto;
		System.out.printf("Informe o seu desconto: ");		
		professor.desconto = ler.nextFloat();
		
//		System.out.println("Tempo de Experi�ncia: " + tempExp);
//		System.out.println("Quantidade de disciplinas: " + disciplina);
//		System.out.println("Bonus: " + bonus);
//		System.out.println("Gratifica��o: " + gratifica��o);
//		System.out.println("Desconto: " + desconto);
		
		float sBruto = 0;
		sBruto = (professor.salario+professor.bonus+professor.gratificacao-professor.desconto)+professor.tempExp*50 +
		professor.disciplina *100;
		
		System.out.println("Sal�rio bruto:"+sBruto);
		
		System.out.printf("O professor %s (%d) � %s, pois ganha R$%.2f\n",
				professor.nome,
				professor.matricula,
				(sBruto>= 10000 ? "Rico" : "pobre"),
				sBruto				);
		
//		sBruto = ( salario+bonus+gratifica��o-desconto);
//		sBruto = sBruto + (tempExp*50);
//		sBruto = sBruto + (disciplina*100);
//		
//		System.out.println(sBruto);
		
		
	}		
}

