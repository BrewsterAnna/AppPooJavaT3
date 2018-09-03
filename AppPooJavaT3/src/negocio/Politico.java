package negocio;

public class Politico {
		final int SEIS_ANOS_MESES = 72;
		final int  QUATRO_ANOS_MESES= 48;		
		public String nome;
		public float salario;
		public boolean senador;
		public int qtMandatos;
		public int tempo;
		
	public void show() {
		System.out.println(nome + calcularSalarioTotal());
	}

	private float calcularSalarioTotal() {
		
		return calcularMandatos()*salario;
	}
	
	private int calcularMandatos() {
		tempo = (senador ? SEIS_ANOS_MESES : QUATRO_ANOS_MESES);
		return tempo*qtMandatos;
	}
	
	
}
//Deve ter um método que calcule o salário total:
//Meses do mandato * salario
//Observações: mandatos de quatro anos (Presidente da República, Governador, 
//Prefeito, Deputado Federal, Deputado Estadual e Vereador) mandato de seis anos (Senador).
//Esse método estará visível apenas pela própria classe

