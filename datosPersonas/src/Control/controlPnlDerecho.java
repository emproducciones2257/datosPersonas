package Control;

import java.awt.event.*;
import Cloud.repositorio;
import View.*;

public class controlPnlDerecho implements ActionListener{
	
	private pnlDerecho pnlDerecho;
	private repositorio repo;
	private ventanasAvisos aviso;
	
	public controlPnlDerecho(pnlDerecho pnlDerecho) {
		this.pnlDerecho = pnlDerecho;
		repo = new repositorio(pnlDerecho);
		aviso = new ventanasAvisos(pnlDerecho);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(pnlDerecho.getBtnBuscar())) {
			
			if(pnlDerecho.getElementoSeleccionado()!=null) {
				pnlDerecho.mostrarDtosPersona(repo.getPersona(pnlDerecho.getElementoSeleccionado().getDtosPersona()));
				pnlDerecho.habilitarOpciones(false);
			}else aviso.faltanDatos(ventanasAvisos.FALTAN_DATOS);
		}
		
		if(e.getSource().equals(pnlDerecho.getBtnGuardar())) {
			if(pnlDerecho.validarCamposNulos()) {
				if(repo.registrarUsuario(pnlDerecho.obtenerUsuario())) {
					aviso.cargaCorrecta(ventanasAvisos.CARGA_OK);
					pnlDerecho.limpiarVistas();
				}else {
					aviso.CargaErronea(ventanasAvisos.CARGA_ERROR);
					pnlDerecho.limpiarVistas();
				}				
			}else {
				aviso.faltanDatos(ventanasAvisos.FALTAN_DATOS);
			}			
		}
		
		if(e.getSource().equals(pnlDerecho.getBtnAgregarPtente())) {
			if(!(pnlDerecho.getTxtIngresoPatente().getText().equals(""))) {
				pnlDerecho.agregarPatenteCmb(pnlDerecho.getTxtIngresoPatente().getText());			
			}
			
		}	
	}
}
