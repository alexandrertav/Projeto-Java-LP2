package testes;

import java.util.ArrayList;
import java.util.List;

import dominio.*;
import telas.Tela;

public class testes {

	public static void main(String[] args) {
		
		
		Regiao sul = new Regiao("Sul", 15);
		Regiao norte = new Regiao("Norte", 30);
		
		Estado e1, e2, e3, e4, e5, e6;
		
		e1 = new Estado("RS");
		e2 = new Estado("SC");
		e3 = new Estado("PR");
		e4 = new Estado("AM");
		e5 = new Estado("PA");
		e6 = new Estado("RR");
		
		sul.incluiEstado(e1);
		sul.incluiEstado(e2);
		sul.incluiEstado(e3);
		norte.incluiEstado(e4);
		norte.incluiEstado(e5);
		norte.incluiEstado(e6);
		
		
		List<Estado> estados = new ArrayList<Estado>();
		estados.add(e1);
		estados.add(e2);
		estados.add(e3);
		estados.add(e4);
		estados.add(e5);
		estados.add(e6);
		
		List<Regiao> regioes = new ArrayList<Regiao>();
		regioes.add(sul);
		regioes.add(norte);
		
		Cao c1, c2, c3, c4, c5, c6;
		c1 = new Cao("Rex 1", 10, sul);
		c2 = new Cao("Rex 2", 20, sul);
		c3 = new Cao("Rex 3", 30, sul);
		c4 = new Cao("Rex 4", 14, norte);
		c5 = new Cao("Rex 5", 15, norte);
		c6 = new Cao("Rex 6", 16, norte);
		
		
		Gato g1, g2, g3, g4, g5, g6;
		g1 = new Gato("Mimi 1", 1, sul);
		g2 = new Gato("Mimi 2", 2, sul);
		g3 = new Gato("Mimi 3", 3, sul);
		g4 = new Gato("Mimi 4", 4, norte);
		g5 = new Gato("Mimi 5", 5, norte);
		g6 = new Gato("Mimi 6", 6, norte);
		
		List<Animal> animais = new ArrayList<Animal>();
		
		animais.add(c1);
		animais.add(c2);
		animais.add(c3);
		animais.add(c4);
		animais.add(c5);
		animais.add(c6);
		animais.add(g1);
		animais.add(g2);
		animais.add(g3);
		animais.add(g4);
		animais.add(g5);
		animais.add(g6);
		
		for (Animal a : animais) {
			System.out.printf("%s, %.1f Kg, %.1f Km/h, Força = %f, Estados: ", a.getNome(), a.getPeso(), a.velocidade(), a.forca());
			int cont = 0;
			for (Estado e: a.getRegiao().getEstados()) {
				System.out.printf(e.getSigla());
				if (cont == a.getRegiao().getEstados().size()) {
					System.out.print(".");
				} else {
				System.out.print(", ");
		}
				cont = cont + 1;
	}
			System.out.println("");
	
		}
		
		for (Regiao r: regioes) {
			for (Estado e: r.getEstados()) {
				if (e.getSigla() == "AM") {
					System.out.printf("Estado %s se encontra na região %s. ", e.getSigla(), r.getNome());
				}
			}
		}

	
	Tela t1 = new Tela();
	
	t1.mostraAnimal(c1);
	t1.mostraAnimaisRegiao(animais, norte);
	t1.mostraAnimaisRegiao(animais, sul);

	}
}


