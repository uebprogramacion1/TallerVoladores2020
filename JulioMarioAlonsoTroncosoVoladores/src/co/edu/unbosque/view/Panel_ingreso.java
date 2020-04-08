package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.model.Bird;
import co.edu.unbosque.model.Flyer;

public class Panel_ingreso extends JPanel implements Flyer{

	public JButton boton1;
	public JButton boton2;
	public JButton boton3;
	public JButton boton4;
	public JButton boton5;
	public JButton boton6;
	public JTextArea area;
	
	
	Panel_ingreso(){
	setLayout(null);
	setBackground(Color.white);
	
	
	
   inicializarComponentes();
 
  
	setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0),
	        new TitledBorder("")));
		
	}
	
	public void inicializarComponentes() {
		
		boton1 = new JButton("pajaro");
		boton1.setBounds(240, 320, 120, 25);
		add(boton1);
	
		boton2 = new JButton("Airplane");
		boton2.setBounds(80, 320, 120, 25);
		add(boton2);
		
		boton3 = new JButton("Kriptonian");
		boton3.setBounds(80, 280, 120, 25);
		add(boton3);	
		
		boton4 = new JButton("SeaPlane");
		boton4.setBounds(240, 280, 120, 25);
		add(boton4);	
		
		boton5 = new JButton("Helicopter");
		boton5.setBounds(80, 240, 120, 25);
		add(boton5);	
		
		boton6 = new JButton("Vehicle");
		boton6.setBounds(240, 240, 120, 25);
		add(boton6);
		
		area = new JTextArea();
		area.setBounds(10, 10, 430, 200);
	    area.setBackground(Color.cyan);
	    area.setEditable(false);
	    add(area);
		
		
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	
	
	


