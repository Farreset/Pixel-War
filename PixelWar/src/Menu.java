

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.Image;
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
		//assets y disseños
		boton1 = new JButton(new ImageIcon(new ImageIcon("assets/botones/jugar1.png").getImage().getScaledInstance(200, 82, Image.SCALE_DEFAULT)));
		boton2 = new JButton(new ImageIcon(new ImageIcon("assets/botones/reglas1.png").getImage().getScaledInstance(200, 82, Image.SCALE_DEFAULT)));
		boton3 = new JButton(new ImageIcon(new ImageIcon("assets/botones/creditos1.png").getImage().getScaledInstance(200, 82, Image.SCALE_DEFAULT)));
		boton4 = new JButton(new ImageIcon(new ImageIcon("assets/botones/guardado1.png").getImage().getScaledInstance(200, 82, Image.SCALE_DEFAULT)));
		boton5 = new JButton(new ImageIcon(new ImageIcon("assets/botones/salir1.png").getImage().getScaledInstance(150, 72, Image.SCALE_DEFAULT)));

		imgbt1 = new JLabel();
		imgbt2 = new JLabel();
		imgbt3 = new JLabel();
		imgbt4 = new JLabel();
		imgbt5 = new JLabel();

		boton1.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/jugar2.png").getImage().getScaledInstance(200, 82, Image.SCALE_DEFAULT)));
		boton1.setFocusable(true);
		boton1.setBorder(null);
		boton1.setFocusPainted(false);
		boton1.setContentAreaFilled(false);

		boton2.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/reglas2.png").getImage().getScaledInstance(200, 82, Image.SCALE_DEFAULT)));
		boton2.setFocusable(true);
		boton2.setBorder(null);
		boton2.setFocusPainted(false);
		boton2.setContentAreaFilled(false);

		boton3.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/creditos2.png").getImage().getScaledInstance(200, 82, Image.SCALE_DEFAULT)));
		boton3.setFocusable(true);
		boton3.setBorder(null);
		boton3.setFocusPainted(false);
		boton3.setContentAreaFilled(false);

		boton4.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/guardado2.png").getImage().getScaledInstance(200, 82, Image.SCALE_DEFAULT)));
		boton4.setFocusable(true);
		boton4.setBorder(null);
		boton4.setEnabled(false);
		boton4.setFocusPainted(false);
		boton4.setContentAreaFilled(false);
		
		//en caso de que se toque el boton cambiara el asset
		boton5.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/salir2.png").getImage().getScaledInstance(150, 72, Image.SCALE_DEFAULT)));
		boton5.setFocusable(true);//
		boton5.setBorder(null);//para que no se vea el borde
		boton5.setFocusPainted(false);
		boton5.setContentAreaFilled(false);
		
		// tamaño y posicion de los botones	
		boton1.setBounds(450, 215, 200, 82);
		boton2.setBounds(450, 315, 200, 82);
		boton3.setBounds(450, 415, 200, 82);
		boton4.setBounds(450, 515, 200, 82);
		boton5.setBounds(44, 570, 150, 72);
		imgbt1.setBounds(450, 200, 200, 72);
		imgbt2.setBounds(450, 306, 200, 72);
		imgbt3.setBounds(450, 415, 200, 72);
		imgbt4.setBounds(450, 522, 200, 72);
		imgbt5.setBounds(44, 580, 110, 50);

		//para que los botones tengan funciones
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		boton5.addActionListener(this);
		//añadir botones
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		add(imgbt1);
		add(imgbt2);
		add(imgbt3);
		add(imgbt4);	
		add(imgbt5);

		img1 = new JLabel();
		img1.setIcon(new ImageIcon("assets/fondos/fondoMenu.png"));
		img1.setBounds(0, 0, 1100, 700);
		add(img1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//cambiar de panel
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
			Marco.getContentPane().add(new Creditos());
			Marco.setVisible(true);
		}
		//		if(e.getSource()==boton4) {
		//			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
		//			Marco.remove(this);
		//			Marco.getContentPane().add(new Creditos());
		//			Marco.setVisible(true);
		//		}
		if(e.getSource()==boton5) {
			System.exit(0); // salir en boton

		}


	}

}
