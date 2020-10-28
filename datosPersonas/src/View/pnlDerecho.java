package View;

import java.awt.Color;
import java.awt.List;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Cloud.repositorio;
import Control.controlPnlDerecho;
import Model.constantes;
import Model.dtosPersona;
import Model.indiceUsuarios;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class pnlDerecho extends JPanel{
	
	
	private JComboBox<String> cmbNombres,cmbPatente;
	private JTextField txtNombre,txtApellido,txtDni,txtNTramite,txtCodDni,txtCuil,txtCodArea,txtNumerTel,txtEmail,txtDireccion,txtCP,txtLocalidad,txtIngresoPatente;
	private JButton btnBuscar,btnGuardar,btnAgregarPtente,copiaNombre,copiaApellido,copiaDNI,copiaNTramite,copiaCUIL,copiaNumero,copiaCaracteristica,copiaEmail,copiaCP,copiaLocalidad,copiaPatente,copiaDomicilio;
	private JButton copiaCodigoDNI;
	private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_8,lblNewLabel_7,lblNewLabel_9,lblNewLabel_10,lblNewLabel_11,lblNewLabel_12,lblNewLabel_13;
	private ArrayList<indiceUsuarios> datos;
	private repositorio repo;
	private ArrayList<JButton> btnHabilitar;


	public pnlDerecho() {
		setBorder(new LineBorder(Color.BLACK));
		setBackground(SystemColor.text);
		setBounds(154, 0, 630, 561);
		setLayout(null);
		repo = new repositorio();
		
		iniciarComponentes();	
		cargarComboNombres();			
		cargarArrayBtn();		
	}
	
	private void cargarArrayBtn() {
		
		btnHabilitar = new ArrayList<>();
		btnHabilitar.add(copiaCodigoDNI);
		btnHabilitar.add(copiaCaracteristica);
		btnHabilitar.add(copiaNumero);
		btnHabilitar.add(copiaEmail);
		btnHabilitar.add(copiaDomicilio);
		btnHabilitar.add(copiaCP);
		btnHabilitar.add(copiaLocalidad);
		btnHabilitar.add(copiaPatente);		
	}

	private void iniciarComponentes() {
		cmbNombres = new JComboBox<String>();
		cmbNombres.setBounds(225, 22, 273, 22);
		add(cmbNombres);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new controlPnlDerecho(this));
		btnBuscar.setBounds(508, 22, 112, 23);
		add(btnBuscar);
		
		lblNewLabel = new JLabel("Buscar:");
		lblNewLabel.setBounds(132, 26, 46, 14);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(21, 87, 90, 14);
		add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(21, 112, 141, 20);
		txtNombre.setColumns(10);
		add(txtNombre);
		
		lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(226, 87, 46, 14);
		add(lblNewLabel_2);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(226, 112, 157, 20);
		txtApellido.setColumns(10);
		add(txtApellido);
		
		lblNewLabel_3 = new JLabel("DNI");
		lblNewLabel_3.setBounds(445, 87, 90, 14);
		add(lblNewLabel_3);
		
		txtDni = new JTextField();
		txtDni.setBounds(445, 112, 100, 20);
		txtDni.setColumns(10);
		add(txtDni);
		
		lblNewLabel_4 = new JLabel("N\u00B0 Tramite DNI");
		lblNewLabel_4.setBounds(21, 187, 90, 14);
		add(lblNewLabel_4);
		
		txtNTramite = new JTextField();
		txtNTramite.setBounds(21, 212, 137, 20);
		txtNTramite.setColumns(10);
		add(txtNTramite);
		
		lblNewLabel_5 = new JLabel("Codigo DNI");
		lblNewLabel_5.setBounds(259, 187, 90, 14);
		add(lblNewLabel_5);
		
		txtCodDni = new JTextField();
		txtCodDni.setBounds(259, 212, 86, 20);
		txtCodDni.setColumns(10);
		add(txtCodDni);
		
		lblNewLabel_6 = new JLabel("CUIL");
		lblNewLabel_6.setBounds(445, 187, 46, 14);
		add(lblNewLabel_6);
		
		txtCuil = new JTextField();
		txtCuil.setBounds(445, 212, 86, 20);
		txtCuil.setColumns(10);
		add(txtCuil);
		
		lblNewLabel_7 = new JLabel("Telefono");
		lblNewLabel_7.setBounds(21, 276, 58, 14);
		add(lblNewLabel_7);
		
		txtCodArea = new JTextField();
		txtCodArea.setBounds(21, 308, 58, 20);
		txtCodArea.setColumns(10);
		add(txtCodArea);
		
		lblNewLabel_8 = new JLabel("15");
		lblNewLabel_8.setBounds(140, 311, 18, 14);
		add(lblNewLabel_8);
		
		txtNumerTel = new JTextField();
		txtNumerTel.setBounds(163, 308, 86, 20);
		txtNumerTel.setColumns(10);
		add(txtNumerTel);
		
		lblNewLabel_9 = new JLabel("Email");
		lblNewLabel_9.setBounds(309, 276, 46, 14);
		add(lblNewLabel_9);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(309, 308, 234, 20);
		txtEmail.setColumns(10);
		add(txtEmail);
		
		lblNewLabel_10 = new JLabel("Domicilio");
		lblNewLabel_10.setBounds(21, 382, 58, 14);
		add(lblNewLabel_10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(21, 418, 120, 20);
		txtDireccion.setColumns(10);
		add(txtDireccion);
				
		lblNewLabel_11 = new JLabel("C.P");
		lblNewLabel_11.setBounds(243, 382, 46, 14);
		add(lblNewLabel_11);
		
		txtCP = new JTextField();
		txtCP.setBounds(230, 418, 86, 20);
		txtCP.setColumns(10);
		add(txtCP);
		
		lblNewLabel_12 = new JLabel("Localidad");
		lblNewLabel_12.setBounds(429, 382, 58, 14);
		add(lblNewLabel_12);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setBounds(429, 418, 86, 20);
		txtLocalidad.setColumns(10);
		add(txtLocalidad);
				
		lblNewLabel_13 = new JLabel("Patente");
		lblNewLabel_13.setBounds(21, 465, 46, 14);
		add(lblNewLabel_13);
		
		cmbPatente = new JComboBox();
		cmbPatente.setBounds(21, 493, 100, 22);
		add(cmbPatente);
		
		btnGuardar = new JButton("Guardar Datos");
		btnGuardar.setBounds(492, 527, 128, 23);
		btnGuardar.addActionListener(new controlPnlDerecho(this));
		btnGuardar.setVisible(false);
		add(btnGuardar);	
		
		copiaNombre = new JButton("");
		copiaNombre.setBackground(SystemColor.text);
		copiaNombre.setForeground(Color.WHITE);
		copiaNombre.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaNombre.setBounds(168, 97, 40, 40);
		add(copiaNombre);
		
		copiaApellido = new JButton("");
		copiaApellido.setBackground(SystemColor.text);
		copiaApellido.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaApellido.setBounds(393, 97, 40, 40);
		add(copiaApellido);
		
		copiaDNI = new JButton("");
		copiaDNI.setBackground(SystemColor.text);
		copiaDNI.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaDNI.setBounds(555, 97, 40, 40);
		add(copiaDNI);
		
		copiaNTramite = new JButton("");
		copiaNTramite.setBackground(SystemColor.text);
		copiaNTramite.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaNTramite.setBounds(168, 192, 40, 40);
		add(copiaNTramite);
		
		copiaCodigoDNI = new JButton("");
		copiaCodigoDNI.setBackground(SystemColor.text);
		copiaCodigoDNI.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaCodigoDNI.setBounds(359, 192, 40, 40);
		add(copiaCodigoDNI);
		
		copiaCUIL = new JButton("");
		copiaCUIL.setBackground(SystemColor.text);
		copiaCUIL.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaCUIL.setBounds(542, 192, 40, 40);
		add(copiaCUIL);
		
		copiaNumero = new JButton("");
		copiaNumero.setBackground(SystemColor.text);
		copiaNumero.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaNumero.setBounds(259, 288, 40, 40);
		add(copiaNumero);
		
		copiaCaracteristica = new JButton("");
		copiaCaracteristica.setBackground(SystemColor.text);
		copiaCaracteristica.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaCaracteristica.setBounds(89, 288, 40, 40);
		add(copiaCaracteristica);
		
		copiaEmail = new JButton("");
		copiaEmail.setBackground(SystemColor.text);
		copiaEmail.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaEmail.setBounds(553, 288, 40, 40);
		add(copiaEmail);
		
		copiaCP = new JButton("");
		copiaCP.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaCP.setBackground(Color.WHITE);
		copiaCP.setBounds(326, 398, 40, 40);
		add(copiaCP);
		
		copiaLocalidad = new JButton("");
		copiaLocalidad.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaLocalidad.setBackground(Color.WHITE);
		copiaLocalidad.setBounds(526, 398, 40, 40);
		add(copiaLocalidad);
		
		copiaPatente = new JButton("");
		copiaPatente.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaPatente.setBackground(Color.WHITE);
		copiaPatente.setBounds(132, 475, 40, 40);
		add(copiaPatente);
		
		copiaDomicilio = new JButton("");
		copiaDomicilio.setIcon(new ImageIcon(pnlDerecho.class.getResource(constantes.ICON)));
		copiaDomicilio.setBackground(Color.WHITE);
		copiaDomicilio.setBounds(151, 398, 40, 40);
		add(copiaDomicilio);
		
		btnAgregarPtente = new JButton("AGREGAR");
		btnAgregarPtente.addActionListener(new controlPnlDerecho(this));
		btnAgregarPtente.setVisible(false);
		btnAgregarPtente.setBounds(309, 493, 161, 23);
		add(btnAgregarPtente);
		
		txtIngresoPatente = new JTextField();
		txtIngresoPatente.setVisible(false);
		txtIngresoPatente.setBounds(203, 494, 86, 20);
		add(txtIngresoPatente);
		txtIngresoPatente.setColumns(10);
		
	}
	
	private void cargarComboNombres() {
		datos = repo.getDtos();
		
		for (int i = 0; i < datos.size(); i++) {
			cmbNombres.addItem(datos.get(i).toString());
		}		
	}

	public indiceUsuarios getElementoSeleccionado() {
		return datos.get(cmbNombres.getSelectedIndex());
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public JTextField getTxtDni() {
		return txtDni;
	}

	public JTextField getTxtNTramite() {
		return txtNTramite;
	}

	public JTextField getTxtCodDni() {
		return txtCodDni;
	}

	public JTextField getTxtCuil() {
		return txtCuil;
	}

	public JTextField getTxtCodArea() {
		return txtCodArea;
	}

	public JTextField getTxtNumerTel() {
		return txtNumerTel;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public JTextField getTxtCP() {
		return txtCP;
	}

	public JTextField getTxtLocalidad() {
		return txtLocalidad;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getCopiaNombre() {
		return copiaNombre;
	}

	public JButton getCopiaApellido() {
		return copiaApellido;
	}

	public JButton getCopiaDNI() {
		return copiaCodigoDNI;
	}

	public JButton getCopiaNTramite() {
		return copiaNTramite;
	}

	public JButton getCopiaCUIL() {
		return copiaCUIL;
	}

	public JButton getCopiaNumero() {
		return copiaNumero;
	}

	public JButton getCopiaCaracteristica() {
		return copiaCaracteristica;
	}

	public JButton getCopiaEmail() {
		return copiaEmail;
	}

	public JButton getCopiaCP() {
		return copiaCP;
	}

	public JButton getCopiaLocalidad() {
		return copiaLocalidad;
	}

	public JButton getCopiaPatente() {
		return copiaPatente;
	}

	public JButton getCopiaDomicilio() {
		return copiaDomicilio;
	}

	public JTextField getTxtIngresoPatente() {
		return txtIngresoPatente;
	}

	public JButton getBtnAgregarPtente() {
		return btnAgregarPtente;
	}

	public void mostrarDtosPersona(dtosPersona persona) {
		
		habilitarBtnPortapapeles();
		
		txtNombre.setText(persona.getNombre().toUpperCase());
		txtApellido.setText(persona.getApellido().toUpperCase());
		txtDni.setText(persona.getDni().toUpperCase());
		txtNTramite.setText(persona.getNroTramite());
		txtCuil.setText(persona.getCuil());
		txtCodDni.setText(persona.getCodDni());
		txtCodArea.setText(persona.getCodArea());
		txtNumerTel.setText(persona.getNumeroTel());
		txtEmail.setText(persona.getEmail());
		txtDireccion.setText(persona.getDomicilio());
		txtCP.setText(persona.getCp());
		txtLocalidad.setText(persona.getLocalidad());
		
		if(persona.getPatentes().isEmpty()) {
			copiaPatente.setEnabled(false);
			cmbPatente.addItem("-");
		}else {
			for (String patente : persona.getPatentes()) {
				cmbPatente.addItem(patente);
			}
		}
		
		if(persona.getCodDni().equals("-")) copiaCodigoDNI.setEnabled(false);		
		
		if(persona.getCodArea().equals("-")) copiaCaracteristica.setEnabled(false);
				
		if(persona.getNumeroTel().equals("-")) copiaNumero.setEnabled(false);
		
		if(persona.getEmail().equals("-")) copiaEmail.setEnabled(false);
				
		if(persona.getDomicilio().equals("-")) copiaDomicilio.setEnabled(false);
				
		if(persona.getCp().equals("-")) copiaCP.setEnabled(false);
			
		if(persona.getLocalidad().equals("-")) copiaLocalidad.setEnabled(false);
		
	}
	
	public void agregarPatenteCmb(String patente) {
		cmbPatente.addItem(patente);
		txtIngresoPatente.setText("");
	}

	public void habilitarBtnPortapapeles() {
		for (JButton botoncito : btnHabilitar) {
			botoncito.setEnabled(true);
		}
	}

	public void limpiarVistas() {
		
		txtNombre.setText("");
		txtApellido.setText("");
		txtDni.setText("");
		txtNTramite.setText("");
		txtCuil.setText("");
		txtCodDni.setText("");
		txtCodArea.setText("");
		txtNumerTel.setText("");
		txtEmail.setText("");
		txtDireccion.setText("");
		txtCP.setText("");
		txtLocalidad.setText("");
		cmbPatente.removeAllItems();
	}

	public void habilitarOpciones(Boolean estado) {
		btnGuardar.setVisible(estado);
		btnAgregarPtente.setVisible(estado);
		txtIngresoPatente.setVisible(estado);		
	}

	public boolean validarCamposNulos() {
		
		if(txtNombre.getText().equals("") ||
				txtApellido.getText().equals("") ||
				txtDni.getText().equals("") ||
				txtNTramite.getText().equals("") ||
				txtCuil.getText().equals(""))return false;
		else return true;
		
	}

	public dtosPersona obtenerUsuario() {
		
		dtosPersona chango = new dtosPersona();
		
		chango.setNombre(txtNombre.getText().toLowerCase());
		chango.setApellido(txtApellido.getText().toLowerCase());
		chango.setDni(txtDni.getText());
		chango.setNroTramite(txtNTramite.getText());
		chango.setCuil(txtCuil.getText());
		
		if (txtCodDni.getText().equals("")) chango.setCodDni(constantes.DATO_NULO);
		else chango.setCodDni(txtCodDni.getText());
		
		if(txtCodArea.getText().equals("") || txtNumerTel.getText().equals("")) {
			chango.setCodArea(constantes.DATO_NULO);
			chango.setNumeroTel(constantes.DATO_NULO);
		}else {
			chango.setCodArea(txtCodArea.getText());
			chango.setNumeroTel(txtNumerTel.getText());
		}
		
		if (txtDireccion.getText().equals("")) chango.setDomicilio(constantes.DATO_NULO);
		else chango.setDomicilio(txtDireccion.getText());
		
		if (txtEmail.getText().equals("")) chango.setEmail(constantes.DATO_NULO);
		else chango.setEmail(txtEmail.getText());
		
		if (txtCP.getText().equals("")) chango.setCp(constantes.DATO_NULO);
		else chango.setCp(txtCP.getText());
		
		if (txtLocalidad.getText().equals("")) chango.setLocalidad(constantes.DATO_NULO);
		else chango.setLocalidad(txtLocalidad.getText());
		
		if(cmbPatente.getItemCount()==0) chango.setPatentes(new ArrayList<String>());
		else {
			ArrayList<String> patentes = new ArrayList<>();
			for (int i = 0; i < cmbPatente.getItemCount(); i++) {
				patentes.add(cmbPatente.getItemAt(i));
			}
			chango.setPatentes(patentes);			
		}
		
		return chango;
	}
}
