package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class PanelSuperman extends JPanel {

	private static final long serialVersionUID = 1L;
	//private PanelOperaciones operaciones = new PanelOperaciones();
	private SupermanFunctions funciones = new SupermanFunctions();
	private PanelResultados resultados = new PanelResultados();
	
	public PanelSuperman() {
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
		resultados.getOutput().setText("==Superman History Log==");
		//operaciones.getGenerate().setBackground(new Color(255, 35, 42));
		//Font segoeui = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/segoeui.ttf")).deriveFont(50f);
		//operaciones.getGenerate().setFont(segoeui);
		//operaciones.getGenerate().setActionCommand("GENERATESUPERMAN");
	}
	
	public void addComponentes() {
		//add(operaciones, BorderLayout.SOUTH);
		add(funciones, BorderLayout.NORTH);
		add(resultados, BorderLayout.CENTER);
	}

	public SupermanFunctions getFunciones() {
		return funciones;
	}

	public PanelResultados getResultados() {
		return resultados;
	}

//	public PanelOperaciones getOperaciones() {
//		return operaciones;
//	}
	
	

}
