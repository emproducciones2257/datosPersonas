package View;

import javax.swing.*;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import Control.controlAnotaciones;
import Model.anotaciones;
import java.awt.Color;

public class FrameAnotaciones extends JFrame {

	private JPanel contentPane;
	private JButton btnBip, btnAfip, btnEmail;
	private JTable tblDtos;
	private DefaultTableModel aModel;
	private JScrollPane scrollPane;
	private String [] nombreColumnas = {"Nombre","Usuario","Clave"};
	private ArrayList<anotaciones> datos;
	private ventanasAvisos avisos;
	private controlAnotaciones contro;

	 
	public FrameAnotaciones() {
		setResizable(false);
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
		
		avisos = new ventanasAvisos(contentPane);
		
		contro = new controlAnotaciones(this);
		
		btnBip = new JButton("");
		btnBip.setBackground(Color.WHITE);
		btnBip.setIcon(new ImageIcon(FrameAnotaciones.class.getResource("/res/bip.png")));
		btnBip.setBounds(24, 11, 89, 89);
		btnBip.addActionListener(contro);
		contentPane.add(btnBip);
		
		btnAfip = new JButton("afip");
		btnAfip.setBounds(240, 11, 89, 23);
		btnAfip.addActionListener(contro);
		contentPane.add(btnAfip);
		
		btnEmail = new JButton("email");
		btnEmail.setBounds(456, 11, 89, 23);
		btnEmail.addActionListener(contro);
		contentPane.add(btnEmail);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 111, 537, 171);
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

	public ArrayList<anotaciones> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<anotaciones> datos) {
		this.datos = datos;
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
	     }else avisos.ProductoNoReg(ventanasAvisos.NO_HAY_ANOTACIONES_CATEGORIA);
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
