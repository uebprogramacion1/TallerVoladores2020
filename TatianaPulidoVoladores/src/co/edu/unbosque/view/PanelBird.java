package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelBird extends JPanel {
	private JTextArea campoRaza;
	private JTextArea campoEat;
	private JTextArea campoVuelo;

	public PanelBird() {
		setLayout(new GridLayout(1, 3));// Se crea una matriz 3x3 con un
		// espaciado tanto horizontal
		// como vertical.
		llenarPanel();
		TitledBorder border = BorderFactory.createTitledBorder("Datos Bird");
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
		campoVuelo = new JTextArea();
		campoVuelo.setLineWrap(true);
		campoVuelo.setFont(new java.awt.Font("Arial", 1, 12));
		campoVuelo.setWrapStyleWord(true);
		add(campoVuelo);
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

	public JTextArea getCampoVuelo() {
		return campoVuelo;
	}

	public void setCampoVuelo(JTextArea campoVuelo) {
		this.campoVuelo = campoVuelo;
	}

	
}
