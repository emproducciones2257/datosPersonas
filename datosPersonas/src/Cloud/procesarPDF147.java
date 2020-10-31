package Cloud;

import Model.*;

public class procesarPDF147 {
	
	private String escaneo;
	private dtosPdf147 dni;
		
	public procesarPDF147() {		
	}
	
	public procesarPDF147(String escaneo) {
		this.escaneo=escaneo;
	}
		
	public dtosPersona procesarEscaneo() {
		
		dni = new dtosPdf147();
		int c;
		int indiceTotal =0, separado=0;
		String temp="";
			
			if(!(escaneo.equals(""))) {
				
				while (indiceTotal<escaneo.length()) {
					
					c = Character.compare('"', escaneo.charAt(indiceTotal));
					if(!(c==0)) temp = temp + String.valueOf(escaneo.charAt(indiceTotal));
					else {
						
						generarObjDni(temp,separado);
						separado++;
						temp="";
					}
						
					indiceTotal ++;			
				}
				separado=0;
				return convertirDniToDto();
				
			}else return null;
	}

	private dtosPersona convertirDniToDto() {
		dtosPersona persona = new dtosPersona(
				dni.getNombre(),
				dni.getApellido(),
				dni.getDni(),
				dni.getNroTramite());
		
		return persona;
	}

	private void generarObjDni(String temp, int separado) {
		
		switch (separado) {
		
		case 0:
			dni.setNroTramite(temp);
			break;
			
		case 1:
			dni.setApellido(temp);
			break;
			
		case 2:
			dni.setNombre(temp);
			break;
			
		case 3:
			dni.setSexo(temp);
			break;
			
		case 4:
			dni.setDni(temp);
			break;
			
		case 5:
			dni.setEjemplar(temp);
			break;
			
		case 6:
			dni.setFeNa(temp);
			break;
			
		case 7:
			dni.setFeEmision(temp);
			break;
		default:
			break;
		}		
	}
		
}
