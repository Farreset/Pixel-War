import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.ImageIcon;
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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalRonda extends JPanel implements ActionListener{

	private JPanel contentPane;
	public static String text;
	public static int contador;
	private static JButton continuar;
	private int cantidad;
	private String tipos[];
	private JTextArea textArea;
	private String nom[];
	private JScrollPane scrollbar;
	private JLabel rondas;
	public FinalRonda(String toString, int cantidad, String tipos[], String nom[]) {//lo que se passa de batalla
		this.cantidad = cantidad;//cantidad de personajes
		this.tipos = tipos;//el tipo de los personajes
		this.nom = nom;//el nombre de los jugadores
		
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		
	//assets y diseños
		continuar = new JButton(new ImageIcon(new ImageIcon("assets/botones/frondab.png").getImage().getScaledInstance(160, 72, Image.SCALE_DEFAULT)));
		continuar.setBounds(468, 539, 160, 76);
		continuar.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/frondab1.png").getImage().getScaledInstance(160, 72, Image.SCALE_DEFAULT)));
		continuar.setFocusable(true);
		continuar.setBorder(null);
		continuar.setFocusPainted(false);
		continuar.setContentAreaFilled(false);
		add(continuar);
		continuar.addActionListener(this);
		
	  
			textArea = new JTextArea(Batalla.texto);
			textArea.setForeground(new Color(51, 204, 102));
			textArea.setEditable(false);
			textArea.setOpaque(false);
			textArea.setFont(new Font("Bahnschrift", Font.BOLD, 25));
			textArea.setBounds(21, 106, 1063, 422);
			textArea.setBorder(null);
			add(textArea);
			
			scrollbar = new JScrollPane(textArea);
			scrollbar.setBounds(16, 105, 1047, 422);
			scrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollbar.setOpaque(false);
			scrollbar.setBorder(null);
			scrollbar.getViewport().setBorder(null);
			scrollbar.getViewport().setOpaque(false);
			add(scrollbar);
		
			rondas = new JLabel(new ImageIcon(new ImageIcon("assets/botones/resumen.png").getImage().getScaledInstance(240,70, Image.SCALE_DEFAULT)));
			rondas.setBounds(430, 11, 240, 70);
			add(rondas);
			
			JLabel lblNewLabel = new JLabel(new ImageIcon(new ImageIcon("assets/fondos/fronda.png").getImage().getScaledInstance(1084,661, Image.SCALE_DEFAULT)));
			lblNewLabel.setBounds(0, 0, 1084, 661);
			add(lblNewLabel);
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==continuar) {
		//cambiar de panel
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new Batalla(this.cantidad, this.tipos, this.nom, Eleccion.equipos));
			Marco.setVisible(true);
		}
		
	}
}
