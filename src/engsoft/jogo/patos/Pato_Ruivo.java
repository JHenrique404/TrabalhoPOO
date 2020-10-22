package engsoft.jogo.patos;

public class Pato_Ruivo extends Pato implements Padrao_Grasnar{//criando uma subclasse e herdando da classe PATO e implementando a interface

	public Pato_Ruivo()//criando metodo construtor
	{
		setComportamento(new Voaveis_Asa());//setando o comportamento pela instancia da classe voaveis_asa		
	}
	
	public String mostrar() {//sobrescrevendo o metodo
		return "Eu sou o Pato Ruivo." ;
	}

	public String grasnar() {//sobrescrevendo e implementando
		return 	"Que-Que.";
	
	}

}
