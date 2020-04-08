package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JFrame;

public class View extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PanelOpciones panel1;
	public PanelTexto panel2;

	public View() {

		setSize(500, 560);
		setTitle("LIGA DE LA JUSTICIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);

		inicializarPaneles();

		setVisible(true);
		setResizable(false);

	}

	private void inicializarPaneles() {
		// TODO Auto-generated method stub

		panel1 = new PanelOpciones();
		panel1.setBounds(10, 10, 476, 160);
		panel1.setOpaque(true);
		panel1.setBackground(Color.ORANGE);
		add(panel1);

		panel2 = new PanelTexto();
		panel2.setBounds(10, 200, 476, 300);
		panel2.setOpaque(true);
		panel2.setBackground(Color.YELLOW);
		add(panel2);

	}
	
	public void mostrarEnConsola(String dato) {
		
		System.out.println(dato);
		
	}
	
}
