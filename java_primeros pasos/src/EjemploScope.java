
public class EjemploScope {
	
	//ESTO ES REFERENTE A LOS SCOPE
	
	public static void main(String[] args) {

		System.out.println("Hellow World");

		int edad = 17;
		int cantPersona = 2;

		boolean esPareja;
		
		

		if (cantPersona >= 1) {
			esPareja = true;
		} else {
			esPareja = false;
		}
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		System.out.println("El valor de la condicion es: " + esPareja);
		
		if (puedeEntrar) {
			
			System.out.println("Bienvenido");
			
		}else {
			System.out.println("No puede ingresar");
			
		}
		

	}

}
