package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel_ingreso extends JPanel {
	
	public JLabel etiqueta_accion;
	
	public JButton validar;
	public JTextArea descripcion_accion;
	
	public Panel_ingreso() {
		setLayout(null);
		setBackground(Color.red);
		
		inicializarComponentes();
		
		
	}
	
	public void inicializarComponentes() {
		etiqueta_accion = new JLabel("Accion");
		etiqueta_accion.setBounds(50, 25, 100, 25);
		etiqueta_accion.setBackground(Color.white);
		add(etiqueta_accion);
		
		validar = new JButton("Validar");
		validar.setBounds(275, 25, 150, 25);
		validar.setBackground(Color.red);
		validar.setForeground(Color.BLACK);
		add(validar);
		
		descripcion_accion = new JTextArea();
		descripcion_accion.setBounds(50, 100, 350, 400);
		descripcion_accion.setEnabled(true);
		add(descripcion_accion);
		
		
		
	}
	
	
	

}
