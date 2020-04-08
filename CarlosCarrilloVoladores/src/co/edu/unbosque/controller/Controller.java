package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.*;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	private JusticeRoom salonJusticia;
	private View view;
	public Controller() {
		salonJusticia= new JusticeRoom();
		view= new View();
		view.getPanelOpciones().getBirdButton().addActionListener(this);
		view.getPanelOpciones().getHelicopterButton().addActionListener(this);
		view.getPanelOpciones().getSeaPlaneButton().addActionListener(this);
		view.getPanelOpciones().getSupermanButton().addActionListener(this);
		view.getPanelOpciones().getAccionButton().addActionListener(this);
	}	
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(view.getPanelOpciones().getAccionButton())) {
			if(view.getPanelOpciones().getBirdButton().isSelected()){
				view.MostrarResultados(salonJusticia.getBird().mostrarDatos());
			}
			if(view.getPanelOpciones().getHelicopterButton().isSelected()){
				view.MostrarResultados(salonJusticia.getHelicopter().mostrarDatos());
			}
			 if(view.getPanelOpciones().getSeaPlaneButton().isSelected()){
				view.MostrarResultados(salonJusticia.getSeaPlane().mostrarDatos());
			}
			 if(view.getPanelOpciones().getSupermanButton().isSelected()){
				view.MostrarResultados(salonJusticia.getSuperman().mostrarDatos());
			}
		}
	}		
}

