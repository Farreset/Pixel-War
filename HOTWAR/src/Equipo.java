

public class Equipo{

	String Nombre;
	int hp, misil;
	String tipo;
	
	public Equipo(String tipo, String nom){
		
		this.Nombre=nom;
		this.tipo = tipo;
		
		if(tipo.equals("Stickman")) {
			this.hp = 200;
			this.misil = 50;
		}
		if(tipo.equals("Donkey Kong")) {
			this.hp = 400;
			this.misil = 20;
		}
		if(tipo.equals("Link")) {
			this.hp = 200;
			this.misil = 50;
		}
		if(tipo.equals("Goku")) {
			this.hp = 200;
			this.misil = 50;
		}
		if(tipo.equals("Creeper")) {
			this.hp = 200;
			this.misil = 50;
		}
		if(tipo.equals("Sonic")) {
			this.hp = 200;
			this.misil = 50;
		}
		if(tipo.equals("Ratchet & Clank")) {
			this.hp = 200;
			this.misil = 50;
		}
		if(tipo.equals("Clank")) {
			this.hp = 50;
			this.misil = 20;
		}
		if(tipo.equals("Mario")) {
			this.hp = 200;
			this.misil = 50;
		}
		if(tipo.equals("Pikachu")) {
			this.hp = 200;
			this.misil = 50;
		}
		if(tipo.equals("Sub-Zero")) {
			this.hp = 200;
			this.misil = 50;
		}
		
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
	

	
	
	
	
}