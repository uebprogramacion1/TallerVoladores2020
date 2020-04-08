package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_botones extends JPanel {
	
	private JButton avion;
	private JButton helicoptero;
	private JButton pajaro;
	private JButton superman;
	
	public Panel_botones (){
		
		setLayout(null);
		inicializarVariables();
		setVisible(true);
	}

	private void inicializarVariables() {
		
		avion = new JButton("avion");
		avion.setBounds(10,10,735,100);
		avion.setBackground(Color.blue);
		avion.setFont(new Font("perpetua", 3, 20));
		add(avion);
		
		helicoptero = new JButton("helicoptero");
		helicoptero.setBounds(10,120,735,100);
		helicoptero.setBackground(Color.blue);
		helicoptero.setFont(new Font("perpetua", 3, 20));
		add(helicoptero);
		
		pajaro = new JButton("pajaro");
		pajaro.setBounds(10,230,735,100);
		pajaro.setBackground(Color.blue);
		pajaro.setFont(new Font("perpetua", 3, 20));
		add(pajaro);
		
		superman = new JButton ("superman");
		superman.setBounds(10,340,735,100);
		superman.setBackground(Color.blue);
		superman.setFont(new Font("perpetua", 3, 20));
		add(superman);
		
	}

	public JButton getAvion() {
		return avion;
	}

	public void setAvion(JButton avion) {
		this.avion = avion;
	}

	public JButton getHelicoptero() {
		return helicoptero;
	}

	public void setHelicoptero(JButton helicoptero) {
		this.helicoptero = helicoptero;
	}

	public JButton getPajaro() {
		return pajaro;
	}

	public void setPajaro(JButton pajaro) {
		this.pajaro = pajaro;
	}

	public JButton getSuperman() {
		return superman;
	}

	public void setSuperman(JButton superman) {
		this.superman = superman;
	}
	
	

}
