package zoo;

public class Mamifero extends Animal {
	private int gestacion;
	
	public Mamifero() {
		super(); 
	}

	public Mamifero( int id,String habitat, String comida, int edad, int gestacion ) {
		super(id,Habitat.valueOf(habitat),comida, edad);
		this.gestacion = gestacion;
	}

	public int getGestacion() {
		return gestacion;
	}

	public void setGestacion(int gestacion) {
		this.gestacion = gestacion;
	}

	@Override
	public String toString() {
		return "gestacion"+getGestacion()+super.toString();
	} 
	public String toFichero() {
		return super.toFichero()+";"+getGestacion();
	}
}
