package Modelo.Material;

import Modelo.Controlador.Biblioteca2;
import java.util.Vector;
import Pr�ctica_4___Dise�o_de_la_persistencia_de_datos.Modelo.Servicio.Favorito;
import Pr�ctica_4___Dise�o_de_la_persistencia_de_datos.Modelo.Material.Ejemplar2;
import Persistencia.LibroDAO;

public class Libro2 {
	private String _t�tulo;
	private String _autores;
	private int _a�o;
	private String _iSBN;
	private int _p�ginas;
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