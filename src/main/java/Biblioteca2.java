import java.util.Vector;

public class Biblioteca2 {
	public Vector<Usuario2> _accede_a = new Vector<Usuario2>();
	public ControladorLector _unnamed_ControladorLector_;
	public ControladorAdministrador _unnamed_ControladorAdministrador_;
	public Vector<Libro2> _contiene = new Vector<Libro2>();
	public Vector<Préstamo2> _tramita = new Vector<Préstamo2>();
	public ObservadorActualizar _unnamed_ObservadorActualizar_;
	public ObservadorEliminar _unnamed_ObservadorEliminar_;

	public boolean autenticacion() {
		throw new UnsupportedOperationException();
	}

	public void addLibro(Object aData) {
		throw new UnsupportedOperationException();
	}

	public Libro getLibro() {
		throw new UnsupportedOperationException();
	}

	public boolean buscarLibro(Object aISBN) {
		throw new UnsupportedOperationException();
	}

	public void actualizarLibro(Object aData) {
		throw new UnsupportedOperationException();
	}

	public void eliminarLibro() {
		throw new UnsupportedOperationException();
	}

	public boolean getLibroBorrado() {
		throw new UnsupportedOperationException();
	}

	public list<Prestamo> pedirPrestamos() {
		throw new UnsupportedOperationException();
	}

	public date pedirFecha() {
		throw new UnsupportedOperationException();
	}

	public date pedirFechaTope() {
		throw new UnsupportedOperationException();
	}

	public date pedirFechaDev() {
		throw new UnsupportedOperationException();
	}
}