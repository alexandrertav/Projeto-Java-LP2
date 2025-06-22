package dominio;

import java.util.ArrayList;
import java.util.List;

public class Regiao {
	
	private String nome;
	private float tempMedia;
	public List<Estado> estados = new ArrayList<Estado>();
	
	public Regiao(String n, float t) {
		this.nome = n;
		this.tempMedia = t;
	}
	
	public String getNome() {
		return nome;
	}

	public float getTempMedia() {
		return tempMedia;
	}

	public List<Estado> getEstados(){
		return estados;
	}
	
	public void incluiEstado(Estado e) {
		estados.add(e);
	}
	
}
