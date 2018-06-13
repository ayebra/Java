package estructurarreglo;
import javax.swing.JOptionPane;

public class Arreglo {
	
	String Nombre [] = new String [5], BU, LE;
    int a, band, i;
   
    public void Insertar(){
     
        for(a = 0;a <5;a++)
        {
            Nombre[a]= JOptionPane.showInputDialog("NOMBRE: ");
                       
        }
        }
    
    public void Eliminar (){
         BU = JOptionPane.showInputDialog(null, "NOMBRE QUE QUIERE ELIMINAR");
         band=0;
         for (int x=0;x<5;x++){
             
         if(BU.equals(Nombre[x]))
             {
                 band=1;
             Nombre[x]="VACIO";
                 
             }     
         }
          if(band==1)
         {
           JOptionPane.showMessageDialog(null, "HA SIDO ELIMINADO");  
         }
         else
         {
             JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NOMBRE");
         }
         } 
    
     public void Consultar (){
         for (int x=0;x<5;x++){
             
          JOptionPane.showMessageDialog(null," En la posicion ["+x+"] Esta guardado el nombre:" + Nombre[x] + "\n" );
             
         }
         
         } 
     
     public void Busqueda (){
         BU = JOptionPane.showInputDialog(null, "NOMBRE QUE QUIERE BUSCAR");
         
         for (int x=0;x<5;x++){
             
         if(BU.equals(Nombre[x]))
             {
                 
             JOptionPane.showMessageDialog(null,"En la posicion ["+x+"] Esta guardado el nombre: "+Nombre[x]+"\n" );                       
         }
          
             }
           
         } 
         
    public void Ordenar (){
            
    for(i=0;i<5;i++)
    {
    for(a =5-1;a >0;a--) 
    {
     if(Nombre[a].compareTo (Nombre[a-1])>0) 
     {
     } 
     else 
     {
         LE = Nombre[a];
         Nombre[a] = Nombre[a-1];
         Nombre[a-1]= LE;
     }
     }

     }
       for (int x=0;x<5;x++)
       {
             
          JOptionPane.showMessageDialog(null," En la posicion ["+x+"] Esta guardado el nombre: "+Nombre[x]+ "\n" );
             
       }
       
        }
} 