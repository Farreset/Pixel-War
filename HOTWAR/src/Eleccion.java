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
import java.awt.Image;

import javax.swing.JLabel;

public class Eleccion extends JPanel implements ActionListener{

	private JButton volver, start;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_17;
	private JTextField textField_19;
	private JLabel imgEq,imgEq1,imgEq2,imgEq3,imgEq4,imgEq5,imgEq6,imgEq7,imgEq8,imgEq9;
	JComboBox <String> pers1,pers2,pers3,pers4,pers5,pers6,pers7,pers8,pers9,pers10;
	String fotos[] = {null,"Stickman","Mario", "Link", "Pikachu","Donkey Kong","Sonic","Creeper","Goku","Ratchet & Clank","Sub-Zero"};
	String s;

	public Eleccion(int num) {
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
		
		start = new JButton("EMPEZAR");
		start.setBounds(946, 580, 110, 50);
		add(start);

		volver.addActionListener(this);
		start.addActionListener(this);

		plantillas(num);
		

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==volver) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Jugar());
			Marco.setVisible(true);

		}
		if(e.getSource()==start) {
			
		}
		
			

	}

	public void plantillas(int cantidad) {

		if (cantidad == 3) {
			textField = new JTextField();
			textField.setText("EQUIPO 1");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 84, 65, 20);
			add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(85, 84, 221, 20);
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


			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(85, 188, 221, 20);
			add(textField_3);

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

			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(85, 292, 221, 20);
			add(textField_5);

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

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 4");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 396, 65, 20);
			add(textField);
			textField.setColumns(10);

			pers4 = new JComboBox();
			pers4.setBounds(312, 396, 127, 20);
			pers4.setModel(new DefaultComboBoxModel());
			add(pers4);

			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(85, 396, 221, 20);
			add(textField_7);

			imgEq = new JLabel("New label");
			imgEq.setBounds(430, 360, 96, 93);
			add(imgEq);
		}
		if (cantidad == 5) {
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 5");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(10, 500, 65, 20);
			add(textField);
			textField.setColumns(10);

			pers5 = new JComboBox();
			pers5.setBounds(312, 500, 127, 20);
			pers5.setModel(new DefaultComboBoxModel());
			add(pers5);

			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(85, 500, 221, 20);
			add(textField_9);

			imgEq = new JLabel("New label");
			imgEq.setBounds(430, 464, 96, 93);
			add(imgEq);
		}
		if (cantidad == 6) {
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 6");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 84, 65, 20);
			add(textField);
			textField.setColumns(10);

			pers6 = new JComboBox();
			pers6.setBounds(856, 84, 127, 20);
			pers6.setModel(new DefaultComboBoxModel());
			add(pers6);

			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(629, 84, 221, 20);
			add(textField_11);

			imgEq= new JLabel("New label");
			imgEq.setBounds(989, 48, 96, 93);
			add(imgEq);

		}
		if (cantidad == 7) {

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 7");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 188, 65, 20);
			add(textField);
			textField.setColumns(10);

			pers7 = new JComboBox();
			pers7.setBounds(856, 188, 127, 20);
			pers7.setModel(new DefaultComboBoxModel());
			add(pers7);

			textField_13 = new JTextField();
			textField_13.setColumns(10);
			textField_13.setBounds(629, 188, 221, 20);
			add(textField_13);

			imgEq= new JLabel(new ImageIcon());
			imgEq.setBounds(989, 152, 96, 93);
			add(imgEq);

		}
		if (cantidad == 8) {

			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 8");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 292, 65, 20);
			add(textField);
			textField.setColumns(10);

			pers8 = new JComboBox();
			pers8.setBounds(856, 292, 127, 20);
			pers8.setModel(new DefaultComboBoxModel());
			add(pers8);

			textField_15 = new JTextField();
			textField_15.setColumns(10);
			textField_15.setBounds(629, 292, 221, 20);
			add(textField_15);

			imgEq = new JLabel("New label");
			imgEq.setBounds(989, 256, 96, 93);
			add(imgEq);
		}
		if (cantidad == 9) {
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 9");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 396, 65, 20);
			add(textField);
			textField.setColumns(10);

			pers9 = new JComboBox();
			pers9.setBounds(856, 396, 127, 20);
			pers9.setModel(new DefaultComboBoxModel());
			add(pers9);

			textField_17 = new JTextField();
			textField_17.setColumns(10);
			textField_17.setBounds(629, 396, 221, 20);
			add(textField_17);

			imgEq = new JLabel("New label");
			imgEq.setBounds(989, 360, 96, 93);
			add(imgEq);
		}
		if (cantidad == 10) {
			//***************************************************************************************//
			textField = new JTextField();
			textField.setText("EQUIPO 10");
			textField.setEnabled(false);
			textField.setEditable(false);
			textField.setBounds(554, 500, 65, 20);
			add(textField);
			textField.setColumns(10);

			pers10 = new JComboBox();
			pers10.setBounds(856, 500, 127, 20);
			pers10.setModel(new DefaultComboBoxModel());
			add(pers10);

			textField_19 = new JTextField();
			textField_19.setColumns(10);
			textField_19.setBounds(629, 500, 221, 20);
			add(textField_19);

			imgEq= new JLabel("New label");
			imgEq.setBounds(989, 464, 96, 93);
			add(imgEq);

		}
	
	}
	
	}
