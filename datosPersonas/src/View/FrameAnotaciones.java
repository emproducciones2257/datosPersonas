package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Control.controlAnotaciones;
import Model.anotaciones;

public class FrameAnotaciones extends JFrame {

	private JPanel contentPane;
	private JButton btnBip, btnAfip, btnEmail;
	private JTable tblDtos;
	private DefaultTableModel aModel;
	private JScrollPane scrollPane;
	private String [] nombreColumnas = {"Nombre","Usuario","Clave"};
	private ArrayList<anotaciones> datos;

	 
	public FrameAnotaciones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameAnotaciones.class.getResource("/res/edit_property_40px.png")));
		setTitle("Anotaciones");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new LineBorder(SystemColor.windowText));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		datos = new ArrayList<>();
		
		btnBip = new JButton("bip");
		btnBip.setBounds(24, 11, 89, 23);
		btnBip.addActionListener(new controlAnotaciones(this));
		contentPane.add(btnBip);
		
		btnAfip = new JButton("afip");
		btnAfip.setBounds(240, 11, 89, 23);
		contentPane.add(btnAfip);
		
		btnEmail = new JButton("email");
		btnEmail.setBounds(456, 11, 89, 23);
		contentPane.add(btnEmail);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 75, 537, 171);
		contentPane.add(scrollPane);
					
		tblDtos = new JTable();
		tblDtos.setFillsViewportHeight(true);
		
		scrollPane.setViewportView(tblDtos);
	}
	
	public JButton getBtnBip() {
		return btnBip;
	}
	
	public JButton getBtnAfip() {
		return btnAfip;
	}

	public JButton getBtnEmail() {
		return btnEmail;
	}

	public void cargarArchivo(ArrayList<anotaciones> datos) {
		
		for (anotaciones anotaciones : datos) {
			this.datos=datos;
		}		
	}
	
	public void modeloTabla() {
		
		Object O[]=null;
		 aModel = new DefaultTableModel();
		 aModel = (DefaultTableModel) tblDtos.getModel();
	     aModel.setColumnIdentifiers(nombreColumnas);
	     
	     if(!datos.isEmpty()) {
	    	 for (int i = 0; i < datos.size(); i++) {
	    		 aModel.addRow(O);
	    		 aModel.setValueAt(datos.get(i).getNombre(), i, 0);
	    		 aModel.setValueAt(datos.get(i).getUser(), i, 1);
	    		 aModel.setValueAt(datos.get(i).getPasw(), i, 2); 
			}
	     }
	     tblDtos.setModel(aModel);
	}
	
	public void limpiarTabla() {
		
		if(aModel!=null) {
			int a = aModel.getRowCount()-1;
			for(int i=a; i>=0;i--){
				aModel.removeRow(i);
			}
		}	
	}
}
