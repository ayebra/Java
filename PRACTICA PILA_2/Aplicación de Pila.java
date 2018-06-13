package paquetepilita;
import javax.swing.JOptionPane;

public class App_Pila {

	public static void main(String[] args) {
		
		
		Pila pila = new Pila();
		
		String Menu = "[1] Agregar\n[2]Retirar\n[3]Recorrer\n[4]Abandonar";
		int Opcion;
		String dat;

		do
		{
			Opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));

			switch(Opcion)
			{
			case 1:// Agregar
				
				dat = JOptionPane.showInputDialog("Dato a agregar ");
				pila.Push(dat);
				break;
			case 2:// Retirar
				pila.Pop();
				JOptionPane.showMessageDialog(null, "Dato retirado");
				break;
			case 3://Recorrer
				pila.Recorrer();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Adios");
			}

		}while(Opcion >= 1 && Opcion <=3);
	}

}

		
		
		
		/*pila.Push("ANDREA");
		pila.Push("MANUEL");
		pila.Push("SHEYLA");
		pila.Push("BERENICE");
		pila.Push("ANDREA");
		
		
		
		pila.Pop();
		pila.Recorrer();
		System.out.println("\n");
      

	}

}*/

