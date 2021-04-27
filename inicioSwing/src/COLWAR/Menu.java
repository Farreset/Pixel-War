package COLWAR;



import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JPanel implements ActionListener{
	private JButton boton1, boton2, boton3, boton4 , boton5;
	private  JLabel img1,imgbt1,imgbt2,imgbt3,imgbt4,imgbt5;


	/**
	 * Create the panel.
	 */
	public Menu() {
		setBounds(100, 100, 1100, 700);
		setLayout(null);


		boton1 = new JButton("JUGAR");
		boton2 = new JButton("REGLAS");
		boton3 = new JButton("INFO");
		boton4 = new JButton("GUARDADO");
		boton5 = new JButton("SALIR");
		img1 = new JLabel(new ImageIcon("assets/fondos/"));
		imgbt1 = new JLabel();
		imgbt2 = new JLabel();
		imgbt3 = new JLabel();
		imgbt4 = new JLabel();
		imgbt5 = new JLabel();


		boton1.setBounds(450, 200, 200, 72);
		boton2.setBounds(450, 306, 200, 72);
		boton3.setBounds(450, 415, 200, 72);
		boton4.setBounds(450, 522, 200, 72);
		boton5.setBounds(44, 580, 110, 50);
		img1.setBounds(0, 0, 1100, 700);
		imgbt1.setBounds(450, 200, 200, 72);
		imgbt2.setBounds(450, 306, 200, 72);
		imgbt3.setBounds(450, 415, 200, 72);
		imgbt4.setBounds(450, 522, 200, 72);
		imgbt5.setBounds(44, 580, 110, 50);


		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		boton5.addActionListener(this);

		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		add(img1);
		add(imgbt1);
		add(imgbt2);
		add(imgbt3);
		add(imgbt4);	
		add(imgbt5);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
		
		JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
		Marco.remove(this);
		Marco.getContentPane().add(new Jugar());
		Marco.setVisible(true);

		}
		if(e.getSource()==boton2) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Reglas());
			Marco.setVisible(true);
		}
		if(e.getSource()==boton3) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Barra());
			Marco.setVisible(true);
		}
		if(e.getSource()==boton4) {

		}
		if(e.getSource()==boton5) {
			System.exit(0); // salir en boton

		}


	}

}
