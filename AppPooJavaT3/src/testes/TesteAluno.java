package testes;

import java.util.Scanner;

import negocio.Aluno;

public class TesteAluno {
	
	
	public static void main(String[] args) {
		//final int ANO_ATUAL = 2018;
		Scanner ler = new Scanner(System.in);
		
		Aluno maria = new Aluno();
		Aluno joao = new Aluno ();
		
		
		System.out.printf("Informe o seu nome: ");
		maria.nome = ler.next();
		
		System.out.printf("Informe sua idade: ");
		maria.idade = ler.nextInt();
		
		System.out.printf("Informe a sua mensalidade: ");		
		maria.mensalidade = ler.nextInt();		
		
		System.out.printf("Seu sexo é feminino? ");		
		maria.feminino = ler.nextBoolean();

		maria.exibir();
		
		System.out.printf("Informe o seu nome: ");
		joao.nome = ler.next();
		
		System.out.printf("Informe sua idade: ");
		joao.idade = ler.nextInt();
		
		System.out.printf("Informe a sua mensalidade: ");		
		joao.mensalidade = ler.nextInt();		
		
		System.out.printf("Seu sexo é feminino? ");		
		joao.feminino = ler.nextBoolean();
		
		joao.exibir();
		
		System.out.println("Nome: " + maria.nome);
		System.out.println("idade: " + maria.idade);
		System.out.println("mensalidade: " + maria.mensalidade);
		System.out.println("feminino? " + (maria.feminino ? "Sim" : "Não"));
		
		System.out.println("Nome: " + joao.nome);
		System.out.println("idade: " + joao.idade);
		System.out.println("mensalidade: " + joao.mensalidade);
		System.out.println("feminino? " + (joao.feminino ? "Sim" : "Não"));
		
//		System.out.printf("%s %s tem %d anos e paga R$%.2f",
//				(feminino ? "A aluna" : "O aluno"),
//				nome,
//				idade,
//				mensalidade
//				);
//		System.out.println(" Ano de nascimento: " + (ANO_ATUAL - idade));
//		
//		if (mensalidade >= 1000) {
//			System.out.println("muito Caro");
//		}
//		 else if(mensalidade>= 500 & mensalidade <=999)
//			System.out.println("Barato");
//		 else
//			System.out.println("Muito Barato");
		
		// exiba na tela nome do aluno mais velho
//		if ( idade > idade2)
//			System.out.println("Aluno mais velho é: "+nome );
//		else
//			System.out.println("Aluno mais velho é: "+nome2);
		
		 //exibir aluno mais velho na tela com operador ternário
//		System.out.printf("%s é o aluno mais velho\n",
//				(idade>= idade2 ? nome : nome2));
//		
//		// exibir aluno que paga maior mensalidade com operador ternário
//		System.out.printf("%s é o aluno que paga maior mensalidade\n",
//				(mensalidade>= mensalidade2 ? nome : nome2));
				
		}
	}
