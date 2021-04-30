package COLWAR;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Batalla extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton sumar,restar,atack;
	String characters[] = {null,};
	private JTextField txtMariano;
	private JTextField textField_3;
	private JProgressBar vida;
	/**
	 * Create the panel.
	 */
	public Batalla() {
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("dni");
		lblNewLabel.setBounds(0, 0, 261, 327);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(270, 42, 163, 40);
		add(textField);
		textField.setColumns(10);
		
		restar = new JButton("-");
		restar.setBounds(264, 263, 48, 47);
		add(restar);
		restar = new JButton("-");
		restar.setBounds(514, 263, 48, 47);
		add(restar);
		
		sumar = new JButton("+");
		sumar.setBounds(678, 263, 48, 47);
		add(sumar);
		
		sumar = new JButton("+");
		sumar.setBounds(428, 263, 48, 47);
		add(sumar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(322, 263, 96, 46);
		add(textField_1);
		textField_1.setColumns(10);
	
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(572, 263, 96, 46);
		add(textField_2);
		
		atack = new JButton("atac");
		atack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		atack.setBounds(416, 409, 163, 76);
		add(atack);
		
		JLabel lblNewLabel_1 = new JLabel("atakc");
		lblNewLabel_1.setBounds(322, 137, 96, 83);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("def");
		lblNewLabel_1_1.setBounds(572, 137, 96, 83);
		add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(characters));
		comboBox.setBounds(10, 373, 185, 22);
		add(comboBox);
		
		txtMariano = new JTextField();
		txtMariano.setText("Mariano");
		txtMariano.setBounds(866, 47, 129, 14);
		add(txtMariano);
		txtMariano.setColumns(10);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(866, 68, 146, 14);
		add(progressBar);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(816, 47,40, 40);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setText("Mariano");
		textField_3.setColumns(10);
		textField_3.setBounds(866, 127, 96, 14);
		add(textField_3);
		
		vida = new JProgressBar();
		vida.setBounds(866, 152, 146, 14);
		add(vida);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBounds(866, 93, 72, 14);
		add(progressBar_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(816, 127, 40, 40);
		add(lblNewLabel_3_1);
		
		JLabel fondo = new JLabel("New label");
		fondo.setBounds(0, 0, 1100, 700);
		add(fondo);
		
	
	}
}
