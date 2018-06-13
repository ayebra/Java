package paquete_01;

public class Pila 
{
	public static int pila []= new int [10], Tope =-1,Dat;
	public static boolean Band;

	
	public static void PilaVacia (int Tope)
	{
		if (Tope==-1){
			Band=true;
		}else 
			Band= false;
		
	}

	
	public static void PilaLlena()
	{
		if (Tope==9){
			Band=true;
		}else
			Band=false;
		
	}
	
	
	public static void Push (int Dat)
	{
		PilaLlena();
		if (Band==true){
			System.out.println("OVERFLOW");
		}else
			Tope=Tope+1;
			pila[Tope]=Dat;
		
			
	}
	
	public static void Pop ()
	{
		PilaVacia(Tope);
		if (Band==true){
			System.out.println("UNDERFLOW");
		} else
			Dat=pila[Tope];
			Tope=Tope-1;
		
	}
	
	public static void Recorrer ()
	{
		int i;
		if (Tope!=-1)
		{
			for (i=Tope; i>=0; i--)
			{
				System.out.println (" "+pila[i]);
			}
		}else 
			System.out.println("Pila Vacia");
	}
}
