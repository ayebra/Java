package pPilaDinamica;

import javax.swing.JOptionPane;

public class Ejecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaPilaDinamica UnaPila = new LaPilaDinamica();
		String Menu = "[1] Agregar\n[2]Retirar\n[3]Recorrer\n[4]Abandonar";
		int Opcion, Valor;

		do
		{
			Opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));

			switch(Opcion)
			{
			case 1:// Agregar
				Valor = Integer.parseInt(JOptionPane.showInputDialog("Dato a agregar "));
				UnaPila.Agregar(Valor);
				break;
			case 2:// Retirar
				Valor = UnaPila.Retirar();
				JOptionPane.showMessageDialog(null, "Dato retirado "+ Valor);
				break;
			case 3://Recorrer
				UnaPila.Recorrer();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Hasta la vista Baby");
			}

		}while(Opcion >= 1 && Opcion <=3);
	}

}
