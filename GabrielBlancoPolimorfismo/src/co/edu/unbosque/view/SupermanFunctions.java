package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SupermanFunctions extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton takeOff = new JButton("Take Off"), fly = new JButton("Fly"), land = new JButton("Land"), listen2world = new JButton("Listen to the World"), laserEyes = new JButton("Laser Eyes"), leapBuilding = new JButton("Leap Building"), stopBullet = new JButton("Stop Bullet"), eat = new JButton("Eat"), clean = new JButton("Clean Log");
	public final String TAKEOFF = "STAKEOFF", FLY = "SFLY", LAND = "SLAND", LISTEN2WORLD = "SLISTEN2WORLD", LASEREYES = "SLASEREYES", LEAPBUILDING = "SLEAPBUILDING", STOPBULLET = "SSTOPBULLET", EAT = "SEAT", CLEAN = "SCLEANLOG";
	
	public SupermanFunctions() {
		try {
			cargar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addComponents();
	}
	
	public void cargar() throws Exception{
		setLayout(new GridLayout(3, 3));
		Font segoeuil = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/segoeuil.ttf")).deriveFont(20f);
		takeOff.setFont(segoeuil);
		fly.setFont(segoeuil);
		land.setFont(segoeuil);
		listen2world.setFont(segoeuil);
		leapBuilding.setFont(segoeuil);
		stopBullet.setFont(segoeuil);
		laserEyes.setFont(segoeuil);
		eat.setFont(segoeuil);
		clean.setFont(segoeuil);
		takeOff.setBackground(new Color(200, 0, 0));
		fly.setBackground(new Color(200, 0, 0));
		land.setBackground(new Color(200, 0, 0));
		listen2world.setBackground(new Color(200, 0, 0));
		leapBuilding.setBackground(new Color(200, 0, 0));
		stopBullet.setBackground(new Color(200, 0, 0));
		laserEyes.setBackground(new Color(200, 0, 0));
		eat.setBackground(new Color(200, 0, 0));
		clean.setBackground(new Color(255, 0, 0));
		clean.setForeground(Color.white);
		takeOff.setActionCommand(TAKEOFF);
		fly.setActionCommand(FLY);
		land.setActionCommand(LAND);
		leapBuilding.setActionCommand(LEAPBUILDING);
		listen2world.setActionCommand(LISTEN2WORLD);
		stopBullet.setActionCommand(STOPBULLET);
		laserEyes.setActionCommand(LASEREYES);
		eat.setActionCommand(EAT);
		clean.setActionCommand(CLEAN);
	}
	
	public void addComponents() {
		add(takeOff);
		add(fly);
		add(land);
		add(listen2world);
		add(leapBuilding);
		add(stopBullet);
		add(laserEyes);
		add(eat);
		add(clean);
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

	public JButton getListen2world() {
		return listen2world;
	}

	public JButton getLaserEyes() {
		return laserEyes;
	}

	public JButton getLeapBuilding() {
		return leapBuilding;
	}

	public JButton getStopBullet() {
		return stopBullet;
	}

	public JButton getEat() {
		return eat;
	}

	public JButton getClean() {
		return clean;
	}
}
