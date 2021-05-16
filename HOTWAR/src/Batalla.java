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
	static String texto = "";
	static int cont = 0;
	int contadorRondas=0;
	private JTextField textField;
	private JSlider atk, def;
	private JTextField textField_cohete;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton sumar, restar, atack, sumar2, restar2;
	private JComboBox comboBox;
	String characters[] = { null, };
	int misilesAtck;
	int misilesDef;
	String ma = "0";
	String md = "0";
	int original = 0;
	int equipo = 0;
	private Font fuente;
	private JLabel lblNewLabel, rondas,lblNewLabel_1,fondo;
	private ImageIcon imgIcon;
	int nmisiles;
	ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	private Random r = new Random();
	int valorDado = r.nextInt(5)+1;
	private JTextField controndas;
	int sub[];
	int cantidades;
	private JLabel lblNewLabel_2;
	private JTextField j1;
	private JTextField textField_4;
	private JLabel lblNewLabel_3;
	private JTextField j2;
	private JTextField textField_6;
	private JLabel lblNewLabel_4;
	private JTextField j3;
	private JTextField textField_8;
	private JLabel lblNewLabel_5;
	private JTextField j4;
	private JTextField textField_10;
	private JLabel lblNewLabel_6;
	private JTextField j5;
	private JTextField textField_12;
	private JLabel lblNewLabel_7;
	private JTextField j6;
	private JTextField textField_14;
	private JLabel lblNewLabel_8;
	private JTextField j7;
	private JTextField textField_16;
	private JLabel lblNewLabel_9;
	private JTextField j8;
	private JTextField textField_18;
	private JLabel lblNewLabel_10;
	private JTextField j9;
	private JTextField textField_20;
	private JLabel lblNewLabel_11;
	private JTextField j10;
	private JTextField textField_22;

	public Batalla(int cantidad, String tipos[], String nom[], ArrayList <Equipo> equip) {
		equipos = equip;
		int subi [] = new int[cantidades];
		sub = subi;
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		nmisiles = Equipo.getmisilestipo(tipos[equipo]);
		fuente = new Font("Calibri",Font.BOLD, 12);

		//diseño del panel
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(10, 368, 163, 40);
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setFont(new Font("Bahnschrift", Font.BOLD, 29));
		add(textField);

		textField_cohete = new JTextField();
		textField_cohete.setText(nmisiles + "");
		textField_cohete.setHorizontalAlignment(SwingConstants.LEFT);
		textField_cohete.setForeground(Color.WHITE);
		textField_cohete.setEditable(false);
		textField_cohete.setOpaque(false);
		textField_cohete.setBorder(null);
		textField_cohete.setBounds(582, 399, 69, 67);
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
		textField_1.setBounds(322, 264, 96, 46);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLUE);

		textField_2.setText(md);
		textField_2.setOpaque(false);
		textField_2.setEditable(false);
		textField_2.setBorder(null);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(572, 264, 96, 46);
		add(textField_2);

		atk = new JSlider();
		atk.setMaximum(Equipo.getmisilestipo(tipos[equipo]));
		atk.setOpaque(false); 
		atk.setValue(0);
		atk.setBounds(266, 338, 200, 26);

		def = new JSlider();
		def.setMaximum(Equipo.getmisilestipo(tipos[equipo]));
		def.setOpaque(false); 
		def.setValue(0);
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
		textField_cohete.setFont(new Font("Bahnschrift", Font.BOLD, 60));

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

		JLabel misilesrest = new JLabel(new ImageIcon(new ImageIcon("assets/botones/misilesrest.png").getImage().getScaledInstance(295,70, Image.SCALE_DEFAULT)));
		misilesrest.setBounds(281, 391, 281, 67);
		add(misilesrest);

		rondas = new JLabel(new ImageIcon(new ImageIcon("assets/botones/RONDA.png").getImage().getScaledInstance(215,70, Image.SCALE_DEFAULT)));
		rondas.setBounds(341, 14, 215, 70);
		add(rondas);

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
		lblNewLabel.setBounds(0, 0, 208, 327);


		String tipo;
		String nombre;
		String a;

		
		//creacion de personajes en la batalla
		for (int i = 0; i < cantidad+1; i++) {
			
			if (i == 1) {
				tipo = tipos[0];//llama al tipo de personaje que coresponde a la posicion
				nombre = nom[0];//llama al nombre del jugador de personaje
				Equipo equipo1 = new Equipo(tipo, nombre);//arraylist de equipos
				equipos.add(equipo1);
				lblNewLabel_2 = new JLabel(new ImageIcon(Equipo.cara(tipos[0])));//pasa la imagen correspondida desde equipos
				lblNewLabel_2.setBounds(816, 79, 40, 40);
				add(lblNewLabel_2);

				j1 = new JTextField(nom[0]);//pasa el nombre correspondida desde equipos
				j1.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));//fuente de la letra
				j1.setBounds(866, 78, 96, 20);
				j1.setOpaque(false);
				j1.setForeground(Color.WHITE);
				j1.setBorder(null);
				j1.setEditable(false);
				add(j1);

				textField_4 = new JTextField();
				textField_4.setText(equipos.get(0).hp + " hp");//pasa la vida correspondida desde equipos
				textField_4.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				textField_4.setOpaque(false);
				textField_4.setEditable(false);
				textField_4.setBorder(null);
				textField_4.setForeground(Color.WHITE);
				textField_4.setBounds(866, 109, 62, 22);
				add(textField_4);

			}else if (i == 2) {
				tipo = tipos[1];
				nombre = nom[1];
				Equipo equipo2 = new Equipo(tipo, nombre);
				equipos.add(equipo2);
				lblNewLabel_3 = new JLabel(new ImageIcon(Equipo.cara(tipos[1])));
				lblNewLabel_3.setBounds(944, 133, 40, 40);
				add(lblNewLabel_3);

				j2 = new JTextField(nom[1]);
				j2.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				j2.setOpaque(false);
				j2.setBorder(null);
				j2.setForeground(Color.WHITE);
				j2.setEditable(false);
				j2.setBounds(994, 132, 96, 20);
				add(j2);

				textField_6 = new JTextField();
				textField_6.setText(equipos.get(1).hp + " hp");
				textField_6.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				textField_6.setOpaque(false);
				textField_6.setForeground(Color.WHITE);
				textField_6.setEditable(false);
				textField_6.setBorder(null);
				textField_6.setBounds(994, 163, 62, 22);
				add(textField_6);

			}else if (i == 3) {

				tipo = tipos[2];
				nombre = nom[2];
				Equipo equipo3 = new Equipo(tipo, nombre);
				equipos.add(equipo3);
				lblNewLabel_4 =new JLabel(new ImageIcon(Equipo.cara(tipos[2])));
				lblNewLabel_4.setBounds(816, 185, 40, 40);
				add(lblNewLabel_4);

				j3 = new JTextField(nom[2]);
				j3.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				j3.setOpaque(false);
				j3.setBorder(null);
				j3.setForeground(Color.WHITE);
				j3.setEditable(false);
				j3.setBounds(866, 184, 96, 20);
				add(j3);

				textField_8 = new JTextField();
				textField_8.setText(equipos.get(2).hp + " hp");
				textField_8.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				textField_8.setOpaque(false);
				textField_8.setForeground(Color.WHITE);
				textField_8.setEditable(false);
				textField_8.setBorder(null);
				textField_8.setBounds(866, 215, 62, 22);
				add(textField_8);


			}else if (i == 4) {

				tipo = tipos[3];
				nombre = nom[3];
				Equipo equipo4 = new Equipo(tipo, nombre);
				equipos.add(equipo4);
				lblNewLabel_5 = new JLabel(new ImageIcon(Equipo.cara(tipos[3])));
				lblNewLabel_5.setBounds(944, 237, 40, 40);
				add(lblNewLabel_5);

				j4 = new JTextField(nom[3]);
				j4.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				j4.setOpaque(false);
				j4.setBorder(null);
				j4.setForeground(Color.WHITE);
				j4.setEditable(false);
				j4.setBounds(994, 236, 96, 20);
				add(j4);

				textField_10 = new JTextField();
				textField_10.setText(equipos.get(3).hp + " hp");
				textField_10.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				textField_10.setOpaque(false);
				textField_10.setEditable(false);
				textField_10.setBorder(null);
				textField_10.setForeground(Color.WHITE);
				textField_10.setBounds(994, 267, 62, 22);
				add(textField_10);
			}
			if (i == 5) {

				tipo = tipos[4];
				nombre = nom[4];
				Equipo equipo5 = new Equipo(tipo, nombre);
				equipos.add(equipo5);
				lblNewLabel_6 = new JLabel(new ImageIcon(Equipo.cara(tipos[4])));
				lblNewLabel_6.setBounds(816, 289, 40, 40);
				add(lblNewLabel_6);

				j5 = new JTextField(nom[4]);
				j5.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				j5.setOpaque(false);
				j5.setBorder(null);
				j5.setForeground(Color.WHITE);
				j5.setEditable(false);
				j5.setBounds(866, 288, 96, 20);
				add(j5);

				textField_12 = new JTextField();
				textField_12.setText(equipos.get(4).hp + " hp");
				textField_12.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				textField_12.setOpaque(false);
				textField_12.setEditable(false);
				textField_12.setForeground(Color.WHITE);
				textField_12.setBorder(null);
				textField_12.setBounds(866, 319, 62, 22);
				add(textField_12);


			}
			if (i == 6) {

				tipo = tipos[5];
				nombre = nom[5];
				Equipo equipo6 = new Equipo(tipo, nombre);
				equipos.add(equipo6);
				lblNewLabel_7 = new JLabel(new ImageIcon(Equipo.cara(tipos[5])));
				lblNewLabel_7.setBounds(944, 331, 40, 40);
				add(lblNewLabel_7);

				j6 = new JTextField(nom[5]);
				j6.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				j6.setOpaque(false);
				j6.setBorder(null);
				j6.setEditable(false);
				j6.setForeground(Color.WHITE);
				j6.setBounds(994, 330, 96, 20);
				add(j6);

				textField_14 = new JTextField();
				textField_14.setText(equipos.get(5).hp + " hp");
				textField_14.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				textField_14.setOpaque(false);
				textField_14.setEditable(false);
				textField_14.setForeground(Color.WHITE);
				textField_14.setBorder(null);
				textField_14.setBounds(994, 361, 62, 22);
				add(textField_14);
			}
			if (i == 7) {


				tipo = tipos[6];
				nombre = nom[6];
				Equipo equipo7 = new Equipo(tipo, nombre);
				equipos.add(equipo7);
				lblNewLabel_8 = new JLabel(new ImageIcon(Equipo.cara(tipos[6])));
				lblNewLabel_8.setBounds(816, 394, 40, 40);
				add(lblNewLabel_8);

				j7 = new JTextField(nom[6]);
				j7.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				j7.setOpaque(false);
				j7.setBorder(null);
				j7.setForeground(Color.WHITE);
				j7.setEditable(false);
				j7.setBounds(866, 393, 96, 20);
				add(j7);

				textField_16 = new JTextField();
				textField_16.setText(equipos.get(6).hp + " hp");
				textField_16.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				textField_16.setOpaque(false);
				textField_16.setEditable(false);
				textField_16.setForeground(Color.WHITE);
				textField_16.setBorder(null);
				textField_16.setBounds(866, 424, 62, 22);
				add(textField_16);

			}
			if (i == 8) {


				tipo = tipos[7];
				nombre = nom[7];
				Equipo equipo8 = new Equipo(tipo, nombre);
				equipos.add(equipo8);
				lblNewLabel_9 = new JLabel(new ImageIcon(Equipo.cara(tipos[7])));
				lblNewLabel_9.setBounds(944, 436, 40, 40);
				add(lblNewLabel_9);

				j8 = new JTextField(nom[7]);
				j8.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				j8.setOpaque(false);
				j8.setBorder(null);
				j8.setForeground(Color.WHITE);
				j8.setEditable(false);
				j8.setBounds(994, 435, 96, 20);
				add(j8);

				textField_18 = new JTextField();
				textField_18.setText(equipos.get(7).hp + " hp");
				textField_18.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				textField_18.setOpaque(false);
				textField_18.setForeground(Color.WHITE);
				textField_18.setEditable(false);
				textField_18.setBorder(null);
				textField_18.setBounds(994, 466, 62, 22);
				add(textField_18);
			}
			if (i == 9) {


				tipo = tipos[8];
				nombre = nom[8];
				Equipo equipo9 = new Equipo(tipo, nombre);
				equipos.add(equipo9);
				lblNewLabel_10 = new JLabel(new ImageIcon(Equipo.cara(tipos[8])));
				lblNewLabel_10.setBounds(816, 502, 40, 40);
				add(lblNewLabel_10);

				j9 = new JTextField(nom[8]);
				j9.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				j9.setOpaque(false);
				j9.setForeground(Color.WHITE);
				j9.setBorder(null);
				j9.setEditable(false);
				j9.setBounds(866, 501, 96, 20);
				add(j9);

				textField_20 = new JTextField();
				textField_20.setText(equipos.get(8).hp + " hp");
				textField_20.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD , 15));
				textField_20.setOpaque(false);
				textField_20.setEditable(false);
				textField_20.setForeground(Color.WHITE);
				textField_20.setBorder(null);
				textField_20.setBounds(866, 532, 62, 22);
				add(textField_20);
			}
			if (i == 10) {


				tipo = tipos[9];
				nombre = nom[9];
				Equipo equipo10 = new Equipo(tipo, nombre);
				equipos.add(equipo10);
				lblNewLabel_11 = new JLabel(new ImageIcon(Equipo.cara(tipos[9])));
				lblNewLabel_11.setBounds(944, 553, 40, 40);
				add(lblNewLabel_11);

				j10 = new JTextField(nom[9]);
				j10.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				j10.setOpaque(false);
				j10.setForeground(Color.WHITE);
				j10.setBorder(null);
				j10.setEditable(false);
				j10.setBounds(994, 552, 96, 20);
				add(j10);

				textField_22 = new JTextField();
				textField_22.setText(equipos.get(9).hp + " hp");
				textField_22.setFont(new Font("Trebuchet MS", Font.ITALIC | Font.BOLD, 15));
				textField_22.setOpaque(false);
				textField_22.setEditable(false);
				textField_22.setForeground(Color.WHITE);
				textField_22.setBorder(null);
				textField_22.setBounds(994, 583, 62, 22);
				add(textField_22);
			}

		}
		this.characters = nom;
		textField.setText(nom[0]);
		comboBox.setModel(new DefaultComboBoxModel(characters));
		this.misilesAtck = Integer.parseInt(ma);
		this.misilesDef = Integer.parseInt(md);
		atack.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int num = Integer.valueOf(textField_1.getText());
				int num2 = Integer.valueOf(textField_2.getText()) * 2;
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
					JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE " + nmisiles + " Recuerda los misiles de defensa cuestan el doble",
							"Error de misiles", 0);
				}

				if (num4 < nmisiles) {
					JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
				}

				if (num4 < nmisiles + 1 && num4 > 0 && num3 == 0 && cont == 0) {


					textField_1.setText("0");
					textField_2.setText("0");
					def.setValue(0);
					atk.setValue(0);

					equipoa = s = (String) comboBox.getSelectedItem();
					int equipoma = mA;
					int equipomd = mD;
					int posicion = comboBox.getSelectedIndex();

					String equipoObj = equipoa;
					//resumen de la partida
					texto += resum( mA,  mD,  nom,  equipoObj);
					//escoje la imagen del personaje
					if((equipo+1) < cantidad) {
						imgIcon=new ImageIcon(Equipo.foto(tipos[equipo+1]));
						lblNewLabel.setIcon(imgIcon);

					}

					// aqui empieza el sistema de daño
					atacar(posicion, equipoma, equipomd, equipo, cantidad, tipos[equipo]);
					// Aqui acaba
					vidas(cantidad); //Actualizar las vidas
					equipo = equipo + 1;
					if (equipo == cantidad) {
						finalizar(cantidad, tipos, nom);

					}
					if (equipo < cantidad) {
						textField.setText(nom[equipo]);
						slider(tipos);

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

		controndas = new JTextField();
		controndas.setEditable(false);
		controndas.setHorizontalAlignment(SwingConstants.LEFT);
		controndas.setForeground(Color.WHITE);
		controndas.setText(cont + "");//cambiar numero de rondas
		controndas.setFont(new Font("Gadugi", Font.BOLD | Font.ITALIC, 99));
		controndas.setOpaque(false);
		controndas.setBorder(null);
		controndas.setBounds(572, 0, 94, 84);
		add(controndas);

		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("assets/fondos/black.png").getImage().getScaledInstance(400,800, Image.SCALE_DEFAULT)));
		lblNewLabel_1.setBounds(816, 0, 284, 700);
		add(lblNewLabel_1);


		fondo = new JLabel();
		fondo.setIcon(new ImageIcon(new ImageIcon("assets/fondos/fondoBatalla"+(valorDado)+".png").getImage().getScaledInstance(1200,800, Image.SCALE_DEFAULT)));
		fondo.setBounds(0, 0, 1100, 700);
		add(fondo);

	}

	public void finalizar(int cantidad, String tipos[], String nom[]) {

		JFrame Marco = (JFrame) SwingUtilities.getWindowAncestor(this);
		Marco.remove(this);
		Marco.getContentPane().add(new FinalRonda(null, cantidad, tipos, nom));
		Marco.setVisible(true);

	}
	public void atacar(int enemigo, int equipoma, int equipomd, int tu, int cantidad, String tipo) {
		int cont = 0;
		int equi[] = new int[cantidad];
		int equiO[] = new int[cantidad];
		int previda [] = new int[cantidad];
		previda[cont] = equipos.get(tu).hp;
		equi[cont] = tu;
		equiO[cont] = enemigo;
		equipos.get(tu).misila = equipoma;
		equipos.get(tu).misild = equipomd;
		ataquesespeciales(tipo, tu, previda[tu], cantidad, enemigo);
		equipos.get(tu).hp = equipos.get(tu).hp + (equipomd/2);
		equipos.get(enemigo).hp = equipos.get(enemigo).hp - equipoma;

		if(equipo == cantidad-1) {
			/* Subzero da errores
				for(int i = 0; i < cantidad; i++) {
				if(sub[i] == equiO[i]+1 && sub[i] > 0) {
				equipos.get(equiO[i]).misila = 0;
					equipos.get(equiO[i]).misild = 0;
				}
				}*/
			for(int i = 0; i < cantidad; i++) {
				if(equipos.get(equi[i]).hp > previda[i]) {
					equipos.get(equi[i]).hp = previda[i];
				}
			}

		}
		cont++;
	}
	public void ataquesespeciales(String tipo, int a, int previda, int cantidad, int enemigo) {
		if(tipo.equals("Stickman")) {

		}
		if(tipo.equals("Link")) {
			int aleatorio = r.nextInt(100)+1;
			if(aleatorio <= 15) {
				equipos.get(a).misila = equipos.get(a).misila + 35;
			}
		}
		if(tipo.equals("Sonic")) {
			int aleatorio = r.nextInt(100)+1;
			if(aleatorio <= 10) {
				equipos.get(a).hp = previda;
			}
		}
		if(tipo.equals("Goku")) {
			int turno =FinalRonda.contador;
			if(turno == 5) {
				equipos.get(a).misila = equipos.get(a).misila + 25;
				turno = 0;
			}
		}
		if(tipo.equals("Creeper")) {
			if(equipos.get(a).hp <= 80) {


			}

		}
		if(tipo.equals("Pikachu")) {
			int aleatorio = r.nextInt(100)+1;
			if(aleatorio <= 30) {
				if(a-1 >= 0) {
					equipos.get(a-1).hp = equipos.get(a-1).hp - (equipos.get(a).hp/2);
				}
				if(a+1 < cantidad) {
					equipos.get(a+1).hp = equipos.get(a+1).hp - (equipos.get(a).hp/2);
				}
			}

		}
		if(tipo.equals("Donkey Kong")) {

		}
		if(tipo.equals("Sub-Zero")) {
			int aleatorio = r.nextInt(100)+1;
			if(aleatorio <= 10) {
				sub[equipo]=enemigo+1;
			}

		}
	}
	public void slider(String tipos[]) {
		atk.setMaximum(Equipo.getmisilestipo(tipos[equipo]));
		def.setMaximum(Equipo.getmisilestipo(tipos[equipo]));
	}
	public  String resum(int mA, int mD, String nom[], String equipoObj){
		String resum = "";
	
		if(mA == 0) {
			resum = nom[equipo]+" no ha atacado y se ha defendido con "+mD + " de poder de escudo\n";	
	
		}
		if(mD == 0) {
			resum = nom[equipo]+" ha atacado con " + mA + " de poder de ataque a " + equipoObj +" y no se ha defendido\n";
		
		}
		else {
			resum = nom[equipo]+" ha atacado con " + mA + " de poder de ataque a " + equipoObj +" y se ha defendido con "+mD + " de poder de escudo\n";
	
		}
		return resum;

	}
	public void vidas(int cantidad) {
	
		for(int i = 0; i > cantidad; i++) {
			if(cantidad == 3) {	
				textField_4.setText(equipos.get(0).hp +" hp");
				textField_6.setText(equipos.get(1).hp +" hp");
				textField_8.setText(equipos.get(2).hp +" hp");
			}

			if(cantidad == 4) {
			
				textField_10.setText(equipos.get(3).hp +" hp");
			}
			if(cantidad == 5) {
			
				textField_12.setText(equipos.get(4).hp +" hp");
			}
			if(cantidad == 6) {
			
				
				textField_14.setText(equipos.get(5).hp +" hp");
			}
			if(cantidad == 7) {

				textField_16.setText(equipos.get(6).hp +" hp");
			}
			if(cantidad == 8) {
			
				textField_18.setText(equipos.get(7).hp +" hp");
			}
			if(cantidad == 9) {
			
				textField_20.setText(equipos.get(8).hp +" hp");
			}
			if(cantidad == 10) {
			
				textField_22.setText(equipos.get(9).hp +" hp");
			}	
		}
		
	}
}