package testes;

import negocio.Politico;
public class TestaPolitico {

	public static void main(String[] args) {
		Politico politico = new Politico();
		politico.nome = "Marcinho";
		politico.salario = 1000;
		politico.qtMandatos = 2;
		politico.senador = true;
		politico.show();
	}
}
