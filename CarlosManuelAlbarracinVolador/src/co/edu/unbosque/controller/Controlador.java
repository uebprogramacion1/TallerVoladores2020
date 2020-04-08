package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.model.Superman;
import co.edu.unbosque.view.InterfazGUI;
import co.edu.unbosque.view.PanelResultados;

public class Controlador implements ActionListener {

	private InterfazGUI gui;
	private Mundo bd;

	public Controlador() {

		bd = new Mundo();
		gui = new InterfazGUI(this);
		gui.setVisible(true);
	}

	public void actionPerformed(ActionEvent evento) {

		if (evento.getActionCommand().equals(gui.getPanelEntrada().Superman)) {

			gui.getPanelResultados().getTxtMonto().setText(bd.getSuperMan().despegar() + "\n" + bd.getSuperMan().aterrrizar() + "\n"
					+ bd.getSuperMan().comer() + "\n" + bd.getSuperMan().detenerBala() + "\n"
					+ bd.getSuperMan().saltarEdificio());
		}

		if (evento.getActionCommand().equals(gui.getPanelEntrada().Ave)) {

			gui.getPanelResultados().getTxtMonto().setText(bd.getAve().contruirNido() + "\n" + bd.getAve().despegar()
					+ "\n" + bd.getAve().aterrrizar() + "\n" + bd.getAve().comer());
		}

		if (evento.getActionCommand().equals(gui.getPanelEntrada().Helicop)) {

			gui.getPanelResultados().getTxtMonto().setText(bd.getHeli().despegar() + "\n" + bd.getHeli().aterrrizar()
					+ "\n" + bd.getHeli().volar() + "\n" + bd.getHeli().taquearGasolina());
		}

		if (evento.getActionCommand().equals(gui.getPanelEntrada().Hidro)) {

			gui.getPanelResultados().getTxtMonto().setText(bd.getHidroavi().despegar() + "\n" + bd.getHidroavi().aterrrizar() + "\n"
					+ bd.getHidroavi().volar() + "\n" + bd.getHidroavi().taquearGasolina());
		}

	}

}
