package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelSeaplane extends JPanel {
	private JTextArea campoPasajeros;
	private JTextArea campoFly;
	private JTextArea campoTakeOff;

	public PanelSeaplane() {
		setLayout(new GridLayout(1, 3));// Se crea una matriz 3x3 con un
		// espaciado tanto horizontal
		// como vertical.
		llenarPanel();
		TitledBorder border = BorderFactory.createTitledBorder("Datos SeaPlane");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		setVisible(true);
	}

	private void llenarPanel() {
		campoFly = new JTextArea();
		campoFly.setLineWrap(true);
		campoFly.setFont(new java.awt.Font("Arial", 1, 12));
		campoFly.setWrapStyleWord(true);
		add(campoFly);
		campoPasajeros = new JTextArea();
		campoPasajeros.setLineWrap(true);
		campoPasajeros.setFont(new java.awt.Font("Arial", 1, 12));
		campoPasajeros.setWrapStyleWord(true);
		add(campoPasajeros);
		campoTakeOff = new JTextArea();
		campoTakeOff.setLineWrap(true);
		campoTakeOff.setFont(new java.awt.Font("Arial", 1, 12));
		campoTakeOff.setWrapStyleWord(true);
		add(campoTakeOff);
	}

	public JTextArea getCampoPasajeros() {
		return campoPasajeros;
	}

	public void setCampoPasajeros(JTextArea campoPasajeros) {
		this.campoPasajeros = campoPasajeros;
	}

	public JTextArea getCampoFly() {
		return campoFly;
	}

	public void setCampoFly(JTextArea campoFly) {
		this.campoFly = campoFly;
	}

	public JTextArea getCampoTakeOff() {
		return campoTakeOff;
	}

	public void setCampoTakeOff(JTextArea campoTakeOff) {
		this.campoTakeOff = campoTakeOff;
	}

}
