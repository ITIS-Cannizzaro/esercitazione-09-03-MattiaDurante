import java.lang.Math;
import java.util.Scanner;

public class esercitazione 
{
 static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n;
		while (true)
		{
		System.out.println("di quanti numeri vuoi creare l'array? numero obbligatoriamente pari");
		n = in.nextInt();
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
		for (int i = 0; i < b.length; i++)
		{
			b[i] = a[i] + a[i+1];
		i++;
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
}
