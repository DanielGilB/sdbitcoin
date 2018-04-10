package eventos;

public class EventoBitcoin {	
	
	private String nombre_;
	private float precio_;
	private float cambio1h_;
	private float cambio24h_;
	private float cambio7d_;

	
	public EventoBitcoin(String nombre, float precio, float cambio1h, float cambio24h, float cambio7d) {
		nombre_ = nombre;
		precio_ = precio;
		cambio1h_ = cambio1h;
		cambio24h_ = cambio24h;
		cambio7d_ = cambio7d;
	}

	public EventoBitcoin(){}
	
	public String getNombre() {
		return nombre_;
	}

	public void setNombre(String nombre) {
		nombre_ = nombre;
	}

	public float getPrecio() {
		return precio_;
	}

	public void setPrecio(float precio) {
		precio_ = precio;
	}
	
	public float getCambio1h() {
		return cambio1h_;
	}

	public void setCambio1h(float cambio1h) {
		cambio1h_ = cambio1h;
	}
	
	public float getCambio24h() {
		return cambio24h_;
	}

	public void setCambio24h(float cambio24h) {
		cambio24h_ = cambio24h;
	}
	
	public float getCambio7d() {
		return cambio7d_;
	}

	public void setCambio7d(float cambio7d) {
		cambio7d_ = cambio7d;
	}

	@Override
	public String toString() {
		return "Precio "+ nombre_ +": " + precio_ + " euros.\n"
				+ "% última hora: " + cambio1h_ + "\n"
						+ "% últimas 24 horas: " + cambio24h_ + "\n"
								+ "% últimos 7 días: " + cambio7d_ ;
	}
}