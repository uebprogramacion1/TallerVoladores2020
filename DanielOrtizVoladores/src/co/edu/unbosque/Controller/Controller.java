package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.Model.Liga_De_LaJusticia;
import co.edu.unbosque.View.View;

public class Controller implements ActionListener{
	
	public Liga_De_LaJusticia jl;
	public View vista;
	
	public Controller() {
		
		jl = new Liga_De_LaJusticia();
		vista = new View();
		vista.panel1.bSuperman.addActionListener(this);
		vista.panel1.bBird.addActionListener(this);
		vista.panel1.bSp.addActionListener(this);
		vista.panel1.bHeli.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		switch(e.getActionCommand()) {
		
		case "Superman":
			vista.panel2.texto.setText(jl.superman.getDato());
			break;
		
		case "Bird":
			vista.panel2.texto.setText(jl.ave.getDatos());
			break;
		
		case "SeaPlane":
			vista.panel2.texto.setText(jl.hidroavion.);
			break;
		
		case "Helicopter":
			vista.panel2.texto.setText(jl.superman.getDato());
			break;
			
		}
		
	}
	
}
