package estructura;

public class Aleatorio {
	int n;
	  int Frente;
	  int Fin;
	  int Arreglo[];
	  
	  public boolean vacia()
		{
			if (Frente==-1)
				return true;
			
			else return false;
		}
		
		public boolean Llena()
		{
			if((Frente==0&&Fin==n)||(Frente==Fin+1))
				return true;
			
			else return false;
		}
		
		public boolean ElementoUNI(){
			
			if(Fin==Frente)
				return true;
			
			else return false;
		}
		
		public int pop()
		{
			int DATOAEliminar;
			
			if(vacia()){
				return -1;
			} 
			
			else {
				
				if(Frente==Fin){
					DATOAEliminar = Arreglo[Frente];
					Frente = Fin = -1;
				}
				
				else {
					if(Frente==n){
						Frente=0;
						DATOAEliminar = Arreglo[Frente];
					}
					else{
						DATOAEliminar = Arreglo[Frente];
						Frente++;
						
					}
				}	
			}
					
			return DATOAEliminar;
						
		}
	  
	 public void push(int DATO)
	 {
		 
		 if(Llena()){
			 System.out.println("No se puede agregar, La COLA ESTA LLENA" + DATO);
		 }
		 
		 else {
		 
			 if(Frente==-1){
			 Frente++;
			 }
		 
		 if(Fin==n){ 
			 Fin=0;
		 }
		 
		 Fin++;
		 Arreglo[Fin] = DATO;
		 
		 }
		 	 
	 }
	
	 public int Tamaño(){
		 
		 return n+1;
	 }
	 
	 public int ubicacion(int a){
			
			int aux = 0;
			
			if (a <= (n)){
				
				aux = Arreglo [a];
				return aux;
			}
			
			else return -1;
			
		}
	 
	 public Aleatorio(int Tamano) {
			
			Frente = -1;
			Fin = -1;
			Arreglo = new int[Tamano];
			n = Tamano -1;
			
		}

	public String toString() {
		String res ="";
		
		if(vacia())
			return "VACIO";
		
		if(Frente > Fin)
		{
			for(int i = Frente;i<n;i++){
				res=res+"[" + Arreglo[i] + "]";
			}
			
			for(int i=0;i<Fin;i++){
				res = res+"[" + Arreglo[i] + "]";
			}
		}
		
		else {
			for(int i = Frente;i<=Fin;i++)
				res=res+"[" + Arreglo[i] + "]";
		}
	
		return res;
	}

}