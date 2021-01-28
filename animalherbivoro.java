package Tarea1;

public class animalherbivoro extends Animal {

	public animalherbivoro(String nombre, String tamaño) {
		super(nombre, tamaño);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alimentarse() {
		System.out.println("Nombre: " + nombre + "\nTamaño: " + Tamaño + "\nSe alimenta de: " + "Hierba");

	}

}
