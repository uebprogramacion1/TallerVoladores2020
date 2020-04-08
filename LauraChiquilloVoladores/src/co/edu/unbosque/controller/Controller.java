package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Voladores;
import co.edu.unbosque.view.View;
import co.edu.unbosque.view.ViewAircraft;
import co.edu.unbosque.view.ViewMostrar;

public class Controller implements ActionListener{

	private View ventana;
	private ViewAircraft venA;
	private ViewMostrar venM;
	private Voladores vl;
	public Controller() {
		ventana= new View(this);
		vl= new Voladores();
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Aircraft")) {
			venA= new ViewAircraft(this);
			ventana.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Birds")) {
			venM= new ViewMostrar();
			ventana.setVisible(false);
			venM.getMostrar_datos().setText("Las aves: "+"\n"+"\n Despegan: "+vl.getAves().takeoff()
					+"\n aterrizan: "+vl.getAves().land()+"\n vuelan: "+vl.getAves().fly()+"\n se alimenan de: "+
					vl.getAves().eat()+"\n construyen: "+vl.getAves().buildNest()+"\n ponen: "+vl.getAves().layEggs());
		}
		
		if (e.getActionCommand().equals("Kryptonian")) {
			venM= new ViewMostrar();
			ventana.setVisible(false);
			venM.getMostrar_datos().setText(" Superman: \n"+vl.getSuperman().takeoff()+"\n"+
			vl.getSuperman().land()+" en la tierra \n"+vl.getSuperman().fly()+"\n"+vl.getSuperman().leapBuilding()
			+"\n puede "+vl.getSuperman().stopBullet()+"\n"+vl.getSuperman().eat());
		}
		
		if (e.getActionCommand().equals("Seaplane")) {
			venM= new ViewMostrar();
			venA.setVisible(false);
			venM.getMostrar_datos().setText("Los hidroavión: \n"+"\n"+vl.getHidroavión().takeoff()
					+" o el agua \n"+vl.getHidroavión().land()+" o el agua \n vuelan por "+vl.getHidroavión().fly());
		}
		if (e.getActionCommand().equals("Helicopter")) {
			venM= new ViewMostrar();
			venA.setVisible(false);
			venM.getMostrar_datos().setText("El helicoptero: \n"+"\n"+vl.getHelicoptero().takeoff()
					+"\n"+vl.getHelicoptero().land()+"\n vuelan por "+vl.getHelicoptero().fly());
		}
	}

}
