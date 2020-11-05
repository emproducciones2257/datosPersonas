package Cloud;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

import Model.anotaciones;
import Model.constantes;
import View.ventanasAvisos;

public class consultaAnotaciones {
	
	private ventanasAvisos avisos;
	private CollectionReference refAnotaciones;
	private ArrayList<anotaciones> anotaciones;
	
	public consultaAnotaciones() {
		avisos = new ventanasAvisos(null);
	}

	public ArrayList<anotaciones> recuperarAnotaciones(String eleccion) {

		Query query;
		ApiFuture<QuerySnapshot> consulta;
		List<QueryDocumentSnapshot> documents;
		anotaciones = new ArrayList<>();
		
		try {
			
			refAnotaciones = conectFirebase.getFirestore().collection(constantes.ANOTACIONES);
			
			query = refAnotaciones.whereEqualTo(constantes.Sitio, eleccion);
			
			consulta = query.get();
			
			documents = consulta.get().getDocuments();
			
			for (QueryDocumentSnapshot document : documents) {
				anotaciones.add(document.toObject(anotaciones.class));
			}
			
		} catch (InterruptedException e) {
			avisos.errorConsulta(ventanasAvisos.ERROR_CONSULTA, e.getMessage());
		} catch (ExecutionException e) {
			avisos.errorConsulta(ventanasAvisos.ERROR_CONSULTA, e.getMessage());
		}
		
		//Collections.sort(datos);
	
		return anotaciones;
	}
}
