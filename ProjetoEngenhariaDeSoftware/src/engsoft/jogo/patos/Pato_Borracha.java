package engsoft.jogo.patos;

public class Pato_Borracha extends Pato {//criando uma subclasse herdando da classe PATO

	public Pato_Borracha()//criando um metodo construtor
	{
		setComportamento(new Nao_Voa());//setando o comportamento pela instancia da classe nao_voa		
	}
	
	public String mostrar() {//subscrevendo o metodo
		return "Olá, eu sou de Boarracha.";
	}
	
}
