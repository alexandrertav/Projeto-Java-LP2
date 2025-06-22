package dominio;

public abstract class Animal {
	
	private String nome;
	private float peso;
	private Regiao regiao;
	
	public Animal(String n, float p, Regiao r) {
		this.nome = n;
		this.peso = p;
		if(r != null) {
			this.regiao = r;
		}
		else {
			throw new RuntimeException("Erro: Região nula");
		}
	}
	public abstract float velocidade();

	public String getNome() {
		return nome;
	}

	public float getPeso() {
		return peso;
	}
	
	public Regiao getRegiao() {
		return regiao;
	}
	
	public float forca() {
		return this.peso * velocidade();
	}
	
	
}
