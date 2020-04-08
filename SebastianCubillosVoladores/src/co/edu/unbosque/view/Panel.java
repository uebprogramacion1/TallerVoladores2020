package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panel extends JPanel{
	
	public JLabel etiquetaSuperman;
	public JLabel etiquetaBird;
	public JLabel etiquetaHelicpter;
	public JLabel etiquetaSeaPlane;
	public JTextArea campoSuperman;
	public JTextArea campoBird;
	public JTextArea campoHelicopter;
	public JTextArea campoSeaPlane;
	public JButton botonMostrar;
	
	public Panel() {
		setLayout(null);
		setBackground(Color.GRAY);
		
		inicializar();
	}
	public void inicializar() {
		etiquetaSuperman = new JLabel("Superman: ");
		etiquetaSuperman.setBounds(5, 5, 100, 20);
		add(etiquetaSuperman);
		
		campoSuperman = new JTextArea("");
		campoSuperman.setBounds(80, 5, 360, 100);
		add(campoSuperman);
		
		etiquetaBird = new JLabel("Ave: ");
		etiquetaBird.setBounds(5, 110, 100, 20);
		add(etiquetaBird);
		
		campoBird = new JTextArea("");
		campoBird.setBounds(80, 110, 360, 100);
		add(campoBird);
		
		etiquetaHelicpter = new JLabel("Helicptero: ");
		etiquetaHelicpter.setBounds(5, 215, 100, 20);
		add(etiquetaHelicpter);
		
		campoHelicopter = new JTextArea("");
		campoHelicopter.setBounds(80, 215, 360, 100);
		add(campoHelicopter);
		
		etiquetaSeaPlane = new JLabel("Hidroavion: ");
		etiquetaSeaPlane.setBounds(5, 320, 100, 20);
		add(etiquetaSeaPlane);
		
		campoSeaPlane = new JTextArea("");
		campoSeaPlane.setBounds(80, 320, 360, 100);
		add(campoSeaPlane);
		
		botonMostrar = new JButton("Mostrar");
		botonMostrar.setBounds(190, 435, 100, 20);
		add(botonMostrar);
	}
	public JLabel getEtiquetaSuperman() {
		return etiquetaSuperman;
	}
	public void setEtiquetaSuperman(JLabel etiquetaSuperman) {
		this.etiquetaSuperman = etiquetaSuperman;
	}
	public JLabel getEtiquetaBird() {
		return etiquetaBird;
	}
	public void setEtiquetaBird(JLabel etiquetaBird) {
		this.etiquetaBird = etiquetaBird;
	}
	public JLabel getEtiquetaHelicpter() {
		return etiquetaHelicpter;
	}
	public void setEtiquetaHelicpter(JLabel etiquetaHelicpter) {
		this.etiquetaHelicpter = etiquetaHelicpter;
	}
	public JLabel getEtiquetaSeaPlane() {
		return etiquetaSeaPlane;
	}
	public void setEtiquetaSeaPlane(JLabel etiquetaSeaPlane) {
		this.etiquetaSeaPlane = etiquetaSeaPlane;
	}
	public JTextArea getCampoSuperman() {
		return campoSuperman;
	}
	public void setCampoSuperman(JTextArea campoSuperman) {
		this.campoSuperman = campoSuperman;
	}
	public JTextArea getCampoBird() {
		return campoBird;
	}
	public void setCampoBird(JTextArea campoBird) {
		this.campoBird = campoBird;
	}
	public JTextArea getCampoHelicopter() {
		return campoHelicopter;
	}
	public void setCampoHelicopter(JTextArea campoHelicopter) {
		this.campoHelicopter = campoHelicopter;
	}
	public JTextArea getCampoSeaPlane() {
		return campoSeaPlane;
	}
	public void setCampoSeaPlane(JTextArea campoSeaPlane) {
		this.campoSeaPlane = campoSeaPlane;
	}
	public JButton getBotonMostrar() {
		return botonMostrar;
	}
	public void setBotonMostrar(JButton botonMostrar) {
		this.botonMostrar = botonMostrar;
	}
	

}
