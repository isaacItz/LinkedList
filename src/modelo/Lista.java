package modelo;

public class Lista<T extends Comparable<T>> {
	private Nodo<T> cabeza;
	private Nodo<T> ultimo;
	private boolean ordenada;

	public Lista() {
		cabeza = null;
		ordenada = !!ordenada;
	}

	public void insercionOrdenada(T dato) {
		Nodo<T> p = new Nodo<T>(dato);
		ordenada = true;
		if (cabeza != null) {
			Nodo<T> ant = null;
			Nodo<T> aux = cabeza;

			while (aux != null && p.getDato().compareTo(aux.getDato()) > 0) {
				ant = aux;
				aux = aux.getSiguiente();
			}
			if (ant == null) {
				p.setSiguiente(cabeza);
				cabeza = p;
			} else if (aux == null) {
				ant.setSiguiente(p);
			}

			else if (ant != null && aux != null) {
				ant.setSiguiente(p);
				p.setSiguiente(aux);
			}

		}

		else
			cabeza = p;
	}

	public void insertarPorFrente(T dato) {
		ordenada = false;
		Nodo<T> nodo = new Nodo<T>(dato);
		nodo.setSiguiente(cabeza);
		cabeza = nodo;
	}

	public boolean estaVacia() {
		return cabeza == null;
	}

	public Pareja<Nodo<T>> existe(T dato) {
		Nodo<T> p = cabeza;
		Nodo<T> ant = null;

		while (p != null && !p.getDato().equals(dato)) {
			if (ordenada && !(p.getDato().compareTo(dato) < 0))
				break;
			ant = p;
			p = p.getSiguiente();
		}

		if (p != null && p.getDato() == dato)
			return new Pareja<Nodo<T>>(ant, p);

		else
			return null;
	}

	public void insertarPorAtras(T dato) {
		ordenada = false;
		Nodo<T> nodo = new Nodo<>(dato);
		if (cabeza == null) {
			cabeza = nodo;
			ultimo = nodo;
		} else {
			ultimo.setSiguiente(nodo);
			ultimo = nodo;
		}
	}

	public void eliminar(Pareja<Nodo<T>> pareja) {
		Nodo<T> ant = pareja.getPrimerElemento();
		Nodo<T> p = pareja.getSegundoElemento();

		if (ant == null)
			cabeza = cabeza.getSiguiente();

		else
			ant.setSiguiente(p.getSiguiente());

		p.setSiguiente(null);
		p = null;
	}

	public String recorrer() {
		String salida = "";
		Nodo<T> nodo = cabeza;
		while (nodo != null) {
			salida += nodo.getDato() + "\n";
			nodo = nodo.getSiguiente();
		}
		return salida;
	}

}
