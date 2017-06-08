package Repaso;

public class NotasAlumnos 
{
public static void main(String[] args)
	{
	 int nalumnos=4 , nevaluaciones=4;
	 int [][] notas;
	 String[] nombrealumnos= {"pedro","maria","juana","carlos"} ;
	 
	 BidimensionalHelper helper= new BidimensionalHelper();
	 
	 notas = helper.llenarArreglo(nalumnos,nevaluaciones);
	
	 helper.mostraralumnos(nombrealumnos, notas, nalumnos, nevaluaciones);
		
	}
}
