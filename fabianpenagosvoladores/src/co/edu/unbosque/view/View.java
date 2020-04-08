package co.edu.unbosque.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class View extends JFrame{
	JPanel panel1;
	JButton btnhelicoptero;
	JButton btnhidroavion;
	JButton btnpajaro;
	JButton btnsuperman;
	
	public View() {
		btnhelicoptero=new JButton("Helicoptero");
		btnhidroavion=new JButton("Hidroavion");
		btnpajaro=new JButton("Pajaro");
		btnsuperman=new JButton("Superman");
		panel1=new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		setTitle("Salon de la justicia");
		setSize(600,400);
		panel1.add(btnhelicoptero);
		panel1.add(btnhidroavion);
		panel1.add(btnpajaro);
		panel1.add(btnsuperman);
		btnhelicoptero.setActionCommand("helicoptero");
		btnhidroavion.setActionCommand("hidroavion");
		btnpajaro.setActionCommand("pajaro");
		btnsuperman.setActionCommand("superman");
		
		add(panel1);
		setVisible(true);
	}
	
	public void imprimirInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje );
		
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}

	public JButton getBtnhelicoptero() {
		return btnhelicoptero;
	}

	public void setBtnhelicoptero(JButton btnhelicoptero) {
		this.btnhelicoptero = btnhelicoptero;
	}

	public JButton getBtnhidroavion() {
		return btnhidroavion;
	}

	public void setBtnhidroavion(JButton btnhidroavion) {
		this.btnhidroavion = btnhidroavion;
	}

	public JButton getBtnpajaro() {
		return btnpajaro;
	}

	public void setBtnpajaro(JButton btnpajaro) {
		this.btnpajaro = btnpajaro;
	}

	public JButton getBtnsuperman() {
		return btnsuperman;
	}

	public void setBtnsuperman(JButton btnsuperman) {
		this.btnsuperman = btnsuperman;
	}
	
}
