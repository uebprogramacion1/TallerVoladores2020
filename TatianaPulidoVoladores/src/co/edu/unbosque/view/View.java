package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.SeaPlane;

public class View extends JFrame {

	// Constante generada por Eclipse
	private static final long serialVersionUID = 1L;

	private PanelBird panelBird;
	private PanelSuperman panelSuperman;
	private PanelHelicopter panelHelicopter;
	private PanelSeaplane panelSeaplane;

	public View() {
		// Definición de los parámetros básicos de la ventana principal

		setSize(800, 300); // tamaño en ancho y alto en pixeles
		setResizable(false); // Se puede cambiar el tamaño de la ventana?
		setTitle("Salon de la justicia"); // tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// qué debe hacer si cierra la
												// ventana
		setLocationRelativeTo(null); // coloca la ventana al centro de la
										// pantalla
		// Establece el layout (lienzo) que vamos a utilizar dentro de la
		// ventana principal.
		getContentPane().setLayout(new GridLayout(2, 2, 10, 10));
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {
		panelBird = new PanelBird();
		getContentPane().add(panelBird);
		panelSuperman = new PanelSuperman();
		getContentPane().add(panelSuperman);
		panelHelicopter = new PanelHelicopter();
		getContentPane().add(panelHelicopter);
		panelSeaplane = new PanelSeaplane();
		getContentPane().add(panelSeaplane);
	}

	public void asignarValoresBird(String campoEat, String campoRaza,
			String campoVuelo) {
		panelBird.getCampoEat().setText(campoEat);
		panelBird.getCampoRaza().setText(campoRaza);
		panelBird.getCampoVuelo().setText(campoVuelo);
	}

	public void asignarValoresSuperman(String campoEat, String campoRaza,
			String campoDefender) {
		panelSuperman.getCampoEat().setText(campoEat);
		panelSuperman.getCampoRaza().setText(campoRaza);
		panelSuperman.getCampoDefender().setText(campoDefender);
	}

	public void asignarValoresSeaPlane(String campoFly, String campoPasajeros,
			String campoTakeOff) {
		panelSeaplane.getCampoFly().setText(campoFly);
		panelSeaplane.getCampoPasajeros().setText(campoPasajeros);
		panelSeaplane.getCampoTakeOff().setText(campoTakeOff);
	}

	public void asignarValoresHelicopter(String campoTanquear,
			String campoPasajeros, String campoTakeOff) {
		panelHelicopter.getCampoTanquear().setText(campoTanquear);
		panelHelicopter.getCampoPasajeros().setText(campoPasajeros);
		panelHelicopter.getCampoTakeOff().setText(campoTakeOff);
	}
}
