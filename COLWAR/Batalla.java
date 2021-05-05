package COLWAR;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.event.*;
import javax.swing.JSlider;

public class Batalla extends JPanel {

	public static int sum=0,res=0;
	private JTextField textField;
	private JTextField txtatak;
	private JTextField txtdef;
	private JSlider atk, def ;
	private JButton sumar1,restar,sumar,restar1,atack;
	private JTextField textField_3;
	private JProgressBar vida;
	private JTextField textField_1;
	/**
	 * Create the panel.
	 */
	public Batalla(int cantidad, String tipos[], String nom[]) {
		setBackground(Color.LIGHT_GRAY);


		setBounds(100, 100, 1100, 700);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("dni");
		lblNewLabel.setBounds(0, 0, 239, 327);
		add(lblNewLabel);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(266, 105, 398, 61);
		add(textField);
		textField.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("Mariano");
		textField_3.setColumns(10);
		textField_3.setBounds(866, 40, 96, 14);
		add(textField_3);

		txtatak = new JTextField();
		txtatak.setForeground(Color.WHITE);
		txtatak.setBackground(Color.BLACK);
		txtatak.setEditable(false);
		txtatak.setText("0");
		
		txtatak.setHorizontalAlignment(SwingConstants.CENTER);
		txtatak.setBounds(318, 282, 96, 45);
		txtatak.setColumns(10);
	
		add(txtatak);


		txtdef = new JTextField();
		txtdef.setBackground(Color.BLACK);
		txtdef.setForeground(Color.WHITE);
		txtdef.setEditable(false);
		txtdef.setText("0");
		txtdef.setHorizontalAlignment(SwingConstants.CENTER);
		txtdef.setColumns(10);
		txtdef.setBounds(568, 282, 96, 47);
		add(txtdef);

		atk = new JSlider();
		atk.setBackground(Color.GREEN);
		atk.setMaximum(50);
	
		atk.setValue(0);
		atk.setBounds(266, 338, 200, 26);

		def = new JSlider();
		def.setBackground(Color.GREEN);
		def.setMaximum(50);
	
		def.setValue(0);
		def.setBounds(520, 338, 200, 26);


		sumar = new JButton("+");
		sumar.setBounds(424, 282, 48, 47);
		sumar.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {

			String s = txtatak.getText();
			int numero = Integer.valueOf(s);
			s = Integer.toString(++numero);
			atk.setValue(numero);
			txtatak.setText(s);

			if(numero > 50) {
				JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES 50", "Error de misiles", 0);
				txtatak.setText("50");

			}
			if(numero < 0) {
				JOptionPane.showInternalMessageDialog(null, "EL MINIMO DE MISILES ES 0", "Error de misiles", 0);
				txtatak.setText("0");
			}
		}});
		add(sumar);

		sumar1 = new JButton("+");
		sumar1.setBounds(674, 282, 48, 47);
		sumar1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {

			String s = txtdef.getText();
			int numero = Integer.valueOf(s);
			s = Integer.toString(++numero);
			def.setValue(numero);
			txtdef.setText(s);
		
			if(numero > 50) {
				JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES 50", "Error de misiles", 0);
				txtdef.setText("50");

			}
			if(numero < 0) {
				JOptionPane.showInternalMessageDialog(null, "EL MINIMO DE MISILES ES 0", "Error de misiles", 0);
				txtdef.setText("0");
			}

		}});
		add(sumar1);

		restar = new JButton("-");
		restar.setBounds(260, 282, 48, 47);
		restar.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {

			String s = txtatak.getText();
			int numero = Integer.valueOf(s);
			s = Integer.toString(--numero);
			atk.setValue(numero);
			txtatak.setText(s);

			if(numero > 50) {
				JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES 50", "Error de misiles", 0);
				txtatak.setText("50");

			}
			if(numero < 0) {
				JOptionPane.showInternalMessageDialog(null, "EL MINIMO DE MISILES ES 0", "Error de misiles", 0);
				txtatak.setText("0");
			}
		}});
		add(restar);

		restar1 = new JButton("-");
		restar1.setBounds(510, 282, 48, 47);
		restar1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			
			String s = txtdef.getText();
			int numero = Integer.valueOf(s);
			s = Integer.toString(--numero);
			def.setValue(numero);
			txtdef.setText(s);
		
			if(numero > 50) {
				JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES 50", "Error de misiles", 0);
				txtdef.setText("50");

			}
			if(numero < 0) {
				JOptionPane.showInternalMessageDialog(null, "EL MINIMO DE MISILES ES 0", "Error de misiles", 0);
				txtdef.setText("0");
			}
			
		}});
		add(restar1);
		
		 atk.addChangeListener(new ChangeListener(){  public void stateChanged(ChangeEvent e) {
			 txtatak.setText(String.valueOf(atk.getValue()));
	            }
	        });
		add(atk);
		 def.addChangeListener(new ChangeListener(){ public void stateChanged(ChangeEvent e) {
	                txtdef.setText(String.valueOf(def.getValue()));
	            }
	        });
		add(def);


	
		atack.setBounds(386, 474, 163, 76);
		add(atack);

		JLabel lblNewLabel_1 = new JLabel("atakc");
		lblNewLabel_1.setBounds(318, 188, 96, 83);
		add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("def");
		lblNewLabel_1_1.setBounds(568, 188, 96, 83);
		add(lblNewLabel_1_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel());
		comboBox.setBounds(10, 397, 185, 22);
		add(comboBox);



		vida = new JProgressBar();
		vida.setBounds(866, 65, 146, 14);
		add(vida);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 338, 185, 48);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(307, 11, 228, 68);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(568, 13, 78, 68);
		add(lblNewLabel_3);




	}
}