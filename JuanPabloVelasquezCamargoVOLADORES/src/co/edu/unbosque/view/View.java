package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelInteraccion panelInteraccion;
	private PanelMostrar panelMostrar;
	private Color colorAzul = new Color(22, 103, 179);
	private Color colorNegroMate = new Color(35,35,35);

	public View() {

		setTitle("Salon de la Justicia");
		setSize(700, 710);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(colorNegroMate);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void inicializarComponentes() {

		panelInteraccion = new PanelInteraccion();
		panelInteraccion.setBounds(16, 16, 662, 185);
		getContentPane().add(panelInteraccion);
		panelInteraccion.setBackground(colorAzul);

		panelMostrar = new PanelMostrar();
		panelMostrar.setBounds(16, 213, 662, 442);
		getContentPane().add(panelMostrar);
		panelMostrar.setBackground(colorAzul);

	}

	public PanelInteraccion getPanelInteraccion() {
		return panelInteraccion;
	}

	public void setPanelInteraccion(PanelInteraccion panelInteraccion) {
		this.panelInteraccion = panelInteraccion;
	}

	public PanelMostrar getPanelMostrar() {
		return panelMostrar;
	}

	public void setPanelMostrar(PanelMostrar panelMostrar) {
		this.panelMostrar = panelMostrar;
	}

	public Color getColorAzul() {
		return colorAzul;
	}

	public void setColorAzul(Color colorAzul) {
		this.colorAzul = colorAzul;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
