package Tarea1;

public class animalherbivoro extends Animal {

	public animalherbivoro(String nombre, String tama�o) {
		super(nombre, tama�o);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alimentarse() {
		System.out.println("Nombre: " + nombre + "\nTama�o: " + Tama�o + "\nSe alimenta de: " + "Hierba");

	}

}
