package es.Studium.tema3CadEjer20;

import java.util.Scanner;

/*
 * Inversa - Realizar un programa que lea una cadena y mediante una función, devuelva la inversa de la misma.
 */
public class Inversa 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase,frase2="";
		System.out.println("indique una frase");
		frase=teclado.nextLine();
		frase2 = invertir(frase, frase2);
		System.out.println(frase2);//imprimimos por pantalla
		teclado.close();
	}

	private static String invertir(String frase, String frase2) {
		for (int i= frase.length()-1;i>=0;i--)//longitud -1 sera la ultima posicion, repetira hasta llegar a 0
		{
			frase2=frase2+frase.charAt(i);//Añadimos los caracteres en orden inverso al String frase2
		}
		return frase2;
	}

}
