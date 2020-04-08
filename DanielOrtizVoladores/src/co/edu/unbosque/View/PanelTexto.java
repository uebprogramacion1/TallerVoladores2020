package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelTexto extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JLabel titulo;
	public JTextArea texto;
	
	public PanelTexto() {
		
		setLayout(null);
		
		titulo = new JLabel("Información");
		titulo.setBounds(10, 10, 454, 60);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Showcard Gothic",Font.BOLD,24));
		titulo.setOpaque(false);
		titulo.setForeground(Color.BLACK);
		add(titulo);
		
		texto = new JTextArea();
		texto.setBounds(10, 80, 454, 180);
		texto.setLineWrap(true);
		texto.setWrapStyleWord(true);
		texto.setEditable(false);
		add(texto);
		
	}
	
}
