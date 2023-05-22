package zoo;

public class Animal {
	 
	private Habitat habitat;
	private String comida; 
	private int edad; 
	
	public Animal() {
		
		habitat=null; 
		comida=""; 
		edad=0;
	}
	
	public Animal( Habitat habitat, String comida,int edad) {
		
		
		this.habitat = habitat;
		this.comida = comida;
		this.edad=edad;
	}

	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Habitat getHabitat() {
		return habitat;
	}
	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Animal [habitat=" + habitat + ", comida=" + comida + ", edad=" + edad + "]";
	}

	
	
}
