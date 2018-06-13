package paquetefibo;
import javax.swing.JOptionPane;

public class App_Fibonacci {

	public static void main(String[] args) {
		
		 Fibonacci FIBO = new Fibonacci ();
	        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("NUMERO ENTERO: "));
        JOptionPane.showMessageDialog(null,"RESULTADO:"+ FIBO.Fibonacci(n));
    
	}

}
