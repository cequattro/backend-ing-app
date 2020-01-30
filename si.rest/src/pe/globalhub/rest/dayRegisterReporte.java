package pe.globalhub.rest;

public class dayRegisterReporte {
	
	private String fecha;
	private int apertura;
	private int cierre;
	private int maximo;
	private int minimo;
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getApertura() {
		return apertura;
	}
	public void setApertura(int apertura) {
		this.apertura = apertura;
	}
	public int getCierre() {
		return cierre;
	}
	public void setCierre(int cierre) {
		this.cierre = cierre;
	}
	public int getMaximo() {
		return maximo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	public dayRegisterReporte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public dayRegisterReporte(String fecha, int apertura, int cierre, int maximo,
			int minimo) {
		super();
		this.fecha = fecha;
		this.apertura = apertura;
		this.cierre = cierre;
		this.maximo = maximo;
		this.minimo = minimo;
	}
	
	
	
}
