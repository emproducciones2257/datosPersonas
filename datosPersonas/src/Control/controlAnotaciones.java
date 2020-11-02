package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.FrameAnotaciones;

public class controlAnotaciones implements ActionListener {
	
	private FrameAnotaciones fAnotacion;
	
	public controlAnotaciones(FrameAnotaciones fAnotacion) {
		this.fAnotacion = fAnotacion;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(fAnotacion.getBtnBip())) {
			
		}
		
		if(e.getSource().equals(fAnotacion.getBtnAfip())) {
			
		}
		
		if(e.getSource().equals(fAnotacion.getBtnEmail())) {
			
		}
		
		
		
		fAnotacion.limpiarTabla();
		fAnotacion.modeloTabla();

	}

}
