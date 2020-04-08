package co.edu.unbosque.view;

import javax.swing.JFrame;

public class View extends JFrame{
	
	public Panel panel;
	
	public View() {
		
		setTitle("Bienvenido");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 530);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		inicializar();
		
		setVisible(true);
	}
	public void inicializar() {
		panel = new Panel();
		panel.setBounds(10, 10, 475, 480);
		getContentPane().add(panel);
	}
	public Panel getPanel() {
		return panel;
	}
	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
}
