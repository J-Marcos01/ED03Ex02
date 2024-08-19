package view;

import java.util.Scanner;

import controller.Modulos;

public class Principal 
{

	public static void main(String[] args) 
	{
		Modulos op = new Modulos();
		Scanner sc=new Scanner(System.in);
		
		int a=9;
		while(a<10 || a>9999)
		{
		a=sc.nextInt();
		}
		int busca=10;
		while(busca<0 || busca>9)
		{
		busca=sc.nextInt();
		}
		int res=op.contaIguais(a, busca, 0);
		System.out.println("O primeiro número possui : "+res+" digitos iguais ao segundo ");
		
		
	}

}
