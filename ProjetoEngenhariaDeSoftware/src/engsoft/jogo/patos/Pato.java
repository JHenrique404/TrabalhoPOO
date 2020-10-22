package engsoft.jogo.patos;

public abstract class Pato {//criando classe mae
	
	protected Padrao_Voaveis comportamento_pato;//definindo comportamento_pato com tipo padrao_voaveis

	abstract String mostrar();//criando metodo abstrato que n pode ser implementado
	
	public String nadar()//metodo concreto
	{
		return "Pato Nadando.";		
	}	
	
	public void setComportamento(Padrao_Voaveis padrao )//metodo concretoque utiliza como parametro o tipo padrao_voaveis para settar para o atributo do mesmo tipo
	{
		comportamento_pato = padrao;		
	}
	
	public String comportamento_pato()//metodo concreto que retorna o retorno do metodo do tipo padrao_voaveis do atributo comportamento_patos
	{		
		return comportamento_pato.voar();		
	}
}
