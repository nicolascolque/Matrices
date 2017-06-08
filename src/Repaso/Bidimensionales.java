package Repaso;

public class Bidimensionales 
{
public static void main(String[] args) 
   {
	int [][] ejemplo = new int [2][3];
	
	System.out.println(ejemplo.length);
	
/** este bloque de codigo es para llenar el arreglo */
	
	for (int i = 0; i < 2; i++) 
	 {
		for (int j = 0; j < 3 ; j++) 
			{
			  ejemplo[i][j]= (i*j);			  
			}
	  }
	System.out.println("Se imprime en forma tradicional");
/** este bloque de codigo es para mostrar el arreglo */
	
	for (int i = 0; i < 2; i++) 
	 {
		for (int j = 0; j < 3 ; j++) 
			{
			 
			System.out.println(ejemplo[i][j]  + "  este es valor contenido en la posicion " + i +"---"+j);
			  
			}
     }
	// foreach
	System.out.println("Se imprime con el FOREACH");
	
	for (int[] x : ejemplo)
		{
			for (int i : x) 
			{
			  System.out.println(i);
			}
		
	    }
   }
}
