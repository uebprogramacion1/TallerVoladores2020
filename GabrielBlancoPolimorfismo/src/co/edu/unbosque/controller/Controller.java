package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;

/**
 * @author Gabriel Blanco Clase Controlador
 *
 */
public class Controller implements ActionListener {

	private Mundo mundo = new Mundo();
	private View view = new View();

	/**
	 * Método Constructor del Controlador
	 * 
	 * @throws IOException
	 */
	public Controller() throws Exception {
		GUI();
	}

	/**
	 * Método para probar casos puntuales en consola
	 * 
	 * @throws IOException
	 */
	public void Consola() throws Exception {
		// Se inicializa gui aqui ya que es necesario para probar por via JOptionPane
		/*
		 * TODO: Buscar un método mas eficiente para mostrar TODOS los errores por
		 * JOptionPane
		 */
		boolean activo = true;
		while (activo) {
			try {
				int comando = Integer.parseInt(view.getDialogos().input(System.in, "Polimorfismo: DebuggerMode",
						view.getDialogos().ayuda(), JOptionPane.PLAIN_MESSAGE));
				switch (comando) {
				default:
					view.getDialogos().output("Error", "Bad command!", JOptionPane.ERROR_MESSAGE);
					break;
				case 0:
					activo = false;
					break;
				case 1:
					activo = false;
					GUI();
					break;
				case 2:
					Flyer();
					break;
				}
			} catch (Exception e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				mundo.getArchivo().makeLog(errors.toString());
				view.getDialogos().output("Error", "Ha ocurrido un error inesperado\n"
						+ "Se ha creado en <proyecto>/docs/Output un archivo myLog.txt en donde aparece el detalle específico del error causado.",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * Método para iniciar la GUI
	 */
	public void GUI() throws Exception {
		try {
			view.iniciar(this);
		} catch (Exception e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			mundo.getArchivo().makeLog(errors.toString());
			view.getDialogos().output("Error", "Ha ocurrido un error inesperado\n"
					+ "Se ha creado en <proyecto>/docs/Output un archivo myLog.txt en donde aparece el detalle específico del error causado.",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/*
	 * TODO: Poner los métodos a probar aqui
	 */

	/**
	 * Método que pregunta que volador quiere probar
	 * @author Gabriel Blanco
	 * @throws Exception
	 */
	public void Flyer() throws Exception {
		int comando = Integer.parseInt(view.getDialogos().input(System.in, "Polimorfismo-DM: Seleccionar un volador",
				"0. SeaPlane\n" + "1. Helicopter\n" + "2. Bird\n" + "3. Superman", JOptionPane.PLAIN_MESSAGE));
		switch (comando) {
		case 0:
			SeaPlane();
			break;
		case 1:
			Helicopter();
			break;
		case 2:
			Bird();
			break;
		case 3:
			Superman();
			break;
		}
	}

	/**
	 * Método para probar las funciones de SeaPlane
	 * @author gebla
	 * @throws Exception
	 */
	public void SeaPlane() throws Exception {
		int comando = Integer.parseInt(view.getDialogos().input(System.in, "Polimorfismo-DM: SeaPlane",
				"0. Start Engine\n" + "1. Stop Engine\n" + "2. Fly\n" + "3. Land\n" + "4. Take Off",
				JOptionPane.PLAIN_MESSAGE));
		switch (comando) {
		case 0:
			view.getDialogos().output("Operacion Finalizada", mundo.getSeaplane().startEngine(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 1:
			view.getDialogos().output("Operacion Finalizada", mundo.getSeaplane().stopEngine(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			view.getDialogos().output("Operacion Finalizada", mundo.getSeaplane().fly(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			view.getDialogos().output("Operacion Finalizada", mundo.getSeaplane().land(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			view.getDialogos().output("Operacion Finalizada", mundo.getSeaplane().takeoff(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	
	/**
	 * Método para probar las funciones de Helicopter
	 * @author gebla
	 * @throws Exception
	 */
	public void Helicopter() throws Exception {
		int comando = Integer.parseInt(view.getDialogos().input(System.in, "Polimorfismo-DM: Helicopter",
				"0. Start Engine\n" + "1. Stop Engine\n" + "2. Fly\n" + "3. Land\n" + "4. Take Off",
				JOptionPane.PLAIN_MESSAGE));
		switch (comando) {
		case 0:
			view.getDialogos().output("Operacion Finalizada", mundo.getHelicopter().startEngine(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 1:
			view.getDialogos().output("Operacion Finalizada", mundo.getHelicopter().stopEngine(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			view.getDialogos().output("Operacion Finalizada", mundo.getHelicopter().fly(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			view.getDialogos().output("Operacion Finalizada", mundo.getHelicopter().land(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			view.getDialogos().output("Operacion Finalizada", mundo.getHelicopter().takeoff(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	
	/**
	 * Método para probar las funciones de Bird
	 * @author gebla
	 * @throws Exception
	 */
	public void Bird() throws Exception {
		int comando = Integer.parseInt(view.getDialogos().input(System.in, "Polimorfismo-DM: Bird",
				"0. Eat\n" + "1. Fly\n" + "2. Land\n" + "3. Take Off\n" + "4. Build Nest\n" + "5. Lay Eggs",
				JOptionPane.PLAIN_MESSAGE));
		switch (comando) {
		case 0:
			view.getDialogos().output("Operacion Finalizada", mundo.getBird().eat(), JOptionPane.INFORMATION_MESSAGE);
			break;
		case 1:
			view.getDialogos().output("Operacion Finalizada", mundo.getBird().fly(), JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			view.getDialogos().output("Operacion Finalizada", mundo.getBird().land(), JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			view.getDialogos().output("Operacion Finalizada", mundo.getBird().takeoff(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			view.getDialogos().output("Operacion Finalizada", mundo.getBird().buildNest(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			view.getDialogos().output("Operacion Finalizada", mundo.getBird().layEggs(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	
	/**
	 * Método para probar las funciones de Superman
	 * @author gebla
	 * @throws Exception
	 */
	public void Superman() throws Exception {
		int comando = Integer.parseInt(view.getDialogos().input(
				System.in, "Polimorfismo-DM: Superman", "0. Eat\n" + "1. Fly\n" + "2. Land\n" + "3. Leap Building\n"
						+ "4. Use Laser Eyes\n" + "5. Stop Bullet\n" + "6. Take Off\n" + "7. Listen to the World",
				JOptionPane.PLAIN_MESSAGE));
		switch (comando) {
		case 0:
			view.getDialogos().output("Operacion Finalizada", mundo.getSuperman().eat(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 1:
			view.getDialogos().output("Operacion Finalizada", mundo.getSuperman().fly(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			view.getDialogos().output("Operacion Finalizada", mundo.getSuperman().land(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			view.getDialogos().output("Operacion Finalizada", mundo.getSuperman().leapBuilding(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			view.getDialogos().output("Operacion Finalizada", mundo.getSuperman().useLaserEyes(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			view.getDialogos().output("Operacion Finalizada", mundo.getSuperman().stopBullet(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6:
			view.getDialogos().output("Operacion Finalizada", mundo.getSuperman().takeoff(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 7:
			view.getDialogos().output("Operacion Finalizada", mundo.getSuperman().listen2World(),
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}

	/**
	 * @author Carl Quinn
	 * Método para escuchar los eventos de la vista
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			// Pestaña SeaPlane
			if (e.getActionCommand() == view.getPestanas().getSeaplane().getFunciones().STARTENGINE) {
				view.getPestanas().getSeaplane().getResultados().getOutput()
						.setText(view.getPestanas().getSeaplane().getResultados().getOutput().getText() + "\n"
								+ mundo.getSeaplane().startEngine());
			}
			if (e.getActionCommand() == view.getPestanas().getSeaplane().getFunciones().STOPENGINE) {
				view.getPestanas().getSeaplane().getResultados().getOutput()
						.setText(view.getPestanas().getSeaplane().getResultados().getOutput().getText() + "\n"
								+ mundo.getSeaplane().stopEngine());
			}
			if (e.getActionCommand() == view.getPestanas().getSeaplane().getFunciones().TAKEOFF) {
				view.getPestanas().getSeaplane().getResultados().getOutput()
						.setText(view.getPestanas().getSeaplane().getResultados().getOutput().getText() + "\n"
								+ mundo.getSeaplane().takeoff());
			}
			if (e.getActionCommand() == view.getPestanas().getSeaplane().getFunciones().FLY) {
				view.getPestanas().getSeaplane().getResultados().getOutput()
						.setText(view.getPestanas().getSeaplane().getResultados().getOutput().getText() + "\n"
								+ mundo.getSeaplane().fly());
			}
			if (e.getActionCommand() == view.getPestanas().getSeaplane().getFunciones().LAND) {
				view.getPestanas().getSeaplane().getResultados().getOutput()
						.setText(view.getPestanas().getSeaplane().getResultados().getOutput().getText() + "\n"
								+ mundo.getSeaplane().land());
			}
			if (e.getActionCommand() == view.getPestanas().getSeaplane().getFunciones().CLEAN) {
				view.getPestanas().getSeaplane().getResultados().getOutput().setText("==SeaPlane History Log==");
			}
			// Pestaña Helicopter
			if (e.getActionCommand() == view.getPestanas().getHelicoptero().getFunciones().STARTENGINE) {
				view.getPestanas().getHelicoptero().getResultados().getOutput()
						.setText(view.getPestanas().getHelicoptero().getResultados().getOutput().getText() + "\n"
								+ mundo.getHelicopter().startEngine());
			}
			if (e.getActionCommand() == view.getPestanas().getHelicoptero().getFunciones().STOPENGINE) {
				view.getPestanas().getHelicoptero().getResultados().getOutput()
						.setText(view.getPestanas().getHelicoptero().getResultados().getOutput().getText() + "\n"
								+ mundo.getHelicopter().stopEngine());
			}
			if (e.getActionCommand() == view.getPestanas().getHelicoptero().getFunciones().TAKEOFF) {
				view.getPestanas().getHelicoptero().getResultados().getOutput()
						.setText(view.getPestanas().getHelicoptero().getResultados().getOutput().getText() + "\n"
								+ mundo.getHelicopter().takeoff());
			}
			if (e.getActionCommand() == view.getPestanas().getHelicoptero().getFunciones().FLY) {
				view.getPestanas().getHelicoptero().getResultados().getOutput()
						.setText(view.getPestanas().getHelicoptero().getResultados().getOutput().getText() + "\n"
								+ mundo.getHelicopter().fly());
			}
			if (e.getActionCommand() == view.getPestanas().getHelicoptero().getFunciones().LAND) {
				view.getPestanas().getHelicoptero().getResultados().getOutput()
						.setText(view.getPestanas().getHelicoptero().getResultados().getOutput().getText() + "\n"
								+ mundo.getHelicopter().land());
			}
			if (e.getActionCommand() == view.getPestanas().getHelicoptero().getFunciones().CLEAN) {
				view.getPestanas().getHelicoptero().getResultados().getOutput().setText("==Helicopter History Log==");
			}
			// Pestaña Bird
			if (e.getActionCommand() == view.getPestanas().getBird().getFunciones().TAKEOFF) {
				view.getPestanas().getBird().getResultados().getOutput()
						.setText(view.getPestanas().getBird().getResultados().getOutput().getText() + "\n"
								+ mundo.getBird().takeoff());
			}
			if (e.getActionCommand() == view.getPestanas().getBird().getFunciones().FLY) {
				view.getPestanas().getBird().getResultados().getOutput()
						.setText(view.getPestanas().getBird().getResultados().getOutput().getText() + "\n"
								+ mundo.getBird().fly());
			}
			if (e.getActionCommand() == view.getPestanas().getBird().getFunciones().LAND) {
				view.getPestanas().getBird().getResultados().getOutput()
						.setText(view.getPestanas().getBird().getResultados().getOutput().getText() + "\n"
								+ mundo.getBird().land());
			}
			if (e.getActionCommand() == view.getPestanas().getBird().getFunciones().LAYEGGS) {
				view.getPestanas().getBird().getResultados().getOutput()
						.setText(view.getPestanas().getBird().getResultados().getOutput().getText() + "\n"
								+ mundo.getBird().layEggs());
			}
			if (e.getActionCommand() == view.getPestanas().getBird().getFunciones().BUILDNEST) {
				view.getPestanas().getBird().getResultados().getOutput()
						.setText(view.getPestanas().getBird().getResultados().getOutput().getText() + "\n"
								+ mundo.getBird().buildNest());
			}
			if (e.getActionCommand() == view.getPestanas().getBird().getFunciones().CLEAN) {
				view.getPestanas().getBird().getResultados().getOutput().setText("==Bird History Log==");
			}
			// Pestaña Superman
			if (e.getActionCommand() == view.getPestanas().getSuperman().getFunciones().TAKEOFF) {
				view.getPestanas().getSuperman().getResultados().getOutput()
						.setText(view.getPestanas().getSuperman().getResultados().getOutput().getText() + "\n"
								+ mundo.getSuperman().takeoff());
			}
			if (e.getActionCommand() == view.getPestanas().getSuperman().getFunciones().FLY) {
				view.getPestanas().getSuperman().getResultados().getOutput()
						.setText(view.getPestanas().getSuperman().getResultados().getOutput().getText() + "\n"
								+ mundo.getSuperman().fly());
			}
			if (e.getActionCommand() == view.getPestanas().getSuperman().getFunciones().LAND) {
				view.getPestanas().getSuperman().getResultados().getOutput()
						.setText(view.getPestanas().getSuperman().getResultados().getOutput().getText() + "\n"
								+ mundo.getSuperman().land());
			}
			if (e.getActionCommand() == view.getPestanas().getSuperman().getFunciones().LEAPBUILDING) {
				view.getPestanas().getSuperman().getResultados().getOutput()
						.setText(view.getPestanas().getSuperman().getResultados().getOutput().getText() + "\n"
								+ mundo.getSuperman().leapBuilding());
			}
			if (e.getActionCommand() == view.getPestanas().getSuperman().getFunciones().LISTEN2WORLD) {
				view.getPestanas().getSuperman().getResultados().getOutput()
						.setText(view.getPestanas().getSuperman().getResultados().getOutput().getText() + "\n"
								+ mundo.getSuperman().listen2World());
			}
			if (e.getActionCommand() == view.getPestanas().getSuperman().getFunciones().LASEREYES) {
				view.getPestanas().getSuperman().getResultados().getOutput()
						.setText(view.getPestanas().getSuperman().getResultados().getOutput().getText() + "\n"
								+ mundo.getSuperman().useLaserEyes());
			}
			if (e.getActionCommand() == view.getPestanas().getSuperman().getFunciones().STOPBULLET) {
				view.getPestanas().getSuperman().getResultados().getOutput()
						.setText(view.getPestanas().getSuperman().getResultados().getOutput().getText() + "\n"
								+ mundo.getSuperman().stopBullet());
			}
			if (e.getActionCommand() == view.getPestanas().getSuperman().getFunciones().EAT) {
				view.getPestanas().getSuperman().getResultados().getOutput()
						.setText(view.getPestanas().getSuperman().getResultados().getOutput().getText() + "\n"
								+ mundo.getSuperman().eat());
			}
			if (e.getActionCommand() == view.getPestanas().getSuperman().getFunciones().CLEAN) {
				view.getPestanas().getSuperman().getResultados().getOutput().setText("==Superman History Log==");
			}

		}
		/*
		 * Estas líneas son para controlar en caso de que por falta de memoria no genere
		 * el log. Esto es vital para el programa ya que me permite llevar una
		 * trazabilidad
		 */
		catch (Exception e2) {
			StringWriter errors = new StringWriter();
			e2.printStackTrace(new PrintWriter(errors));
			try {
				mundo.getArchivo().makeLog(errors.toString());
			} catch (IOException e1) {
				view.getDialogos().output("Error Fatal",
						"Ha ocurrido un error inesperado donde se debe salir del programa.\nMotivo: Error creando el log de archivos",
						JOptionPane.ERROR_MESSAGE);
				System.exit(1);
			}
			view.getDialogos().output("Error", "Ha ocurrido un error inesperado\n"
					+ "Se ha creado en <proyecto>/docs/Output un archivo myLog.txt en donde aparece el detalle específico del error causado.",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
