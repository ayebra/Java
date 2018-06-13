package paquetepote;
import javax.swing.JOptionPane;

public class App_Potencia {
	
	public static void main(String[] args) {
	
		Potencia POTE = new Potencia ();
    	
		int BY;
    	int BU;
    
    
    BU = Integer.parseInt(JOptionPane.showInputDialog("NUMERO ENTERO: "));
    BY = Integer.parseInt(JOptionPane.showInputDialog("NUMERO ENTERO PARA CALCULAR POTENCIA: "));
    JOptionPane.showMessageDialog(null,"RESULTADO"+"\t"+BU+"\t "+ "DE LA POTENCIA"+ "\t"+BY+ "\t"+ "es:"+POTE.potencia(BU,BY));
    
}
	}
