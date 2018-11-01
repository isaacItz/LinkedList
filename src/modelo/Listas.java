package modelo;

public class Listas {

	public static void main(String[] args) {
		Lista<Integer> lista = new Lista<>();
		Lista<String> lista2 = new Lista<>();

		int arr[] = { 342, 12, 45, 45, 89, 36 };

		for (int i : arr) {
			lista.insertarPorAtras(i);
			lista.insercionOrdenada(i);
			lista.insertarPorFrente(i);
		}

		lista2.insercionOrdenada("zum");
		lista2.insercionOrdenada("julio");
		lista2.insercionOrdenada("isaac");
		lista2.insercionOrdenada("armando1");
		lista2.insercionOrdenada("armando");

		System.out.println(lista.recorrer());

		System.out.println(lista.existe(45));

		lista.eliminar(lista.existe(45));

		System.out.println(lista.recorrer());

	}

}
