package zoo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args []) {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bis= new BufferedReader(isr);
		ArrayList<Animal> animal= new ArrayList<Animal>();
		int opcion=0; 
		try {
			
			do {
				System.out.println("Ingresa una opcion");
				opcion=Integer.parseInt(bis.readLine());
				switch(opcion) {
				case 1 : addAnimal(animal); break;
				case 2 : listarAnimal(animal); break; 
				case 3:  deleteAnimal(animal); break; 
				case 4: System.out.println("Adios");break;
				default:System.out.println("No existe la opcion");break; 
				}
			}while(opcion!=0); 
			
		} catch (NumberFormatException | IOException e) {
			System.out.println("Opcion no validad");
			// TODO: handle exception
		}
	}
	
	public static void addAnimal(ArrayList<Animal> anim)  {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bis= new BufferedReader(isr);
		Gato gato= new Gato();
		String habitat, comida , tipoAnimal, raza, pedigri;
		int edad, gestacion, id;
		double cantidadComida;
		
		try {
			System.out.println("Ingresauna id");
			id=Integer.parseInt(bis.readLine()); 
			System.out.println("Ingresa el habitat TIERRA, MAR O AEREO");
			habitat=bis.readLine().toUpperCase();
			System.out.println("que tipo de comida?");
			comida=bis.readLine(); 
			System.out.println("Ingresa la edad");
			edad=Integer.parseInt(bis.readLine()); 
			System.out.println("Escribe tiempo de gestacion");
			gestacion=Integer.parseInt(bis.readLine()); 
			System.out.println("Que tipo de animal es \n perro \n gato\n delfin?");
			tipoAnimal=bis.readLine(); 
			if(tipoAnimal.equalsIgnoreCase("perro")) {
				System.out.println("Que raza es?");
				raza=bis.readLine();
				anim.add(new Perro(id, habitat, comida, edad, gestacion, raza));
			}
			else if(tipoAnimal.equalsIgnoreCase("gato")) {
				System.out.println("Tiene pedigri? SI o NO ");
				pedigri=bis.readLine(); 
				if(pedigri.equalsIgnoreCase("si")) {
					 anim.add(new Gato(id, habitat, comida, edad, gestacion, true));
					
				}
				else if(pedigri.equalsIgnoreCase("no")) {
					anim.add(new Gato(id, habitat, comida, edad, gestacion, false));
				}
			}
			else if(tipoAnimal.equalsIgnoreCase("delfin")) {
				System.out.println("Ingresa la cantidad de comida que consume");
				cantidadComida=Double.parseDouble(bis.readLine()); 
				anim.add(new Delfin(id, habitat, comida, edad, gestacion, cantidadComida)); 
			}
			
			
		} catch (Exception e) {
			System.out.println("Error de entrada");
		}
		
		
	}
	public static void listarAnimal(ArrayList< Animal> animal) {
		for(Animal anima: animal) {
			System.out.println(anima);
		}
		
	}
	/*El nuevo usuario creará una rama llamada delete */
	public static void deleteAnimal(ArrayList<Animal> animal) {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader bis= new BufferedReader(isr);
		System.out.println("QUE ID DESEAS ELIMINAR?");
		try {
			int id=Integer.parseInt(bis.readLine());
			for (int i=0; i<animal.size(); i++) {
				if(animal.get(i).getId()==id) {
					animal.remove(i); 
					System.out.println("animal eliminado");
				}
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrecta entrada de datos");
		}
	}
	
	public static void crearFichero() {
		FileWriter fw= new FileWriter("animales.csv"); 
		BufferedWriter bw= new BuferredWriter(fw); 
	}
}
