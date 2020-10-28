package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.pnlDerecho;
import View.pnlIzquierdo;

public class controlPnlIzquierdo implements ActionListener{
	
	private pnlIzquierdo pnlIzquierdo;
	private pnlDerecho pnlDerecho;
	
	public controlPnlIzquierdo(pnlIzquierdo pnlIzquierdo,pnlDerecho pnlDerecho) {
		this.pnlIzquierdo = pnlIzquierdo;
		this.pnlDerecho = pnlDerecho;

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource().equals(pnlIzquierdo.getBtnCargaTeclado())) {
			
			pnlDerecho.limpiarVistas();
			pnlDerecho.habilitarBtnPortapapeles();
			pnlDerecho.habilitarOpciones(true);
		}
		
		if(e.getSource().equals(pnlIzquierdo.getBtnCargaCuil())) {
			System.out.println("Toque cuil");
		}
		
		if(e.getSource().equals(pnlIzquierdo.getBtnCargaScan())) {
			System.out.println("Toque scan");
		}		
	}
}
