package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class PanelBird extends JPanel {

	private static final long serialVersionUID = 1L;
	private BirdFunctions funciones = new BirdFunctions();
	private PanelResultados resultados = new PanelResultados();
	
	public PanelBird() {
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
		resultados.getOutput().setText("==Bird History Log==");
		//Font segoeui = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/segoeui.ttf")).deriveFont(50f);
		
	}
	
	public void addComponentes() {
		add(funciones, BorderLayout.NORTH);
		add(resultados, BorderLayout.CENTER);
	}

	public BirdFunctions getFunciones() {
		return funciones;
	}

	public PanelResultados getResultados() {
		return resultados;
	}

}
