package telas;

import java.util.List;

import dominio.*;

public class Tela {

	public void mostraAnimal(Animal a) {
			System.out.printf("%s, %f Kg, %f Km/h, Força = %f, Estados: ", a.getNome(), a.getPeso(), a.velocidade(), a.forca());
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
		}

public void mostraAnimalSul(List<Animal> animais) {
	for (Animal a: animais) {
		if (a.getRegiao().getNome() == "Sul") {
			mostraAnimal(a);
		}
	}
}

public void mostraAnimaisRegiao (List<Animal> animais, Regiao r) {
	for (Animal a: animais) {
		if(a.getRegiao() == r) {
			mostraAnimal(a);
		}
	}
}
}

