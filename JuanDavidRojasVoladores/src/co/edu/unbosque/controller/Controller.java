package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Salon_justicia;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	
	
	public Salon_justicia sj; 
	public View v;
	
	



	public Controller() {
	
	sj = new Salon_justicia();
	v = new View();
	v.getPanel_1().getSuperman().addActionListener(this);
	v.getPanel_1().getBird().addActionListener(this);
	v.getPanel_1().getSeaplane().addActionListener(this);
	v.getPanel_1().getHelicopter().addActionListener(this);
	
	}





	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Superman")) {
			
			v.mostrarMensaje(sj.getSm().eat()+"\n"+sj.getSm().fly()+"\n"+sj.getSm().land()+"\n"+sj.getSm().takeOff()+"\n"+sj.getSm().stopBullet()+"\n"+sj.getSm().leapBuilding()+"\n"+sj.getSm().habitar());
			
			
			
		}else if(e.getActionCommand().equals("Bird")) {
		
			v.mostrarMensaje(sj.getB().eat()+"\n"+sj.getB().fly()+"\n"+sj.getB().land()+"\n"+sj.getB().takeOff()+"\n"+sj.getB().buildNest()+"\n"+sj.getB().layEggs());
			
			
		}else if(e.getActionCommand().equals("Seaplane")) {
			
			
			v.mostrarMensaje(sj.getSp().fly()+"\n"+sj.getSp().land()+"\n"+sj.getSp().takeOff()+"\n"+sj.getSp().movilidad());
			
		}else if(e.getActionCommand().equals("Helicopter")) {
			
			v.mostrarMensaje(sj.getH().fly()+"\n"+sj.getH().land()+"\n"+sj.getH().takeOff()+"\n"+sj.getH().movilidad());
			
		}
		
	}



}