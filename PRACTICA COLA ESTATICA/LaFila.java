package pColaEstatica;

import javax.swing.JOptionPane;

public class LaFila {

	int Fila[];
	int Frente, Final;
	int Maximo = 3;
	LaFila()
	{
		Fila = new int [Maximo];
		Frente = -1; Final = -1;
	}
	public Boolean Sobreflujo()
	{
		if(Final == (Maximo-1))
			return true;
		else return false;
	}
	public Boolean Bajoflujo()
	{
		if((Frente == (-1) && Final == (-1)) || (Frente > Final))
			return true;
		else return false;
	}
	public void Agregar(int Dato)
	{
		if(Sobreflujo() == false)
		{
			if(Bajoflujo() == true) Frente ++;
			Fila[++Final]= Dato;
		}
		else JOptionPane.showMessageDialog(null, "Imposible agregar");
	}
	public int Retirar()
	{
		int dato;
		if(Bajoflujo() == false)
		{
			dato = Fila[Frente++];
			if (Frente > Final) {Frente = -1; Final = -1;}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Imposible retirar");
			dato= -1;
		}
		return dato;
	}
	public void Recorrer()
	{
		String Salida = "";
		int i;
		if(Bajoflujo() != true)
		{
			for(i=Frente; i<=Final; i++)
				Salida += Fila[i] + ", ";
			JOptionPane.showMessageDialog(null, Salida);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Imposible Recorrer");
		}
	}
}


