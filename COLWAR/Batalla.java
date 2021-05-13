package COLWAR;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;

public class Batalla extends JPanel {
	private JTextField textField;
	private JSlider atk, def;
	private JTextField textField_cohete,nomicon;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton sumar, restar, atack, sumar2, restar2;
	private JComboBox comboBox;
	String characters[] = { null, };
	private JTextField txtMariano;
	private JTextField textField_3;
	private JProgressBar vida;
	int misilesAtck;
	int misilesDef;
	String ma = "0";
	String md = "0";
	int original = 0;
	int equipo = 0;
	ArrayList<String> resumen = new ArrayList<String>();
	int nmisiles;
	private JLabel rondas,lblNewLabel;
	private JLabel numrondas,lblNewLabel_1,fondo;
	private Font fuente;
	private Random r = new Random();
	int valorDado = r.nextInt(5);
	
	public Batalla(int cantidad, String tipos[], String nom[]) {
	
		JLabel lblNewLabel = new JLabel("dni");
		lblNewLabel.setBounds(0, 0, 261, 327);
		add(lblNewLabel);

		setBounds(100, 100, 1100, 700);
		setLayout(null);
		nmisiles = Equipo.getmisilestipo(tipos[equipo]);
		fuente = new Font("Calibri",Font.BOLD, 12);



		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(10, 368, 163, 40);
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setFont(fuente);
		add(textField);
		textField.setColumns(10);

		textField_cohete = new JTextField();
		textField_cohete.setHorizontalAlignment(SwingConstants.LEFT);
		textField_cohete.setForeground(Color.WHITE);
		textField_cohete.setText("50");
		textField_cohete.setEditable(false);
		textField_cohete.setOpaque(false);
		textField_cohete.setBorder(null);
	textField_cohete.setBounds(591, 408, 69, 60);
	add(textField_cohete);
		textField_cohete.setColumns(10);

		restar = new JButton();
	restar.setBounds(264, 263, 48, 47);
		restar.setFocusable(true);
		restar.setBorder(null);
		restar.setFocusPainted(false);
		restar.setContentAreaFilled(false);
		add(restar);
		restar2 = new JButton();
		restar2.setBounds(514, 263, 48, 47);
		restar2.setFocusable(true);
		restar2.setBorder(null);
	restar2.setFocusPainted(false);
		restar2.setContentAreaFilled(false);
		add(restar2);

		sumar = new JButton();
		sumar.setBounds(678, 263, 48, 47);
	sumar.setFocusable(true);
		sumar.setBorder(null);
		sumar.setFocusPainted(false);
sumar.setContentAreaFilled(false);
		add(sumar);

		sumar2= new JButton();
		sumar2.setBounds(428, 263, 48, 47);
		sumar2.setFocusable(true);
		sumar2.setBorder(null);
		sumar2.setFocusPainted(false);
		sumar2.setContentAreaFilled(false);
		add(sumar2);

		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
	textField_1.setEditable(false);
		textField_1.setText(ma);
	textField_1.setOpaque(false);
		textField_1.setBorder(null);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(322, 263, 96, 46);
	add(textField_1);
textField_1.setColumns(10);

		textField_2 = new JTextField();
	textField_2.setForeground(Color.BLUE);
		textField_2.setEditable(false);
		textField_2.setText(md);
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(572, 263, 96, 46);
		add(textField_2);

		atk = new JSlider();
	atk.setMaximum(50);
		atk.setOpaque(false); 
		atk.setValue(0);
		atk.setBounds(266, 338, 200, 26);

		def = new JSlider();
		def.setMaximum(50);
		def.setValue(0);
		def.setOpaque(false); 
		def.setBounds(522, 340, 200, 26);

		atack = new JButton(new ImageIcon(new ImageIcon("assets/botones/activo1.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
		atack.setBounds(419, 499, 172, 157);
		add(atack);
		atack.setPressedIcon(new ImageIcon(new ImageIcon("assets/botones/activo2.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
		atack.setFocusable(true);
		atack.setBorder(null);
		atack.setFocusPainted(false);
		atack.setContentAreaFilled(false);
		textField_1.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		textField_2.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		textField_cohete.setFont(new Font("Bahnschrift", Font.BOLD, 50));

		JLabel fotoatak = new JLabel();
		fotoatak.setIcon(new ImageIcon(new ImageIcon("assets/fondos/atacar.png").getImage().getScaledInstance( 70, 116, Image.SCALE_DEFAULT)));
		fotoatak.setBounds(341, 103, 135, 149);
		add(fotoatak);

		JLabel fotodef = new JLabel();
	fotodef.setIcon(new ImageIcon(new ImageIcon("assets/fondos/defens.png").getImage().getScaledInstance( 80, 83, Image.SCALE_DEFAULT)));
		fotodef.setBounds(572, 117, 135, 121);
		add(fotodef);

		comboBox = new JComboBox();

		comboBox.setBounds(10, 423, 185, 22);
		add(comboBox);

		nomicon = new JTextField();
		nomicon.setEditable(false);
		nomicon.setText("Mariano");
		nomicon.setColumns(10);
		nomicon.setBounds(933, 44, 96, 14);
		add(nomicon);

		vida = new JProgressBar();
		vida.setValue(100);
		vida.setForeground(Color.GREEN);
		vida.setBounds(933, 69, 146, 14);
	add(vida);

		JLabel image = new JLabel("New label");
		image.setBounds(883, 44, 40, 40);
		add(image);

		JLabel misilesrest = new JLabel(new ImageIcon(new ImageIcon("assets/botones/misilesrest.png").getImage().getScaledInstance(295,70, Image.SCALE_DEFAULT)));
		misilesrest.setBounds(281, 391, 281, 67);
		add(misilesrest);

		rondas = new JLabel(new ImageIcon(new ImageIcon("assets/botones/RONDA.png").getImage().getScaledInstance(215,70, Image.SCALE_DEFAULT)));
		rondas.setBounds(341, 14, 215, 70);
		add(rondas);
		numrondas = new JLabel(new ImageIcon(new ImageIcon("assets/botones/NRONDA"+(1)+".png").getImage().getScaledInstance(65,67, Image.SCALE_DEFAULT)));
		numrondas.setBounds(572, 14, 69, 67);
		add(numrondas);

		String tipo;
	String nombre;
		String a;

		if (cantidad == 3) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
		}
		if (cantidad == 4) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
		}
		if (cantidad == 5) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
		}
		if (cantidad == 6) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
		}
		if (cantidad == 7) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
			tipo = tipos[6];
			nombre = nom[6];
			Equipo equipo7 = new Equipo(tipo, nombre);
		}
		if (cantidad == 8) {
			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
			tipo = tipos[6];
			nombre = nom[6];
			Equipo equipo7 = new Equipo(tipo, nombre);
			tipo = tipos[7];
			nombre = nom[7];
			Equipo equipo8 = new Equipo(tipo, nombre);
		}
		if (cantidad == 9) {

			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
			tipo = tipos[6];
			nombre = nom[6];
			Equipo equipo7 = new Equipo(tipo, nombre);
			tipo = tipos[7];
			nombre = nom[7];
			Equipo equipo8 = new Equipo(tipo, nombre);
			tipo = tipos[8];
			nombre = nom[8];
			Equipo equipo9 = new Equipo(tipo, nombre);
		}
		if (cantidad == 10) {

			tipo = tipos[0];
			nombre = nom[0];
			Equipo equipo1 = new Equipo(tipo, nombre);
			tipo = tipos[1];
			nombre = nom[1];
			Equipo equipo2 = new Equipo(tipo, nombre);
			tipo = tipos[2];
			nombre = nom[2];
			Equipo equipo3 = new Equipo(tipo, nombre);
			tipo = tipos[3];
			nombre = nom[3];
			Equipo equipo4 = new Equipo(tipo, nombre);
			tipo = tipos[4];
			nombre = nom[4];
			Equipo equipo5 = new Equipo(tipo, nombre);
			tipo = tipos[5];
			nombre = nom[5];
			Equipo equipo6 = new Equipo(tipo, nombre);
			tipo = tipos[6];
			nombre = nom[6];
			Equipo equipo7 = new Equipo(tipo, nombre);
			tipo = tipos[7];
			nombre = nom[7];
			Equipo equipo8 = new Equipo(tipo, nombre);
			tipo = tipos[8];
			nombre = nom[8];
			Equipo equipo9 = new Equipo(tipo, nombre);
			tipo = tipos[9];
			nombre = nom[9];
			Equipo equipo10 = new Equipo(tipo, nombre);
		}
		this.characters = nom;
		textField.setText(nom[0]);
		comboBox.setModel(new DefaultComboBoxModel(characters));
		this.misilesAtck = Integer.parseInt(ma);
		this.misilesDef = Integer.parseInt(md);
		atack.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int num = Integer.valueOf(textField_1.getText());
				int num2 = Integer.valueOf(textField_2.getText());
				int num4 = num + num2;
				int num3 = Integer.valueOf(textField_cohete.getText());
				int mA = 0;
				mA = num + mA;
				int mD = 0;
				mD = num2 + mD;
				int cont = 0;
				num3 = num3 - num4;
				String equipoa = "";
				String s;
				String s1;
				s1 = s = (String) comboBox.getSelectedItem();

				if (s.equals(nom[equipo])) {
					JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo", 0);
					cont++;
				}

				if (num4 > nmisiles) {
					JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE " + nmisiles,
							"Error de misiles", 0);
				}

				if (num4 < nmisiles) {
					JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
				}

				if (num4 < nmisiles + 1 && num4 > 0 && num3 == 0 && cont == 0) {
					JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);

					textField_1.setText("0");
					textField_2.setText("0");
					def.setValue(0);
					atk.setValue(0);

					equipoa = s = (String) comboBox.getSelectedItem();
					int equipoma = mA;
					int equipomd = mD;
					String equipoObj = equipoa;
					(nom[equipo] + " a atacado con " + equipoma + " a " + equipoObj
							+ " y se ha defendido con " + equipomd + "\n");
					
					// aqui empieza el sistema de daño

					// Aqui acaba

					equipo = equipo + 1;
					if (equipo == cantidad) {
						JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
						finalizar(cantidad, tipos, nom);
					}
					if (equipo < cantidad) {
						textField.setText(nom[equipo]);
					}

					if (equipo < cantidad) {
						nmisiles = Equipo.getmisilestipo(tipos[equipo]);
					}
					textField_cohete.setText(Integer.toString(nmisiles));

				}
				cont = 0;
			}
		});
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ma = textField_1.getText();
				misilesAtck = Integer.valueOf(ma);
				misilesAtck--;
				atk.setValue(misilesAtck);
				ma = Integer.toString(misilesAtck);
				textField_1.setText(ma);

			}
		});
		sumar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ma = textField_1.getText();
				misilesAtck = Integer.valueOf(ma);
				misilesAtck++;
				atk.setValue(misilesAtck);
				ma = Integer.toString(misilesAtck);
				textField_1.setText(ma);
			}
		});
		restar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				md = textField_2.getText();
				misilesDef = Integer.valueOf(md);
				misilesDef--;
				def.setValue(misilesDef);
				md = Integer.toString(misilesDef);
				textField_2.setText(md);
			}
		});
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				md = textField_2.getText();
				misilesDef = Integer.valueOf(md);
				misilesDef++;
				def.setValue(misilesDef);
				md = Integer.toString(misilesDef);
				textField_2.setText(md);
			}
		});
		atk.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				textField_1.setText(String.valueOf(atk.getValue()));
			}
		});
		add(atk);
		def.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				textField_2.setText(String.valueOf(def.getValue()));
			}
		});
		add(def);
	}
	public String Resumen (cantidad, cantidad, toString, toString){
        String mensaje = nom[equipo] + " a atacado con " + equipoma + " a " + equipoObj + " y se ha defendido con " + equipomd + "\n";
        return mensaje;
    }
	public void finalizar(int cantidad, String tipos[], String nom[],String Resumen) {

		JFrame Marco = (JFrame) SwingUtilities.getWindowAncestor(this);
		Marco.remove(this);
		Marco.getContentPane().add(new FinalRonda(Resumen, cantidad, tipos, nom));
		Marco.setVisible(true);

	}

}
