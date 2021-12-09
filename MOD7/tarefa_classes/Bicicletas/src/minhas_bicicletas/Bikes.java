package minhas_bicicletas;

public class Bikes {
	String apelido;
	String modelo;
	String marca;
	String tipo;
	/**
	 * @deprecated
	 */
	int peso;
	String cor;
	int ano;
	double preco;
	/**
	 * @author Loser
	 * 
	 */
	
	public void dadosBikes() {
		System.out.println("Apelido da bike: " + apelido);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Peso: " + peso);
		System.out.println("Ano de Fabricação: " + ano + "\n");
		
	}
}
