package paquetepote;

public class Potencia {
	 
	public static int potencia (int a, int z){
	       
		if (z == 0){
	            return 1;
	        }
	        else {
	            return a* potencia(a,z-1);
	        }
	    }

}
