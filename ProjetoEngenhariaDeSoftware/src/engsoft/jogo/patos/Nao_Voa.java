package engsoft.jogo.patos;

public class Nao_Voa implements Padrao_Voaveis {//Implementando a Interface

	
	public Nao_Voa()//metodo construtor
	{
			
	}
	
	public String voar() {//sobrescrevendo e implementando o metodo
		
		return "Esse pato n�o Voa. Velocidade: " + getVelocidade();
		
	}

	public double getVelocidade() {//sobrescrevendo e implementando o metodo
		
		return 0;
		
	}

}
