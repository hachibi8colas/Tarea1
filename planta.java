package Tarea1;

public class planta extends serVivo {

	String color;

	public planta(String nombre, String color) {
		super(nombre);
		this.color = color;
	}

	@Override
	public void alimentarse() {
		System.out.println("Fotosintesis");

	}

}
