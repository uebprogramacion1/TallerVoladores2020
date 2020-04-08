package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Panel extends JPanel {

	
	private JLabel seaplane;
	private JTextField takeoffseaplane;
	private JTextField flyseaplaine;
	private JTextField landseaplaine;
	private JTextField distanceseplane;
	
	private JLabel Bird;
	private JTextField takeoffBird;
	private JTextField flyAirpBird;
	private JTextField landAirBird;
	private JTextField eatBird;
	
	private JLabel Helicopter;
	private JTextField takeoffHelicopter;
	private JTextField flyHelicopter;
	private JTextField landHelicopter;
	private JTextField nameHelicopter;
	
	private JLabel Superman;
	private JTextField takeoffSuperman;
	private JTextField flyAirpSuperman;
	private JTextField landAirSuperman;
	private JTextField eatSuperman;

	public Panel() {
		setLayout(new GridLayout(4,5));
		setBackground(Color.red);
		inicializarComponentes();

		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0),
				new TitledBorder("Capturar datos")));

	}

	private void inicializarComponentes() {
		
		seaplane = new JLabel("Datos SeaPlane:");
		add(seaplane);
		takeoffseaplane = new JTextField();
		add(takeoffseaplane);
		flyseaplaine = new JTextField();
		add(flyseaplaine);
		landseaplaine = new JTextField();
		add(landseaplaine);
		distanceseplane = new JTextField();
		add(distanceseplane);
		
		Bird = new JLabel("Datos Bird:");
		add(Bird);
		takeoffBird = new JTextField();
		add(takeoffBird);
		flyAirpBird = new JTextField();
		add(flyAirpBird);
		landAirBird = new JTextField();
		add(landAirBird);
		eatBird = new JTextField();
		add(eatBird);
		
		Helicopter = new JLabel("Datos Helicoptero:");
		add(Helicopter);
		takeoffHelicopter = new JTextField();
		add(takeoffHelicopter);
		flyHelicopter = new JTextField();
		add(flyHelicopter);
		landHelicopter = new JTextField();
		add(landHelicopter);
		nameHelicopter = new JTextField();
		add(nameHelicopter);
		
		
		Superman = new JLabel("Datos Superman:");
		add(Superman);
		takeoffSuperman = new JTextField();
		add(takeoffSuperman);
		flyAirpSuperman = new JTextField();
		add(flyAirpSuperman);
		landAirSuperman = new JTextField();
		add(landAirSuperman);
		eatSuperman = new JTextField();
		add(eatSuperman);
		


	}

	public JLabel getSeaplane() {
		return seaplane;
	}

	public void setSeaplane(JLabel seaplane) {
		this.seaplane = seaplane;
	}

	public JTextField getTakeoffseaplane() {
		return takeoffseaplane;
	}

	public void setTakeoffseaplane(JTextField takeoffseaplane) {
		this.takeoffseaplane = takeoffseaplane;
	}

	public JTextField getFlyseaplaine() {
		return flyseaplaine;
	}

	public void setFlyseaplaine(JTextField flyseaplaine) {
		this.flyseaplaine = flyseaplaine;
	}

	public JTextField getLandseaplaine() {
		return landseaplaine;
	}

	public void setLandseaplaine(JTextField landseaplaine) {
		this.landseaplaine = landseaplaine;
	}

	public JTextField getDistanceseplane() {
		return distanceseplane;
	}

	public void setDistanceseplane(JTextField distanceseplane) {
		this.distanceseplane = distanceseplane;
	}

	public JLabel getBird() {
		return Bird;
	}

	public void setBird(JLabel bird) {
		Bird = bird;
	}

	public JTextField getTakeoffBird() {
		return takeoffBird;
	}

	public void setTakeoffBird(JTextField takeoffBird) {
		this.takeoffBird = takeoffBird;
	}

	public JTextField getFlyAirpBird() {
		return flyAirpBird;
	}

	public void setFlyAirpBird(JTextField flyAirpBird) {
		this.flyAirpBird = flyAirpBird;
	}

	public JTextField getLandAirBird() {
		return landAirBird;
	}

	public void setLandAirBird(JTextField landAirBird) {
		this.landAirBird = landAirBird;
	}

	public JTextField getEatBird() {
		return eatBird;
	}

	public void setEatBird(JTextField eatBird) {
		this.eatBird = eatBird;
	}

	public JLabel getHelicopter() {
		return Helicopter;
	}

	public void setHelicopter(JLabel helicopter) {
		Helicopter = helicopter;
	}

	public JTextField getTakeoffHelicopter() {
		return takeoffHelicopter;
	}

	public void setTakeoffHelicopter(JTextField takeoffHelicopter) {
		this.takeoffHelicopter = takeoffHelicopter;
	}

	public JTextField getFlyHelicopter() {
		return flyHelicopter;
	}

	public void setFlyHelicopter(JTextField flyHelicopter) {
		this.flyHelicopter = flyHelicopter;
	}

	public JTextField getLandHelicopter() {
		return landHelicopter;
	}

	public void setLandHelicopter(JTextField landHelicopter) {
		this.landHelicopter = landHelicopter;
	}

	public JTextField getNameHelicopter() {
		return nameHelicopter;
	}

	public void setNameHelicopter(JTextField nameHelicopter) {
		this.nameHelicopter = nameHelicopter;
	}

	public JLabel getSuperman() {
		return Superman;
	}

	public void setSuperman(JLabel superman) {
		Superman = superman;
	}

	public JTextField getTakeoffSuperman() {
		return takeoffSuperman;
	}

	public void setTakeoffSuperman(JTextField takeoffSuperman) {
		this.takeoffSuperman = takeoffSuperman;
	}

	public JTextField getFlyAirpSuperman() {
		return flyAirpSuperman;
	}

	public void setFlyAirpSuperman(JTextField flyAirpSuperman) {
		this.flyAirpSuperman = flyAirpSuperman;
	}

	public JTextField getLandAirSuperman() {
		return landAirSuperman;
	}

	public void setLandAirSuperman(JTextField landAirSuperman) {
		this.landAirSuperman = landAirSuperman;
	}

	public JTextField getEatSuperman() {
		return eatSuperman;
	}

	public void setEatSuperman(JTextField eatSuperman) {
		this.eatSuperman = eatSuperman;
	}

	public void setTakeoffseaplane(Boolean takeOff) {
		// TODO Auto-generated method stub
		
	}

	public void setflyseaplane(Boolean fly) {
		// TODO Auto-generated method stub
		
	}

	public void setlandseaplane(Boolean land) {
		// TODO Auto-generated method stub
		
	}

	public void setTakeoffHelicopter(Boolean takeOff) {
		// TODO Auto-generated method stub
		
	}

	public void setflyHelicopter(Boolean fly) {
		// TODO Auto-generated method stub
		
	}

	public void setlandHelicopter(Boolean land) {
		// TODO Auto-generated method stub
		
	}

	public void setTakeoffBird(Boolean takeOff) {
		// TODO Auto-generated method stub
		
	}

	public void setFlyAirpBird(Boolean fly) {
		// TODO Auto-generated method stub
		
	}

	public void setLandAirBird(Boolean land) {
		// TODO Auto-generated method stub
		
	}

	public void setTakeoffSuperman(Boolean takeOff) {
		// TODO Auto-generated method stub
		
	}

	public void setFlyAirpSuperman(Boolean fly) {
		// TODO Auto-generated method stub
		
	}

	public void setLandAirSuperman(Boolean land) {
		// TODO Auto-generated method stub
		
	}


	}

