package paquetevectores;
import javax.swing.JOptionPane;

public class Vectores {
	 	
	    int VECTOR []= new int [5];
		int VECTORI []= new int [5];
	       
		int PRODUCTO []= new int [5];
	    int PROMEDIO []= new int [5];
	    int A, B , C;
	    int JUNTAR = 0;
	                
		public void PrimerArreg (){
			
			for ( A = 0; A<5;A++){
				VECTOR[A]=Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO ENTERO (VECTOR 1)"));
			}
		}
		
		public void SegundoArreg (){
			for (B=0; B<5; B++){
				VECTORI[B]=Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO ENTERO (VECTOR 2)"));
			}
		}
	        public void Produ (){
	            for (A=0;A<5;A++){
	                PRODUCTO[A]= VECTOR[A]*VECTORI[A];
	            }
	            for (A=0;A<5;A++){
	          
	            JOptionPane.showMessageDialog(null,"El valor es:"+PRODUCTO[A]);
	         
	        }}
	        
	        public void Promedio (){
	            JUNTAR = 0;
	            
	            for (A=0; A<5; A++){
	                JUNTAR= JUNTAR+ VECTOR[A]+VECTORI[A];
	                
	            }
	            JUNTAR=JUNTAR/10;
	                JOptionPane.showMessageDialog(null,"PROMEDIO: "+ JUNTAR);
	        }
}