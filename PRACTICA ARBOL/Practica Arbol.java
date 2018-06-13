
public class Arbol {
	private Nodo raiz;
	private Nodo otro;

	public Arbol() {
		raiz = null;

	}

	public void insertar(int valor) {
		if (raiz == null) {
			raiz = new Nodo(valor);
		} else {
			insertar(raiz, valor);
		}

	}

	public void insertar(Nodo APNodo, int Info) {
		
		if(Info<APNodo.getDato()){
			if(APNodo.getIzq()==null){
				Nodo Otro=new Nodo(Info);
				APNodo.setIzq(Otro);
						
			}else{
				insertar(APNodo.getIzq(),APNodo.getDato());
			}
	
		}else{
			if(Info>APNodo.getDato()){
				if(APNodo.getDer()==null){
					Nodo Otro=new Nodo(Info);
					APNodo.setDer(Otro);
				}else{
					insertar(APNodo.getDer(),APNodo.getDato());
				}
			}else{
				System.out.println("el nodo ya se encuentra en el arbol");
			
			}
		}
	}

	
	
	
}
