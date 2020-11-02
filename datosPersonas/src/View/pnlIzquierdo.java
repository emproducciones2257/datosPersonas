package View;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import Control.controlPnlIzquierdo;
import javax.swing.*;

public class pnlIzquierdo extends JPanel{
	
	private JButton btnCargaTeclado,btnCargaCuil,btnCargaScan,btnAnotaciones;
	private JLabel lblNewLabel;
	private pnlDerecho pnlDerecho;
	
	public pnlIzquierdo(pnlDerecho pnlDerecho) {
		setBorder(new LineBorder(Color.BLACK));
		setBackground(SystemColor.textHighlight);
		setBounds(0, 0, 164, 561);
		setLayout(null);
		this.pnlDerecho = pnlDerecho;
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		
		btnCargaTeclado = new JButton("");
		btnCargaTeclado.setBackground(SystemColor.textHighlight);
		btnCargaTeclado.setIcon(new ImageIcon(pnlIzquierdo.class.getResource("/res/keyboard_100px.png")));
		btnCargaTeclado.setBounds(36, 36, 79, 74);
		btnCargaTeclado.addActionListener(new controlPnlIzquierdo(this,pnlDerecho));
		add(btnCargaTeclado);
		
		btnCargaCuil = new JButton("");
		btnCargaCuil.setBackground(SystemColor.textHighlight);
		btnCargaCuil.setIcon(new ImageIcon(pnlIzquierdo.class.getResource("/res/internet_64px.png")));
		btnCargaCuil.setBounds(36, 253, 79, 74);
		btnCargaCuil.addActionListener(new controlPnlIzquierdo(this,pnlDerecho));
		add(btnCargaCuil);
		
		btnCargaScan = new JButton("");
		btnCargaScan.setBackground(SystemColor.textHighlight);
		btnCargaScan.setIcon(new ImageIcon(pnlIzquierdo.class.getResource("/res/barcode_reader_64px.png")));
		btnCargaScan.setBounds(36, 144, 79, 74);
		btnCargaScan.addActionListener(new controlPnlIzquierdo(this,pnlDerecho));
		add(btnCargaScan);
		
		btnAnotaciones = new JButton("");
		btnAnotaciones.setBackground(SystemColor.textHighlight);
		btnAnotaciones.setIcon(new ImageIcon(pnlIzquierdo.class.getResource("/res/edit_property_40px.png")));
		btnAnotaciones.setBounds(36, 424, 97, 83);
		btnAnotaciones.addActionListener(new controlPnlIzquierdo(this,pnlDerecho));
		add(btnAnotaciones);
		
		lblNewLabel = new JLabel("REGISTRAR USUARIO");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(21, 11, 133, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ANOTACIONES");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(36, 384, 97, 14);
		add(lblNewLabel_1);		
	}

	public JButton getBtnCargaTeclado() {
		return btnCargaTeclado;
	}

	public JButton getBtnCargaCuil() {
		return btnCargaCuil;
	}

	public JButton getBtnCargaScan() {
		return btnCargaScan;
	}
	
	public JButton getBtnAnotaciones() {
		return btnAnotaciones;
	}
}
