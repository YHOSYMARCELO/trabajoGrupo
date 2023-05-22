package zoo;

public class Perro extends Mamifero{
	private String raza;

	public Perro() {
		super(); 
		raza="sin definir"; 
	}
	public Perro(int id, String habitat, String comida, int edad, int gestacion, String raza) {
		super(id,habitat, comida, edad, gestacion);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Raza"+getRaza()+super.toString();
	} 
	public String toFichero() {
		return super.toFichero()+";"+getRaza(); 
	}
	
}
