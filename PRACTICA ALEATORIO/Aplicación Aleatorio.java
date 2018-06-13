package estructura;

public class App_Aleatorio {

	public static void main(String[] args) {
		Aleatorio COLA = new Aleatorio(50);
		Aleatorio NEGA = new Aleatorio(50);
		
		int numero;
		int max = 25;
		int min = -25;
			
		for(int i = 0; i < 50; i++) {
			
			numero = (int)(Math.random()*(max - min) + min);
			COLA.push(numero);
			
			if (numero < 0)
				NEGA.push(numero);
		}
	
		System.out.println("Cola con Valores Aleatorios con rango -25 a 25");
		System.out.println(COLA.toString() + "\n");
		System.out.println("Con Valores Negativos");
		System.out.println(NEGA.toString() + "\n");
	}

}
