package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	public Mundo m;
	public View gui;
	
	
	public Controller() {
		m = new Mundo();
		gui = new View(this);
		
		gui.setVisible(true);
		
		//gui.mostrarVoladores();
//		gui.mostrarVoladores(m.getAir().land());
//		gui.mostrarVoladores(m.getHeli().takeoff());
//		gui.mostrarVoladores(m.getBir().fly());
//		gui.mostrarVoladores(m.getSea().takeoff());
//		gui.mostrarVoladores(m.getSup().stopBullet());
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Animal")) {
			//System.out.println("Clase Abstracta");
			JOptionPane.showMessageDialog(null,"Clase Abstracta");
			
		}else if (e.getActionCommand().equals("Vehicle")) {
			System.out.println("Convertible");
			JOptionPane.showMessageDialog(null,"Clase Abstracta");
			
			
		}else if (e.getActionCommand().equals("Airplane")) {
			System.out.println("Estación");
			JOptionPane.showMessageDialog(null,m.getAir().takeoff());
			JOptionPane.showMessageDialog(null,m.getAir().fly());
			JOptionPane.showMessageDialog(null,m.getAir().land());
			
		}else if (e.getActionCommand().equals("Bird")) {
			System.out.println("Cuak");
			JOptionPane.showMessageDialog(null,m.getBir().eat());
			JOptionPane.showMessageDialog(null,m.getBir().fly());
			
			
		}else if (e.getActionCommand().equals("Helicopter")) {
			System.out.println("Volar");
			JOptionPane.showMessageDialog(null,m.getHeli().takeoff());
			JOptionPane.showMessageDialog(null,m.getHeli().fly());
			JOptionPane.showMessageDialog(null,m.getHeli().land());
			
		}else if (e.getActionCommand().equals("SeaPlane")) {
			System.out.println("VolarX2");
			JOptionPane.showMessageDialog(null,m.getSea().takeoff());
			JOptionPane.showMessageDialog(null,m.getSea().fly());
			JOptionPane.showMessageDialog(null,m.getSea().land());

			
		}else if (e.getActionCommand().equals("Kryptonian")) {
			System.out.println("Clase Abstracta");
			JOptionPane.showMessageDialog(null,"Clase Abstracta");
			
		}else if (e.getActionCommand().equals("Superman")) {
			System.out.println("SuperMan");
			
			JOptionPane.showMessageDialog(null,m.getSup().stopBullet());
			JOptionPane.showMessageDialog(null,m.getSup().leapBuilding());
			JOptionPane.showMessageDialog(null,m.getSup().takeoff());
			JOptionPane.showMessageDialog(null,m.getSup().fly());
			JOptionPane.showMessageDialog(null,m.getSup().land());


			
		}else if (e.getActionCommand().equals("Salir")) {
			System.out.println("Saliendo");
			
			gui.setVisible(false);
			
		}
		
	}
	

	
}
