package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SeaPlaneFunctions extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton startEngine = new JButton("Start Engine"), stopEngine = new JButton("Stop Engine"),
			takeOff = new JButton("Take Off"), fly = new JButton("Fly"), land = new JButton("Land"), clean = new JButton("Clean Log");
	public final String STARTENGINE = "SPSTARTENGINE", STOPENGINE = "SPSTOPENGINE", TAKEOFF = "SPTAKEOFF",
			FLY = "SPFLY", LAND = "SPLAND", CLEAN = "SPCLEANLOG";
	// private boolean cStartEngine = false, cStopEngine = false, cTakeOff = false,
	// cFly = false;

	public SeaPlaneFunctions() {
		try {
			cargar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addComponentes();
	}

	public void cargar() throws Exception {
		setLayout(new GridLayout(2, 3));
		Font segoeuil = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/segoeuil.ttf")).deriveFont(30f);
		startEngine.setFont(segoeuil);
		stopEngine.setFont(segoeuil);
		takeOff.setFont(segoeuil);
		fly.setFont(segoeuil);
		land.setFont(segoeuil);
		clean.setFont(segoeuil);
		startEngine.setBackground(new Color(149, 255, 0));
		stopEngine.setBackground(new Color(149, 255, 0));
		takeOff.setBackground(new Color(149, 255, 0));
		fly.setBackground(new Color(149, 255, 0));
		land.setBackground(new Color(149, 255, 0));
		clean.setBackground(new Color(255, 0, 0));
		clean.setForeground(Color.white);
		startEngine.setActionCommand(STARTENGINE);
		stopEngine.setActionCommand(STOPENGINE);
		takeOff.setActionCommand(TAKEOFF);
		fly.setActionCommand(FLY);
		land.setActionCommand(LAND);
		clean.setActionCommand(CLEAN);
	}

	public void addComponentes() {
		add(startEngine);
		add(takeOff);
		add(fly);
		add(land);
		add(stopEngine);
		add(clean);
	}

	public JButton getStartEngine() {
		return startEngine;
	}

	public JButton getStopEngine() {
		return stopEngine;
	}

	public JButton getTakeOff() {
		return takeOff;
	}

	public JButton getFly() {
		return fly;
	}

	public JButton getLand() {
		return land;
	}

	public JButton getClean() {
		return clean;
	}
	
	
	
}
