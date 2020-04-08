package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JLabel titulo;
	public JButton bSuperman, bBird, bSp, bHeli;
	
	public PanelOpciones() {
		
		setLayout(null);
		
		titulo = new JLabel("Opciones");
		titulo.setBounds(10, 10, 454, 60);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Showcard Gothic",Font.BOLD,20));
		titulo.setOpaque(false);
		titulo.setForeground(Color.BLACK);
		add(titulo);
		
		bSuperman = new JButton("Superman");
		bSuperman.setBounds(10, 80, 100, 40);
		bSuperman.setOpaque(true);
		bSuperman.setBackground(Color.BLUE);
		bSuperman.setForeground(Color.BLACK);
		add(bSuperman);
		
		bBird = new JButton("Bird");
		bBird.setBounds(120, 80, 100, 40);
		bBird.setOpaque(true);
		bBird.setBackground(Color.YELLOW);
		bBird.setForeground(Color.BLACK);
		add(bBird);
		
		bSp = new JButton("SeaPlane");
		bSp.setBounds(248, 80, 100, 40);
		bSp.setOpaque(true);
		bSp.setBackground(Color.LIGHT_GRAY);
		bSp.setForeground(Color.BLACK);
		add(bSp);
		
		bHeli = new JButton("Helicopter");
		bHeli.setBounds(366, 80, 100, 40);
		bHeli.setOpaque(true);
		bHeli.setBackground(Color.RED);
		bHeli.setForeground(Color.BLACK);
		add(bHeli);
		
	}
	
}