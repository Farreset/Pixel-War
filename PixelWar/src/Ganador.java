import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Ganador extends JPanel implements ActionListener {
	private JButton home;
	private JLabel fondo,lblNewLabel,fondo2;
	private ImageIcon imgIcon;
	private JTextField textField;
	public Ganador(String foto) {
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		
		//ASSETS Y DISEÑOS
		home = new JButton(new ImageIcon(new ImageIcon("assets/botones/home.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)));
		home.setBounds(40, 546, 80, 80);
		home.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/home1.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)));
		home.setFocusable(true);
		home.setBorder(null); // NO VER EL BORDE DEL BOTON
		home.setFocusPainted(false);
		home.setContentAreaFilled(false);
		home.addActionListener(this);
		add(home);
		
		fondo2 = new JLabel();
		fondo2.setIcon(new ImageIcon(new ImageIcon("assets/fondos/confeti.gif").getImage().getScaledInstance(1100,665, Image.SCALE_DEFAULT)));
		fondo2.setBounds(0, 0, 1100, 665);
		add(fondo2);
		
		lblNewLabel = new JLabel(new ImageIcon(foto));
		lblNewLabel.setBounds(446, 186, 208, 327);
		add(lblNewLabel);
		
		textField = new JTextField();//NOMBRE DEL GANADOR
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(255, 250, 205));
		textField.setFont(new Font("Malgun Gothic", Font.BOLD, 56));
		textField.setBounds(147, 147, 805, 57);
		textField.setOpaque(false);
		textField.setEditable(false);
		textField.setBorder(null);
		add(textField);
		textField.setColumns(10);
		
		
		fondo = new JLabel();
		fondo.setIcon(new ImageIcon(new ImageIcon("assets/fondos/ganar.png").getImage().getScaledInstance(1100,665, Image.SCALE_DEFAULT)));
		fondo.setBounds(0, 0, 1100, 665);
		add(fondo);
		
		
		
	
	}
	public void actionPerformed(ActionEvent e) {
		if(home == e.getSource()) {//RETRONAR AL MENU
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Menu());
			Marco.setVisible(true);	
		}
	}
}