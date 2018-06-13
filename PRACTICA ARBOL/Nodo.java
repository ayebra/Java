
public class Nodo {
	private int dato;
	private Nodo der;
	private Nodo izq;
	
	public Nodo(int dato) {
		this.dato = dato;
		der = null;
		izq = null;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo Der) {
		der = Der;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo Izq) {
		izq = Izq;
	}


	public String toString() {
		return " ["+ this.dato + "]";
	}
}
