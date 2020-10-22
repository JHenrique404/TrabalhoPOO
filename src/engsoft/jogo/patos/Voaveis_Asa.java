package engsoft.jogo.patos;

public class Voaveis_Asa implements Padrao_Voaveis {//criando uma classe implementando da padrao_voaveis

	private double velocidade;//criando um atributo

	public Voaveis_Asa() {//criando metodo construtor
		velocidade = 10;
	}

	public String voar() {//subscrevendo e implementando
		return "Voando como um pássaro que voa. Velocidade: "
				+ getVelocidade();
	}

	public double getVelocidade() {//subscrevendo e implementando
		return velocidade;
	}

}
