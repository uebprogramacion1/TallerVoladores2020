package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelMostrar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextArea txtLetraCancion;

	public PanelMostrar() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {

		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Informacion:");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		txtLetraCancion = new JTextArea();
		txtLetraCancion.setEditable(false);
		txtLetraCancion.setBackground(Color.WHITE);
		txtLetraCancion.setForeground(Color.black);
		txtLetraCancion.setFont(new Font("Times New Roman", 0, 25));
		txtLetraCancion.setBounds(16, 26, 630, 389);
		add(txtLetraCancion, BorderLayout.CENTER);

	}

	public JTextArea getTxtLetraCancion() {
		return txtLetraCancion;
	}

	public void setTxtLetraCancion(JTextArea txtLetraCancion) {
		this.txtLetraCancion = txtLetraCancion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
