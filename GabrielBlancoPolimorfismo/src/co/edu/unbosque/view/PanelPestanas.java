package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PanelPestanas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTabbedPane pestanas = new JTabbedPane();
	private PanelHelicopter helicoptero = new PanelHelicopter();
	private PanelSeaPlane seaplane = new PanelSeaPlane();
	private PanelSuperman superman = new PanelSuperman();
	private PanelBird bird = new PanelBird();
	
	public PanelPestanas() {
		try {
			cargar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addComponentes();
	}
	
	public void cargar() throws Exception{
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		Font segoeuiLight = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/segoeuil.ttf")).deriveFont(20f);
		pestanas.setFont(segoeuiLight);
	}
	
	public void addComponentes() {
		add(pestanas, BorderLayout.CENTER);
		pestanas.addTab("SeaPlane",seaplane);
		pestanas.setBackgroundAt(0, new Color(149, 255, 0));
		pestanas.addTab("Helicopter",helicoptero);
		pestanas.setBackgroundAt(1, new Color(200, 136, 52));
		pestanas.addTab("Bird",bird);
		pestanas.setBackgroundAt(2, new Color(242, 242, 3));
		pestanas.addTab("Superman",superman);
		pestanas.setBackgroundAt(3, new Color(200, 0, 0));
	}

	public JTabbedPane getPestanas() {
		return pestanas;
	}

	public PanelHelicopter getHelicoptero() {
		return helicoptero;
	}

	public PanelSeaPlane getSeaplane() {
		return seaplane;
	}

	public PanelSuperman getSuperman() {
		return superman;
	}

	public PanelBird getBird() {
		return bird;
	}
}
