package co.edu.unbosque.view;



import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class InterfazGui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private JButton Airplane;
	private JButton Animal;
	private JButton Bird;
	private JButton Flyer;
	private JButton Helicopter;
	private JButton Kryptonian;
	private JButton SeaPlane;
	private JButton Superman;
	private JButton Vehicle;
	
	public void name(String cadena) {
		
		JOptionPane.showMessageDialog(null, cadena);
		
		
	}
	
	
	public InterfazGui() {
			

		setSize(1000,600);
		setResizable(false);
		setTitle("Cancion");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		
		setLayout(null);
		
		Airplane = new JButton("Airplane");
		Airplane.setBounds(100, 120, 200, 200);
		Airplane.setBackground(Color.green);
		Airplane.setForeground(Color.orange);
		Airplane.setOpaque(false);
		Airplane.setBorder(null);
		
		
		Animal = new JButton("Animal");
		Animal.setBounds(200, 120, 200, 200);
		Animal.setBackground(Color.green);
		Animal.setForeground(Color.orange);
		Animal.setOpaque(false);
		Animal.setBorder(null);
		
		Bird = new JButton("Bird");
		Bird.setBounds(300, 120, 200, 200);
		Bird.setBackground(Color.green);
		Bird.setForeground(Color.orange);
		Bird.setOpaque(false);
		Bird.setBorder(null);
		
		Flyer = new JButton("Flyer");
		Flyer.setBounds(400, 120, 200, 200);
		Flyer.setBackground(Color.green);
		Flyer.setForeground(Color.orange);
		Flyer.setOpaque(false);
		Flyer.setBorder(null);

		Helicopter = new JButton("Helicopter");
		Helicopter.setBounds(600, 120, 200, 200);
		Helicopter.setBackground(Color.green);
		Helicopter.setForeground(Color.orange);
		Helicopter.setOpaque(false);
		Helicopter.setBorder(null);
		
		Kryptonian = new JButton("Kryptonian");
		Kryptonian.setBounds(700, 120, 200, 200);
		Kryptonian.setBackground(Color.green);
		Kryptonian.setForeground(Color.orange);
		Kryptonian.setOpaque(false);
		Kryptonian.setBorder(null);
		
		SeaPlane = new JButton("SeaPlane");
		SeaPlane.setBounds(800, 120, 200, 200);
		SeaPlane.setBackground(Color.green);
		SeaPlane.setForeground(Color.orange);
		SeaPlane.setOpaque(false);
		SeaPlane.setBorder(null);
		
		
		Superman = new JButton("Superman");
		Superman.setBounds(900, 120, 200, 200);
		Superman.setBackground(Color.green);
		Superman.setForeground(Color.orange);
		Superman.setOpaque(false);
		Superman.setBorder(null);
		
		
		Vehicle = new JButton("Vehicle");
		Vehicle.setBounds(200, 300, 200, 200);
		Vehicle.setBackground(Color.green);
		Vehicle.setForeground(Color.orange);
		Vehicle.setOpaque(false);
		Vehicle.setBorder(null);
		
		add(Airplane);
		add(Animal);
		add(Bird);
		add(Flyer);
		add(Helicopter);
		add(Kryptonian);
		add(Vehicle);
		add(SeaPlane);
		
		
		
		
	}

	public JButton getAirplane() {
		return Airplane;
	}

	public void setAirplane(JButton airplane) {
		Airplane = airplane;
	}

	public JButton getAnimal() {
		return Animal;
	}

	public void setAnimal(JButton animal) {
		Animal = animal;
	}

	public JButton getBird() {
		return Bird;
	}

	public void setBird(JButton bird) {
		Bird = bird;
	}

	public JButton getFlyer() {
		return Flyer;
	}

	public void setFlyer(JButton flyer) {
		Flyer = flyer;
	}

	public JButton getHelicopter() {
		return Helicopter;
	}

	public void setHelicopter(JButton helicopter) {
		Helicopter = helicopter;
	}

	public JButton getKryptonian() {
		return Kryptonian;
	}

	public void setKryptonian(JButton kryptonian) {
		Kryptonian = kryptonian;
	}

	public JButton getSeaPlane() {
		return SeaPlane;
	}

	public void setSeaPlane(JButton seaPlane) {
		SeaPlane = seaPlane;
	}

	public JButton getSuperman() {
		return Superman;
	}

	public void setSuperman(JButton superman) {
		Superman = superman;
	}

	public JButton getVehicle() {
		return Vehicle;
	}

	public void setVehicle(JButton vehicle) {
		Vehicle = vehicle;
	}
	
	
	

}
