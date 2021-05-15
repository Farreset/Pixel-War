import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Barra extends JPanel implements ActionListener {
	public static int x = 0,r = 0;

	private JProgressBar vida, mana;
	private JTextField txtatak;
	private JTextField txtdef;
	private JSlider atk, def ;
	private JButton sumar1,restar,sumar,restar1,atack;

	public Barra() {

		setLayout(null);

		vida = new JProgressBar();
		vida.setValue(100);
		vida.setStringPainted(true);
		vida.setForeground(Color.GREEN);
		vida.setBounds(115, 200, 312, 59);
		add(vida);

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
		atk.setOpaque(false);
		atk.setValue(0);
		atk.setBounds(266, 338, 200, 26);

		def = new JSlider();
		def.setBackground(Color.GREEN);
		def.setMaximum(50);
		def.setOpaque(false);
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

		atack = new JButton("atacar");
		atack.setBounds(385, 484, 89, 23);
		add(atack);

		atack.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			String atk = txtatak.getText();
			int natk = Integer.valueOf(atk);
			String def = txtdef.getText();
			int ndef = Integer.valueOf(def);
			int rest = 0;
	
			
			if(e.getSource()==atack) {
			rest =Math.abs( vida.getValue()-natk);
			vida.setValue(rest);
			}
			else if( vida.getValue() < natk && e.getSource()==atack) {
				
				vida.setValue(0);		
			}

			if(rest > 50) {
				vida.setForeground(Color.GREEN);
			}
			else if(rest <= 50) {
				vida.setForeground(Color.ORANGE);
			}
			else if(rest > 25) {
				vida.setForeground(Color.ORANGE);
			}
			if(rest <= 25) {
				vida.setForeground(Color.RED);
			}




		}});




	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}


}