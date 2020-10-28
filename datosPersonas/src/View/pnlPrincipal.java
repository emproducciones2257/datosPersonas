package View;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class pnlPrincipal extends JFrame{
	
	private pnlIzquierdo pnlIzquierdo;
	private pnlDerecho pnlDerecho;
	
	public pnlPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		
		pnlDerecho = new pnlDerecho();
		pnlIzquierdo = new pnlIzquierdo(pnlDerecho);
		
		
		getContentPane().add(pnlIzquierdo);
		getContentPane().add(pnlDerecho);
		
	}
}
