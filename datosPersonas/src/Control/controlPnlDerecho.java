package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Cloud.repositorio;
import View.pnlDerecho;

public class controlPnlDerecho implements ActionListener{
	
	private pnlDerecho pnlDerecho;
	private repositorio repo;
	
	public controlPnlDerecho(pnlDerecho pnlDerecho) {
		this.pnlDerecho = pnlDerecho;
		repo = new repositorio();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(pnlDerecho.getBtnBuscar())) {
			pnlDerecho.mostrarDtosPersona(repo.getPersona(pnlDerecho.getElementoSeleccionado().getDtosPersona()));
			pnlDerecho.habilitarOpciones(false);
		}
		
		if(e.getSource().equals(pnlDerecho.getBtnGuardar())) {
			if(pnlDerecho.validarCamposNulos()) {
				repo.registrarUsuario(pnlDerecho.obtenerUsuario());
				pnlDerecho.limpiarVistas();
			}
			
		}
		
		if(e.getSource().equals(pnlDerecho.getBtnAgregarPtente())) {
			if(!(pnlDerecho.getTxtIngresoPatente().getText().equals(""))) {
				pnlDerecho.agregarPatenteCmb(pnlDerecho.getTxtIngresoPatente().getText());
				
				
			}
			
		}	
	}
}
