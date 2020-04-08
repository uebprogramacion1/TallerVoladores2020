package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Salondelajusticia;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	Salondelajusticia sal;
	View v;
	public Controller() {
		sal=new Salondelajusticia();
		v=new View();
		v.getBtnhelicoptero().addActionListener(this);
		v.getBtnhidroavion().addActionListener(this);
		v.getBtnpajaro().addActionListener(this);
		v.getBtnsuperman().addActionListener(this);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		String accion=e.getActionCommand();
		if(accion=="helicoptero") {
			
			String mensaje=sal.getHel().aterrizar()+"  "+sal.getHel().despegar()+"  "+sal.getHel().volar();
			v.imprimirInformacion(mensaje);
		}
		if(accion=="hidroavion") {
			String mensaje=sal.getHid().aterrizar()+"  "+sal.getHid().despegar()+"  "+sal.getHid().volar();
			v.imprimirInformacion(mensaje);
		}
		if(accion=="pajaro") {
			String mensaje=sal.getPaj().aterrizar()+"  "+sal.getPaj().comer()+"  "+sal.getPaj().construirNido()
					+"  "+sal.getPaj().despegar()+"  "+sal.getPaj().ponerHuevos();
			v.imprimirInformacion(mensaje);
		}if(accion=="superman") {
			String mensaje=sal.getSup().aterrizar()+"  "+sal.getSup().comer()+"  "+sal.getSup().despegar()
					+"  "+sal.getSup().detenerBala()+"  "+sal.getSup().saltarEdificio();
			v.imprimirInformacion(mensaje);
		}
		
	}
	
	
}
