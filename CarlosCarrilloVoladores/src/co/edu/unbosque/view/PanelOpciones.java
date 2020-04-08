package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class PanelOpciones extends JPanel {
	private JLabel instruccion;
	private JRadioButton birdButton;
	private JRadioButton helicopterButton;  
	private JRadioButton seaPlaneButton;
	private JRadioButton supermanButton;
	private JButton accionButton;
	public PanelOpciones() {
		setLayout(new BorderLayout()); 
		Iniciar();
	    
	}
	public void Iniciar() {
		instruccion = new JLabel("Escoge alguna opcion visible");
		add(instruccion,BorderLayout.CENTER);
		add(panelBotones(),BorderLayout.CENTER);
	    accionButton = new JButton("Mostar");
	    add(accionButton,BorderLayout.SOUTH);
	}
	public JPanel panelBotones() {
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(1,2));
		birdButton= new JRadioButton("Pajaro");
		helicopterButton= new JRadioButton("Helicoptero");
		seaPlaneButton= new JRadioButton("Avion De A...");
		supermanButton= new JRadioButton("Superman");
		birdButton.setSelected(true);
	    ButtonGroup group = new ButtonGroup();
	    group.add(birdButton);
	    group.add(helicopterButton);
	    group.add(seaPlaneButton);
	    group.add(supermanButton);
	    panelBotones.add(birdButton);
	    panelBotones.add(helicopterButton);
	    panelBotones.add(seaPlaneButton);
	    panelBotones.add(supermanButton);
	    return panelBotones;
	}
	public JLabel getInstruccion() {
		return instruccion;
	}
	public void setInstruccion(JLabel instruccion) {
		this.instruccion = instruccion;
	}
	public JRadioButton getBirdButton() {
		return birdButton;
	}
	public void setBirdButton(JRadioButton birdButton) {
		this.birdButton = birdButton;
	}
	public JRadioButton getHelicopterButton() {
		return helicopterButton;
	}
	public void setHelicopterButton(JRadioButton helicopterButton) {
		this.helicopterButton = helicopterButton;
	}
	public JRadioButton getSeaPlaneButton() {
		return seaPlaneButton;
	}
	public void setSeaPlaneButton(JRadioButton seaPlaneButton) {
		this.seaPlaneButton = seaPlaneButton;
	}
	public JRadioButton getSupermanButton() {
		return supermanButton;
	}
	public void setSupermanButton(JRadioButton supermanButton) {
		this.supermanButton = supermanButton;
	}
	public JButton getAccionButton() {
		return accionButton;
	}
	public void setAccionButton(JButton accionButton) {
		this.accionButton = accionButton;
	}
	
	
}
