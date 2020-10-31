package Control;

import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.awt.event.*;

import View.pnlDerecho;

public class controlBtnPortapapeles implements ActionListener{
	
	private pnlDerecho pnlDerecho;
	private Clipboard cb;
	private StringSelection ss;
	 	
	public controlBtnPortapapeles(pnlDerecho pnlDerecho) {
		this.pnlDerecho = pnlDerecho;
		cb = Toolkit.getDefaultToolkit().getSystemClipboard();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(pnlDerecho.getCopiaNombre())) {			 
			ss = new StringSelection(pnlDerecho.getTxtNombre().getText());
			cb.setContents(ss, ss);
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaApellido())) {			 
			ss = new StringSelection(pnlDerecho.getTxtApellido().getText());
			cb.setContents(ss, ss);
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaDNI())) {			
			ss = new StringSelection(pnlDerecho.getTxtDni().getText());
			cb.setContents(ss, ss);			
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaNTramite())) {			
			ss = new StringSelection(pnlDerecho.getTxtNTramite().getText());
			cb.setContents(ss, ss);			
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaCUIL())) {			
			ss = new StringSelection(pnlDerecho.getTxtCuil().getText());
			cb.setContents(ss, ss);			
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaCaracteristica())) {			
			ss = new StringSelection(pnlDerecho.getTxtCodArea().getText());
			cb.setContents(ss, ss);			
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaNumero())) {			
			ss = new StringSelection(pnlDerecho.getTxtNumerTel().getText());
			cb.setContents(ss, ss);			
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaEmail())) {			
			ss = new StringSelection(pnlDerecho.getTxtEmail().getText());
			cb.setContents(ss, ss);			
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaDomicilio())) {			
			ss = new StringSelection(pnlDerecho.getTxtDireccion().getText());
			cb.setContents(ss, ss);			
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaCP())) {			
			ss = new StringSelection(pnlDerecho.getTxtCP().getText());
			cb.setContents(ss, ss);			
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaLocalidad())) {			
			ss = new StringSelection(pnlDerecho.getTxtLocalidad().getText());
			cb.setContents(ss, ss);			
		}
		
		if(e.getSource().equals(pnlDerecho.getCopiaPatente())) {			
			ss = new StringSelection(pnlDerecho.getPatenteSeleccionada());
			cb.setContents(ss, ss);			
		}
	}
}
