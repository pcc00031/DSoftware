import java.util.Vector;

public class Lector2 extends Usuario2 {
	private String _dirección;
	private boolean _estado;
	private int _tiempoPenalización;
	public Vector<Reserva2> _reserva2s = new Vector<Reserva2>();
	public Vector<Préstamo2> _préstamo2s = new Vector<Préstamo2>();
	public Vector<Favorito> _favoritos = new Vector<Favorito>();
}