package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import co.edu.unbosque.controller.Controller;

import java.awt.*;
import java.io.IOException;

/**
 * @author Gabriel Blanco
 * Clase para definir la ventana principal
 */
public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private Dialogos dialogos = new Dialogos();
	private PanelFuncionesSuperiores toolbar = new PanelFuncionesSuperiores();
	private PanelPestanas pestanas = new PanelPestanas();
	/**
	 * Método para iniciar la ventana principal
	 * @author Gabriel Blanco
	 * @param control
	 */
	public void iniciar(Controller control) {
		cargar();
		addComponentes();
		escucharComponentes(control);
	}
	/**
	 * Método para cargar la configuración de la ventana principal
	 * @author Gabriel Blanco
	 */
	public void cargar() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setTitle("Polimorfismo");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setVisible(true);
	}
	
	/**
	 * Método para añadir los componentes de la ventana principal
	 * @author Gabriel Blanco
	 */
	public void addComponentes() {
		//TODO: Añadir aquí los componentes
		//add(toolbar, BorderLayout.NORTH);
		add(pestanas, BorderLayout.CENTER);
	}
	
	/**
	 * Método para escuchar los componentes donde <pre>Controller</pre> va a manejar todas
	 * estas excepciones.
	 * @author Gabriel Blanco
	 * @param control
	 */
	public void escucharComponentes(Controller control) {
		/*
		 * SeaPlane
		 */
		pestanas.getSeaplane().getFunciones().getStartEngine().addActionListener(control);
		pestanas.getSeaplane().getFunciones().getStopEngine().addActionListener(control);
		pestanas.getSeaplane().getFunciones().getTakeOff().addActionListener(control);
		pestanas.getSeaplane().getFunciones().getFly().addActionListener(control);
		pestanas.getSeaplane().getFunciones().getLand().addActionListener(control);
		pestanas.getSeaplane().getFunciones().getClean().addActionListener(control);
		/*
		 * Helicopter
		 */
		pestanas.getHelicoptero().getFunciones().getStartEngine().addActionListener(control);
		pestanas.getHelicoptero().getFunciones().getStopEngine().addActionListener(control);
		pestanas.getHelicoptero().getFunciones().getTakeOff().addActionListener(control);
		pestanas.getHelicoptero().getFunciones().getFly().addActionListener(control);
		pestanas.getHelicoptero().getFunciones().getLand().addActionListener(control);
		pestanas.getHelicoptero().getFunciones().getClean().addActionListener(control);
		/*
		 * Bird
		 */
		pestanas.getBird().getFunciones().getTakeOff().addActionListener(control);
		pestanas.getBird().getFunciones().getFly().addActionListener(control);
		pestanas.getBird().getFunciones().getLand().addActionListener(control);
		pestanas.getBird().getFunciones().getLayEggs().addActionListener(control);
		pestanas.getBird().getFunciones().getBuildNest().addActionListener(control);
		pestanas.getBird().getFunciones().getClean().addActionListener(control);
		/*
		 * Superman
		 */
		pestanas.getSuperman().getFunciones().getTakeOff().addActionListener(control);
		pestanas.getSuperman().getFunciones().getFly().addActionListener(control);
		pestanas.getSuperman().getFunciones().getLand().addActionListener(control);
		pestanas.getSuperman().getFunciones().getLeapBuilding().addActionListener(control);
		pestanas.getSuperman().getFunciones().getListen2world().addActionListener(control);
		pestanas.getSuperman().getFunciones().getLaserEyes().addActionListener(control);
		pestanas.getSuperman().getFunciones().getStopBullet().addActionListener(control);
		pestanas.getSuperman().getFunciones().getEat().addActionListener(control);
		pestanas.getSuperman().getFunciones().getClean().addActionListener(control);
	}
	
	public String cargarArchivo() throws IOException {
		String path = "";
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", ".txt");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(chooser);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			path = chooser.getSelectedFile().getAbsolutePath();
			return path;
		} else {
			//No hace nada
			return null;
		}
	}
	
	/**
	 * Método para guardar un archivo via JFileChooser
	 * @author Gabriel Blanco
	 * @param linea
	 * @throws IOException
	 */
	public String guardarArchivo() throws IOException {
		String path = "";
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", ".txt");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showSaveDialog(chooser);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			path = chooser.getSelectedFile().getAbsolutePath();
		} 
		else {
			//No hace nada
		}
		return path;
	}

	public Dialogos getDialogos() {
		return dialogos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public PanelFuncionesSuperiores getToolbar() {
		return toolbar;
	}
	public PanelPestanas getPestanas() {
		return pestanas;
	}
}
