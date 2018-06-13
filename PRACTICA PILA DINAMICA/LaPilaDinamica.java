package pPilaDinamica;

import javax.swing.JOptionPane;

public class LaPilaDinamica 
{
	static Vagon Frente;
	static Vagon Final;

	public LaPilaDinamica() {
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
				Dato = Final.Carga;
				Final = null;
				Frente = null;
			}
			else
			{
				for(p=Frente; p.Liga != Final; p = p.Liga);
				Dato = Final.Carga;
				p.Liga = null;
				Final = p;
			}		
		}
		else JOptionPane.showMessageDialog(null,"Imposible retirar");
		p = null;
		return Dato;
	}
	
	public void Recorrer()
	{
		String Salida = "";
		Vagon p;
		
		if(Bajoflujo() == false)
		{
			for(p=Frente; p != null; p = p.Liga)
			{
				Salida += p.Carga + " ,";
			}
			JOptionPane.showMessageDialog(null, Salida);
		}
		else JOptionPane.showMessageDialog(null,"Imposible Recorrer");
		p = null;
	}
}












