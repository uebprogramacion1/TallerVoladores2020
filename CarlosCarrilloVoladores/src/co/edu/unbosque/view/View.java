package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame {
	private PanelOpciones panelOpciones;
	public View() {
		setTitle("Salon de la Justicia");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setBackground(Color.YELLOW);
		getContentPane().setLayout(new BorderLayout());
		
		inicializar();
		
		setVisible(true);
	}
	public void inicializar() {
		panelOpciones = new PanelOpciones();
		panelOpciones.setBounds(100, 10, 400, 400);
		getContentPane().add(panelOpciones,BorderLayout.CENTER);
	}
	public void MostrarResultados(String palabra) {
		JOptionPane.showMessageDialog(null, palabra);
	}
	public PanelOpciones getPanelOpciones() {
		return panelOpciones;
	}
	public void setPanelOpciones(PanelOpciones panelOpciones) {
		this.panelOpciones = panelOpciones;
	}
	
	

}
