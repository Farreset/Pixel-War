package COLWAR;

import java.awt.Color;
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
import javax.swing.JOptionPane;

public class Reglas extends JPanel implements ActionListener {
	public  int i = 2;
	public int x = 0;
	private JButton volver, iz,de;
	private JLabel imgEq;
	private ImageIcon img;
	public Reglas() {


		setBounds(100, 100, 1100, 700);
		setLayout(null);

		volver = new JButton("VOLVER");
		volver.setBounds(44, 580, 110, 50);
		add(volver);

		iz = new JButton("izquierda");
		iz.setBounds(79, 285, 75, 62);
		add(iz);

		de = new JButton("derecha");
		de.setBounds(964, 285, 75, 62);
		add(de);


		volver.addActionListener(this);

		imgEq = new JLabel(new ImageIcon("assets/fondos/pag1.png"));
		imgEq.setBounds(164, 28, 790, 583);
		add(imgEq);

		de.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			if(x==2) {//PARA QUE NO SE REPITA LA MISMA IMAGEN AL CAMBIAR DE SENTIDO
				i++;
			}
			if( i < 7) {
				img=new ImageIcon("assets/fondos/pag"+(i)+".png");
				imgEq.setIcon(img);
				i++;
				x=1;//IDENTIFICA QUE ESTAS EN LA PAGINA DERECHA
			}
			else if(e.getSource()==de && i == 7) {
				JOptionPane.showInternalMessageDialog(null, "NO HAY MÁS PAGINAS", "Aviso de paginas", 2);	
			}
		}
		});
		iz.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			if(x==1) {//PARA QUE NO SE REPITA LA MISMA IMAGEN AL CAMBIAR DE SENTIDO
				i --;	
			}
			if(i > 1) {
				i--;
				img=new ImageIcon("assets/fondos/pag"+(i)+".png");
				imgEq.setIcon(img);
				x =2;//IDENTIFICA QUE ESTAS EN LA PAGINA IZQUIERDA
			}
			else if(e.getSource()==iz && i == 1) {
				JOptionPane.showInternalMessageDialog(null, "NO HAY MÁS PAGINAS", "Aviso de paginas", 2);	
			}

		}
		});
	}
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==volver) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Menu());
			Marco.setVisible(true);

		}
	
	}




}

