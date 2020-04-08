package co.edu.unbosque.controller;



import javax.swing.JOptionPane;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;

public class Controller  {
	
	private Mundo mundo = new Mundo();
	private View view = new View();
	
	public Controller() {
		Consola();
	}
	
		
 	public void Consola(){
 		boolean activo = true;
 		while(activo) {
 			try {
 				int comando = Integer.parseInt(view.getDialogos().input(System.in,"Menu",  view.getDialogos().menu(),JOptionPane.PLAIN_MESSAGE ));
 				switch(comando) {
 				case 0:
 					activo = false;
 					break;
 				case 1:
 					activo = false;
 					menu2();
 					break;
 				}
 			} catch (Exception e) {
 				view.getDialogos().output("Error","Ocurrio un error inesperado.\n"+e.fillInStackTrace(),JOptionPane.ERROR_MESSAGE);
 			}
 		}
 	}
 	public void menu2() {
 		boolean activo = true;
 		while(activo) {
 			try {
 				int comando = Integer.parseInt(view.getDialogos().input(System.in,"Menu",  view.getDialogos().menu1(),JOptionPane.PLAIN_MESSAGE ));
 				switch(comando) {
 				case 0:
 					activo = false;
 					break;
 				case 1:
 					activo = false;
 					String respuesta ="SeaPlane "+mundo.getSeaplane().fly();
 					view.getPaneltexto().getTexto().setText(respuesta);
 					GUI();
 					break;
 				case 2:
 					activo = false;
 					String respuesta1 ="Bird "+mundo.getBird().layeggs();
 					view.getPaneltexto().getTexto().setText(respuesta1);
 					GUI();
 					break;
 				case 3:
 					activo = false;
 					String respuesta2 ="Helicoptero "+mundo.getHelicoptero().land();
 					view.getPaneltexto().getTexto().setText(respuesta2);
 					GUI();
 					break;
 				case 4:
 					activo = false;
 					String respuesta3 ="Superman "+mundo.getSuperman().eat();
 					view.getPaneltexto().getTexto().setText(respuesta3);
 					GUI();
 					break;
 				}
 			} catch (Exception e) {
 				view.getDialogos().output("Error","Ocurrio un error inesperado.\n"+e.fillInStackTrace(),JOptionPane.ERROR_MESSAGE);
 			}
 		}
 	}
 	
 	
 	public void GUI(){
 		try {
 			view.iniciar(this);
		} catch (Exception e) {
			view.getDialogos().output("Error","Ocurrio un error inesperado.\n"+e.fillInStackTrace(), JOptionPane.ERROR_MESSAGE);
		}
 	}


	
}
