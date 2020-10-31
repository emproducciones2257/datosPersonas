package Cloud;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import Model.*;
import View.ventanasAvisos;

public class consultaCuilOnLine {
	
	private String dni;
	private String cuil="",lineaQueQuiero, nombre="", apellido="";
    private URL url;
    private URLConnection uc;
    private StringBuilder parsedContentFromUrl;
    private String urlString;
    private int nroLinia;
    private ArrayList<Integer> espaciosVacios;
    private ventanasAvisos aviso;
	
	public consultaCuilOnLine(String dni) {
		this.dni=dni;
		parsedContentFromUrl= new StringBuilder();
    	urlString = constantes.URL_DATEAS;
    	nroLinia=0;		
    	aviso = new ventanasAvisos(null);
	}
 
    public void buscar() {
    	   	
    	try {
			url = new URL(urlString+dni);
			uc = url.openConnection();
			uc.connect();
			uc = url.openConnection();
			uc.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			uc.getInputStream();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
		      
		      while ((in.readLine()) != null) {
		    	  
		    	  if(nroLinia==445) {
		    		lineaQueQuiero=in.readLine();			    		
		    	  }
		         nroLinia++;
		      }
		      
		      lineaQueQuiero = eliminarTags(lineaQueQuiero);
		      
		      recuperarNombre(lineaQueQuiero);	
			
			} catch (Exception e) {
				e.printStackTrace();
			}			
    	}
	
	public dtosPersona generarObjPersona() {
		dtosPersona persona = new dtosPersona();
		buscar();
		recuperarApellido();
		
		persona.setDni(dni);
		persona.setCuil(cuil);
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		
		return persona;
	}

	private void recuperarNombre(String lineaQueQuiero) {

		int indice= 0;
				
		try {
			
			lineaQueQuiero = lineaQueQuiero.substring(3,lineaQueQuiero.length()-15);
			int cantidadCaracteres = lineaQueQuiero.length();

			
			for (int i = 0; i < cantidadCaracteres; i++) {
				
				if ((lineaQueQuiero.charAt(i) == '0') ||
						(lineaQueQuiero.charAt(i) == '1') ||
						(lineaQueQuiero.charAt(i) == '2') ||
						(lineaQueQuiero.charAt(i) == '3') ||
						(lineaQueQuiero.charAt(i) == '4') ||
						(lineaQueQuiero.charAt(i) == '5') ||
						(lineaQueQuiero.charAt(i) == '6') ||
						(lineaQueQuiero.charAt(i) == '7') ||
						(lineaQueQuiero.charAt(i) == '8') ||
						(lineaQueQuiero.charAt(i) == '9') ||
						(lineaQueQuiero.charAt(i) == '-')) {
							
							cuil = cuil + lineaQueQuiero.charAt(i);
					
						}else {
							nombre = nombre + lineaQueQuiero.charAt(i);
						}				
				indice++;
			}
			
			nombre = nombre.substring(0,nombre.length()-5);
			
			cuil = cuil.replaceAll("-", "");
		} catch (Exception e) {
			aviso.errorConsulta(ventanasAvisos.ERROR_CONSULTA, "");
		} 
	}
		
	private void recuperarApellido() {
		
		int temporal;
		
		espaciosVacios = new ArrayList<>();
		
		for (int i = 0; i < nombre.length(); i++) {
			
			temporal = Character.compare(' ', nombre.charAt(i));
			
			if(temporal==0) espaciosVacios.add(i);
		}
		
		if(espaciosVacios.size()== 1 || espaciosVacios.size()== 2) {
			apellido = nombre.substring(0, espaciosVacios.get(0));
			nombre = nombre.substring(espaciosVacios.get(0), nombre.length());
		}
		
		if(espaciosVacios.size() == 3) {
			apellido = nombre.substring(0, espaciosVacios.get(1));
			nombre = nombre.substring(espaciosVacios.get(1), nombre.length());
		}		
	}

	private  String eliminarTags(String cadena){
	    while(true){
	      int izdaTag= cadena.indexOf('<');
	      if (izdaTag < 0 ) return cadena;
	      int derTag = cadena.indexOf('>',izdaTag);
	      if (derTag < 0) return cadena;
	      cadena= cadena.substring(0,izdaTag)+" "+ cadena.substring(derTag+1);
	    }
	  }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public dtosPersona obtenerCuil(dtosPersona persona) {
		buscar();
		persona.setCuil(cuil);
		return persona;
	}
}
