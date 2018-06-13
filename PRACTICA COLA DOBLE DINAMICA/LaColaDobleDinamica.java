package pColaDobleDinamica;

import javax.swing.JOptionPane;

public class LaColaDobleDinamica 
{
	static Vagon Frente;
	static Vagon Final;

	public LaColaDobleDinamica() {
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
				Frente = new Vagon();	Final = new Vagon();
				Final.Carga = Dato;
				Final.LigaIzq = null;	Final.LigaDer = null;
				Frente = Final;
			}
			else
			{
				p = new Vagon();
				p.Carga = Dato;
				p.LigaIzq = Final;		p.LigaDer = null;
				Final.LigaDer = p;		Final = p;
			}
		}
		else JOptionPane.showMessageDialog(null,"Imposible agregar");
	}

	public int Retirar()
	{
		int Dato = 0;		Vagon p;
		if(Bajoflujo() != true)
		{
			if(Frente == Final)
			{
				Dato = Final.Carga;
				Final = null;		Frente = null;
			}
			else
			{
				p = Frente.LigaDer;
				Dato = Frente.Carga;
				p.LigaIzq = null;
				Frente = null;
				Frente = p;
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
			for(p=Frente; p != null; p = p.LigaDer)
			{
				Salida += p.Carga + " ,";
			}
			JOptionPane.showMessageDialog(null, Salida);
		}
		else JOptionPane.showMessageDialog(null,"Imposible Recorrer");
		p = null;
	}
}












