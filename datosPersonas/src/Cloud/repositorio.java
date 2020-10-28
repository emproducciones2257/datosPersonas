package Cloud;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.cloud.firestore.DocumentReference;

import Model.dtosPersona;
import Model.indiceUsuarios;

public class repositorio {
	
	ArrayList<indiceUsuarios> datos;
	
	public ArrayList<indiceUsuarios> getDtos(){

		datos = new ArrayList<indiceUsuarios>();
		
		datos.add(new indiceUsuarios("Gomez", "Marina", null));
		datos.add(new indiceUsuarios("Marquez", "Emanuel", null));
		datos.add(new indiceUsuarios("Olivera", "Carmen", null));
		datos.add(new indiceUsuarios("Rodriguez", "Josefa", null));
		datos.add(new indiceUsuarios("Mangini", "Isabel", null));
		datos.add(new indiceUsuarios("Etchegaray", "Laura", null));
		datos.add(new indiceUsuarios("HERNANDEZ MONTERROZA", "ADRIANA CAROLINA", null));
		
		return datos;
	}
	
	public dtosPersona getPersona(DocumentReference referencia) {
				
		return new dtosPersona("Marina",
				"Gomez",
				"30068534",
				"00214510510",
				"-","30068534",
				"-","-",
				"-",
				"-","6616","Castilla",
				Arrays.asList());
	}

	public void registrarUsuario(dtosPersona chango) {
		System.out.println(chango.toString());		
	}
}
