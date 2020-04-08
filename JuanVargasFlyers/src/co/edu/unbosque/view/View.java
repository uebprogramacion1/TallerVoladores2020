package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class View extends JFrame{
	

	JButton vehiculo;
	JButton aeroplano;
	JButton hidroavion;
	JLabel voladores;
	JButton pajaro;
	JButton kryptoniano;
	JButton helicoptero;
	JLabel js;
	JButton superman;
	JButton salida;

	public View() {

		setTitle("Voladores");

		GridLayout matriz= new GridLayout(2,1);
		setLayout(matriz);


		voladores = new JLabel();
		voladores.setIcon(new ImageIcon(""));


		

		aeroplano = new JButton("Aeroplano");
		aeroplano.setIcon(new ImageIcon(""));
		
		vehiculo = new JButton("Vehiculo");
		vehiculo.setIcon(new ImageIcon(""));

		hidroavion = new JButton("Hidroavion");
		hidroavion.setIcon(new ImageIcon(""));

		pajaro = new JButton("Pajaro");
		pajaro.setIcon(new ImageIcon(""));
		
		helicoptero = new JButton("");
		helicoptero.setIcon(new ImageIcon(""));

		kryptoniano = new JButton("Kryptoniano");
		kryptoniano.setIcon(new ImageIcon(""));

		js= new JLabel("");
		js.setIcon(new ImageIcon(""));

		superman = new JButton("Superman");
		superman.setIcon(new ImageIcon(""));

		salida = new JButton("Salir");
		salida.setIcon(new ImageIcon(""));

		add(voladores);

		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(3,2)); 
		botones.add(vehiculo);
		botones.add(aeroplano);
		botones.add(hidroavion);
		botones.add(helicoptero);
		botones.add(pajaro);
		botones.add(kryptoniano);
		botones.add(js);
		botones.add(superman);
		botones.add(salida);

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

	public JButton getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(JButton vehiculo) {
		this.vehiculo = vehiculo;
	}

	public JButton getAeroplano() {
		return aeroplano;
	}

	public void setAeroplano(JButton aeroplano) {
		this.aeroplano = aeroplano;
	}

	public JButton getHidroavion() {
		return hidroavion;
	}

	public void seHidroavion(JButton hidroavion) {
		this.hidroavion = hidroavion;
	}

	public JButton getHelicoptero() {
		return helicoptero;
	}

	public void setHelicoptero(JButton helicoptero) {
		this.helicoptero= helicoptero;
	}

	public JButton getPajaro() {
		return pajaro;
	}

	public void setPajaro(JButton pajaro) {
		this.pajaro = pajaro;
	}

	public JButton getKryptoniano() {
		return kryptoniano;
	}

	public void setKryptoniano(JButton kryptoniano) {
		this.kryptoniano = kryptoniano;
	}

	public JButton getSuperman() {
		return superman;
	}

	public void setSuperman(JButton superman) {
		this.superman = superman;
	}

	public JButton getSalidat() {
		return salida;
	}

	public void setSalida(JButton salida) {
		this.salida= salida;
	}

	public void mostrarVehicle(String V) {

		JOptionPane.showMessageDialog(null, V, "Vehiculo",  JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarAirplane(String A) {

		JOptionPane.showMessageDialog(null, A, "Aeroplano",  JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarSeaplane(String H) {

		JOptionPane.showMessageDialog(null, H, "Hidroavion",  JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarHelicoptero(String string) {

		JOptionPane.showMessageDialog(null, string, "Helicoptero",  JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarBird(String P) {

		JOptionPane.showMessageDialog(null, P, "Pajaro",  JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarKryptonian(String Kry) {

		JOptionPane.showMessageDialog(null, Kry, "Kryptoniano",  JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarSuperman(String Super) {

		JOptionPane.showMessageDialog(null, Super, "Superman",  JOptionPane.INFORMATION_MESSAGE);
	}

}
