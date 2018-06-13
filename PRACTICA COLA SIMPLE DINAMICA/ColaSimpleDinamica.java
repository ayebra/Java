package pRadix;

import javax.swing.JOptionPane;


public  class ColaSimpleDinamica 
{
	 Vagon Frente;	// Se removio el modificador "static".. sino, no corre
	 Vagon Final;

	public ColaSimpleDinamica() {
		Frente = null;
		Final = null;
	}

	public boolean Bajoflujo()
	{
		if((Frente == null) && (Final == null))
			return true;
		else return false;
	}

	public boolean Sobreflujo()
	{
		boolean Cierto = true;
		Vagon p = new Vagon();
		if(p!=null)
			Cierto = false;
		p = null;
		return Cierto;
	}

	public void Agregar(int Dato)
	{
		Vagon p;
		if(Sobreflujo() == false)
		{
			if(Bajoflujo() == true)	// Si es la primera vez
			{
				Frente = new Vagon();
				Final = new Vagon();
				Frente.Carga = Dato;
				Frente.Liga = null;
				Final = Frente;
			}
			else
			{
				p = new Vagon();
				p.Carga = Dato;
				p.Liga = null;
				Final.Liga = p;
				Final = p;
			}
		}
		else JOptionPane.showMessageDialog(null,"Imposible agregar");
	}

	public int Retirar()
	{
		int Dato = 0;
		Vagon p;
		if(Bajoflujo() != true)
		{
			if(Frente == Final)
			{
				Dato = Frente.Carga;
				Final = null;
				Frente = null;
			}
			else
			{
				Dato = Frente.Carga;
				p = Frente;
				Frente = Frente.Liga;
				p.Liga = null;
			}		
		}
		else JOptionPane.showMessageDialog(null,"Imposible retirar");
		p = null;
		return Dato;
	}

	public void Recorrer()
	{
		String Salida = ""; int i = 1;
		Vagon p;

		if(Bajoflujo() == false)
		{
			for(p=Frente; p != null; p = p.Liga)
			{
				Salida += p.Carga + " ,";
				if((i++) == 14)
				{
					Salida += "\n";
					i = 1;
				}
			}
			JOptionPane.showMessageDialog(null, Salida);
		}
		else JOptionPane.showMessageDialog(null,"Imposible Recorrer");
		p = null;
	}	
	public void Recorrer_y_Destruir()
	{
		String Salida = ""; int i=1;

		while(Bajoflujo() == false)
		{
			Salida += Retirar() + " ,";
			if((i++) == 14)
			{
				Salida += "\n";
				i = 1;
			}
		}
		JOptionPane.showMessageDialog(null, Salida);
	}
}













