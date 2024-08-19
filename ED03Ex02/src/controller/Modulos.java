package controller;

public class Modulos 
{
	public Modulos() 
	{
		super();
	}
	
	public int contaIguais(int a,int busca,int qtd)
	{
		int resto=0;
		if(a==0)       //o número será dividido até chegar a zero, quando chegar a 0 retorne a quantide de termos iguais.
		{
			return qtd;
		}
		else
		{
		resto=a%10;	
			if(resto==busca)
			{
				qtd++;
			}
				return contaIguais(a/10,busca,qtd); //a chamada de passos é dada pela divisão do número por 10 assim a cada passo o programa verificara se o último dígito do primeiro número ( n%10) corresponde ao número de busca .
		}
		
	}

}
