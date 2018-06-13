package pRadix;

import java.util.Random;

//import javax.swing.JOptionPane;

public class Ejecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, QueCubeta, Divisor = 1, pasada, Dato;
		ColaSimpleDinamica ListaOriginal = new ColaSimpleDinamica();
		ColaSimpleDinamica Cubetas[] = 
				{new ColaSimpleDinamica(),new ColaSimpleDinamica(),
				new ColaSimpleDinamica(),new ColaSimpleDinamica(),
				new ColaSimpleDinamica(),new ColaSimpleDinamica(),
				new ColaSimpleDinamica(),new ColaSimpleDinamica(),
				new ColaSimpleDinamica(),new ColaSimpleDinamica()};

		Random Valor = new Random();

		// Se fabrica la lista original de datos con numeros aleatorios
		i = 1;
		while((ListaOriginal.Sobreflujo() == false) && (i++) <= 5000)
		{
			ListaOriginal.Agregar(Math.abs(Valor.nextInt())%100000);	// El 100k es para usar solo las primeras 5 cifras
		}
		
		// Se muestra la ListaOriginal para comprobar que esta desordenada
		ListaOriginal.Recorrer();

		// Se inicia el ciclo que controla el numero de pasadas del metodo (100k = 5 digitos = 5 pasadas)
		for(pasada = 1; pasada <= 5; pasada++)
		{
			// Se distribuyen los datos de la ListaOriginal en las Cubetas
			while(ListaOriginal.Bajoflujo() == false)
			{
				Dato = ListaOriginal.Retirar();		// Se saca un dato
				QueCubeta = (Dato/Divisor)%10;		// Se determina a que cubeta se va a agregar
				Cubetas[QueCubeta].Agregar(Dato);	// El dato se agrega en la cubeta correspondiente
			}
			// Se vacian las cubetas en la ListaOriginal
			for(i = 0; i <= 9; i++)
				while(Cubetas[i].Bajoflujo() == false)
				{
					ListaOriginal.Agregar(Cubetas[i].Retirar());
				}
			// Se multiplica el Divisor por 10 para sacar la siguiente cifra
			Divisor = Divisor*10;
		}
		// Se muestran los datos ORDENADOS destruyendo al mismo tiempo
		ListaOriginal.Recorrer_y_Destruir();
	}	

}
