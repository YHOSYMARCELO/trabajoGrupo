package zoo;

public class Gato extends Mamifero {
	private boolean pedigri;

	public Gato() {
		super(); 
		pedigri=true; 
	}

	public Gato(int id, String habitat, String comida, int edad, int gestacion, boolean pedigri) {
		super(id, habitat, comida, edad, gestacion);
		this.pedigri = pedigri;
	}

	public boolean isPedigri() {
		return pedigri;
	}

	public void setPedigri(boolean pedigri) {
		this.pedigri = pedigri;
	}
	public String toString() {
		return "pedigri"+isPedigri()+super.toString(); 
	}
}
