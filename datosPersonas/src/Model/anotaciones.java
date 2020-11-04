package Model;

public class anotaciones {

	private String nombre;
	private String user;
	private String pasw;
	private String Sitio;
	
	public anotaciones() {

	}

	public anotaciones(String nombre, String user, String pasw, String Sitio) {
		super();
		this.nombre = nombre;
		this.user = user;
		this.pasw = pasw;
		this.Sitio = Sitio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasw() {
		return pasw;
	}

	public void setPasw(String pasw) {
		this.pasw = pasw;
	}

	public String getSitio() {
		return Sitio;
	}

	public void setSitio(String sitio) {
		Sitio = sitio;
	}

	@Override
	public String toString() {
		return "anotaciones [nombre=" + nombre + ", user=" + user + ", pasw=" + pasw + ", Sitio=" + Sitio + "]";
	}	
}
