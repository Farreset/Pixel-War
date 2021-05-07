package COLWAR;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

public class FinalRonda extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JScrollPane scroll;
	public static String text;
	

	public FinalRonda(ArrayList resumen) {

		setBounds(100, 100, 1100, 700);
		setLayout(null);
		
	    	JScrollBar scrollBar = new JScrollBar();
			scrollBar.setBounds(1044, 131, 40, 376);
			  scroll = new JScrollPane(textField);
		        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

			add(scrollBar);
			
			textField = new JTextField();
			textField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
			textField.setText(resumen.toString());
			
			textField.setBounds(0, 131, 1044, 376);
			textField.setEditable(false); // set textArea non-editable
		
			textField.setColumns(10);
			add(textField);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1084, 661);
		add(lblNewLabel);
	}
}
