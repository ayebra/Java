package estructurarreglo;
import javax.swing.JOptionPane;

public class App_Arreglo {

	public static void main(String[] args) {
		
		Arreglo arre = new Arreglo ();
        
        String CAJA;
        int BY = 0;
        int Seleccion;
        
        CAJA = JOptionPane.showInputDialog("SELECCIÓNA: \n [1] Insertar \n [2] Eliminar \n [3] Consultar \n [4] Busqueda \n [5]Ordenar \n  [6]Salir ");
        
        do {
            
        Seleccion = Integer.parseInt(JOptionPane.showInputDialog(CAJA));
		
        switch (Seleccion){
        
            case 1:
                arre.Insertar();
             break;
                
            case 2:
                arre.Eliminar();
                
             break;
             
            case 3:
                arre.Consultar();
              
              break;
            case 4:
                arre.Busqueda();
              break;
                
            case 5:
                arre.Ordenar();
                break;
                
            case 6:
                BY = 6;
                
            break;
        }
                 
        } while (BY!= 6); 
             
    }
	}} 