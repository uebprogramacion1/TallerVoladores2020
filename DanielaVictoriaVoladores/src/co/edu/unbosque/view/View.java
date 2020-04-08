package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class View extends JFrame{
	JLabel voladores;
	JButton vehicle;
	JButton airplane;
	JButton seaplane;
	JButton helicopter;
	JButton bird;
	JButton kryptonian;
	JLabel nd;
	JButton superman;
	JButton exit;

	public View() {

		setTitle("Voladores");

		GridLayout matriz= new GridLayout(2,1);
		setLayout(matriz);


		voladores = new JLabel();
		voladores.setIcon(new ImageIcon("imagenes/volar1.jpg"));


		vehicle = new JButton("Vehicle");
		vehicle.setIcon(new ImageIcon("imagenes/Captura.PNG"));

		airplane = new JButton("Airplane");
		airplane.setIcon(new ImageIcon("imagenes/avion.PNG"));

		seaplane = new JButton("Seaplane");
		seaplane.setIcon(new ImageIcon("imagenes/sea.PNG"));

		helicopter = new JButton("Helicopter");
		helicopter.setIcon(new ImageIcon("imagenes/hel.PNG"));

		bird = new JButton("Bird");
		bird.setIcon(new ImageIcon("imagenes/pio.PNG"));

		kryptonian = new JButton("Kryptonian");
		kryptonian.setIcon(new ImageIcon("imagenes/krypton.PNG"));

		nd = new JLabel("");
		nd.setIcon(new ImageIcon("imagenes/nd.jpg"));

		superman = new JButton("Superman");
		superman.setIcon(new ImageIcon("imagenes/su.PNG"));

		exit = new JButton("exit");
		exit.setIcon(new ImageIcon("imagenes/exit.PNG"));


		add(voladores);

		
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(3,2)); 
		botones.add(vehicle);
		botones.add(airplane);
		botones.add(seaplane);
		botones.add(helicopter);
		botones.add(bird);
		botones.add(kryptonian);
		botones.add(nd);
		botones.add(superman);
		botones.add(exit);

		add(botones);
		setBounds(0, 0, 480, 440);
		setResizable(false);

		setVisible(true);

	}




	public JLabel getVoladores() {
		return voladores;
	}



	public void setVoladores(JLabel voladores) {
		this.voladores = voladores;
	}



	public JButton getVehicle() {
		return vehicle;
	}



	public void setVehicle(JButton vehicle) {
		this.vehicle = vehicle;
	}



	public JButton getAirplane() {
		return airplane;
	}



	public void setAirplane(JButton airplane) {
		this.airplane = airplane;
	}



	public JButton getSeaplane() {
		return seaplane;
	}



	public void setSeaplane(JButton seaplane) {
		this.seaplane = seaplane;
	}



	public JButton getHelicopter() {
		return helicopter;
	}



	public void setHelicopter(JButton helicopter) {
		this.helicopter = helicopter;
	}



	public JButton getBird() {
		return bird;
	}



	public void setBird(JButton bird) {
		this.bird = bird;
	}



	public JButton getKryptonian() {
		return kryptonian;
	}



	public void setKryptonian(JButton kryptonian) {
		this.kryptonian = kryptonian;
	}



	public JButton getSuperman() {
		return superman;
	}



	public void setSuperman(JButton superman) {
		this.superman = superman;
	}
	
	


	public JButton getExit() {
		return exit;
	}



	public void setExit(JButton exit) {
		this.exit = exit;
	}




	public void mostrarVehicle(String x) {

		JOptionPane.showMessageDialog(null, x, "Vehicle",  JOptionPane.INFORMATION_MESSAGE);
	}


	public void mostrarAirplane(String y) {

		JOptionPane.showMessageDialog(null, y, "Airplane",  JOptionPane.INFORMATION_MESSAGE);
	}


	public void mostrarSeaplane(String z) {

		JOptionPane.showMessageDialog(null, z, "Seaplane",  JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarHelicoptero(String string) {

		JOptionPane.showMessageDialog(null, string, "Helicopter",  JOptionPane.INFORMATION_MESSAGE);
	}


	public void mostrarBird(String a) {

		JOptionPane.showMessageDialog(null, a, "Bird",  JOptionPane.INFORMATION_MESSAGE);
	}


	public void mostrarKryptonian(String h) {

		JOptionPane.showMessageDialog(null, h, "Kryptonian",  JOptionPane.INFORMATION_MESSAGE);
	}


	public void mostrarSuperman(String k) {

		JOptionPane.showMessageDialog(null, k, "Superman",  JOptionPane.INFORMATION_MESSAGE);
	}


}
