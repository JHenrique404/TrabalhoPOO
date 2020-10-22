package engsoft.jogo.patos;

public class Voar_Foguete implements Padrao_Voaveis{//criando uma classe e implementando a interface padrao_voaveis
	
	private double velocidade;//criando um atributo
	
	public Voar_Foguete()//metodo construtor
	{
		velocidade = 1000;	
	}
	
	public String voar() {//sobrescrevendo e implementando 
		return "Voando como um foguete. Velocidade: " + getVelocidade();	 	
	}

	public double getVelocidade() {//sobscrevendo e implementando
		return velocidade;
	}	
}
