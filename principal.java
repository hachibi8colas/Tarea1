package Tarea1;

public class principal {

	public static void main(String[] args) {

		AnimalCarnivoro león = new AnimalCarnivoro("león", "grande");
		león.alimentarse();
		animalherbivoro vaca = new animalherbivoro("vaca", "pequeña");
		vaca.alimentarse();

	}

}
