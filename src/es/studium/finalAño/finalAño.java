package es.studium.finalAño;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//import java.util.concurrent.TimeUnit;

public class finalAño
{

	public static void main(String[] args) 
	{
		int dia, mes, anio, resto;
		int finAnio;
		dia=0;
		mes=0;
		anio=0;

		// Scanner para relacionarlo con teclado 
		Scanner teclado = new  Scanner(System.in);

		System.out.println("Escriba el día de la fecha");
		dia = teclado.nextInt();

		System.out.println("escriba el mes de la fecha");
		mes = teclado.nextInt();

		System.out.println("escriba el año de la fecha");
		anio = teclado.nextInt();

		// Cerramos el acceso al teclado
		teclado.close();

			if(mes > 0 && mes < 13)
			{
				//declaramos las condicionales según los casos:
				switch(mes)
				{
				case 1:
					finAnio = bisiesto(anio) - dia;
					System.out.println(finAnio);
					break;
				case 2:
					finAnio = (bisiesto(anio) - 31) - dia;
					System.out.println(finAnio);

					break;
				case 3:
					finAnio = (bisiesto(anio) - diaBisiesto(mes)-31) - dia;
					System.out.println(finAnio);
					break;
				case 4:
					finAnio = (bisiesto(anio) - diaBisiesto(mes) - 62) - dia;
					System.out.println(finAnio);
					break;
				case 5:
					finAnio = (bisiesto(anio) - diaBisiesto(mes) - 92) - dia;
					System.out.println(finAnio);
					break;
				case 6:
					finAnio = (bisiesto(anio) - diaBisiesto(mes) - 123) - dia;
					System.out.println(finAnio);
					break;
				case 7:
					finAnio = (bisiesto(anio) - diaBisiesto(mes) - 153) - dia;
					System.out.println(finAnio);
					break;
				case 8:
					finAnio = (bisiesto(anio) - diaBisiesto(mes) - 184) - dia;
					System.out.println(finAnio);
					break;
				case 9:
					finAnio = (bisiesto(anio) - diaBisiesto(mes) - 215) - dia;
					System.out.println(finAnio);
					break;
				case 10:
					finAnio = (bisiesto(anio) - diaBisiesto(mes) - 245) - dia;
					System.out.println(finAnio);
					break;
				case 11:
					finAnio = (bisiesto(anio) - diaBisiesto(mes) - 276) - dia;
					System.out.println(finAnio);
					break;
				case 12:
					finAnio = 31 - dia;
					System.out.println(finAnio);
					break;
				}
			}
			else
			{
				System.out.println("La fecha no corresponde");
			}
	}
	// Declaramos la función suma en la que nos vamos a basar
	public static int bisiesto(int aa)
	{
		int resto;
		resto=0;

		//Si se cumple la condición para que sea año bisiesto
		if((aa % 4 == 0)  &&  (aa % 100 != 0)  || (aa % 400 == 0))
		{
			resto = 366;
		}
		//En caso contrario 
		else 
		{
			resto = 365;				
		}
		return resto;
	}

	// Declaramos la función para los días de febrero
	public static int diaBisiesto(int dd)
	{
		int dias;
		dias=0;

		//Si se cumple la condición para que sea año bisiesto
		if((dd % 4 == 0)  &&  (dd % 100 != 0)  || (dd % 400 == 0))
		{
			dias = 29;
		}
		//En caso contrario 
		else 
		{
			dias = 28;				
		}
		return dias;
	}
}
		
	


