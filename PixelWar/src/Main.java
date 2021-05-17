import java.awt.Image;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		Frame frame1 = new Frame();// llama al frame principal
		//imagen del marco 
		Image icon = Toolkit.getDefaultToolkit().getImage("assets/fondos/principal.png");  
		 frame1.setIconImage(icon);  


	}
}