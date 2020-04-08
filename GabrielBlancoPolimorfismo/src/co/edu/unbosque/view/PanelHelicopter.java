package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class PanelHelicopter extends JPanel {

	private static final long serialVersionUID = 1L;
	//private PanelOperaciones operaciones = new PanelOperaciones();
	private HelicopterFunctions funciones = new HelicopterFunctions();
	private PanelResultados resultados = new PanelResultados();
	
	public PanelHelicopter() {
		try {
			cargar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addComponentes();
	}
	
	public void cargar() throws Exception {
		setLayout(new BorderLayout());
		resultados.getOutput().setText("==Helicopter History Log==");
		//operaciones.getGenerate().setBackground(new Color(200, 136, 52));
		//Font segoeui = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/segoeui.ttf")).deriveFont(50f);
		//operaciones.getGenerate().setFont(segoeui);
		//operaciones.getGenerate().setActionCommand("GENERATEHELICOPTER");
	}
	
	public void addComponentes() {
		//add(operaciones, BorderLayout.SOUTH);
		add(funciones, BorderLayout.NORTH);
		add(resultados, BorderLayout.CENTER);
	}

//	public PanelOperaciones getOperaciones() {
//		return operaciones;
//	}

	public HelicopterFunctions getFunciones() {
		return funciones;
	}

	public PanelResultados getResultados() {
		return resultados;
	}
	
	
	
}
