import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Creditos extends JPanel implements ActionListener{
	private JLabel fondo;
	private JButton github, volver;
	public Creditos() {
		setBounds(100, 100, 1100, 700);
		setLayout(null);

		github = new JButton(new ImageIcon(new ImageIcon("assets/botones/github.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		github.setBounds(940, 555, 73, 68);
		github.setFocusable(true);
		github.setBorder(null);
		github.setFocusPainted(false);
		github.setContentAreaFilled(false);
		github.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebPage("https://github.com/Farreset/Pixel-War.git");
			}
		});
		add(github);

		volver = new JButton(new ImageIcon(new ImageIcon("assets/botones/homeC.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)));
		volver.setBounds(40, 546, 80, 80);
		volver.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/home1.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)));
		volver.setFocusable(true);
		volver.setBorder(null);
		volver.setFocusPainted(false);
		volver.setContentAreaFilled(false);
		volver.addActionListener(this);
		add(volver);

		fondo = new JLabel();
		fondo.setIcon(new ImageIcon(new ImageIcon("assets/fondos/creditos.png").getImage().getScaledInstance(1100,700, Image.SCALE_DEFAULT)));
		fondo.setBounds(0, 0, 1100, 700);
		add(fondo);

	}
	public void openWebPage(String url){
		try {         
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		}
		catch (java.io.IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(volver == e.getSource()) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Menu());
			Marco.setVisible(true);	
		}
	}

}
