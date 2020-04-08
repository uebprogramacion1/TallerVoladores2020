package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	private JLabel labEntrada;
	private JButton butSuperm;
	private JButton butAve;
	private JButton buthecop;
	private JButton butHidro;
	public static final String Superman = "butSuperm";
	public static final String Ave = "butAve";
	public static final String Helicop = "buthecop";
	public static final String Hidro = "butHidro";

	public PanelEntrada() {
		setLayout(new GridLayout(1, 1));
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		butSuperm = new JButton("Superman");
		butSuperm.setActionCommand(Superman);

		butAve = new JButton("AVE");
		butAve.setActionCommand(Ave);

		buthecop = new JButton("Helicoptero");
		buthecop.setActionCommand(Helicop);

		butHidro = new JButton("HidroAvión");
		butHidro.setActionCommand(Hidro);

		
		add(new JLabel(""));
		add(butSuperm);
		add(butAve);
		add(buthecop);
		add(butHidro);
	}


	

	public JButton getButSuperm() {
		return butSuperm;
	}


	public void setButSuperm(JButton butSuperm) {
		this.butSuperm = butSuperm;
	}


	public JButton getButAve() {
		return butAve;
	}


	public void setButAve(JButton butAve) {
		this.butAve = butAve;
	}


	public JButton getButhecop() {
		return buthecop;
	}


	public void setButhecop(JButton buthecop) {
		this.buthecop = buthecop;
	}




	public JButton getButHidro() {
		return butHidro;
	}




	public void setButHidro(JButton butHidro) {
		this.butHidro = butHidro;
	}



}
