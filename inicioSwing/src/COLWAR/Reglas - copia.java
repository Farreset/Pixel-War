package COLWAR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class Reglas extends JPanel implements ActionListener {

	private JButton volver, iz,de;
	private ArrayList<JLabel> imagenes = new ArrayList<JLabel>();

	public Reglas() {
		setBounds(100, 100, 1100, 700);
		setLayout(null);

		volver = new JButton("VOLVER");
		volver.setBounds(44, 580, 110, 50);
		add(volver);

		iz = new JButton("New button");
		iz.setBounds(79, 285, 75, 62);
		add(iz);

		de = new JButton("derecha");
		de.setBounds(964, 285, 75, 62);
		add(de);

		de.addActionListener(this);
		iz.addActionListener(this);
		volver.addActionListener(this);
		

		for(int i =0;i<5;i++) {
			
			imagenes.add(new JLabel(new ImageIcon("assets/fondos/pag"+(i+1)+".png")));
		imagenes.get(i).setBounds(164, 28, 790, 583);
		
		}
	



	}

	public void actionPerformed(ActionEvent e) {
		
		int i = 1;
		
		if(e.getSource()==volver) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Menu());
			Marco.setVisible(true);

		}
		else if(e.getSource()==de) {
			imagenes.get(i).setVisible(false);
			
			add(imagenes.get(i));
			imagenes.get(i).setVisible(true);	
			
		}
	}
}



