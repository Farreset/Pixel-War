package COLWAR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;

public class Eleccion extends JPanel implements ActionListener{

	private JButton volver, start;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel imgEq,imgEq1,imgEq2,imgEq3,imgEq4,imgEq5,imgEq6,imgEq7,imgEq8,imgEq9,fondo;
	JComboBox <String> pers1,pers2,pers3,pers4,pers5,pers6,pers7,pers8,pers9,pers10;
	String fotos[] = {null,"Stickman","Mario", "Link", "Pikachu","Donkey Kong","Sonic","Creeper","Goku","Ratchet & Clank","Sub-Zero"};
	String s;
	private Font fuente;
	int cantidades;

	public Eleccion(int num) {
		setBounds(100, 100, 1100, 700);
		setLayout(null);

	
		fuente = new Font("Calibri",1, 19);
		volver = new JButton(new ImageIcon(new ImageIcon("assets/botones/volver1.png").getImage().getScaledInstance(150, 72, Image.SCALE_DEFAULT)));
		volver.setBounds(44, 570, 150, 72);
		volver.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/volver2.png").getImage().getScaledInstance(150, 72, Image.SCALE_DEFAULT)));
		volver.setFocusable(true);
		volver.setBorder(null);
		volver.setFocusPainted(false);
		volver.setContentAreaFilled(false);
		
		add(volver);
		
		start = new JButton("EMPEZAR");
		start.setBounds(946, 580, 110, 50);
		add(start);

		volver.addActionListener(this);
		start.addActionListener(this);

		plantillas(num);
		
		fondo = new JLabel(new ImageIcon(new ImageIcon("assets/fondos/fondoEleccion.png").getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT)));
		fondo.setBounds(0, 0, 1100, 700);
		add(fondo);
		
		textField_1.setFont(fuente);
		textField_2.setFont(fuente);
		textField_3.setFont(fuente);
	
		

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==volver) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Jugar());
			Marco.setVisible(true);

		}
		if(cantidades == 3) {
			if(e.getSource()==start) {
				String s1 =	s = (String) pers1.getSelectedItem();
				String s2 =	s = (String) pers2.getSelectedItem();
				String s3 =	s = (String) pers3.getSelectedItem();
				if(s1 == null || s2 == null || s3 == null) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE TIPO DE EQUIPO", "Error de tipo de equipo", 0);
				}
				else if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO", "Error de nombre de equipo", 0);
				}
				else if(textField_1.getText().equals(textField_2.getText()) || textField_1.getText().equals(textField_3.getText()) || textField_2.getText().equals(textField_3.getText())) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO DIFERENTE", "Error de nombre de equipo", 0);
				}
				else {
					String tipos [] = {s1,s2,s3};
					String nom [] = {textField_1.getText(),textField_2.getText(),textField_3.getText()};

					JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
					Marco.remove(this);
					Marco.getContentPane().add(new Batalla(this.cantidades, tipos, nom));
					Marco.setVisible(true);
				}
			}
		}


		if(cantidades == 4) {
			if(e.getSource()==start) {
				String s1 =	s = (String) pers1.getSelectedItem();
				String s2 =	s = (String) pers2.getSelectedItem();
				String s3 =	s = (String) pers3.getSelectedItem();
				String s4 =	s = (String) pers4.getSelectedItem();
				if(cantidades == 4 && s1 == null || s2 == null || s3 == null || s4 == null) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE TIPO DE EQUIPO", "Error de tipo de equipo", 0);
				}

				else if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")|| textField_4.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO", "Error de nombre de equipo", 0);
				}
				else if(textField_1.getText().equals(textField_2.getText()) || textField_1.getText().equals(textField_3.getText()) || textField_2.getText().equals(textField_3.getText())||textField_1.getText().equals(textField_4.getText())||textField_2.getText().equals(textField_4.getText())||textField_3.getText().equals(textField_4.getText())) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO DIFERENTE", "Error de nombre de equipo", 0);
				}
				else {
					String tipos [] = {s1,s2,s3,s4};
					String nom [] = {textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText()};

					JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
					Marco.remove(this);
					Marco.getContentPane().add(new Batalla(this.cantidades, tipos, nom));
					Marco.setVisible(true);
				}
			}
		}
		if(cantidades == 5) {
			if(e.getSource()==start) {
				String s1 =	s = (String) pers1.getSelectedItem();
				String s2 =	s = (String) pers2.getSelectedItem();
				String s3 =	s = (String) pers3.getSelectedItem();
				String s4 =	s = (String) pers4.getSelectedItem();
				String s5 =	s = (String) pers5.getSelectedItem();
				if(cantidades == 4 && s1 == null || s2 == null || s3 == null || s4 == null || s5 == null) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE TIPO DE EQUIPO", "Error de tipo de equipo", 0);
				}

				else if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")|| textField_4.getText().equals("")|| textField_5.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO", "Error de nombre de equipo", 0);
				}
				else if(textField_1.getText().equals(textField_2.getText()) || textField_1.getText().equals(textField_3.getText()) || textField_2.getText().equals(textField_3.getText())||textField_1.getText().equals(textField_4.getText())||textField_2.getText().equals(textField_4.getText())||textField_3.getText().equals(textField_4.getText())||textField_1.getText().equals(textField_5.getText())||textField_2.getText().equals(textField_5.getText())||textField_3.getText().equals(textField_5.getText())||textField_4.getText().equals(textField_5.getText())) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO DIFERENTE", "Error de nombre de equipo", 0);
				}
				else {
					String tipos [] = {s1,s2,s3,s4,s5};
					String nom [] = {textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText()};

					JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
					Marco.remove(this);
					Marco.getContentPane().add(new Batalla(this.cantidades, tipos, nom));
					Marco.setVisible(true);
				}
			}
		}
		if(cantidades == 6) {
			if(e.getSource()==start) {
				String s1 =	s = (String) pers1.getSelectedItem();
				String s2 =	s = (String) pers2.getSelectedItem();
				String s3 =	s = (String) pers3.getSelectedItem();
				String s4 =	s = (String) pers4.getSelectedItem();
				String s5 =	s = (String) pers5.getSelectedItem();
				String s6 =	s = (String) pers6.getSelectedItem();
				if(cantidades == 6 && s1 == null || s2 == null || s3 == null || s4 == null || s5 == null || s6 == null) {

					JOptionPane.showInternalMessageDialog(null, "ELIGE TIPO DE EQUIPO", "Error de tipo de equipo", 0);

				}
				else if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")|| textField_4.getText().equals("")|| textField_5.getText().equals("")||textField_6.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO", "Error de nombre de equipo", 0);
				}
				else if(textField_1.getText().equals(textField_2.getText()) || textField_1.getText().equals(textField_3.getText()) || textField_2.getText().equals(textField_3.getText())||textField_1.getText().equals(textField_4.getText())||textField_2.getText().equals(textField_4.getText())||textField_3.getText().equals(textField_4.getText())||textField_1.getText().equals(textField_5.getText())||textField_2.getText().equals(textField_5.getText())||textField_3.getText().equals(textField_5.getText())||textField_4.getText().equals(textField_5.getText())||textField_1.getText().equals(textField_6.getText())||textField_2.getText().equals(textField_6.getText())||textField_3.getText().equals(textField_6.getText())||textField_4.getText().equals(textField_6.getText())||textField_5.getText().equals(textField_6.getText())) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO DIFERENTE", "Error de nombre de equipo", 0);
				}
				else {
					String tipos [] = {s1,s2,s3,s4,s5,s6};
					String nom [] = {textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText()};

					JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
					Marco.remove(this);
					Marco.getContentPane().add(new Batalla(this.cantidades, tipos, nom));
					Marco.setVisible(true);
				}

			}
		}
		if(cantidades == 7) {
			if(e.getSource()==start) {
				String s1 =	s = (String) pers1.getSelectedItem();
				String s2 =	s = (String) pers2.getSelectedItem();
				String s3 =	s = (String) pers3.getSelectedItem();
				String s4 =	s = (String) pers4.getSelectedItem();
				String s5 =	s = (String) pers5.getSelectedItem();
				String s6 =	s = (String) pers6.getSelectedItem();
				String s7 =	s = (String) pers6.getSelectedItem();
				if(cantidades == 6 && s1 == null || s2 == null || s3 == null || s4 == null || s5 == null || s6 == null || s7 == null) {

					JOptionPane.showInternalMessageDialog(null, "ELIGE TIPO DE EQUIPO", "Error de tipo de equipo", 0);

				}
				else if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")|| textField_4.getText().equals("")|| textField_5.getText().equals("")||textField_6.getText().equals("")||textField_7.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO", "Error de nombre de equipo", 0);
				}
				else if(textField_1.getText().equals(textField_2.getText()) || textField_1.getText().equals(textField_3.getText()) || textField_2.getText().equals(textField_3.getText())||textField_1.getText().equals(textField_4.getText())||textField_2.getText().equals(textField_4.getText())||textField_3.getText().equals(textField_4.getText())||textField_1.getText().equals(textField_5.getText())||textField_2.getText().equals(textField_5.getText())||textField_3.getText().equals(textField_5.getText())||textField_4.getText().equals(textField_5.getText())||textField_1.getText().equals(textField_6.getText())||textField_2.getText().equals(textField_6.getText())||textField_3.getText().equals(textField_6.getText())||textField_4.getText().equals(textField_6.getText())||textField_5.getText().equals(textField_6.getText())||textField_1.getText().equals(textField_7.getText())||textField_2.getText().equals(textField_7.getText())||textField_3.getText().equals(textField_7.getText())||textField_4.getText().equals(textField_7.getText())||textField_5.getText().equals(textField_7.getText())||textField_6.getText().equals(textField_7.getText())) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO DIFERENTE", "Error de nombre de equipo", 0);
				}
				else {
					String tipos [] = {s1,s2,s3,s4,s5,s6,s7};
					String nom [] = {textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText()};

					JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
					Marco.remove(this);
					Marco.getContentPane().add(new Batalla(this.cantidades, tipos, nom));
					Marco.setVisible(true);
				}

			}
		}
		if(cantidades == 8) {
			if(e.getSource()==start) {
				String s1 =	s = (String) pers1.getSelectedItem();
				String s2 =	s = (String) pers2.getSelectedItem();
				String s3 =	s = (String) pers3.getSelectedItem();
				String s4 =	s = (String) pers4.getSelectedItem();
				String s5 =	s = (String) pers5.getSelectedItem();
				String s6 =	s = (String) pers6.getSelectedItem();
				String s7 =	s = (String) pers7.getSelectedItem();
				String s8 =	s = (String) pers8.getSelectedItem();
				if(cantidades == 6 && s1 == null || s2 == null || s3 == null || s4 == null || s5 == null || s6 == null || s7 == null|| s8 == null) {

					JOptionPane.showInternalMessageDialog(null, "ELIGE TIPO DE EQUIPO", "Error de tipo de equipo", 0);

				}
				else if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")|| textField_4.getText().equals("")|| textField_5.getText().equals("")||textField_6.getText().equals("")||textField_7.getText().equals("")||textField_8.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO", "Error de nombre de equipo", 0);
				}
				else if(textField_1.getText().equals(textField_2.getText()) || textField_1.getText().equals(textField_3.getText()) || textField_2.getText().equals(textField_3.getText())||textField_1.getText().equals(textField_4.getText())||textField_2.getText().equals(textField_4.getText())||textField_3.getText().equals(textField_4.getText())||textField_1.getText().equals(textField_5.getText())||textField_2.getText().equals(textField_5.getText())||textField_3.getText().equals(textField_5.getText())||textField_4.getText().equals(textField_5.getText())||textField_1.getText().equals(textField_6.getText())||textField_2.getText().equals(textField_6.getText())||textField_3.getText().equals(textField_6.getText())||textField_4.getText().equals(textField_6.getText())||textField_5.getText().equals(textField_6.getText())||textField_1.getText().equals(textField_7.getText())||textField_2.getText().equals(textField_7.getText())||textField_3.getText().equals(textField_7.getText())||textField_4.getText().equals(textField_7.getText())||textField_5.getText().equals(textField_7.getText())||textField_6.getText().equals(textField_7.getText())||textField_1.getText().equals(textField_8.getText())||textField_2.getText().equals(textField_8.getText())||textField_3.getText().equals(textField_8.getText())||textField_4.getText().equals(textField_8.getText())||textField_5.getText().equals(textField_8.getText())||textField_6.getText().equals(textField_8.getText())||textField_7.getText().equals(textField_8.getText())) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO DIFERENTE", "Error de nombre de equipo", 0);
				}
				else {
					String tipos [] = {s1,s2,s3,s4,s5,s6,s7,s8};
					String nom [] = {textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText(),textField_8.getText()};

					JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
					Marco.remove(this);
					Marco.getContentPane().add(new Batalla(this.cantidades, tipos, nom));
					Marco.setVisible(true);
				}
			}
		}
		if(cantidades == 9) {
			if(e.getSource()==start) {
				String s1 =	s = (String) pers1.getSelectedItem();
				String s2 =	s = (String) pers2.getSelectedItem();
				String s3 =	s = (String) pers3.getSelectedItem();
				String s4 =	s = (String) pers4.getSelectedItem();
				String s5 =	s = (String) pers5.getSelectedItem();
				String s6 =	s = (String) pers6.getSelectedItem();
				String s7 =	s = (String) pers7.getSelectedItem();
				String s8 =	s = (String) pers8.getSelectedItem();
				String s9 =	s = (String) pers8.getSelectedItem();
				if(cantidades == 6 && s1 == null || s2 == null || s3 == null || s4 == null || s5 == null || s6 == null || s7 == null|| s8 == null|| s9 == null) {

					JOptionPane.showInternalMessageDialog(null, "ELIGE TIPO DE EQUIPO", "Error de tipo de equipo", 0);

				}
				else if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")|| textField_4.getText().equals("")|| textField_5.getText().equals("")||textField_6.getText().equals("")||textField_7.getText().equals("")||textField_8.getText().equals("")||textField_9.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO", "Error de nombre de equipo", 0);
				}
				else if(textField_1.getText().equals(textField_2.getText()) || textField_1.getText().equals(textField_3.getText()) || textField_2.getText().equals(textField_3.getText())||textField_1.getText().equals(textField_4.getText())||textField_2.getText().equals(textField_4.getText())||textField_3.getText().equals(textField_4.getText())||textField_1.getText().equals(textField_5.getText())||textField_2.getText().equals(textField_5.getText())||textField_3.getText().equals(textField_5.getText())||textField_4.getText().equals(textField_5.getText())||textField_1.getText().equals(textField_6.getText())||textField_2.getText().equals(textField_6.getText())||textField_3.getText().equals(textField_6.getText())||textField_4.getText().equals(textField_6.getText())||textField_5.getText().equals(textField_6.getText())||textField_1.getText().equals(textField_7.getText())||textField_2.getText().equals(textField_7.getText())||textField_3.getText().equals(textField_7.getText())||textField_4.getText().equals(textField_7.getText())||textField_5.getText().equals(textField_7.getText())||textField_6.getText().equals(textField_7.getText())||textField_1.getText().equals(textField_8.getText())||textField_2.getText().equals(textField_8.getText())||textField_3.getText().equals(textField_8.getText())||textField_4.getText().equals(textField_8.getText())||textField_5.getText().equals(textField_8.getText())||textField_6.getText().equals(textField_8.getText())||textField_7.getText().equals(textField_8.getText())||textField_1.getText().equals(textField_9.getText())||textField_2.getText().equals(textField_9.getText())||textField_3.getText().equals(textField_9.getText())||textField_4.getText().equals(textField_9.getText())||textField_5.getText().equals(textField_9.getText())||textField_6.getText().equals(textField_9.getText())||textField_7.getText().equals(textField_9.getText())||textField_8.getText().equals(textField_9.getText())) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO DIFERENTE", "Error de nombre de equipo", 0);
				}
				else {
					String tipos [] = {s1,s2,s3,s4,s5,s6,s7,s8,s9};
					String nom [] = {textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText(),textField_8.getText(),textField_9.getText()};

					JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
					Marco.remove(this);
					Marco.getContentPane().add(new Batalla(this.cantidades, tipos, nom));
					Marco.setVisible(true);
				}
			}
		}
		if(cantidades == 10) {
			if(e.getSource()==start) {
				String s1 =	s = (String) pers1.getSelectedItem();
				String s2 =	s = (String) pers2.getSelectedItem();
				String s3 =	s = (String) pers3.getSelectedItem();
				String s4 =	s = (String) pers4.getSelectedItem();
				String s5 =	s = (String) pers5.getSelectedItem();
				String s6 =	s = (String) pers6.getSelectedItem();
				String s7 =	s = (String) pers7.getSelectedItem();
				String s8 =	s = (String) pers8.getSelectedItem();
				String s9 =	s = (String) pers8.getSelectedItem();
				String s10 =	s = (String) pers8.getSelectedItem();
				if(cantidades == 6 && s1 == null || s2 == null || s3 == null || s4 == null || s5 == null || s6 == null || s7 == null|| s8 == null|| s9 == null|| s10 == null) {

					JOptionPane.showInternalMessageDialog(null, "ELIGE TIPO DE EQUIPO", "Error de tipo de equipo", 0);

				}
				else if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")|| textField_4.getText().equals("")|| textField_5.getText().equals("")||textField_6.getText().equals("")||textField_7.getText().equals("")||textField_8.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO", "Error de nombre de equipo", 0);
				}
				else if(textField_1.getText().equals(textField_2.getText()) || textField_1.getText().equals(textField_3.getText()) || textField_2.getText().equals(textField_3.getText())||textField_1.getText().equals(textField_4.getText())||textField_2.getText().equals(textField_4.getText())||textField_3.getText().equals(textField_4.getText())||textField_1.getText().equals(textField_5.getText())||textField_2.getText().equals(textField_5.getText())||textField_3.getText().equals(textField_5.getText())||textField_4.getText().equals(textField_5.getText())||textField_1.getText().equals(textField_6.getText())||textField_2.getText().equals(textField_6.getText())||textField_3.getText().equals(textField_6.getText())||textField_4.getText().equals(textField_6.getText())||textField_5.getText().equals(textField_6.getText())||textField_1.getText().equals(textField_7.getText())||textField_2.getText().equals(textField_7.getText())||textField_3.getText().equals(textField_7.getText())||textField_4.getText().equals(textField_7.getText())||textField_5.getText().equals(textField_7.getText())||textField_6.getText().equals(textField_7.getText())||textField_1.getText().equals(textField_8.getText())||textField_2.getText().equals(textField_8.getText())||textField_3.getText().equals(textField_8.getText())||textField_4.getText().equals(textField_8.getText())||textField_5.getText().equals(textField_8.getText())||textField_6.getText().equals(textField_8.getText())||textField_7.getText().equals(textField_8.getText())||textField_1.getText().equals(textField_9.getText())||textField_2.getText().equals(textField_9.getText())||textField_3.getText().equals(textField_9.getText())||textField_4.getText().equals(textField_9.getText())||textField_5.getText().equals(textField_9.getText())||textField_6.getText().equals(textField_9.getText())||textField_7.getText().equals(textField_9.getText())||textField_8.getText().equals(textField_9.getText())||textField_1.getText().equals(textField_10.getText())||textField_2.getText().equals(textField_10.getText())||textField_3.getText().equals(textField_10.getText())||textField_4.getText().equals(textField_10.getText())||textField_5.getText().equals(textField_10.getText())||textField_6.getText().equals(textField_10.getText())||textField_7.getText().equals(textField_10.getText())||textField_8.getText().equals(textField_10.getText())||textField_9.getText().equals(textField_10.getText())) {
					JOptionPane.showInternalMessageDialog(null, "ELIGE NOMBRE DE EQUIPO DIFERENTE", "Error de nombre de equipo", 0);
				}
				else {
					String tipos [] = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
					String nom [] = {textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText(),textField_8.getText(),textField_9.getText(),textField_10.getText()};

					JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
					Marco.remove(this);
					Marco.getContentPane().add(new Batalla(this.cantidades, tipos, nom));
					Marco.setVisible(true);
				}
			}
		}



	}





	public void plantillas(int cantidad) {
		this.cantidades = cantidad;
		if (cantidad == 3) {
			textField = new JTextField();
			textField.setText("EQUIPO 1");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_1 = new JTextField();
			textField_1.setBounds(85, 84, 221, 23);
			add(textField_1);
			textField_1.setColumns(10);

			pers1 = new JComboBox<String>(fotos);
			pers1.setBounds(312, 84, 127, 20);
			add(pers1);

			pers1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers1.getSelectedItem();
					imgEq.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq.setBounds(430, 48, 96, 93);
				}
			});

			imgEq = new JLabel(new ImageIcon());
			add(imgEq);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 2");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(85, 188, 221, 23);
			add(textField_2);

			pers2 = new JComboBox<String>(fotos);
			pers2.setBounds(312, 188, 127, 20);
			add(pers2);

			pers2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers2.getSelectedItem();
					imgEq1.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq1.setBounds(430, 152, 96, 93);
				}
			});

			imgEq1 = new JLabel(new ImageIcon());
			add(imgEq1);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 3");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(85, 292, 221, 23);
			add(textField_3);

			pers3 = new JComboBox<String>(fotos);
			pers3.setBounds(312, 292, 127, 20);
			add(pers3);

			pers3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers3.getSelectedItem();
					imgEq2.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq2.setBounds(430, 256, 96, 93);
				}
			});

			imgEq2 = new JLabel(new ImageIcon());
			add(imgEq2);


		}

		if (cantidad == 4) {
			textField = new JTextField();
			textField.setText("EQUIPO 1");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_1 = new JTextField();
			textField_1.setBounds(85, 84, 221, 23);
			add(textField_1);
			textField_1.setColumns(10);

			pers1 = new JComboBox<String>(fotos);
			pers1.setBounds(312, 84, 127, 20);
			add(pers1);

			pers1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers1.getSelectedItem();
					imgEq.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq.setBounds(430, 48, 96, 93);
				}
			});

			imgEq = new JLabel(new ImageIcon());
			add(imgEq);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 2");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(85, 188, 221, 23);
			add(textField_2);

			pers2 = new JComboBox<String>(fotos);
			pers2.setBounds(312, 188, 127, 20);
			add(pers2);

			pers2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers2.getSelectedItem();
					imgEq1.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq1.setBounds(430, 152, 96, 93);
				}
			});

			imgEq1 = new JLabel(new ImageIcon());
			add(imgEq1);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 3");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(85, 292, 221, 23);
			add(textField_3);

			pers3 = new JComboBox<String>(fotos);
			pers3.setBounds(312, 292, 127, 20);
			add(pers3);

			pers3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers3.getSelectedItem();
					imgEq2.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq2.setBounds(430, 256, 96, 93);
				}
			});

			imgEq2 = new JLabel(new ImageIcon());
			add(imgEq2);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 4");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 396, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(85, 396, 221, 23);
			add(textField_4);

			pers4 = new JComboBox<String>(fotos);
			pers4.setBounds(312, 396, 127, 20);
			add(pers4);

			pers4.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers4.getSelectedItem();
					imgEq3.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq3.setBounds(430, 360, 96, 93);
				}
			});

			imgEq3 = new JLabel(new ImageIcon());
			add(imgEq3);

		}
		if (cantidad == 5) {
			textField = new JTextField();
			textField.setText("EQUIPO 1");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_1 = new JTextField();
			textField_1.setBounds(85, 84, 221, 23);
			add(textField_1);
			textField_1.setColumns(10);

			pers1 = new JComboBox<String>(fotos);
			pers1.setBounds(312, 84, 127, 20);
			add(pers1);

			pers1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers1.getSelectedItem();
					imgEq.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq.setBounds(430, 48, 96, 93);
				}
			});

			imgEq = new JLabel(new ImageIcon());
			add(imgEq);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 2");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(85, 188, 221, 23);
			add(textField_2);

			pers2 = new JComboBox<String>(fotos);
			pers2.setBounds(312, 188, 127, 20);
			add(pers2);

			pers2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers2.getSelectedItem();
					imgEq1.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq1.setBounds(430, 152, 96, 93);
				}
			});

			imgEq1 = new JLabel(new ImageIcon());
			add(imgEq1);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 3");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(85, 292, 221, 23);
			add(textField_3);

			pers3 = new JComboBox<String>(fotos);
			pers3.setBounds(312, 292, 127, 20);
			add(pers3);

			pers3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers3.getSelectedItem();
					imgEq2.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq2.setBounds(430, 256, 96, 93);
				}
			});

			imgEq2 = new JLabel(new ImageIcon());
			add(imgEq2);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 4");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 396, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(85, 396, 221, 23);
			add(textField_4);

			pers4 = new JComboBox<String>(fotos);
			pers4.setBounds(312, 396, 127, 20);
			add(pers4);

			pers4.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers4.getSelectedItem();
					imgEq3.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq3.setBounds(430, 360, 96, 93);
				}
			});

			imgEq3 = new JLabel(new ImageIcon());
			add(imgEq3);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 5");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 500, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(85, 500, 221, 23);
			add(textField_5);


			pers5 = new JComboBox<String>(fotos);
			pers5.setBounds(312, 500, 127, 20);
			add(pers5);

			pers5.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers5.getSelectedItem();
					imgEq4.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq4.setBounds(430, 464, 96, 93);
				}
			});

			imgEq4 = new JLabel(new ImageIcon());
			add(imgEq4);
		}
		if (cantidad == 6) {
			textField = new JTextField();
			textField.setText("EQUIPO 1");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_1 = new JTextField();
			textField_1.setBounds(85, 84, 221, 23);
			add(textField_1);
			textField_1.setColumns(10);

			pers1 = new JComboBox<String>(fotos);
			pers1.setBounds(312, 84, 127, 20);
			add(pers1);

			pers1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers1.getSelectedItem();
					imgEq.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq.setBounds(430, 48, 96, 93);
				}
			});

			imgEq = new JLabel(new ImageIcon());
			add(imgEq);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 2");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(85, 188, 221, 23);
			add(textField_2);

			pers2 = new JComboBox<String>(fotos);
			pers2.setBounds(312, 188, 127, 20);
			add(pers2);

			pers2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers2.getSelectedItem();
					imgEq1.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq1.setBounds(430, 152, 96, 93);
				}
			});

			imgEq1 = new JLabel(new ImageIcon());
			add(imgEq1);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 3");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(85, 292, 221, 23);
			add(textField_3);

			pers3 = new JComboBox<String>(fotos);
			pers3.setBounds(312, 292, 127, 20);
			add(pers3);

			pers3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers3.getSelectedItem();
					imgEq2.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq2.setBounds(430, 256, 96, 93);
				}
			});

			imgEq2 = new JLabel(new ImageIcon());
			add(imgEq2);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 4");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 396, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(85, 396, 221, 23);
			add(textField_4);

			pers4 = new JComboBox<String>(fotos);
			pers4.setBounds(312, 396, 127, 20);
			add(pers4);

			pers4.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers4.getSelectedItem();
					imgEq3.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq3.setBounds(430, 360, 96, 93);
				}
			});

			imgEq3 = new JLabel(new ImageIcon());
			add(imgEq3);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 5");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 500, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(85, 500, 221, 23);
			add(textField_5);


			pers5 = new JComboBox<String>(fotos);
			pers5.setBounds(312, 500, 127, 20);
			add(pers5);

			pers5.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers5.getSelectedItem();
					imgEq4.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq4.setBounds(430, 464, 96, 93);
				}
			});

			imgEq4 = new JLabel(new ImageIcon());
			add(imgEq4);
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 6");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(629, 84, 221, 23);
			add(textField_6);


			pers6 = new JComboBox<String>(fotos);
			pers6.setBounds(856, 84, 127, 20);
			add(pers6);

			pers6.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers6.getSelectedItem();
					imgEq5.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq5.setBounds(989, 48, 96, 93);
				}
			});

			imgEq5 = new JLabel(new ImageIcon());
			add(imgEq5);
		}
		if (cantidad == 7) {

			textField = new JTextField();
			textField.setText("EQUIPO 1");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_1 = new JTextField();
			textField_1.setBounds(85, 84, 221, 23);
			add(textField_1);
			textField_1.setColumns(10);

			pers1 = new JComboBox<String>(fotos);
			pers1.setBounds(312, 84, 127, 20);
			add(pers1);

			pers1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers1.getSelectedItem();
					imgEq.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq.setBounds(430, 48, 96, 93);
				}
			});

			imgEq = new JLabel(new ImageIcon());
			add(imgEq);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 2");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(85, 188, 221, 23);
			add(textField_2);

			pers2 = new JComboBox<String>(fotos);
			pers2.setBounds(312, 188, 127, 20);
			add(pers2);

			pers2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers2.getSelectedItem();
					imgEq1.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq1.setBounds(430, 152, 96, 93);
				}
			});

			imgEq1 = new JLabel(new ImageIcon());
			add(imgEq1);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 3");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(85, 292, 221, 23);
			add(textField_3);

			pers3 = new JComboBox<String>(fotos);
			pers3.setBounds(312, 292, 127, 20);
			add(pers3);

			pers3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers3.getSelectedItem();
					imgEq2.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq2.setBounds(430, 256, 96, 93);
				}
			});

			imgEq2 = new JLabel(new ImageIcon());
			add(imgEq2);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 4");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 396, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(85, 396, 221, 23);
			add(textField_4);

			pers4 = new JComboBox<String>(fotos);
			pers4.setBounds(312, 396, 127, 20);
			add(pers4);

			pers4.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers4.getSelectedItem();
					imgEq3.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq3.setBounds(430, 360, 96, 93);
				}
			});

			imgEq3 = new JLabel(new ImageIcon());
			add(imgEq3);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 5");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 500, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(85, 500, 221, 23);
			add(textField_5);


			pers5 = new JComboBox<String>(fotos);
			pers5.setBounds(312, 500, 127, 20);
			add(pers5);

			pers5.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers5.getSelectedItem();
					imgEq4.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq4.setBounds(430, 464, 96, 93);
				}
			});

			imgEq4 = new JLabel(new ImageIcon());
			add(imgEq4);
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 6");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(629, 84, 221, 23);
			add(textField_6);


			pers6 = new JComboBox<String>(fotos);
			pers6.setBounds(856, 84, 127, 20);
			add(pers6);

			pers6.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers6.getSelectedItem();
					imgEq5.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq5.setBounds(989, 48, 96, 93);
				}
			});

			imgEq5 = new JLabel(new ImageIcon());
			add(imgEq5);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 7");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(629, 188, 221, 23);
			add(textField_7);


			pers7 = new JComboBox<String>(fotos);
			pers7.setBounds(856, 188, 127, 20);
			add(pers7);

			pers7.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers7.getSelectedItem();
					imgEq6.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq6.setBounds(989, 152, 96, 93);
				}
			});

			imgEq6 = new JLabel(new ImageIcon());
			add(imgEq6);

		}
		if (cantidad == 8) {

			textField = new JTextField();
			textField.setText("EQUIPO 1");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_1 = new JTextField();
			textField_1.setBounds(85, 84, 221, 23);
			add(textField_1);
			textField_1.setColumns(10);

			pers1 = new JComboBox<String>(fotos);
			pers1.setBounds(312, 84, 127, 20);
			add(pers1);

			pers1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers1.getSelectedItem();
					imgEq.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq.setBounds(430, 48, 96, 93);
				}
			});

			imgEq = new JLabel(new ImageIcon());
			add(imgEq);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 2");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(85, 188, 221, 23);
			add(textField_2);

			pers2 = new JComboBox<String>(fotos);
			pers2.setBounds(312, 188, 127, 20);
			add(pers2);

			pers2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers2.getSelectedItem();
					imgEq1.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq1.setBounds(430, 152, 96, 93);
				}
			});

			imgEq1 = new JLabel(new ImageIcon());
			add(imgEq1);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 3");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(85, 292, 221, 23);
			add(textField_3);

			pers3 = new JComboBox<String>(fotos);
			pers3.setBounds(312, 292, 127, 20);
			add(pers3);

			pers3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers3.getSelectedItem();
					imgEq2.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq2.setBounds(430, 256, 96, 93);
				}
			});

			imgEq2 = new JLabel(new ImageIcon());
			add(imgEq2);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 4");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 396, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(85, 396, 221, 23);
			add(textField_4);

			pers4 = new JComboBox<String>(fotos);
			pers4.setBounds(312, 396, 127, 20);
			add(pers4);

			pers4.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers4.getSelectedItem();
					imgEq3.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq3.setBounds(430, 360, 96, 93);
				}
			});

			imgEq3 = new JLabel(new ImageIcon());
			add(imgEq3);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 5");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 500, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(85, 500, 221, 23);
			add(textField_5);


			pers5 = new JComboBox<String>(fotos);
			pers5.setBounds(312, 500, 127, 20);
			add(pers5);

			pers5.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers5.getSelectedItem();
					imgEq4.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq4.setBounds(430, 464, 96, 93);
				}
			});

			imgEq4 = new JLabel(new ImageIcon());
			add(imgEq4);
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 6");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(629, 84, 221, 23);
			add(textField_6);


			pers6 = new JComboBox<String>(fotos);
			pers6.setBounds(856, 84, 127, 20);
			add(pers6);

			pers6.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers6.getSelectedItem();
					imgEq5.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq5.setBounds(989, 48, 96, 93);
				}
			});

			imgEq5 = new JLabel(new ImageIcon());
			add(imgEq5);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 7");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(629, 188, 221, 23);
			add(textField_7);


			pers7 = new JComboBox<String>(fotos);
			pers7.setBounds(856, 188, 127, 20);
			add(pers7);

			pers7.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers7.getSelectedItem();
					imgEq6.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq6.setBounds(989, 152, 96, 93);
				}
			});

			imgEq6 = new JLabel(new ImageIcon());
			add(imgEq6);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 8");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(629, 292, 221, 23);
			add(textField_8);

			pers8 = new JComboBox<String>(fotos);
			pers8.setBounds(856, 292, 127, 20);
			add(pers8);

			pers8.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers8.getSelectedItem();
					imgEq7.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq7.setBounds(989, 256, 96, 93);
				}
			});

			imgEq7 = new JLabel(new ImageIcon());
			add(imgEq7);

		}
		if (cantidad == 9) {
			textField = new JTextField();
			textField.setText("EQUIPO 1");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_1 = new JTextField();
			textField_1.setBounds(85, 84, 221, 23);
			add(textField_1);
			textField_1.setColumns(10);

			pers1 = new JComboBox<String>(fotos);
			pers1.setBounds(312, 84, 127, 20);
			add(pers1);

			pers1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers1.getSelectedItem();
					imgEq.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq.setBounds(430, 48, 96, 93);
				}
			});

			imgEq = new JLabel(new ImageIcon());
			add(imgEq);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 2");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(85, 188, 221, 23);
			add(textField_2);

			pers2 = new JComboBox<String>(fotos);
			pers2.setBounds(312, 188, 127, 20);
			add(pers2);

			pers2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers2.getSelectedItem();
					imgEq1.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq1.setBounds(430, 152, 96, 93);
				}
			});

			imgEq1 = new JLabel(new ImageIcon());
			add(imgEq1);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 3");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(85, 292, 221, 23);
			add(textField_3);

			pers3 = new JComboBox<String>(fotos);
			pers3.setBounds(312, 292, 127, 20);
			add(pers3);

			pers3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers3.getSelectedItem();
					imgEq2.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq2.setBounds(430, 256, 96, 93);
				}
			});

			imgEq2 = new JLabel(new ImageIcon());
			add(imgEq2);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 4");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 396, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(85, 396, 221, 23);
			add(textField_4);

			pers4 = new JComboBox<String>(fotos);
			pers4.setBounds(312, 396, 127, 20);
			add(pers4);

			pers4.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers4.getSelectedItem();
					imgEq3.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq3.setBounds(430, 360, 96, 93);
				}
			});

			imgEq3 = new JLabel(new ImageIcon());
			add(imgEq3);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 5");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 500, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(85, 500, 221, 23);
			add(textField_5);


			pers5 = new JComboBox<String>(fotos);
			pers5.setBounds(312, 500, 127, 20);
			add(pers5);

			pers5.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers5.getSelectedItem();
					imgEq4.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq4.setBounds(430, 464, 96, 93);
				}
			});

			imgEq4 = new JLabel(new ImageIcon());
			add(imgEq4);
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 6");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(629, 84, 221, 23);
			add(textField_6);


			pers6 = new JComboBox<String>(fotos);
			pers6.setBounds(856, 84, 127, 20);
			add(pers6);

			pers6.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers6.getSelectedItem();
					imgEq5.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq5.setBounds(989, 48, 96, 93);
				}
			});

			imgEq5 = new JLabel(new ImageIcon());
			add(imgEq5);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 7");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(629, 188, 221, 23);
			add(textField_7);


			pers7 = new JComboBox<String>(fotos);
			pers7.setBounds(856, 188, 127, 20);
			add(pers7);

			pers7.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers7.getSelectedItem();
					imgEq6.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq6.setBounds(989, 152, 96, 93);
				}
			});

			imgEq6 = new JLabel(new ImageIcon());
			add(imgEq6);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 8");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(629, 292, 221, 23);
			add(textField_8);

			pers8 = new JComboBox<String>(fotos);
			pers8.setBounds(856, 292, 127, 20);
			add(pers8);

			pers8.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers8.getSelectedItem();
					imgEq7.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq7.setBounds(989, 256, 96, 93);
				}
			});

			imgEq7 = new JLabel(new ImageIcon());
			add(imgEq7);
			
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 9");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 396, 65, 20);
			add(textField);
			textField.setColumns(10);

	
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(629, 396, 221, 23);
			add(textField_9);

			
			pers9 = new JComboBox<String>(fotos);
			pers9.setBounds(856, 396, 127, 20);
			add(pers9);

			pers9.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers9.getSelectedItem();
					imgEq8.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq8.setBounds(989, 360, 96, 93);
				}
			});

			imgEq8 = new JLabel(new ImageIcon());
			add(imgEq8);

		}
		if (cantidad == 10) {
			textField = new JTextField();
			textField.setText("EQUIPO 1");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_1 = new JTextField();
			textField_1.setBounds(85, 84, 221, 23);
			add(textField_1);
			textField_1.setColumns(10);

			pers1 = new JComboBox<String>(fotos);
			pers1.setBounds(312, 84, 127, 20);
			add(pers1);

			pers1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers1.getSelectedItem();
					imgEq.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq.setBounds(430, 48, 96, 93);
				}
			});

			imgEq = new JLabel(new ImageIcon());
			add(imgEq);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 2");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(85, 188, 221, 23);
			add(textField_2);

			pers2 = new JComboBox<String>(fotos);
			pers2.setBounds(312, 188, 127, 20);
			add(pers2);

			pers2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers2.getSelectedItem();
					imgEq1.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq1.setBounds(430, 152, 96, 93);
				}
			});

			imgEq1 = new JLabel(new ImageIcon());
			add(imgEq1);




			//***************************************************************************************//

			textField = new JTextField();
			textField.setText("EQUIPO 3");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(85, 292, 221, 23);
			add(textField_3);

			pers3 = new JComboBox<String>(fotos);
			pers3.setBounds(312, 292, 127, 20);
			add(pers3);

			pers3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers3.getSelectedItem();
					imgEq2.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq2.setBounds(430, 256, 96, 93);
				}
			});

			imgEq2 = new JLabel(new ImageIcon());
			add(imgEq2);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 4");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 396, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(85, 396, 221, 23);
			add(textField_4);

			pers4 = new JComboBox<String>(fotos);
			pers4.setBounds(312, 396, 127, 20);
			add(pers4);

			pers4.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers4.getSelectedItem();
					imgEq3.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq3.setBounds(430, 360, 96, 93);
				}
			});

			imgEq3 = new JLabel(new ImageIcon());
			add(imgEq3);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 5");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 500, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(85, 500, 221, 23);
			add(textField_5);


			pers5 = new JComboBox<String>(fotos);
			pers5.setBounds(312, 500, 127, 20);
			add(pers5);

			pers5.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers5.getSelectedItem();
					imgEq4.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq4.setBounds(430, 464, 96, 93);
				}
			});

			imgEq4 = new JLabel(new ImageIcon());
			add(imgEq4);
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 6");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(629, 84, 221, 23);
			add(textField_6);


			pers6 = new JComboBox<String>(fotos);
			pers6.setBounds(856, 84, 127, 20);
			add(pers6);

			pers6.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers6.getSelectedItem();
					imgEq5.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq5.setBounds(989, 48, 96, 93);
				}
			});

			imgEq5 = new JLabel(new ImageIcon());
			add(imgEq5);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 7");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 188, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(629, 188, 221, 23);
			add(textField_7);


			pers7 = new JComboBox<String>(fotos);
			pers7.setBounds(856, 188, 127, 20);
			add(pers7);

			pers7.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers7.getSelectedItem();
					imgEq6.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq6.setBounds(989, 152, 96, 93);
				}
			});

			imgEq6 = new JLabel(new ImageIcon());
			add(imgEq6);

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 8");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 292, 65, 20);
			add(textField);
			textField.setColumns(10);


			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(629, 292, 221, 23);
			add(textField_8);

			pers8 = new JComboBox<String>(fotos);
			pers8.setBounds(856, 292, 127, 20);
			add(pers8);

			pers8.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers8.getSelectedItem();
					imgEq7.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq7.setBounds(989, 256, 96, 93);
				}
			});

			imgEq7 = new JLabel(new ImageIcon());
			add(imgEq7);
			
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 9");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 396, 65, 20);
			add(textField);
			textField.setColumns(10);

	
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(629, 396, 221, 23);
			add(textField_9);

			
			pers9 = new JComboBox<String>(fotos);
			pers9.setBounds(856, 396, 127, 20);
			add(pers9);

			pers9.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers9.getSelectedItem();
					imgEq8.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq8.setBounds(989, 360, 96, 93);
				}
			});

			imgEq8 = new JLabel(new ImageIcon());
			add(imgEq8);
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 10");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 500, 65, 20);
			add(textField);
			textField.setColumns(10);

	
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(629, 500, 221, 23);
			add(textField_10);

	
			pers10 = new JComboBox<String>(fotos);
			pers10.setBounds(856, 500, 127, 20);
			add(pers10);

			pers10.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {

					s = (String) pers10.getSelectedItem();
					imgEq9.setIcon(new ImageIcon("assets/caras/"+s +".png"));
					imgEq9.setBounds(989, 464, 96, 93);
				}
			});

			imgEq9 = new JLabel(new ImageIcon());
			add(imgEq9);


		}

	}



}