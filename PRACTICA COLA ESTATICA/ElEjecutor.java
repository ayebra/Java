package pColaEstatica;

import javax.swing.JOptionPane;

public class ElEjecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaFila UnaFila = new LaFila();
		String Menu = "[1] Agregar\n[2]Retirar\n[3]Recorrer\n[4]Abandonar";
		int Opcion, Valor;

		do
		{
			Opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));

			switch(Opcion)
			{
			case 1:// Agregar
				Valor = Integer.parseInt(JOptionPane.showInputDialog("Dato a agregar "));
				UnaFila.Agregar(Valor);
				break;
			case 2:// Retirar
				Valor = UnaFila.Retirar();
				JOptionPane.showMessageDialog(null, "Dato retirado "+ Valor);
				break;
			case 3://Recorrer
				UnaFila.Recorrer();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Hasta la vista, Baby... ");
			}

		}while(Opcion >= 1 && Opcion <=3);
	}

}


