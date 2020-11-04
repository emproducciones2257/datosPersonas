package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Cloud.consultaAnotaciones;
import Model.constantes;
import View.FrameAnotaciones;

public class controlAnotaciones implements ActionListener {
	
	private FrameAnotaciones fAnotacion;
	private String eleccion = "";
	private consultaAnotaciones queryAnot;
	
	public controlAnotaciones(FrameAnotaciones fAnotacion) {
		this.fAnotacion = fAnotacion;
		queryAnot = new consultaAnotaciones();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(fAnotacion.getBtnBip())) {
			
			if(eleccion.equals(constantes.BIP)) {
				fAnotacion.limpiarTabla();
				fAnotacion.modeloTabla();
			}else {
				eleccion = constantes.BIP;
				fAnotacion.setDatos(queryAnot.recuperarAnotaciones(eleccion));
				fAnotacion.limpiarTabla();
				fAnotacion.modeloTabla();
			}			
		}
		
		if(e.getSource().equals(fAnotacion.getBtnAfip())) {
			
			if(eleccion.equals(constantes.AFIP)) {
				fAnotacion.limpiarTabla();
				fAnotacion.modeloTabla();
			}else {
				eleccion = constantes.AFIP;
				fAnotacion.setDatos(queryAnot.recuperarAnotaciones(eleccion));
				fAnotacion.limpiarTabla();
				fAnotacion.modeloTabla();
			}			
		}
		
		if(e.getSource().equals(fAnotacion.getBtnEmail())) {
			
			if(eleccion.equals(constantes.Email)) {
				fAnotacion.limpiarTabla();
				fAnotacion.modeloTabla();
			}else {
				eleccion = constantes.Email;
				fAnotacion.setDatos(queryAnot.recuperarAnotaciones(eleccion));
				fAnotacion.limpiarTabla();
				fAnotacion.modeloTabla();
			}			
		}
	}
}
