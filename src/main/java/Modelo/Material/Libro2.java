package Modelo.Material;

import Modelo.Controlador.Biblioteca2;
import java.util.Vector;
import Práctica_4___Diseño_de_la_persistencia_de_datos.Modelo.Servicio.Favorito;
import Práctica_4___Diseño_de_la_persistencia_de_datos.Modelo.Material.Ejemplar2;
import Persistencia.LibroDAO;

public class Libro2 {
	private String _título;
	private String _autores;
	private int _año;
	private String _iSBN;
	private int _páginas;
	public Biblioteca2 _contiene;
	public Vector<Favorito> _petenece = new Vector<Favorito>();
	public Vector<Ejemplar2> _unnamed_Ejemplar2_ = new Vector<Ejemplar2>();
	public LibroDAO _unnamed_LibroDAO_;

	public void crearLibro(Object aData) {
		throw new UnsupportedOperationException();
	}

	public void actualizarLibro(Object aData) {
		throw new UnsupportedOperationException();
	}

	public void eliminarLibro() {
		throw new UnsupportedOperationException();
	}
}