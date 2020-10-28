package Cloud;

import java.io.IOException;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;


public class conectFirebase {
	
	public static Firestore firestore=null;
	
	private conectFirebase() {
		firestore=initFirebase();
	}
	public static Firestore getFirestore() {
		if(firestore==null) {
			firestore=initFirebase();
		}
		return firestore;
		//hola desca aca
	}

	public static Firestore initFirebase() {
	
		try {
			FirebaseOptions options = new FirebaseOptions.Builder()
							.setCredentials(GoogleCredentials.fromStream(conectFirebase.class.getResourceAsStream("datospersonas-29299-firebase-adminsdk-z5prc-4d301ceb9a.json")))
						  .setDatabaseUrl("https://datospersonas-29299.firebaseio.com")
						  .build();
			FirebaseApp.initializeApp(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	return FirestoreClient.getFirestore();
	}
}
