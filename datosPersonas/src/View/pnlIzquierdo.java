package View;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import Control.controlPnlIzquierdo;
import javax.swing.*;

public class pnlIzquierdo extends JPanel{
	
	private JButton btnCargaTeclado,btnCargaCuil,btnCargaScan;
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
		btnCargaCuil.setBounds(36, 252, 79, 74);
		btnCargaCuil.addActionListener(new controlPnlIzquierdo(this,pnlDerecho));
		add(btnCargaCuil);
		
		btnCargaScan = new JButton("");
		btnCargaScan.setBackground(SystemColor.textHighlight);
		btnCargaScan.setIcon(new ImageIcon(pnlIzquierdo.class.getResource("/res/barcode_reader_64px.png")));
		btnCargaScan.setBounds(36, 144, 79, 74);
		btnCargaScan.addActionListener(new controlPnlIzquierdo(this,pnlDerecho));
		add(btnCargaScan);
		
		lblNewLabel = new JLabel("REGISTRAR USUARIO");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(21, 11, 133, 14);
		add(lblNewLabel);
		
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
}
