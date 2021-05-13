package COLWAR;

import java.awt.BorderLayout;
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
	private JTextField textField;
	private JScrollPane scroll;
	public static String text;
	private JButton continuar;
	private int cantidad;
	private String tipos[];
	private String nom[];

	public FinalRonda(String toString, int cantidad, String tipos[], String nom[]) {
		this.cantidad = cantidad;
		this.tipos = tipos;
		this.nom = nom;
		
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		continuar = new JButton("continuar");
		continuar.setBounds(416, 409, 163, 76);
		add(continuar);
		continuar.addActionListener(this);
	    	JScrollBar scrollBar = new JScrollBar();
			scrollBar.setBounds(1044, 131, 40, 376);
			  scroll = new JScrollPane(textField);
		        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

			add(scrollBar);
			
			textField = new JTextField();
			textField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
			textField.setText(Batalla.Resumen(cantidad, cantidad, toString, toString));
			
			textField.setBounds(0, 131, 1044, 376);
			textField.setEditable(false); // set textArea non-editable
		
			textField.setColumns(10);
			add(textField);
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