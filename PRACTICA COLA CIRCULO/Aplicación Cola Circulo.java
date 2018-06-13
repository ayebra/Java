package paquetecirculo;
import javax.swing.JOptionPane;

public class App_ColaCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColaCirculo CIRCULO = new ColaCirculo(5);
		
       String Menu = "[1]Agregar\n[2]Retirar\n[3]Recorrer\n[4]Consultar\n[5]Abandonar";
		int Opcion, Valor;

		do {
			Opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));
			switch (Opcion) {
			case 1: 
				Valor = Integer.parseInt(JOptionPane
						.showInputDialog("AGREGAR DATO"));
				CIRCULO.push(Valor);
				break;
			case 2: 
				Valor = CIRCULO.pop();
				JOptionPane.showMessageDialog(null,"DATO RETIRADO" + Valor);
				break;
			case 3: 
				JOptionPane.showMessageDialog(null,CIRCULO.toString());
				break;
			
			case 4:
				CIRCULO.consultar(Integer.parseInt(JOptionPane.showInputDialog("DATO QUE DESEA BUSCAR")));
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "ADIOS");
			}
		} while (Opcion >= 1 && Opcion <= 4);

	}

}
