package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel_1 extends JPanel {
		
		
	
		private JButton superman;
		private JButton bird;
		private JButton seaplane;
		private JButton helicopter;
		
		
		
		
		
		
		public Panel_1() {
			
			setLayout(null);
	        inicializar();
			
			setVisible(true);
		}

		public void inicializar() {
			
			
			
			superman=new JButton("Superman");
			superman.setBounds(80, 120, 100, 20);
			add(superman);
			
			bird=new JButton("Bird");
			bird.setBounds(290, 120, 70, 20);
			add(bird);
			
			seaplane=new JButton("Seaplane");
			seaplane.setBounds(80, 250, 100, 20);
			add(seaplane);
			
			
			helicopter=new JButton("Helicopter");
			helicopter.setBounds(290, 250, 100, 20);
			add(helicopter);
			
			
		
			
			
	
		}

		public JButton getSuperman() {
			return superman;
		}

		public void setSuperman(JButton superman) {
			this.superman = superman;
		}

		public JButton getBird() {
			return bird;
		}

		public void setBird(JButton bird) {
			this.bird = bird;
		}

		public JButton getSeaplane() {
			return seaplane;
		}

		public void setSeaplane(JButton seaplane) {
			this.seaplane = seaplane;
		}

		public JButton getHelicopter() {
			return helicopter;
		}

		public void setHelicopter(JButton helicopter) {
			this.helicopter = helicopter;
		}
		
		

		
		
		

		

}
