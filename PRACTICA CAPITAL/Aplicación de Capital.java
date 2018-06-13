package estructuracapi;
import javax.swing.JOptionPane;

public class App_PRACapi {

	public static void main(String[] args) {
		 PRACapi c = new PRACapi ();
	        
		 int DINERO;
	     int TIEMPO;
	        
	     DINERO = Integer.parseInt(JOptionPane.showInputDialog("CANTIDAD DE DINERO: "));
	     TIEMPO = Integer.parseInt(JOptionPane.showInputDialog("¿POR CUANTO TIEMPO?: "));
	       
	     JOptionPane.showMessageDialog(null,"El Resultado es: "+ c.intereses(DINERO, TIEMPO));
	}

}
