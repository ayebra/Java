package paquetecirculo;
import javax.swing.JOptionPane;

public class ColaCirculo {
	
	  int x;
	  int ARREGLO[];
	  int Frente;
	  int Fin;
	  
	  public boolean VACIO()
		{
			if (Frente==-1)
				return true;
			
			else return false;
		}
		
		public boolean TOPE()
		{
			if((Frente ==0&&Fin==x)||(Frente == Fin+1))
				return true;
			
			else return false;
		}
		
		public boolean UNICOElemento(){
			
			if(Fin == Frente)
				return true;
			
			else return false;
		}
		
		public int pop()
		{
			int DATOAEliminar;
			if(TOPE()){
				return -1;
			}else
				if(Frente==Fin){
					DATOAEliminar = ARREGLO[Frente];
					Frente = Fin = -1;
				}else{
					if(Frente == x){
						Frente = 0;
						DATOAEliminar = ARREGLO[Frente];
					}else{
						DATOAEliminar = ARREGLO[Frente];
						Frente++;
					}
						
				}
					
			return DATOAEliminar;
						
		}
	  
	 public void push(int dato)
	 {
		 
		 if(TOPE()){
			 JOptionPane.showMessageDialog(null,"NO SE PUEDE AGREGAR, LA COLA ESTA LLENA" + dato);
		 }
		 
		 else {
		 
			 if(Frente==-1){
			 Frente++;
			 }
		 
		 if(Fin==x){ 
			 Fin=0;
		 }
		 
		 Fin++;
		 ARREGLO[Fin] = dato;
		 
		 }		 
	 }
	
	 public ColaCirculo(int tamano) {
			
			Frente=-1;
			Fin=-1;
			ARREGLO = new int[tamano];
			x = tamano-1;
			
		}
	 
	public String toString() {
		String res = "";
		
		if(TOPE())
			return "Cola Vacia";
		
		if(Frente > Fin)
		{
			for(int i=Frente;i<=x;i++){
				res=res+"[" + ARREGLO[i] + "]";
			}
			
			for(int i=0;i<Fin;i++){
				res=res+"[" +ARREGLO[i] + "]";
			}
		}
		
		else {
			for(int i=0;i<=x;i++)
				res=res+"[" +ARREGLO[i] + "]";
		}
	
		return res;
	}
	
	public void consultar(int numero){
		
		int x = -1;
		int y = -1;
		
		for (int i = 0; i <= x; i++){
			
			if (ARREGLO [i] == numero){
				x = ARREGLO [i];
				y = i;
			}
				
		}
		
		if (x==numero)
			JOptionPane.showMessageDialog(null,"El elemento buscado: " + numero + "SE ENCUENTRA EN: " + y);
		else
			JOptionPane.showMessageDialog(null,"El elemento buscado: " + numero + "NO SE ENCUENTRA");
	}
	

}
