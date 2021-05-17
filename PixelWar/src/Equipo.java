package COLWAR;

public class Equipo{

	String Nombre; //Nombre del equipo
	int hp, misil; //Vida y misiles del equipo
	String tipo; //Tipo de personaje del equipo
	int misila, misild; //eqnergia defensivas y ofensivas
	String foto;
	public Equipo(String tipo, String nom){
		
		this.Nombre=nom;
		this.tipo = tipo;
		foto = foto(tipo);
			this.hp=gethptipo(tipo);
			this.misil=getmisiltipo(tipo);
		

	}
	//se passa la vida de cada tipo a la batalla
	public int gethptipo(String tipo) {
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
	//se passa los missiles de cada tipo a la batalla
	public int getmisiltipo(String tipo) {
		int misiles = 0;
		if(tipo.equals("Stickman")) {
			misiles = 50;
		}
		if(tipo.equals("Link")) {
			misiles = 50;
		}
		if(tipo.equals("Creeper")) {
			misiles = 50;
		}
		if(tipo.equals("Sonic")) {
			misiles = 50;
		}
		if(tipo.equals("Ratchet & Clank")) {
			misiles = 50;
		}
		if(tipo.equals("Donkey Kong")) {
			misiles = 20;
		}
		if(tipo.equals("Clank")) {
			misiles = 20;
		}
		if(tipo.equals("Mario")) {
			misiles = 50;
		}	
		if(tipo.equals("Pikachu")) {
			misiles = 50;
		}
		if(tipo.equals("Sub-Zero")) {
			misiles = 50;
		}
		if(tipo.equals("Goku")) {
			misiles = 50;
		}
		return misiles;
	}
	public static int getmisilestipo(String tipo) {
		int misiles = 0;
		if(tipo.equals("Stickman")) {
			misiles = 50;
		}
		if(tipo.equals("Link")) {
			misiles = 50;
		}
		if(tipo.equals("Creeper")) {
			misiles = 50;
		}
		if(tipo.equals("Sonic")) {
			misiles = 50;
		}
		if(tipo.equals("Ratchet & Clank")) {
			misiles = 50;
		}
		if(tipo.equals("Donkey Kong")) {
			misiles = 20;
		}
		if(tipo.equals("Clank")) {
			misiles = 20;
		}
		if(tipo.equals("Mario")) {
			misiles = 50;
		}	
		if(tipo.equals("Pikachu")) {
			misiles = 50;
		}
		if(tipo.equals("Sub-Zero")) {
			misiles = 50;
		}
		if(tipo.equals("Goku")) {
			misiles = 50;
		}
		
		return misiles;
	}
	//se passa la respectiva imagen del jugador a la batalla
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
			imagen = "assets/personajes/Ratchet and clank.png";
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
	public static String cara(String tipo) {
		String imagen = tipo;
		
		if(tipo.equals("Stickman")) {
			imagen = "assets/caras/Stickman.png";
		}
		if(tipo.equals("Link")) {
			imagen = "assets/caras/Link.png";
		}
		if(tipo.equals("Creeper")) {
			imagen = "assets/caras/Creeper.png";
		}
		if(tipo.equals("Sonic")) {
			imagen = "assets/caras/Sonic.png";
		}
		if(tipo.equals("Ratchet & Clank")) {
			imagen = "assets/caras/Ratchet & Clank.png";
		}
		if(tipo.equals("Donkey Kong")) {
			imagen = "assets/caras/Donkey Kong.png";
		}
		if(tipo.equals("Clank")) {
			imagen = "assets/caras/cara_clank.png";
		}
		if(tipo.equals("Mario")) {
			imagen = "assets/caras/Mario.png";
		}
		if(tipo.equals("Pikachu")) {
			imagen = "assets/caras/Pikachu.png";
		}
		if(tipo.equals("Sub-Zero")) {
			imagen = "assets/caras/Sub-Zero.png";
		}
		if(tipo.equals("Goku")) {
			imagen = "assets/caras/Goku.png";
		}
		
		return imagen;
	}
	
	
	public int recibirmisiles(String nome, int cantidad, String nom, int hp, int misilesE, int misilesD) {
	int cont=0;
	int vida;
	String jugador[] = new String[cantidad];
	jugador[cont] = nom; 
	String jugadorO[] = new String[cantidad];
	jugadorO[cont] = nome; 		
	
	if(cont == cantidad) {
	for(int i = 0; i < cantidad;i++) {
		for(int y = 0; y < cantidad;y++) {
		if(jugador[i] == jugadorO[y]) {
			
		}
		}
	}
	}
		vida = misilesE - misilesD;
		
		hp = hp-vida;
		vida=0;
		return hp;	
	}
	
	public String getNombre(){
		return this.Nombre;
	}
	
	public int gethp() {
		
		
		
		return 0;
	}

	
	
	
	
}