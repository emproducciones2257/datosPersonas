package View;

import javax.swing.*;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Enumeration;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import Control.controlAnotaciones;
import Model.anotaciones;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class FrameAnotaciones extends JFrame {

	private JPanel contentPane,pnlIngresoAnotaciones;
	private JButton btnBip, btnAfip, btnEmail, btnRegistrar;
	private JTable tblDtos;
	private DefaultTableModel aModel;
	private JScrollPane scrollPane;
	private String [] nombreColumnas = {"Nombre","Usuario","Clave"};
	private ArrayList<anotaciones> datos;
	private ventanasAvisos avisos;
	private controlAnotaciones contro;
	private ButtonGroup buttonGroup;
	private JRadioButton rdBtnBip,rdBtnAfip,rdBtnEmail;
	private JTextField txtNombre,txtUser,txtPasw;
	private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2;

	
	public FrameAnotaciones() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameAnotaciones.class.getResource("/res/edit_property_40px.png")));
		setTitle("Anotaciones");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 590, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new LineBorder(SystemColor.windowText));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		datos = new ArrayList<>();
		
		avisos = new ventanasAvisos(contentPane);
		
		contro = new controlAnotaciones(this);
		
		buttonGroup = new ButtonGroup();
		
		btnBip = new JButton("");
		btnBip.setBackground(Color.WHITE);
		btnBip.setIcon(new ImageIcon(FrameAnotaciones.class.getResource("/res/bip.png")));
		btnBip.setBounds(10, 11, 89, 89);
		btnBip.addActionListener(contro);
		contentPane.add(btnBip);
		
		btnAfip = new JButton("");
		btnAfip.setIcon(new ImageIcon(FrameAnotaciones.class.getResource("/res/afip.png")));
		btnAfip.setBounds(240, 11, 89, 89);
		btnAfip.addActionListener(contro);
		contentPane.add(btnAfip);
		
		btnEmail = new JButton("");
		btnEmail.setBackground(Color.WHITE);
		btnEmail.setIcon(new ImageIcon(FrameAnotaciones.class.getResource("/res/icons8_email_64.png")));
		btnEmail.setBounds(480, 11, 89, 89);
		btnEmail.addActionListener(contro);
		contentPane.add(btnEmail);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 559, 171);
		contentPane.add(scrollPane);
					
		tblDtos = new JTable();
		tblDtos.setFillsViewportHeight(true);
		
		scrollPane.setViewportView(tblDtos);
		
		pnlIngresoAnotaciones = new JPanel();
		pnlIngresoAnotaciones.setBackground(SystemColor.menu);
		pnlIngresoAnotaciones.setBorder(new TitledBorder(null, "Agregar - Editar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlIngresoAnotaciones.setBounds(10, 293, 559, 143);
		contentPane.add(pnlIngresoAnotaciones);
		pnlIngresoAnotaciones.setLayout(null);
		
		rdBtnBip = new JRadioButton("Bip");
		rdBtnBip.setBounds(6, 16, 109, 23);
		pnlIngresoAnotaciones.add(rdBtnBip);
		buttonGroup.add(rdBtnBip);
		
		rdBtnAfip = new JRadioButton("Afip");
		rdBtnAfip.setBounds(222, 16, 109, 23);
		pnlIngresoAnotaciones.add(rdBtnAfip);
		buttonGroup.add(rdBtnAfip);
		
		rdBtnEmail = new JRadioButton("Email");
		rdBtnEmail.setBounds(444, 16, 109, 23);
		pnlIngresoAnotaciones.add(rdBtnEmail);
		buttonGroup.add(rdBtnEmail);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(6, 56, 46, 14);
		pnlIngresoAnotaciones.add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(6, 81, 86, 20);
		pnlIngresoAnotaciones.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(222, 56, 46, 14);
		pnlIngresoAnotaciones.add(lblNewLabel_1);
		
		txtUser = new JTextField();
		txtUser.setBounds(222, 81, 86, 20);
		pnlIngresoAnotaciones.add(txtUser);
		txtUser.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Clave");
		lblNewLabel_2.setBounds(444, 56, 46, 14);
		pnlIngresoAnotaciones.add(lblNewLabel_2);
		
		txtPasw = new JTextField();
		txtPasw.setBounds(444, 81, 86, 20);
		pnlIngresoAnotaciones.add(txtPasw);
		txtPasw.setColumns(10);
		
		btnRegistrar = new JButton("Guardar");
		btnRegistrar.setBounds(464, 114, 89, 23);
		btnRegistrar.addActionListener(contro);
		pnlIngresoAnotaciones.add(btnRegistrar);
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
	
	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
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
	
	public String btnSeleccionado() {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

	public anotaciones obtenerAnotacion() {
		if(validarVacios()) 
			return new anotaciones(txtNombre.getText(),
					txtUser.getText(),txtPasw.getText(), btnSeleccionado());
		else return null;	
	}

	private boolean validarVacios() {
		if(txtNombre.getText().equals("") ||
				txtPasw.getText().equals("") ||
				txtUser.getText().equals(""))return false;
		else return true;
	}
}
