package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelSuperman extends JPanel {
	private JTextArea campoRaza;
	private JTextArea campoEat;
	private JTextArea campoDefender;

	public PanelSuperman() {
		setLayout(new GridLayout(1, 3));// Se crea una matriz 3x3 con un
		// espaciado tanto horizontal
		// como vertical.
		llenarPanel();
		TitledBorder border = BorderFactory
				.createTitledBorder("Datos Superman");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		setVisible(true);
	}

	private void llenarPanel() {
		campoEat = new JTextArea();
		campoEat.setLineWrap(true);
		campoEat.setFont(new java.awt.Font("Arial", 1, 12));
		campoEat.setWrapStyleWord(true);
		add(campoEat);
		campoRaza = new JTextArea();
		campoRaza.setLineWrap(true);
		campoRaza.setFont(new java.awt.Font("Arial", 1, 12));
		campoRaza.setWrapStyleWord(true);
		add(campoRaza);
		campoDefender = new JTextArea();
		campoDefender.setLineWrap(true);
		campoDefender.setFont(new java.awt.Font("Arial", 1, 12));
		campoDefender.setWrapStyleWord(true);
		add(campoDefender);
	}

	public JTextArea getCampoRaza() {
		return campoRaza;
	}

	public void setCampoRaza(JTextArea campoRaza) {
		this.campoRaza = campoRaza;
	}

	public JTextArea getCampoEat() {
		return campoEat;
	}

	public void setCampoEat(JTextArea campoEat) {
		this.campoEat = campoEat;
	}

	public JTextArea getCampoDefender() {
		return campoDefender;
	}

	public void setCampoDefender(JTextArea campoDefender) {
		this.campoDefender = campoDefender;
	}
	
}
