package Model;

public class dtosPdf147 {
	
	private String nroTramite;
	private String apellido;
	private String nombre;
	private String sexo;
	private String dni;
	private String ejemplar;
	private String feNa;
	private String feEmision;
	
	
	public String getNroTramite() {
		return nroTramite;
	}
	public void setNroTramite(String nroTramite) {
		this.nroTramite = nroTramite;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(String ejemplar) {
		this.ejemplar = ejemplar;
	}
	public String getFeNa() {
		return feNa;
	}
	public void setFeNa(String feNa) {
		this.feNa = feNa;
	}
	public String getFeEmision() {
		return feEmision;
	}
	public void setFeEmision(String feEmision) {
		this.feEmision = feEmision;
	}
	
	@Override
	public String toString() {
		return "dtosPdf147 [nroTramite=" + nroTramite + ", apellido=" + apellido + ", nombre=" + nombre + ", sexo="
				+ sexo + ", dni=" + dni + ", ejemplar=" + ejemplar + ", feNa=" + feNa + ", feEmision=" + feEmision
				+ "]";
	}
}
