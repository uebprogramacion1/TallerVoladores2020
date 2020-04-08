package co.edu.unbosque.view;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	private JLabel Fondo;
	private JButton btnAnimal;
	private JButton btnVehicle;
	private JButton btnAirplane;
	private JButton btnBird;
	private JButton btnHelicopter;
	private JButton btnSeaPlane;
	private JButton btnKryptonian;
	private JButton btnSuperman;
	private JButton btnSalir;

	private static final long serialVersionUID = 1L;
	
	public View(Controller c) {

		super("Flyers");
		setLayout(null);
		setSize(525,590);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mostrarVoladores(c);


		Fondo = new JLabel();
		Fondo.setIcon(new ImageIcon("src/Imagenes/Titulo.png"));
		Fondo.setBounds(0,0,530,549);
		add(Fondo);
	}

	public void mostrarVoladores(Controller c) {

				btnAnimal = new JButton("Animal");
				btnAnimal.setIcon(new ImageIcon("src/Imagenes/Animal.png"));
				btnAnimal.setBounds(30,250,110,80);
				btnAnimal.addActionListener(c);
				add(btnAnimal);
					
				btnVehicle = new JButton("Vehicle");
				btnVehicle.setIcon(new ImageIcon("src/Imagenes/Vehicle.png"));
				btnVehicle.setBounds(200,250,110,80);
				btnVehicle.addActionListener(c);
				add(btnVehicle);
				
				btnAirplane = new JButton("Airplane");
				btnAirplane.setIcon(new ImageIcon("src/Imagenes/Airplane.png"));
				btnAirplane.setBounds(360,250,110,80);
				btnAirplane.addActionListener(c);
				add(btnAirplane);
				
				btnBird = new JButton("Bird");
				btnBird.setIcon(new ImageIcon("src/Imagenes/Bird.png"));
				btnBird.setBounds(30,350,110,80);
				btnBird.addActionListener(c);
				add(btnBird);
				
				btnHelicopter = new JButton("Helicopter");
				btnHelicopter.setIcon(new ImageIcon("src/Imagenes/Helicopter.png"));
				btnHelicopter.setBounds(200,350,110,80);
				btnHelicopter.addActionListener(c);
				add(btnHelicopter);
				
				btnSeaPlane = new JButton("SeaPlane");
				btnSeaPlane.setIcon(new ImageIcon("src/Imagenes/Seanplane.png"));
				btnSeaPlane.setBounds(360,350,110,80);
				btnSeaPlane.addActionListener(c);
				add(btnSeaPlane);
				
				btnKryptonian = new JButton("Kryptonian");
				btnKryptonian.setIcon(new ImageIcon("src/Imagenes/kryptonian.png"));
				btnKryptonian.setBounds(30,450,110,80);
				btnKryptonian.addActionListener(c);
				add(btnKryptonian);
				
				btnSuperman = new JButton("Superman");
				btnSuperman.setIcon(new ImageIcon("src/Imagenes/Superman.png"));
				btnSuperman.setBounds(200,450,110,80);
				btnSuperman.addActionListener(c);
				add(btnSuperman);
				
				btnSalir = new JButton("Salir");
				btnSalir.setIcon(new ImageIcon("src/Imagenes/Salir.png"));
				btnSalir.setBounds(360,450,110,80);
				btnSalir.addActionListener(c);
				add(btnSalir);
				
			

	}
	
	//	public void mostrarVoladores(String cadena) {
	//		
	//		JOptionPane.showMessageDialog(null, cadena, "Flyers " , JOptionPane.INFORMATION_MESSAGE);
	//	}

	public JLabel getFondo() {
		return Fondo;
	}

	public void setFondo(JLabel fondo) {
		Fondo = fondo;
	}

	public JButton getBtnAnimal() {
		return btnAnimal;
	}

	public void setBtnAnimal(JButton btnAnimal) {
		this.btnAnimal = btnAnimal;
	}

	public JButton getBtnVehicle() {
		return btnVehicle;
	}

	public void setBtnVehicle(JButton btnVehicle) {
		this.btnVehicle = btnVehicle;
	}

	public JButton getBtnAirplane() {
		return btnAirplane;
	}

	public void setBtnAirplane(JButton btnAirplane) {
		this.btnAirplane = btnAirplane;
	}

	public JButton getBtnBird() {
		return btnBird;
	}

	public void setBtnBird(JButton btnBird) {
		this.btnBird = btnBird;
	}

	public JButton getBtnHelicopter() {
		return btnHelicopter;
	}

	public void setBtnHelicopter(JButton btnHelicopter) {
		this.btnHelicopter = btnHelicopter;
	}

	public JButton getBtnSeaPlane() {
		return btnSeaPlane;
	}

	public void setBtnSeaPlane(JButton btnSeaPlane) {
		this.btnSeaPlane = btnSeaPlane;
	}

	public JButton getBtnKryptonian() {
		return btnKryptonian;
	}

	public void setBtnKryptonian(JButton btnKryptonian) {
		this.btnKryptonian = btnKryptonian;
	}

	public JButton getBtnSuperman() {
		return btnSuperman;
	}

	public void setBtnSuperman(JButton btnSuperman) {
		this.btnSuperman = btnSuperman;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	
}
