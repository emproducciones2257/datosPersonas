package Control;

import java.awt.event.*;
import java.util.ArrayList;

import Cloud.consultaAnotaciones;
import Model.anotaciones;
import Model.constantes;
import View.FrameAnotaciones;
import View.ventanasAvisos;

public class controlAnotaciones implements ActionListener {
	
	private FrameAnotaciones fAnotacion;
	private String eleccion = "";
	private consultaAnotaciones queryAnot;
	private ArrayList<anotaciones> anotaciones;
	private ventanasAvisos aviso;
	
	public controlAnotaciones(FrameAnotaciones fAnotacion) {
		this.fAnotacion = fAnotacion;
		queryAnot = new consultaAnotaciones();
		anotaciones = new ArrayList<>();
		aviso = new ventanasAvisos(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(fAnotacion.getBtnBip())) {
			
			consultaAnotaciones(constantes.BIP);
		}
		
		if(e.getSource().equals(fAnotacion.getBtnAfip())) {
			
			consultaAnotaciones(constantes.AFIP);
		}
		
		if(e.getSource().equals(fAnotacion.getBtnEmail())) {
			
			consultaAnotaciones(constantes.Email);	
		}
		
		if(e.getSource().equals(fAnotacion.getBtnRegistrar())) {
			
			String seleccionado = fAnotacion.btnSeleccionado();
			
			if(seleccionado != null) {
				anotaciones an = fAnotacion.obtenerAnotacion();
				
				if(an!=null) {
					queryAnot.agregarAnotacion(an);
					fAnotacion.limpiarElementos();
				}else aviso.faltanDatos(ventanasAvisos.FALTAN_DATOS);

			}else aviso.faltanDatos(ventanasAvisos.SELECCIONAR_SITIO);
		}
		
		if(e.getSource().equals(fAnotacion.getBtnEditar())) {
			//
			
		}
	}

	private void consultaAnotaciones(String sitio) {
		
		if(eleccion.equals(sitio)) {
			fAnotacion.limpiarTabla();
			fAnotacion.modeloTabla();
		}else {
			eleccion = sitio;
			anotaciones = new ArrayList<>();
			anotaciones = queryAnot.recuperarAnotaciones(eleccion);
			fAnotacion.setDatos(anotaciones);
			fAnotacion.limpiarTabla();
			fAnotacion.modeloTabla();
		}
	}
}
