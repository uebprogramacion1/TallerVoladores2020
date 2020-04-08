package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class PanelSeaPlane extends JPanel {

	private static final long serialVersionUID = 1L;
	//private PanelOperaciones operaciones = new PanelOperaciones();
	private SeaPlaneFunctions funciones = new SeaPlaneFunctions();
	private PanelResultados resultados = new PanelResultados();
	
	public PanelSeaPlane() {
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
		resultados.getOutput().setText("==SeaPlane History Log==");
		//operaciones.getGenerate().setBackground(new Color(149, 255, 0));
		//Font segoeui = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/segoeui.ttf")).deriveFont(50f);
		//operaciones.getGenerate().setFont(segoeui);
		//operaciones.getGenerate().setActionCommand("GENERATESEAPLANE");
	}
	
	public void addComponentes() {
		add(funciones, BorderLayout.NORTH);
		add(resultados, BorderLayout.CENTER);
		//add(operaciones, BorderLayout.SOUTH);
	}

//	public PanelOperaciones getOperaciones() {
//		return operaciones;
//	}

	public SeaPlaneFunctions getFunciones() {
		return funciones;
	}

	public PanelResultados getResultados() {
		return resultados;
	}
	
	
	
	

}
