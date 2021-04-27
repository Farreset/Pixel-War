package COLWAR;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
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
		volver = new JButton("VOLVER");
		volver.setBounds(44, 580, 110, 50);
		add(volver);
		cont = new JButton("CONFIRMAR");
		cont.setBounds(946, 580, 110, 50);
		add(cont);

		volver.addActionListener(this);
		cont.addActionListener(this);

		eq3 = new JRadioButton("3 EQUIPOS");
		eq3.setBounds(424, 287, 109, 23);
		add(eq3);

		eq4 = new JRadioButton("4 EQUIPOS");
		eq4.setBounds(424, 334, 109, 23);
		add(eq4);

		eq5 = new JRadioButton("5 EQUIPOS");
		eq5.setBounds(424, 385, 109, 23);
		add(eq5);

		eq6 = new JRadioButton("6 EQUIPOS");
		eq6.setBounds(424, 436, 109, 23);
		add(eq6);

		eq7 = new JRadioButton("7 EQUIPOS");
		eq7.setBounds(579, 287, 109, 23);
		add(eq7);

		eq8 = new JRadioButton("8 EQUIPOS");
		eq8.setBounds(579, 334, 109, 23);
		add(eq8);

		eq9 = new JRadioButton("9 EQUIPOS");
		eq9.setBounds(579, 385, 109, 23);
		add(eq9);

		eq10 = new JRadioButton("10 EQUIPOS");
		eq10.setBounds(579, 436, 109, 23);
		add(eq10);
		//PARA SELECIONAR SOLO UNO (RADIO BUTTON)
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


		imag1 = new JLabel(new ImageIcon("assets/fondos/"));
		imag1.setBounds(0, 0, 1100, 700);
		add(imag1);


	}
	public void actionPerformed(ActionEvent e) {

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
