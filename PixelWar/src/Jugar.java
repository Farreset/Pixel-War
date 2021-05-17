

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Choice;

public class Jugar extends JPanel implements ActionListener  {
	private JButton volver, cont;
	private JRadioButton eq3,eq4,eq5,eq6,eq7,eq8,eq9,eq10;
	private JLabel imag1;


	/**
	 * Create the panel.
	 */
	public Jugar() {

		setBounds(100, 100, 1100, 700);
		setLayout(null);
	

		volver = new JButton(new ImageIcon(new ImageIcon("assets/botones/volver1.png").getImage().getScaledInstance(150, 72, Image.SCALE_DEFAULT)));
		volver.setBounds(44, 570, 150, 72);
		volver.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/volver2.png").getImage().getScaledInstance(150, 72, Image.SCALE_DEFAULT)));
		volver.setFocusable(true);
		volver.setBorder(null);
		volver.setFocusPainted(false);
		volver.setContentAreaFilled(false);
		add(volver);
		
		cont = new JButton(new ImageIcon(new ImageIcon("assets/botones/confirm1.png").getImage().getScaledInstance(160, 72, Image.SCALE_DEFAULT)));
		cont.setBounds(900, 570, 160, 72);
		cont.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/confirm2.png").getImage().getScaledInstance(160, 72, Image.SCALE_DEFAULT)));
		cont.setFocusable(true);
		cont.setBorder(null);
		cont.setFocusPainted(false);
		cont.setContentAreaFilled(false);
		add(cont);
	
		volver.addActionListener(this);
		cont.addActionListener(this);

		eq3 = new JRadioButton();
		eq3.setContentAreaFilled(false);
		eq3.setFocusPainted(false);
		eq3.setForeground(Color.white);
		eq3.setBounds(424, 287, 100, 30);
		eq3.setIcon(new ImageIcon("assets/botones/elec1.png"));
		eq3.setSelectedIcon(new ImageIcon("assets/botones/elec2.png"));
		add(eq3);

		eq4 = new JRadioButton("4 EQUIPOS");
		eq4.setContentAreaFilled(false);
		eq4.setFocusPainted(false);
		eq4.setForeground(Color.white);
		eq4.setBounds(424, 334, 100, 30);
		eq4.setIcon(new ImageIcon("assets/botones/elec21.png"));
		eq4.setSelectedIcon(new ImageIcon("assets/botones/elec11.png"));
		add(eq4);

		eq5 = new JRadioButton("5 EQUIPOS");
		eq5.setContentAreaFilled(false);
		eq5.setFocusPainted(false);
		eq5.setForeground(Color.white);
		eq5.setBounds(424, 385, 100, 30);
		eq5.setIcon(new ImageIcon("assets/botones/elec22.png"));
		eq5.setSelectedIcon(new ImageIcon("assets/botones/elec12.png"));
		
		add(eq5);

		eq6 = new JRadioButton("6 EQUIPOS");
		eq6.setContentAreaFilled(false);
		eq6.setFocusPainted(false);
		eq6.setForeground(Color.white);
		eq6.setBounds(424, 436, 100, 30);
		eq6.setIcon(new ImageIcon("assets/botones/elec13.png"));
		eq6.setSelectedIcon(new ImageIcon("assets/botones/elec31.png"));
		add(eq6);

		eq7 = new JRadioButton("7 EQUIPOS");
		eq7.setContentAreaFilled(false);
		eq7.setFocusPainted(false);
		eq7.setForeground(Color.white);
		eq7.setBounds(579, 287, 100, 30);
		eq7.setIcon(new ImageIcon("assets/botones/elec14.png"));
		eq7.setSelectedIcon(new ImageIcon("assets/botones/elec41.png"));
		add(eq7);

		eq8 = new JRadioButton("8 EQUIPOS");
		eq8.setContentAreaFilled(false);
		eq8.setFocusPainted(false);
		eq8.setForeground(Color.white);
		eq8.setBounds(579, 334, 100, 30);
		eq8.setIcon(new ImageIcon("assets/botones/elec15.png"));
		eq8.setSelectedIcon(new ImageIcon("assets/botones/elec51.png"));
		add(eq8);

		eq9 = new JRadioButton("9 EQUIPOS");
		eq9.setContentAreaFilled(false);
		eq9.setFocusPainted(false);
		eq9.setForeground(Color.white);//el color de la fuente
		eq9.setBounds(579, 385, 100, 30);
		eq9.setIcon(new ImageIcon("assets/botones/elec16.png"));
		eq9.setSelectedIcon(new ImageIcon("assets/botones/elec61.png"));
		add(eq9);

		eq10 = new JRadioButton("10 EQUIPOS");
		eq10.setContentAreaFilled(false);
		eq10.setFocusPainted(false);
		eq10.setForeground(Color.white);
		eq10.setBounds(579, 436, 100, 30);
		eq10.setIcon(new ImageIcon("assets/botones/elec17.png"));
		eq10.setSelectedIcon(new ImageIcon("assets/botones/elec71.png"));
		add(eq10);
		//PARA SELECIONAR SOLO UNO (RADIO BUTTON)
		//se añade todos los radio buttons previamente creados
		ButtonGroup bg=new ButtonGroup();
		bg.add(eq3);
		bg.add(eq4);
		bg.add(eq5);
		bg.add(eq6);
		bg.add(eq7);
		bg.add(eq8);
		bg.add(eq9);
		bg.add(eq10);

		eq3.addActionListener(this);
		eq4.addActionListener(this);
		eq5.addActionListener(this);
		eq6.addActionListener(this);
		eq7.addActionListener(this);
		eq8.addActionListener(this);
		eq9.addActionListener(this);
		eq10.addActionListener(this);


		imag1 = new JLabel(new ImageIcon(new ImageIcon("assets/fondos/fondoEquipos.png").getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT)));
		imag1.setBounds(0, 0, 1100, 700);
		add(imag1);


	}
	public void actionPerformed(ActionEvent e) {
//depende de la eleccion passa un numero que es el de contrincantes
		if(e.getSource()==volver) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Menu());
			Marco.setVisible(true);
		}


		if (eq3.isSelected() && e.getSource()==cont) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Eleccion(3));
			Marco.setVisible(true);
		

		}
		if (eq4.isSelected()&& e.getSource()==cont) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Eleccion(4));
			Marco.setVisible(true);
		
		}
		if (eq5.isSelected()&& e.getSource()==cont) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Eleccion(5));
			Marco.setVisible(true);
		
			
		}
		if (eq6.isSelected()&& e.getSource()==cont) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Eleccion(6));
			Marco.setVisible(true);	
			
		}
		if (eq7.isSelected()&& e.getSource()==cont) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Eleccion(7));
			Marco.setVisible(true);
			
		}
		if (eq8.isSelected()&& e.getSource()==cont) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Eleccion(8));
			Marco.setVisible(true);
			
		}
		if (eq9.isSelected()&& e.getSource()==cont) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Eleccion(9));
			Marco.setVisible(true);
			
		}
		if (eq10.isSelected()&& e.getSource()==cont) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Eleccion(10));
			Marco.setVisible(true);
			
		}
		else if (e.getSource()!=volver&&eq3.isSelected()==false&&eq4.isSelected()==false&&eq5.isSelected()==false&&eq6.isSelected()==false&&eq7.isSelected()==false&&eq8.isSelected()==false&&eq9.isSelected()==false&&eq10.isSelected()==false) {	
			JOptionPane.showInternalMessageDialog(null, "ELEGE LA CANTIDAD DE EQUIPOS", "Error de cantidad", 0);

		}

	}
}
