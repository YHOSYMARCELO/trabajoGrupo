package zoo;

public class Delfin extends Mamifero{
	private double cantidadComida;
	public Delfin() {
		super(); 
		cantidadComida=0.0; 
	}

	public Delfin(int id, String habitat, String comida, int edad, int gestacion, double cantidadComida) {
		super(id, habitat, comida, edad, gestacion);
		this.cantidadComida = cantidadComida;
	}

	public double getCantidadComida() {
		return cantidadComida;
	}

	public void setCantidadComida(double cantidadComida) {
		this.cantidadComida = cantidadComida;
	}

	public String toString() {
		return "cantidadComida"+getCantidadComida()+super.toString(); 
	}
	public String toFichero() {
		return super.toFichero()+";"+getCantidadComida(); 
	}
	
}
