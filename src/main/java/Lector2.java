import java.util.Vector;

public class Lector2 extends Usuario2 {
	private String _direcci�n;
	private boolean _estado;
	private int _tiempoPenalizaci�n;
	public Vector<Reserva2> _reserva2s = new Vector<Reserva2>();
	public Vector<Pr�stamo2> _pr�stamo2s = new Vector<Pr�stamo2>();
	public Vector<Favorito> _favoritos = new Vector<Favorito>();
}