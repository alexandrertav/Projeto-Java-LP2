package dominio;

public class Gato extends Animal{

	public Gato(String n, float p, Regiao r) {
		super(n, p, r);
	}

	public float velocidade() {
		if(getRegiao().getTempMedia() < 20) {
			return 30;
		}else {
			return 40;
		}
		
	}
	
}
