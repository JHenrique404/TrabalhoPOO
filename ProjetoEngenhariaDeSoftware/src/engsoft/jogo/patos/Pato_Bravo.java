package engsoft.jogo.patos;

public class Pato_Bravo extends Pato implements  Padrao_Grasnar{//criando uma subclasse, herdando uma classe e implementando a interface

	public Pato_Bravo()	//metodo construtor
	{
		setComportamento(new Voaveis_Asa());//setando o comportamento pela instancia da classe voaveis_asa	
	}
	
	public String mostrar() {//sobrescrevendo o metodo
		return "Eu sou o Pato Bravo.";
	}

	public String grasnar() {//sobrescrevendo e implementando
		return "Que-Que. Grrrrrrrrr.";
	}

}
