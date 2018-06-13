package pPilaEstatica;

import javax.swing.JOptionPane;

public class LaPila {
	int Pila[];
	int Cima;
	int Maximo = 10;
	LaPila()
	{
		Pila = new int [Maximo];
		Cima = -1;
	}
	public Boolean Sobreflujo()
	{
		if(Cima == (Maximo -1))
			return true;
		else return false;
	}
	public Boolean Bajoflujo()
	{
		if(Cima == (-1))
			return true;
		else return false;
	}
	public void Agregar(int Dato)
	{
		if(Sobreflujo() == false)
			Pila[++Cima]= Dato;
		else JOptionPane.showMessageDialog(null, "Imposible agregar");
	}
	public int Retirar()
	{
		if(Bajoflujo() == false)
			return Pila[Cima--];
		else
		{
			JOptionPane.showMessageDialog(null, "Imposible retirar");
			return -1;
		}
	}
	public void Recorrer()
	{
		String Salida = "";
		int i;
		if(Bajoflujo() != true)
		{
			for(i=0; i<=Cima; i++)
				Salida += Pila[i] + ", ";
			JOptionPane.showMessageDialog(null, Salida);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Imposible Recorrer");
		}
	}
}
