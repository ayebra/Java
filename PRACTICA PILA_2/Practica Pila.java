package paquetepilita;
import javax.swing.JOptionPane;

public class Pila {
	String Pila[]=new String [10];
	int tope=-1;
	String dat;
    boolean band;
    
	public  void PilaVacia(int tope){
		if(tope==-1)
			band=true;
		else
			band=false;
	}
	
	
	
	public  void PilaLlena(){
		if (tope==9)
			band=true;
		else 
			band=false;
	}
	
	public  void Push(String dat){
		PilaLlena();
		if (band==true)
			JOptionPane.showMessageDialog(null,"OVERFLOW");
		else{
			tope=tope+1;
			Pila[tope]=dat;
		}
	}
	
	public void Pop(){
		PilaVacia(tope);
		if (band==true)
			JOptionPane.showMessageDialog(null,"UNDERFLOW");
		else{
			dat=Pila[tope];
			tope=tope-1;
		}
	}
	
	public  void Recorrer(){
		int i;
		if (tope!=-1){
			for(i=tope;i>=0;i--){
				JOptionPane.showMessageDialog(null," "+Pila[i]);
			}
		}
			else 
				JOptionPane.showMessageDialog(null,"Pila Vacia");
	}
	


public String toString() {
	
	String s="";
	
	for(int i=0;i<=tope;i++)
	s+=Pila[i];
	
	
	return s;
}

}
