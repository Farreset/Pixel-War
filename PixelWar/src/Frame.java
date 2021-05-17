
import javax.swing.*;

public class Frame extends JFrame {

	public Frame() {
		// creacion del grame 
		Menu pInicio;

		setBounds(300,300,825,505);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// para cerrar
		setTitle("PIXEL WAR");//titulo del frame



		pInicio = new Menu();
		setBounds(100, 100, 1100, 700);
		getContentPane().add(pInicio);// llama al panel menu donde esta todo lo principal
		setVisible(true);// para que sea todo visible
	}
}