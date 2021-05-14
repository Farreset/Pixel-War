package COLWAR;

public class Equipo{

	String Nombre;
	static int hp, misil;
	String tipo;
	
	public Equipo(String tipo, String nom){
		
		this.Nombre=nom;
		this.tipo = tipo;
	}
	public static int gethptipo(String tipo) {
		if(tipo.equals("Stickman")) {
			hp = 200;
		}
		if(tipo.equals("Link")) {
			hp = 200;
		}
		if(tipo.equals("Creeper")) {
			hp = 200;
		}
		if(tipo.equals("Sonic")) {
			hp = 200;
		}
		if(tipo.equals("Ratchet & Clank")) {
			hp = 200;
		}
		if(tipo.equals("Donkey Kong")) {
			hp = 400;
		}
		if(tipo.equals("Clank")) {
			hp = 50;
		}
		if(tipo.equals("Mario")) {
			hp = 200;
		}
		if(tipo.equals("Pikachu")) {
			hp = 200;
		}
		if(tipo.equals("Sub-Zero")) {
			hp = 200;
		}
		if(tipo.equals("Goku")) {
			hp = 200;
		}
		
		
		return hp;
	}
	
	public static int getmisilestipo(String tipo) {
		if(tipo.equals("Stickman")) {
			misil = 50;
		}
		if(tipo.equals("Link")) {
			misil = 50;
		}
		if(tipo.equals("Creeper")) {
			misil = 50;
		}
		if(tipo.equals("Sonic")) {
			misil = 50;
		}
		if(tipo.equals("Ratchet & Clank")) {
			misil = 50;
		}
		if(tipo.equals("Donkey Kong")) {
			misil = 20;

		}
		if(tipo.equals("Clank")) {
			misil = 20;
		}
		if(tipo.equals("Mario")) {
			misil = 50;
		}
		if(tipo.equals("Pikachu")) {
			misil = 50;
		}
		if(tipo.equals("Sub-Zero")) {
			misil = 50;
		}
		if(tipo.equals("Goku")) {
			misil = 50;
		}
		
		return misil;
	}
	public static String foto(String tipo) {
		String imagen = tipo;
		
		if(tipo.equals("Stickman")) {
			imagen = "assets/personajes/Stickman.png";
		}
		if(tipo.equals("Link")) {
			imagen = "assets/personajes/Link.png";
		}
		if(tipo.equals("Creeper")) {
			imagen = "assets/personajes/Creeper.png";
		}
		if(tipo.equals("Sonic")) {
			imagen = "assets/personajes/Sonic.png";
		}
		if(tipo.equals("Ratchet & Clank")) {
			imagen = "assets/personajes/Ratchet and Clank.png";
		}
		if(tipo.equals("Donkey Kong")) {
			imagen = "assets/personajes/DK.png";
		}
		if(tipo.equals("Clank")) {
			imagen = "assets/personajes/clank.png";
		}
		if(tipo.equals("Mario")) {
			imagen = "assets/personajes/Mario.png";
		}
		if(tipo.equals("Pikachu")) {
			imagen = "assets/personajes/Pikachus.png";
		}
		if(tipo.equals("Sub-Zero")) {
			imagen = "assets/personajes/Sub-zero.png";
		}
		if(tipo.equals("Goku")) {
			imagen = "assets/personajes/Gokus.png";
		}
		
		return imagen;
	}
	
	
	
	public void recibirmisiles(int misilesE, int misilesD) {
	int vida;
	
		misilesD = misilesD/2;
		
		vida = misilesE - misilesD;
		
		this.hp = this.hp-vida;
	}
	
	public String getNombre(){
		return this.Nombre;
	}
	
	public int gethp() {
		
		
		
		return 0;
	}

	
	
	
	
}