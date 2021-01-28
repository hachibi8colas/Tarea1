package Tarea1;

public class AnimalCarnivoro extends Animal {

	public AnimalCarnivoro(String nombre, String tamaño) {
		super(nombre, tamaño);
	}

	@Override
	public void alimentarse() {
		System.out.println("Nombre: " + nombre + "\nTamaño: " + Tamaño + "\nSe alimenta de: " + "carne");

	}

}
