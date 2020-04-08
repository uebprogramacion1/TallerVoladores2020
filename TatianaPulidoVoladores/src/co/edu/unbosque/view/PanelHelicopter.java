package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelHelicopter extends JPanel {

	private JTextArea campoPasajeros;
	private JTextArea campoTanquear;
	private JTextArea campoTakeOff;

	public PanelHelicopter() {
		setLayout(new GridLayout(1, 3));// Se crea una matriz 3x3 con un
		// espaciado tanto horizontal
		// como vertical.
		llenarPanel();
		TitledBorder border = BorderFactory
				.createTitledBorder("Datos Helicopter");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		setVisible(true);
	}

	private void llenarPanel() {
		campoTanquear = new JTextArea();
		campoTanquear.setLineWrap(true);
		campoTanquear.setFont(new java.awt.Font("Arial", 1, 12));
		campoTanquear.setWrapStyleWord(true);
		add(campoTanquear);
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

	public JTextArea getCampoTanquear() {
		return campoTanquear;
	}

	public void setCampoTanquear(JTextArea campoTanquear) {
		this.campoTanquear = campoTanquear;
	}

	public JTextArea getCampoTakeOff() {
		return campoTakeOff;
	}

	public void setCampoTakeOff(JTextArea campoTakeOff) {
		this.campoTakeOff = campoTakeOff;
	}

}
