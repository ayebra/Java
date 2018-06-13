package estruarbolbi;
import javax.swing.JOptionPane;

public class ArbolBinario 
{
	static Vagon Raiz;

	public ArbolBinario() {
		Raiz = null;
	}

	public boolean Bajoflujo()
	{
		if(Raiz == null)	return true;
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
		Vagon p = null, q = null;
		if(Sobreflujo() == false)
		{
			if(Bajoflujo() == true)	// Si es la primera vez
			{
				Raiz = new Vagon();	
				Raiz.Carga = Dato;
				Raiz.LigaIzq = null;	
				Raiz.LigaDer = null;
			}
			else
			{
				q = Raiz;
				while(q != null)
				{
					p = q;
					if(Dato <= p.Carga)
						q = q.LigaIzq;
					else q = q.LigaDer;
				}
				q = new Vagon();
				q.Carga = Dato;
				q.LigaIzq = null;		
				q.LigaDer = null;
				if(q.Carga <= p.Carga)
					p.LigaIzq = q;
				else p.LigaDer = q;
			}
		}
		else JOptionPane.showMessageDialog(null,"Imposible agregar");
	}
	public boolean Buscar(int Dato)
	{
		boolean Existe = false;
		Vagon p = null;

		if(Bajoflujo() == false)
		{
			p = Raiz;
			while(p != null && Dato != p.Carga)
			{
				if(Dato == p.Carga) Existe = true;
				else 
					if(Dato < p.Carga)
						p = p.LigaIzq;
					else p = p.LigaDer;
			}
			if(p != null) 
			{
				Existe = true;
				p= null;
			}
		}
		return Existe;
	}
	/*	public int Retirar()
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
	 */
	private void PreOrden(Vagon p)
	{

		if(p != null)
		{
			System.out.print("\t "+p.Carga);
			PreOrden(p.LigaIzq);
			PreOrden(p.LigaDer);
		}
	}
	public void RecorrerPreOrden()
	{
		System.out.print("\n");
		PreOrden(Raiz);
	}
	private void EnOrden(Vagon p)
	{

		if(p != null)
		{
			EnOrden(p.LigaIzq);
			System.out.print("\t "+p.Carga);
			EnOrden(p.LigaDer);
		}
	}
	public void RecorrerEnOrden()
	{
		System.out.print("\n");
		EnOrden(Raiz);
	}
	private void PostOrden(Vagon p)
	{

		if(p != null)
		{
			PostOrden(p.LigaIzq);
			PostOrden(p.LigaDer);
			System.out.print("\t "+p.Carga);
		}
	}
	public void RecorrerPostOrden()
	{
		System.out.print("\n");
		PostOrden(Raiz);
	}
}