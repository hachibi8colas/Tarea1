package Tarea1;

public class AnimalCarnivoro extends Animal {

	public AnimalCarnivoro(String nombre, String tama�o) {
		super(nombre, tama�o);
	}

	@Override
	public void alimentarse() {
		System.out.println("Nombre: " + nombre + "\nTama�o: " + Tama�o + "\nSe alimenta de: " + "carne");

	}

}
