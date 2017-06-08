package Repaso;

import java.util.Random;

public class BidimensionalHelper 
{
	public int aleatorio (int min , int max)
	{
	  Random rand = new Random ();
	  int randomnum = rand.nextInt((max - min)+1)+ min;
	  return randomnum;
	}
	public int [][] llenarArreglo(int numfilas, int numcolumnas)
	
	{
		int [][] arreglo = new int[numfilas][numcolumnas];
		for (int i = 0; i < numfilas; i++) 
		{
			for (int j = 0; j < numcolumnas; j++)
			{
				arreglo[i][j] = aleatorio(1,29);
			}
		}
		return arreglo;
	}
	public void mostraralumnos(String[] nombrealumnos, int[][]notas,int nalumnos,  int nevaluaciones)
	{
		
		 for (int i = 0; i < nalumnos; i++) 
		 {
			for (int j = 0; j <nevaluaciones; j++) 
			{
				System.out.println(nombrealumnos[i] + "  Evaluacion #[" + j + "] : "+ notas[i][j]);
			}
		}
	}
	public int buscaralumnospornombre(String [] nombresalumnos, String nombre)
	{
		int posicion=0;
		for (int i = 0; i < nombresalumnos.length; i++)
		 {		
			if (nombresalumnos[i].equalsIgnoreCase(nombre)) 
			{
				posicion=i;	
			}
	     }
		return posicion;
	}
}
