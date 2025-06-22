package dominio;

public class Cao extends Animal{

	public Cao(String n, float p, Regiao r) {
		super(n, p, r);
	}
	
	public float velocidade() {
		return this.getPeso() * 2;
	}
}
