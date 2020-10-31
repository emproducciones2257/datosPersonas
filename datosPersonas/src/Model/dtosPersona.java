package Model;


import java.util.List;

public class dtosPersona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private String nroTramite;
	private String codDni;
	private String cuil;
	private String codArea;
	private String numeroTel;
	private String email;
	private String domicilio;
	private String cp;
	private String localidad;
	private List<String> patentes;
	
	public dtosPersona() {
	}

	public dtosPersona(String nombre, String apellido, String dni, String nroTramite, String codDni, String cuil,
			String codArea, String numeroTel, String email, String domicilio, String cp, String localidad,
			List<String> patentes) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nroTramite = nroTramite;
		this.codDni = codDni;
		this.cuil = cuil;
		this.codArea = codArea;
		this.numeroTel = numeroTel;
		this.email = email;
		this.domicilio = domicilio;
		this.cp = cp;
		this.localidad = localidad;
		this.patentes = patentes;
	}

	public dtosPersona(String nombre, String apellido, String dni, String nroTramite) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nroTramite = nroTramite;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNroTramite() {
		return nroTramite;
	}

	public void setNroTramite(String nroTramite) {
		this.nroTramite = nroTramite;
	}

	public String getCodDni() {
		return codDni;
	}

	public void setCodDni(String codDni) {
		this.codDni = codDni;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getCodArea() {
		return codArea;
	}

	public void setCodArea(String codArea) {
		this.codArea = codArea;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public List<String> getPatentes() {
		return patentes;
	}

	public void setPatentes(List<String> patentes) {
		this.patentes = patentes;
	}

	@Override
	public String toString() {
		return "dtosPersona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nroTramite="
				+ nroTramite + ", codDni=" + codDni + ", cuil=" + cuil + ", codArea=" + codArea + ", numeroTel="
				+ numeroTel + ", email=" + email + ", domicilio=" + domicilio + ", cp=" + cp + ", localidad="
				+ localidad + ", patentes=" + patentes + "]";
	}
}
