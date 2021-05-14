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
	private JTextField textField, nomicon;
	private JSlider atk, def;
	private JTextField textField_cohete;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton sumar, restar, atack, sumar2, restar2;
	private JComboBox comboBox;
	String characters[] = { null, };
	private JTextField txtMariano;
	private JTextField textField_3;
	int misilesAtck;
	int misilesDef;
	String ma = "0";
	String md = "0";
	int original = 0;
	int equipo = 0;
	private ImageIcon imgIcon;
	ArrayList<String> resumen = new ArrayList<String>();
	int nmisiles;
	private JLabel rondas,lblNewLabel, imagen;
	private JLabel numrondas,lblNewLabel_1,fondo;
	private Font fuente;
	private Random r = new Random();
	int valorDado = r.nextInt(5);
	static String texto = "";
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel image_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel image_2;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel image_3;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel image_4;
	private JTextField textField_12;
	private JTextField textField_13;
	private JLabel image_5;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel image_6;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel image_7;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel image_8;
	private JTextField textField_20;
	private JTextField textField_21;
	private JLabel image_9;
	private JTextField textField_22;
	public Batalla(int cantidad, String tipos[], String nom[]) {
		///////////////////////////////////////////////////////
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		nmisiles = Equipo.getmisilestipo(tipos[equipo]);
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		nmisiles = Equipo.getmisilestipo(tipos[equipo]);
		fuente = new Font("Calibri",Font.BOLD, 12);



		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(10, 368, 163, 40);
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setFont(new Font("Bahnschrift", Font.BOLD, 29));
		add(textField);


		textField_cohete = new JTextField();
		textField_cohete.setHorizontalAlignment(SwingConstants.LEFT);
		textField_cohete.setForeground(Color.WHITE);
		textField_cohete.setText("50");
		textField_cohete.setEditable(false);
		textField_cohete.setOpaque(false);
		textField_cohete.setBorder(null);
		textField_cohete.setBounds(591, 408, 69, 60);
		add(textField_cohete);


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
		def.setMaximum(25);
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
		nomicon.setBounds(841, 72, 69, 32);
		add(nomicon);

		JLabel image = new JLabel("New label");
		image.setBounds(791, 90, 40, 40);
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

		JLabel imgrest = new JLabel("New label");
		imgrest.setIcon(new ImageIcon(new ImageIcon("assets/botones/restar.png").getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT)));
		imgrest.setBounds(264, 262, 48, 48);
		add(imgrest);

		JLabel imagsum1 = new JLabel("New label");
		imagsum1.setIcon(new ImageIcon(new ImageIcon("assets/botones/sumar.png").getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT)));
		imagsum1.setBounds(428, 262, 48, 48);
		add(imagsum1);

		JLabel imagrest2 = new JLabel("New label");
		imagrest2.setIcon(new ImageIcon(new ImageIcon("assets/botones/restar.png").getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT)));
		imagrest2.setBounds(514, 263, 48, 48);
		add(imagrest2);

		JLabel imagsum2 = new JLabel("New label");
		imagsum2.setIcon(new ImageIcon(new ImageIcon("assets/botones/sumar.png").getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT)));
		imagsum2.setBounds(678, 262, 48, 48);
		add(imagsum2);

		lblNewLabel = new JLabel(new ImageIcon());
		imgIcon=new ImageIcon(Equipo.foto(tipos[0]));
		lblNewLabel.setIcon(imgIcon);
		lblNewLabel.setBounds(0, 0, 261, 327);
		/////////////////////////////
		String tipo;
		String nombre;
		String a;

		for (int i = 0; i < cantidad; i++) {

			if (i == 1) {
				tipo = tipos[0];
				nombre = nom[0];
				Equipo equipo1 = new Equipo(tipo, nombre);

			}else if (i == 2) {
				tipo = tipos[1];
				nombre = nom[1];
				Equipo equipo2 = new Equipo(tipo, nombre);

			}else if (i == 3) {

				tipo = tipos[2];
				nombre = nom[2];
				Equipo equipo3 = new Equipo(tipo, nombre);

			}else if (i == 4) {

				tipo = tipos[3];
				nombre = nom[3];
				Equipo equipo3 = new Equipo(tipo, nombre);
			}
			if (i == 5) {

				tipo = tipos[4];
				nombre = nom[4];
				Equipo equipo4 = new Equipo(tipo, nombre);

			}
			if (i == 6) {

				tipo = tipos[5];
				nombre = nom[5];
				Equipo equipo5 = new Equipo(tipo, nombre);
			}
			if (i == 7) {


				tipo = tipos[6];
				nombre = nom[6];
				Equipo equipo6 = new Equipo(tipo, nombre);
			}
			if (i == 8) {


				tipo = tipos[7];
				nombre = nom[7];
				Equipo equipo7 = new Equipo(tipo, nombre);
			}
			if (i == 9) {


				tipo = tipos[8];
				nombre = nom[8];
				Equipo equipo8 = new Equipo(tipo, nombre);
			}
			if (i == 10) {


				tipo = tipos[9];
				nombre = nom[9];
				Equipo equipo9 = new Equipo(tipo, nombre);
			}

		}
		this.characters = nom;
		textField.setText(nom[0]);
		comboBox.setModel(new DefaultComboBoxModel(characters));
		this.misilesAtck = Integer.parseInt(ma);
		this.misilesDef = Integer.parseInt(md);



		atack.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String resum;

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
					texto += resum( mA,  mD,  nom,  equipoObj);

					//////////////////\\\\\\\\\\\\\///////////////\\\\\\\
					if((equipo+1) < cantidad) {
						imgIcon=new ImageIcon(Equipo.foto(tipos[equipo+1]));
						lblNewLabel.setIcon(imgIcon);

					}
					///////////////////////////////////////////



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

		add(lblNewLabel);

		

		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("assets/fondos/black.png").getImage().getScaledInstance(400,800, Image.SCALE_DEFAULT)));
		lblNewLabel_1.setBounds(791, 0, 309, 700);
		add(lblNewLabel_1);

		fondo = new JLabel();
		fondo.setIcon(new ImageIcon(new ImageIcon("assets/fondos/fondoBatalla"+(valorDado)+".png").getImage().getScaledInstance(1200,800, Image.SCALE_DEFAULT)));
		fondo.setBounds(0, 0, 1100, 700);
		add(fondo);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setText("200");
		textField_4.setBounds(841, 115, 48, 32);
		add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setText("Mariano");
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(987, 72, 69, 32);
		add(textField_5);

		image_1 = new JLabel("New label");
		image_1.setBounds(937, 90, 40, 40);
		add(image_1);

		textField_6 = new JTextField();
		textField_6.setText("200");
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(987, 115, 48, 32);
		add(textField_6);

		textField_7 = new JTextField();
		textField_7.setText("Mariano");
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(841, 175, 69, 32);
		add(textField_7);

		image_2 = new JLabel("New label");
		image_2.setBounds(791, 193, 40, 40);
		add(image_2);

		textField_8 = new JTextField();
		textField_8.setText("200");
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(841, 218, 48, 32);
		add(textField_8);

		textField_9 = new JTextField();
		textField_9.setText("Mariano");
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(987, 175, 69, 32);
		add(textField_9);

		image_3 = new JLabel("New label");
		image_3.setBounds(937, 193, 40, 40);
		add(image_3);

		textField_10 = new JTextField();
		textField_10.setText("200");
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(987, 218, 48, 32);
		add(textField_10);

		textField_11 = new JTextField();
		textField_11.setText("Mariano");
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(841, 279, 69, 32);
		add(textField_11);

		image_4 = new JLabel("New label");
		image_4.setBounds(791, 297, 40, 40);
		add(image_4);

		textField_12 = new JTextField();
		textField_12.setText("200");
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_12.setColumns(10);
		textField_12.setBounds(841, 322, 48, 32);
		add(textField_12);

		textField_13 = new JTextField();
		textField_13.setText("Mariano");
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(987, 279, 69, 32);
		add(textField_13);

		image_5 = new JLabel("New label");
		image_5.setBounds(937, 297, 40, 40);
		add(image_5);

		textField_14 = new JTextField();
		textField_14.setText("200");
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_14.setColumns(10);
		textField_14.setBounds(987, 322, 48, 32);
		add(textField_14);

		textField_15 = new JTextField();
		textField_15.setText("Mariano");
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(841, 380, 69, 32);
		add(textField_15);

		image_6 = new JLabel("New label");
		image_6.setBounds(791, 398, 40, 40);
		add(image_6);

		textField_16 = new JTextField();
		textField_16.setText("200");
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_16.setColumns(10);
		textField_16.setBounds(841, 423, 48, 32);
		add(textField_16);

		textField_17 = new JTextField();
		textField_17.setText("Mariano");
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(987, 380, 69, 32);
		add(textField_17);

		image_7 = new JLabel("New label");
		image_7.setBounds(937, 398, 40, 40);
		add(image_7);

		textField_18 = new JTextField();
		textField_18.setText("200");
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_18.setColumns(10);
		textField_18.setBounds(987, 423, 48, 32);
		add(textField_18);

		textField_19 = new JTextField();
		textField_19.setText("Mariano");
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(841, 481, 69, 32);
		add(textField_19);

		image_8 = new JLabel("New label");
		image_8.setBounds(791, 499, 40, 40);
		add(image_8);

		textField_20 = new JTextField();
		textField_20.setText("200");
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_20.setColumns(10);
		textField_20.setBounds(841, 524, 48, 32);
		add(textField_20);

		textField_21 = new JTextField();
		textField_21.setText("Mariano");
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(1001, 481, 69, 32);
		add(textField_21);

		image_9 = new JLabel("New label");
		image_9.setBounds(951, 499, 40, 40);
		add(image_9);

		textField_22 = new JTextField();
		textField_22.setText("200");
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_22.setColumns(10);
		textField_22.setBounds(1001, 524, 48, 32);
		add(textField_22);

	}
	public  String resum(int mA, int mD, String nom[], String equipoObj){
		String resum = "";
		if(mA == 0) {
			resum = nom[equipo]+" no ha atacado y se ha defendido con "+mD + " de poder de escudo\n";	
			return resum;
		}
		if(mD == 0) {
			resum = nom[equipo]+" ha atacado con " + mA + " de poder de ataque a " + equipoObj +" y no se ha defendido\n";
			return resum;
		}
		else {
			resum = nom[equipo]+" ha atacado con " + mA + " de poder de ataque a " + equipoObj +" y se ha defendido con "+mD + " de poder de escudo\n";
			return resum;
		}


	}


	public void finalizar(int cantidad, String tipos[], String nom[]) {

		JFrame Marco = (JFrame) SwingUtilities.getWindowAncestor(this);
		Marco.remove(this);
		Marco.getContentPane().add(new FinalRonda(null, cantidad, tipos, nom));
		Marco.setVisible(true);

	}
}
