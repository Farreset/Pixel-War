package COLWAR;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Reglas extends JPanel implements ActionListener {
	public  int i = 2;
	public int x = 0;
	private JButton volver, iz,de;
	private JLabel imgEq,fondo;
	private ImageIcon img,imgDe,imgIz;
	public Reglas() {


		setBounds(100, 100, 1100, 700);
		setLayout(null);

		imgIz = new ImageIcon("assets/botones/izquierda1.png");

		imgDe = new ImageIcon("assets/botones/derecha1.png");


		imgEq = new JLabel(new ImageIcon("assets/fondos/pag1.png"));
		imgEq.setBounds(155, 11, 790, 583);
		add(imgEq);
		
		volver = new JButton(new ImageIcon(new ImageIcon("assets/botones/volver1.png").getImage().getScaledInstance(150, 72, Image.SCALE_DEFAULT)));
		volver.setBounds(466, 576, 150, 72);
		volver.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/volver2.png").getImage().getScaledInstance(150, 72, Image.SCALE_DEFAULT)));
		volver.setFocusable(true);
		volver.setBorder(null);
		volver.setFocusPainted(false);
		volver.setContentAreaFilled(false);
		volver.addActionListener(this);
		add(volver);
		
		iz = new JButton(imgIz);
		iz.setBounds(25, 285, 110, 113);
		iz.setFocusable(true);
		iz.setBorder(null);
		iz.setPressedIcon(new ImageIcon("assets/botones/izquierda2.png"));
		iz.setFocusPainted(false);
		iz.setContentAreaFilled(false);
		add(iz);

		de = new JButton(imgDe);
		de.setBounds(955, 285, 110, 113);
		de.setPressedIcon(new ImageIcon("assets/botones/derecha2.png"));
		de.setFocusable(true);
		de.setBorder(null);
		de.setFocusPainted(false);
		de.setContentAreaFilled(false);
		add(de);
		

		fondo = new JLabel();
		fondo.setIcon(new ImageIcon(new ImageIcon("assets/fondos/fondoReglas.gif").getImage().getScaledInstance(1240,800, Image.SCALE_DEFAULT)));
		fondo.setBounds(0, 0, 1100, 700);
		add(fondo);



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