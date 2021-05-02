import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

import javax.swing.JTextField;

public class Barra extends JPanel implements ActionListener {
	public static int x = 0,r = 0;
	private JButton restar,sumar,atack;
	private JProgressBar vida, mana;
	private JTextField textField;

	public Barra() {

		setLayout(null);

		vida = new JProgressBar();
		vida.setValue(100);
		vida.setStringPainted(true);
		vida.setForeground(Color.GREEN);
		vida.setBounds(115, 200, 625, 59);
		add(vida);

		restar = new JButton("vida");
		restar.setBounds(99, 410, 89, 23);
		add(restar);

		sumar = new JButton("mana");
		sumar.setBounds(687, 410, 89, 23);
		add(sumar);


		mana = new JProgressBar();
		mana.setValue(0);
		mana.setStringPainted(true);
		mana.setForeground(new Color(0, 0, 255));
		mana.setBounds(115, 309, 344, 23);
		add(mana);

		textField = new JTextField();
		textField.setBounds(115, 87, 178, 20);
		textField.setColumns(10);
		add(textField);

		atack = new JButton("atacar");
		atack.setBounds(385, 484, 89, 23);
		add(atack);
		
		atack.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==atack && mana.getValue()==100) {
				mana.setValue(0);
				System.out.println("acabas de matar a una persona inocente");
				x=0;r=0;
			}
			else if(e.getSource()==atack && mana.getValue()!=100) {
				
				System.out.println("No hay el mana");
			}
		}});
		
		restar.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			String gb = textField.getText();
			if(gb==null && e.getSource()==restar) {
				JOptionPane.showInternalMessageDialog(null, "ELEGE LA CANTIDAD DE EQUIPOS", "Error de cantidad", 0);
			}
			int numero=Integer.parseInt(gb);

			if(e.getSource()==restar) {
				vida.setValue(numero);	
			}

			if(numero > 50) {
				vida.setForeground(Color.GREEN);
			}
			else if(numero <= 50) {
				vida.setForeground(Color.ORANGE);
			}
			else if(numero > 25) {
				vida.setForeground(Color.ORANGE);
			}
			if(numero <= 25) {
				vida.setForeground(Color.RED);
			}
			if(mana.getValue()< 60) {
			if(vida.getValue()<=45) {
		
				r=x+60;
				mana.setValue(r);
			}
			}
		}
		});
		
		sumar.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			x++;
			r++;
			mana.setValue(r);
			
			if(mana.getValue()==100) {
				mana.setForeground(new Color(0, 0, 139));
			}
			if(mana.getValue()!=100) {
				mana.setForeground(new Color(0, 0, 255));
			}
		}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}



