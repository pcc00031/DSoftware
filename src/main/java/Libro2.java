import java.util.Vector;
import Pr�ctica_4___Dise�o_de_la_persistencia_de_datos.Ejemplar2;

public class Libro2 {
	private String _t�tulo;
	private String _autores;
	private int _a�o;
	private String _iSBN;
	private int _p�ginas;
	public Biblioteca2 _contiene;
	public Vector<Favorito> _favoritos = new Vector<Favorito>();
	public Vector<Ejemplar2> _ejemplar2s = new Vector<Ejemplar2>();

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