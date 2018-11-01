package modelo;

public class Pareja<T> {

	private T primerElemento;
	private T segundoElemento;

	public Pareja(T primerElemento, T segundoElemento) {
		super();
		this.primerElemento = primerElemento;
		this.segundoElemento = segundoElemento;
	}

	public T getPrimerElemento() {
		return primerElemento;
	}

	public void setPrimerElemento(T primerElemento) {
		this.primerElemento = primerElemento;
	}

	public T getSegundoElemento() {
		return segundoElemento;
	}

	public void setSegundoElemento(T segundoElemento) {
		this.segundoElemento = segundoElemento;
	}

	@Override
	public String toString() {
		return "Pareja [primerElemento=" + primerElemento + ", segundoElemento=" + segundoElemento + "]";
	}

}
