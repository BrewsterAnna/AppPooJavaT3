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
//Deve ter um m�todo que calcule o sal�rio total:
//Meses do mandato * salario
//Observa��es: mandatos de quatro anos (Presidente da Rep�blica, Governador, 
//Prefeito, Deputado Federal, Deputado Estadual e Vereador) mandato de seis anos (Senador).
//Esse m�todo estar� vis�vel apenas pela pr�pria classe

