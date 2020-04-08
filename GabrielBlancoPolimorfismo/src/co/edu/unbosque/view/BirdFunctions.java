package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class BirdFunctions extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton takeOff = new JButton("Take Off"), land = new JButton("Land"), fly = new JButton("Fly"),
			layEggs = new JButton("Lay Eggs"), buildNest = new JButton("Build Nest"), clean = new JButton("Clean Log");
	public final String TAKEOFF = "BTAKEOFF", LAND = "BLAND", FLY = "BFLY", LAYEGGS = "BLAYEGGS",
			BUILDNEST = "BBUILDNEST", CLEAN = "BCLEANLOG";

	public BirdFunctions() {
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
		takeOff.setFont(segoeuil);
		land.setFont(segoeuil);
		fly.setFont(segoeuil);
		layEggs.setFont(segoeuil);
		buildNest.setFont(segoeuil);
		clean.setFont(segoeuil);
		takeOff.setBackground(new Color(242, 242, 3));
		land.setBackground(new Color(242, 242, 3));
		fly.setBackground(new Color(242, 242, 3));
		layEggs.setBackground(new Color(242, 242, 3));
		buildNest.setBackground(new Color(242, 242, 3));
		takeOff.setBackground(new Color(242, 242, 3));
		clean.setBackground(new Color(255, 0, 0));
		clean.setForeground(Color.white);
		takeOff.setActionCommand(TAKEOFF);
		land.setActionCommand(LAND);
		fly.setActionCommand(FLY);
		layEggs.setActionCommand(LAYEGGS);
		buildNest.setActionCommand(BUILDNEST);
		clean.setActionCommand(CLEAN);
	}

	public void addComponentes() {
		add(takeOff);
		add(fly);
		add(land);
		add(layEggs);
		add(buildNest);
		add(clean);
	}

	public JButton getTakeOff() {
		return takeOff;
	}

	public JButton getLand() {
		return land;
	}

	public JButton getFly() {
		return fly;
	}

	public JButton getLayEggs() {
		return layEggs;
	}

	public JButton getBuildNest() {
		return buildNest;
	}

	public JButton getClean() {
		return clean;
	}
	
	

}
