package COLWAR;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Batalla extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton sumar,restar,atack;
	private JProgressBar vida1;
	String characters[] = {null,"Stickman","Mario", "Link", "Pikachu","Donkey Kong","Sonic","Creeper","Goku","Ratchet & Clank","Sub-Zero"};
	/**
	 * Create the panel.
	 */
	public Batalla() {
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 261, 327);
		add(lblNewLabel);
		
		vida1 = new JProgressBar();
		vida1.setBounds(307, 120, 329, 53);
		add(vida1);
		
		textField = new JTextField();
		textField.setBounds(307, 47, 163, 40);
		add(textField);
		textField.setColumns(10);
		
		restar = new JButton("-");
		restar.setBounds(249, 415, 48, 47);
		add(restar);
		restar = new JButton("-");
		restar.setBounds(499, 415, 48, 47);
		add(restar);
		
		sumar = new JButton("+");
		sumar.setBounds(663, 415, 48, 47);
		add(sumar);
		
		sumar = new JButton("+");
		sumar.setBounds(413, 415, 48, 47);
		add(sumar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(307, 415, 96, 46);
		add(textField_1);
		textField_1.setColumns(10);
	
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(557, 415, 96, 46);
		add(textField_2);
		
		atack = new JButton("atac");
		atack.setBounds(401, 561, 163, 76);
		add(atack);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(307, 289, 96, 83);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(557, 289, 96, 83);
		add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(characters));
		comboBox.setBounds(10, 373, 185, 22);
		add(comboBox);
	}
}
