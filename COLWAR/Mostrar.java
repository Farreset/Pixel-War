package COLWAR;

import java.util.ArrayList;
public class Mostrar  {
ArrayList <Batalla> equipo = new ArrayList <Batalla>();


	private  int vida;
	private  int ataque;


	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {

		String a = "Vidas " + this.vida + " Ataque " + this.ataque;

		return a;
	}

	public void MostrarCaracteristicas(){
		
		for(int i=0; i < equipo.size();i++){
			System.out.println(equipo.get(i).toString());

		}
	}
}