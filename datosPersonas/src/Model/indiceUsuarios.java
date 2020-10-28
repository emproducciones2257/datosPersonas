package Model;

import com.google.cloud.firestore.DocumentReference;

public class indiceUsuarios {
	
	private String apellido;
	private String nombre;
	private DocumentReference dtosPersona;
	
	public indiceUsuarios() {}

	public indiceUsuarios(String apellido, String nombre, DocumentReference dtosPersona) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dtosPersona = dtosPersona;
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

	public DocumentReference getDtosPersona() {
		return dtosPersona;
	}

	public void setDtosPersona(DocumentReference dtosPersona) {
		this.dtosPersona = dtosPersona;
	}

	@Override
	public String toString() {
		return apellido+", " + nombre;
	}
}
