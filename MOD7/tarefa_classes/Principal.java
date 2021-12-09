package minhas_bicicletas;

public class Principal {

	public static void main(String[] args) {
		Bikes bike = new Bikes();
		
		bike.apelido = "Pretinha";
		bike.ano = 1990;
		bike.cor = "verde muito escuro";
		bike.marca = "specialized";
		bike.modelo = "hard rock";
		//bike.peso = 12;
		bike.tipo = "MTB";
		bike.preco = 2.500;
		
		bike.dadosBikes();
				
				}

}
