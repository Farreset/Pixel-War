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

	/**
	 * Create the panel.
	 */
	public Batalla() {
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 261, 327);
		add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(307, 120, 329, 53);
		add(progressBar);
		
		textField = new JTextField();
		textField.setBounds(307, 47, 163, 40);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(249, 415, 48, 47);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(413, 415, 48, 47);
		add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(307, 415, 96, 46);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(499, 415, 48, 47);
		add(btnNewButton_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(557, 415, 96, 46);
		add(textField_2);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(663, 415, 48, 47);
		add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(307, 289, 96, 83);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(557, 289, 96, 83);
		add(lblNewLabel_1_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(401, 561, 163, 76);
		add(btnNewButton_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"null", "Mario", "Sonic", "Pikachus"}));
		comboBox.setBounds(10, 373, 185, 22);
		add(comboBox);
	}
}
