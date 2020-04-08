package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * 
 * Esta clase tiene el campo de texto que va a mostrar todos los eventos de los 4 voladores
 * @author Gabriel Blanco
 *
 */
public class PanelResultados extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextArea output = new JTextArea();
	
	public PanelResultados() {
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
		Font consolas = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/consola.ttf")).deriveFont(14f);
		output.setFont(consolas);
		output.setBackground(Color.white);
		output.setForeground(Color.black);
		output.setLineWrap(true);
		output.setWrapStyleWord(true);
		output.setAutoscrolls(true);
		output.setEditable(false);
	}
	
	public void addComponentes() {
		add(output);
	}

	public JTextArea getOutput() {
		return output;
	}
	
	
}
