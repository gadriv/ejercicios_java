
public class CalculoDelIR {

	public static void main(String[] args) {
		
		double salario = 3500.00;
		
		if (salario <= 2600.0) {
			System.out.println("Tu tasa es del 15%");
			System.out.println("Puedes deducir hasta $350");
		}if (salario >=3700.0) {
			System.out.println("Su tasa es del 22.5%");
			System.out.println("Puedes deducir hasta $636.00");
			
		}
	}
}
