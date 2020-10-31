package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;


public class pnlPrincipal extends JFrame{
	
	private pnlIzquierdo pnlIzquierdo;
	private pnlDerecho pnlDerecho;
	
	public pnlPrincipal() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(pnlPrincipal.class.getResource("/res/cloud_database_64px.png")));
		setTitle("Banco de Datos - EMProducciones");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		
		pnlDerecho = new pnlDerecho();
		pnlIzquierdo = new pnlIzquierdo(pnlDerecho);
		
		
		getContentPane().add(pnlIzquierdo);
		getContentPane().add(pnlDerecho);
		
	}
}
