package estruarbolbi;
import javax.swing.JOptionPane;

public class Ejecutor {

	public static void main(String[] args) {

		ArbolBinario UnArbol = new ArbolBinario();
		String Menu = "[1] Agregar\n[2]Buscar\n[3]Recorrer PreOrden\n";
		Menu += "[4]Recorrer EnOrden\n[5]Recorrer PostOrden\n[6]Abandonar";
		int Opcion, Valor;

		do
		{
			Opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));

			switch(Opcion)
			{
			case 1:// Agregar
				Valor = Integer.parseInt(JOptionPane.showInputDialog("Dato a agregar "));
				UnArbol.Agregar(Valor);
				break;
			case 2:// Buscar
				Valor = Integer.parseInt(JOptionPane.showInputDialog("Dato a buscar "));
				if(UnArbol.Buscar(Valor) == true)
					JOptionPane.showMessageDialog(null, "El dato SI existe");
				else				
					JOptionPane.showMessageDialog(null, "El dato NO existe");
				break;
			case 3://Recorrer
				UnArbol.RecorrerPreOrden();
				break;
			case 4://Recorrer
				UnArbol.RecorrerEnOrden();
				break;
			case 5://Recorrer
				UnArbol.RecorrerPostOrden();
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Hasta la vista Baby");
			}

		}while(Opcion >= 1 && Opcion <=5);
	}
}
