package View;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ventanasAvisos {
	
	private JPanel vista;	
	
	//Mensajes
	
	public static final String FALTAN_DATOS="Faltan datos para realizar la consulta";


	public static final String EXISTE_PERSONA = "PERSONA YA REGISTRADA";


	public static final String CARGA_OK = "Se cargo correctamente";


	public static final String CARGA_ERROR = "Fallo la carga ";


	public static final String ERROR_CONSULTA = "No se puede realizar la consutla";


	public static final String UPDATE_OK = "Base actualizada correctamente";


	public static final String ERROR_UPDATE = "No se puede actualizar la BD";
	
	
	public static final String ESCANEAR_DNI = "Escanear PDF147 DNI";


	public static final String INGRESAR_DNI = "Ingresar DNI";

	public static final String NO_HAY_ANOTACIONES_CATEGORIA = "No se registras anotaciones para esta categoria";

	public static final String SELECCIONAR_SITIO = "Seleccionar sitio del recordatorio";

	
	public ventanasAvisos(JPanel vista) {
		this.vista=vista;
	}
	
	public void faltanDatos(String message) {
		JOptionPane.showMessageDialog(vista, message, "Verificar Datos", JOptionPane.ERROR_MESSAGE);
	}

	public void datoExistente(String marcaRegistrada) {		
		JOptionPane.showMessageDialog(vista, marcaRegistrada, "Verificar Datos", JOptionPane.OK_OPTION);
	}

	public void cargaCorrecta(String cargaOk) {
		JOptionPane.showMessageDialog(vista, cargaOk, "Carga Correcta", JOptionPane.INFORMATION_MESSAGE);
	}

	public void cargaFallida(String cargaError, String message) {
		JOptionPane.showMessageDialog(vista, cargaError + " " + message, "Verificar Datos", JOptionPane.ERROR_MESSAGE);
	}

	public void errorConsulta(String errorConsulta, String message) {
		JOptionPane.showMessageDialog(vista, errorConsulta + " " + message, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void CargaErronea(String errorCargaArchivo) {
		JOptionPane.showMessageDialog(vista, errorCargaArchivo, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void updateCorrecta(String updateOk) {
		JOptionPane.showMessageDialog(vista, updateOk, "Actualizacion Correcta", JOptionPane.INFORMATION_MESSAGE);	
	}

	public void errorUpdate(String errorUpdate, String message) {
		JOptionPane.showMessageDialog(vista, errorUpdate + " " + message, "Error Update", JOptionPane.ERROR_MESSAGE);
	}

	public void ProductoNoReg(String productoNReg) {		
		JOptionPane.showMessageDialog(vista, productoNReg, "No Registrado", JOptionPane.WARNING_MESSAGE);
	}

	public void errorCargaDtos(String cargaError, String message) {
		JOptionPane.showMessageDialog(vista, cargaError + " " + message, "Error carga fecha y porcentaje", JOptionPane.ERROR_MESSAGE);
	}

	public void mostrarSiESta(String men) {
		JOptionPane.showMessageDialog(vista, men, "No Registrado", JOptionPane.WARNING_MESSAGE);
	}
	
	public String ingresoScan (String texto) {
		 return JOptionPane.showInputDialog(texto);	       
	}
}
