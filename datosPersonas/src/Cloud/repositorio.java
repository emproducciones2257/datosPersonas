package Cloud;


import java.util.*;
import java.util.concurrent.ExecutionException;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import Model.*;
import View.*;

public class repositorio {
	
	private ventanasAvisos avisos;
	private pnlDerecho pnlDerecho;
	private DocumentReference docRef;
	private CollectionReference refDtosPersonas, refIndicePersonas;
	private Query query;
	private ApiFuture<QuerySnapshot> consulta;
	private ApiFuture<DocumentReference> result;
	private ApiFuture<DocumentSnapshot> future;
	private ArrayList<indiceUsuarios> datos;
	private List<QueryDocumentSnapshot> documents;
	
	public repositorio(pnlDerecho pnlDerecho) {
		this.pnlDerecho=pnlDerecho;
		avisos = new ventanasAvisos(null);
	}
		
	public ArrayList<indiceUsuarios> getDtos(){

		datos = new ArrayList<indiceUsuarios>();

		try {
			refIndicePersonas = conectFirebase.getFirestore().collection(constantes.INDICE_PERSONAS);
			
			consulta = refIndicePersonas.get();
			
			documents = consulta.get().getDocuments();
			
			for (QueryDocumentSnapshot document : documents) {
				datos.add(document.toObject(indiceUsuarios.class));
			}
			
		} catch (InterruptedException e) {
			avisos.errorConsulta(ventanasAvisos.ERROR_CONSULTA, e.getMessage());
		} catch (ExecutionException e) {
			avisos.errorConsulta(ventanasAvisos.ERROR_CONSULTA, e.getMessage());
		}
		
		Collections.sort(datos);
		
		return datos;
	}
	
	public dtosPersona getPersona(DocumentReference referencia) {
		
		dtosPersona temp = new dtosPersona();
		
		refDtosPersonas = conectFirebase.getFirestore().collection(constantes.DTOS_PERSONA);
		
		future = referencia.get();
		
		try {
			temp = future.get().toObject(dtosPersona.class);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return temp;
	}

	public Boolean registrarUsuario(dtosPersona chango) {
		//verificar dni si existe cargado *
		
		//si la persona no esta cargada, la cargo *
	
		//luego de cargar, obtengo el id o referencia del documento cargado *
	
		//cargo esa referencia en la otra table de indices*
	
		//actualizo el combo de personas o hago una nueva llamada*
	
	//si esta cargada, mando aviso que existe el usuario
		boolean estado = true;
	
		if(existeDni(chango)) {
			
			docRef = cargaPersona(chango);
			
			if(docRef!=null) {
				
				pnlDerecho.actualizarListaNombresDisponibles(cargarPersonaEnIndices(chango,docRef));
				estado= true;
			}else estado= false;
						
		}else {
			avisos.datoExistente(ventanasAvisos.EXISTE_PERSONA);
			estado=false;
		}
		return estado;		
	}

	private indiceUsuarios cargarPersonaEnIndices(dtosPersona chango, DocumentReference referenciaPersona){
		
		refIndicePersonas = conectFirebase.getFirestore().collection(constantes.INDICE_PERSONAS);
		
		indiceUsuarios indice = new indiceUsuarios(chango.getApellido(), chango.getNombre(), referenciaPersona);
		
		result = refIndicePersonas.add(indice);
		return indice;
	}

	private boolean existeDni(dtosPersona chango) {
		
		boolean estado = false;
		
		refDtosPersonas = conectFirebase.getFirestore().collection(constantes.DTOS_PERSONA);
	
		query = refDtosPersonas.whereEqualTo(constantes.CAMPO_DNI, chango.getDni());
		
		consulta = query.get();
		
		try {
			
			if(consulta.get().getDocumentChanges().isEmpty()) {
				estado= true;
			}else {
				estado = false;
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (ExecutionException e) {
			
			e.printStackTrace();
		}
		return estado;
	}

	private DocumentReference cargaPersona(dtosPersona chango) {
		
		refDtosPersonas = conectFirebase.getFirestore().collection(constantes.DTOS_PERSONA);
		
		result = refDtosPersonas.add(chango);
    	
    	try {
    		return result.get();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (ExecutionException e) {
			
			e.printStackTrace();
		}
    	return null;
	}	
}
