package View;


import java.awt.EventQueue;
import javax.swing.JFrame;


public class frameIni extends JFrame {
	public frameIni() {
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pnlPrincipal frame = new pnlPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
