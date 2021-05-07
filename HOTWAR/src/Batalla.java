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
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

public class Batalla extends JPanel implements ActionListener {
	private JTextField nomp;
	private JSlider atk,def;
	private JTextField textField_cohete;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton sumar, restar, atack, sumar2, restar2;
	private JComboBox comboBox;
	String characters[] = { null, };
	private JTextField nomicon;
	private JProgressBar vida;
	int misilesAtck;
	int misilesDef;
	String ma = "0";
	String md = "0";
	int original =0;
	int equipo=0;
	private JLabel rondas;
	private JLabel numrondas;
	private JLabel fondo;
	private Random r = new Random();
	int valorDado = r.nextInt(5)+1;
	private int finalizar = 0;
	private int vidas;
	ArrayList <String> resumen =   new ArrayList<String>(); 
	/**
	 * Create the panel.
	 */
	public int getvidas() {
		return this.getvidas();
	}
	
	public int setvidas(int vidas) {
		return this.vidas = vidas;
	}
	
	public String getataque() {
		return null;
	}
	
	public static Object get (int i) {
		return null;
	}
	
	public int getsize() {
		return 0;
		
	}
	public void actionPerformed(ActionEvent e) {

		
		
	}
	public Batalla(int cantidad, String tipos[], String nom[]) {
		setBounds(100, 100, 1100, 700);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("dni");
		lblNewLabel.setBounds(0, 0, 261, 327);
		add(lblNewLabel);

		nomp = new JTextField();
		nomp.setEditable(false);
		nomp.setBounds(10, 363, 185, 49);
		add(nomp);
		nomp.setColumns(10);
		
		textField_cohete = new JTextField();
		textField_cohete.setHorizontalAlignment(SwingConstants.CENTER);
		textField_cohete.setText("50");
		textField_cohete.setEditable(false);
		textField_cohete.setBounds(593, 411, 48, 47);
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
		textField_1.setEditable(false);
		textField_1.setText(ma);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(322, 263, 96, 46);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText(md);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(572, 263, 96, 46);
		add(textField_2);
		
		atk = new JSlider();
		atk.setMaximum(50);
		atk.setValue(0);
		atk.setBounds(266, 338, 200, 26);

		def = new JSlider();
		def.setMaximum(50);
		def.setValue(0);
		def.setBounds(522, 340, 200, 26);

		atack = new JButton("atac");
		atack.setBounds(417, 511, 163, 76);
		add(atack);

		JLabel fotoatak = new JLabel();
		fotoatak.setIcon(new ImageIcon(new ImageIcon("assets/fondos/atacar.png").getImage().getScaledInstance( 86, 73, Image.SCALE_DEFAULT)));
		fotoatak.setBounds(322, 169, 96, 83);
		add(fotoatak);

		JLabel fotodef = new JLabel();
		fotodef.setIcon(new ImageIcon(new ImageIcon("assets/fondos/defens.png").getImage().getScaledInstance( 76, 83, Image.SCALE_DEFAULT)));
		fotodef.setBounds(572, 169, 96, 83);
		add(fotodef);

		comboBox = new JComboBox();
		
		comboBox.setBounds(10, 423, 185, 22);
		add(comboBox);

		nomicon = new JTextField();
		nomicon.setEditable(false);
		nomicon.setText("Mariano");
		nomicon.setColumns(10);
		nomicon.setBounds(917, 43, 96, 14);
		add(nomicon);

		vida = new JProgressBar();
		vida.setValue(100);
		vida.setForeground(Color.GREEN);
		vida.setBounds(917, 68, 146, 14);
		add(vida);

		JLabel image = new JLabel("New label");
		image.setBounds(867, 43, 40, 40);
		add(image);
		
		JLabel misilesrest = new JLabel("New label");
		misilesrest.setBounds(360, 411, 202, 47);
		add(misilesrest);
		
		JProgressBar vidap = new JProgressBar();
		vidap.setValue(100);
		vidap.setForeground(Color.GREEN);
		vidap.setBounds(271, 109, 360, 49);
		add(vidap);
		
		rondas = new JLabel("New label");
		rondas.setBounds(341, 14, 215, 70);
		add(rondas);
		
		numrondas = new JLabel("New label");
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
			String nob[] = {nom[0],nom[1],nom[2]};
			this.characters = nob;
			nomp.setText(nom[0]);
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
					mA=num + mA;
					int mD = 0; 
					mD=num2 + mD;
					int cont=0;
					num3 = num3-num4;
					String equipoa = "";
					String s;
					String s1;
					s1 =s = (String) comboBox.getSelectedItem();
					if(s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo", 0);
						cont++;
					}

					if(num4 > 50 || textField_1.getText() == null) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE 50", "Error de misiles", 0);
					}
					
					if(num4 < 50 && tipos[equipo] != "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					if(num4 < 20 && tipos[equipo] == "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					
					if(num4 < 51 && num4 >0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);
						textField_cohete.setText(Integer.toString(50));
						if(tipos[equipo] == "Donky Kong") {
							textField_cohete.setText(Integer.toString(20));
						}
						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						if(equipo ==0 ) {
							
							nomp.setText(nom[1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipo1ma = mA;
							int equipo1md = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[0]+" a atacado con "+ equipo1ma+" a "+ equipo1Obj +" y se ha defendido con "+equipo1md+"\n");
				
						}
						if(equipo==1) {
							nomp.setText(nom[2]);
							equipoa=s = (String) comboBox.getSelectedItem();
							int equipo2ma = mA;
							int equipo2md = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[1]+" a atacado con "+ equipo2ma+" a "+ equipo1Obj +" y se ha defendido con "+equipo2md+"\n");
						}
						if(equipo==2) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							equipoa=s1;
							int equipo3ma = mA;
							int equipo3md = mD;
							String equipo1Obj = equipoa;
							resumen.add(nom[2]+" a atacado con "+ equipo3ma+" a "+ equipo1Obj +" y se ha defendido con "+equipo3md+"\n");
							finalizar = 1;
							finalizar();
							
						}
						equipo=equipo+1;
					}
					cont = 0;
				}});	
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck= Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
					
}});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck= Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
}});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef= Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
}});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef= Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
}});
			atk.addChangeListener(new ChangeListener(){  public void stateChanged(ChangeEvent e) {
				textField_1.setText(String.valueOf(atk.getValue()));
				           }
				       });
				add(atk);
				def.addChangeListener(new ChangeListener(){ public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				           }
				       });
				add(def);
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
			String nob[] = {nom[0],nom[1],nom[2], nom[3]};
			this.characters = nob;
			nomp.setText(nom[0]);
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
					mA=num + mA;
					int mD = 0; 
					mD=num2 + mD;
					int cont=0;
					num3 = num3-num4;
					String equipoa = "";
					String s;
					String s1;
					s1 =s = (String) comboBox.getSelectedItem();
					if(s.equals(nom[equipo])) {
						JOptionPane.showInternalMessageDialog(null, "TE ESTAS ELIGIENDO A TI MISMO", "Error de equipo", 0);
						cont++;
					}

					if(num4 > 50 || textField_1.getText() == null) {
						JOptionPane.showInternalMessageDialog(null, "EL MAXIMO DE MISILES ES DE 50", "Error de misiles", 0);
					}
					
					if(num4 < 50 && tipos[equipo] != "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					if(num4 < 20 && tipos[equipo] == "Donky Kong") {
						JOptionPane.showInternalMessageDialog(null, "AUN TE QUEDAN MISILES", "Error de misiles", 0);
					}
					
					if(num4 < 51 && num4 >0 && num3 == 0 && cont == 0) {
						JOptionPane.showInternalMessageDialog(null, "Hola", "Error de misiles", 0);
						textField_cohete.setText(Integer.toString(50));
						if(tipos[equipo] == "Donky Kong") {
							textField_cohete.setText(Integer.toString(20));
						}
						textField_1.setText("0");
						textField_2.setText("0");
						def.setValue(0);
						atk.setValue(0);
						if(equipo ==0 ) {
							nomp.setText(nom[1]);
							equipoa = s = (String) comboBox.getSelectedItem();
							int equipo1ma = mA;
							int equipo1md = mD;
							String equipo1Obj = equipoa;
							
							
						}
						if(equipo==1) {
							nomp.setText(nom[2]);
							equipoa=s = (String) comboBox.getSelectedItem();
							int equipo2ma = mA;
							int equipo2md = mD;
							String equipo1Obj = equipoa;
							
						}
						if(equipo==2) {
							JOptionPane.showInternalMessageDialog(null, "Adios", "Error de misiles", 0);
							equipoa=s1;
							int equipo3ma = mA;
							int equipo3md = mD;
							String equipo1Obj = equipoa;
							
						}
						equipo=equipo+1;
					}
					cont = 0;
				}});	
			restar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck= Integer.valueOf(ma);
					misilesAtck--;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
					
}});
			sumar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ma = textField_1.getText();
					misilesAtck= Integer.valueOf(ma);
					misilesAtck++;
					atk.setValue(misilesAtck);
					ma = Integer.toString(misilesAtck);
					textField_1.setText(ma);
}});
			restar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef= Integer.valueOf(md);
					misilesDef--;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
}});
			sumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					md = textField_2.getText();
					misilesDef= Integer.valueOf(md);
					misilesDef++;
					def.setValue(misilesDef);
					md = Integer.toString(misilesDef);
					textField_2.setText(md);
}});
			atk.addChangeListener(new ChangeListener(){  public void stateChanged(ChangeEvent e) {
				textField_1.setText(String.valueOf(atk.getValue()));
				           }
				       });
				add(atk);
				def.addChangeListener(new ChangeListener(){ public void stateChanged(ChangeEvent e) {
					textField_2.setText(String.valueOf(def.getValue()));
				           }
				       });
				add(def);
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
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4]};
			this.characters = nob;
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
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5]};
			this.characters = nob;
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
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5],nom[6]};
			this.characters = nob;
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
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5],nom[6],nom[7]};
			this.characters = nob;
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
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5],nom[6],nom[7],nom[8]};
			this.characters = nob;
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
			String nob[] = {nom[0],nom[1],nom[2],nom[3],nom[4],nom[5],nom[6],nom[7],nom[8],nom[9]};
			this.characters = nob;
		}
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("assets/fondos/black.png").getImage().getScaledInstance(1200,800, Image.SCALE_DEFAULT)));
		lblNewLabel_1.setBounds(867, 0, 233, 700);
		add(lblNewLabel_1);
		
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
		
				fondo = new JLabel("New label");
				fondo.setIcon(new ImageIcon(new ImageIcon("assets/fondos/fondoBatalla"+(valorDado)+".gif").getImage().getScaledInstance(1200,800, Image.SCALE_DEFAULT)));
				fondo.setBounds(0, 0, 873, 700);
				add(fondo);

		
	}

	
	public void finalizar() {
		
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new FinalRonda(resumen));
			Marco.setVisible(true);
		
	}

}