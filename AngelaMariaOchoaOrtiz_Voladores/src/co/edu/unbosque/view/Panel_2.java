package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panel_2 extends JPanel {
	

	private JTextArea salida1;
	private JButton salida;

	
	public Panel_2() {
		setLayout(null);
		inicializarVariables();
		setVisible(false);
	}

	private void inicializarVariables() {


		salida1 = new JTextArea();
		salida1.setBounds(10,10,735,400);
		salida1.setBackground(Color.blue);
		salida1.setFont(new Font("perpetua", 3, 20));
		add(salida1);
		
		salida = new JButton("salir");
		salida.setBounds(340,41,80,30);
		salida.setBackground(Color.red);
		salida.setFont(new Font("perpetua", 3, 20));
		add(salida);
		
	}

	public JTextArea getSalida1() {
		return salida1;
	}

	public void setSalida1(JTextArea salida1) {
		this.salida1 = salida1;
	}

	public JButton getSalida() {
		return salida;
	}

	public void setSalida(JButton salida) {
		this.salida = salida;
	}




}
