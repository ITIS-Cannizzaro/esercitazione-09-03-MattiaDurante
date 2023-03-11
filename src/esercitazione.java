package ciao;
import java.lang.Math;
import java.util.Scanner;

public class esercitazione 
{
 static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		primo_es();
		secondo_es();

	}
	static void primo_es()
	{
		int n;
		while (true)
		{
		System.out.println("di quanti numeri vuoi creare l'array? numero obbligatoriamente pari");
		n = Integer.parseInt(in.nextLine());
		if (n % 2 == 0) /*controllo se è pari*/
			break;
		else
		System.out.println("numero OBBLIGATORIAMENTE pari :)");/*obbligatoriamente*/
		}
		double[] array = new double[n];
		riempi_array_double(array);
	double[] array2 = new double[n/2];/*creo un array con la metà dei numeri*/
	togli_decimali(array);
	riempi_secondo(array, array2);
	System.out.println("i numeri nel primo array sono:");
	stampa_array(array);
	System.out.println("--------------------------");
	System.out.println("i numeri nel secodno sono:");
	stampa_array(array2);
	}
	
	static double[] riempi_array_double(double[] a)
	{
		for(int i = 0; i < a.length; i++)/* incremento la i per poter scorrere l'array*/
		{
			a[i] = (Math.random() * 11); /* prendo in ingresso numeri casuali da 0 a 11(poca probabilità che esca)*/
		if (a[i] == 11) /*tolgo la probablità che esca 11*/
			i--;
		}
return a;	
	}
	static double[] riempi_secondo(double[]a, double[] b)
	{
		int c = 0;
		for (int i = 0; i < a.length; i+=2)
		{
			b[c] = a[i] * a[i+1];
		c++;
		}
		
		return b;
	}
	static void stampa_array(double[] array)
	{
	for(int i = 0; i < array.length; i++)/*stampo array*/
	System.out.println(array[i]);
	}
	static double[] togli_decimali(double[] a)
	{
		int c;
		for(int i = 0; i < a.length; i++)/* incremento la i per poter scorrere l'array*/
		{
			c = (int) (a[i]*10);
			a[i] = (double)  c / 10;
		}
		return a;
		}
	static void secondo_es()
	{
		System.out.println("quante stringhe vuoi scrivere?");
		int n = Integer.parseInt(in.nextLine());
		String[] a = new String[n]; 
		String[] b = new String[n]; 
		riempi_array(a);
		riempi_array(b);
		uguali(a,b);
	}
	static String[] riempi_array(String[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("scrivi la " + (i+1) + "° stringa");
		a[i] = in.nextLine();	
		}
		return a;
	}
	static void uguali (String[]a, String[] b)
	{
	for(int i = 0; i < a.length; i++)
		for(int j = 0; j < a.length; j++)
			if (a[i].equals(b[j]))
			{
				System.out.println("OK");
			System.exit(0);	
			}
	System.out.println("NO");
	}
	
}


