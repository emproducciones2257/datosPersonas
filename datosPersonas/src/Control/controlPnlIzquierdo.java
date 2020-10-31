package Control;

import java.awt.event.*;
import Cloud.*;
import Model.dtosPersona;
import View.*;

public class controlPnlIzquierdo implements ActionListener{
	
	private pnlIzquierdo pnlIzquierdo;
	private pnlDerecho pnlDerecho;
	private ventanasAvisos aviso;
	private procesarPDF147 escaneo;
	private consultaCuilOnLine cuilOnline;
	private dtosPersona persona;
	private String loEscaneado = "";
	
	public controlPnlIzquierdo(pnlIzquierdo pnlIzquierdo,pnlDerecho pnlDerecho) {
		this.pnlIzquierdo = pnlIzquierdo;
		this.pnlDerecho = pnlDerecho;
		aviso = new ventanasAvisos(pnlDerecho);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource().equals(pnlIzquierdo.getBtnCargaTeclado())) {
			
			pnlDerecho.habilitarOpcionesCargas();
		}
		
		if(e.getSource().equals(pnlIzquierdo.getBtnCargaCuil())) {

			pnlDerecho.habilitarOpcionesCargas();
			
			loEscaneado = aviso.ingresoScan(ventanasAvisos.INGRESAR_DNI);
			
			if(loEscaneado!=null) {
				
				cuilOnline = new consultaCuilOnLine(loEscaneado);
				persona = cuilOnline.generarObjPersona();
				
				if(persona!=null) {
					pnlDerecho.mostrarDtosXScan(persona);
				}				
			}
		}
		
		if(e.getSource().equals(pnlIzquierdo.getBtnCargaScan())) {
			
			pnlDerecho.habilitarOpcionesCargas();
			
			loEscaneado = aviso.ingresoScan(ventanasAvisos.ESCANEAR_DNI);
			
			if(loEscaneado!=null){
				escaneo = new procesarPDF147(loEscaneado);
				persona = escaneo.procesarEscaneo();
				
				if (persona != null) {
					cuilOnline = new consultaCuilOnLine(persona.getDni());
					persona = cuilOnline.obtenerCuil(persona);
					pnlDerecho.mostrarDtosXScan(persona);					
				}				
			}		
		}		
	}
}
