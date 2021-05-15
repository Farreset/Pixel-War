import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalRonda extends JPanel implements ActionListener{

	private JPanel contentPane;
	public static String text;
	private JButton continuar;
	private int cantidad;
	private String tipos[];
	private String nom[];
	private JTextArea textArea;
	public FinalRonda(String toString, int cantidad, String tipos[], String nom[]) {this.cantidad = cantidad;
		this.tipos = tipos;
		this.nom = nom;
		
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		continuar = new JButton("continuar");
		continuar.setBounds(468, 539, 163, 76);
		add(continuar);
		continuar.addActionListener(this);
	  
			textArea = new JTextArea(Batalla.texto);
			textArea.setForeground(Color.GREEN);
			textArea.setEnabled(false);
			textArea.setFont(new Font("Bahnschrift", Font.BOLD, 25));
			textArea.setBounds(0, 100, 1100, 422);
			add(textArea);
		

			JLabel Resumen = new JLabel("New label");
			Resumen.setBounds(367, 11, 341, 78);
			add(Resumen);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(0, 0, 1084, 661);
			add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==continuar) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Batalla(this.cantidad, this.tipos, this.nom));
			Marco.setVisible(true);
		}
		
	}
}