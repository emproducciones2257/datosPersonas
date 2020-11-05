package Control;

import java.awt.event.*;
import java.util.ArrayList;

import Cloud.consultaAnotaciones;
import Model.anotaciones;
import Model.constantes;
import View.FrameAnotaciones;

public class controlAnotaciones implements ActionListener {
	
	private FrameAnotaciones fAnotacion;
	private String eleccion = "puto";
	private consultaAnotaciones queryAnot;
	private ArrayList<anotaciones> anotaciones;
	
	public controlAnotaciones(FrameAnotaciones fAnotacion) {
		this.fAnotacion = fAnotacion;
		queryAnot = new consultaAnotaciones();
		anotaciones = new ArrayList<>();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(fAnotacion.getBtnBip())) {
			
			if(eleccion.equals(constantes.BIP)) {
				fAnotacion.limpiarTabla();
				fAnotacion.modeloTabla();
			}else {
				eleccion = constantes.BIP;
				anotaciones = new ArrayList<>();
				queryAnot = new consultaAnotaciones();
				anotaciones = queryAnot.recuperarAnotaciones(eleccion);
				fAnotacion.setDatos(anotaciones);
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
				anotaciones = new ArrayList<>();
				queryAnot = new consultaAnotaciones();
				anotaciones = queryAnot.recuperarAnotaciones(eleccion);
				fAnotacion.setDatos(anotaciones);
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
				anotaciones = new ArrayList<>();
				queryAnot = new consultaAnotaciones();
				anotaciones = queryAnot.recuperarAnotaciones(eleccion);
				fAnotacion.setDatos(anotaciones);
				fAnotacion.limpiarTabla();
				fAnotacion.modeloTabla();
			}	
		}
	}
}
