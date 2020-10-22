package engsoft.jogo.patos;

public class Main {//criando a classe main

	public static void main(String[] args) {
		
		Pato pt = new Pato_Ruivo();//instanciando objeto Pato_Ruivo	
		
		System.out.println(pt.mostrar());//printando o mostrar do pato_ruivo
		System.out.println(pt.nadar());//printando o nadar do pato_ruivo
		System.out.println(pt.comportamento_pato());//printando o comportamento do pato_ruivo
		
		pt.setComportamento(new Voar_Foguete());//settando um novo comportamento do pato_ruivo
		
		System.out.println(pt.comportamento_pato());//printando o novo comportamento do pato ruivo definido acima
		
	}
}
