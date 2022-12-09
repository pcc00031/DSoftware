import java.util.Vector;

public class Ejemplar2 {
	private String _idInventario;
	private date _fechaCompra;
	private boolean _estado;
	private integer _idEjemplar;
	public Libro2 _tiene;
	public Vector<Reserva2> _reserva2s = new Vector<Reserva2>();
	public Vector<Préstamo2> _préstamo2s = new Vector<Préstamo2>();

	public void getEjemplar() {
		throw new UnsupportedOperationException();
	}
}