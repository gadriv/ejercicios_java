public class factorial {
	
	public static void main(String[] args) {
		
		int	factorial = 1;
		
		for(int multiplo = 1; multiplo< 11; multiplo++) {
			
			factorial *= multiplo;
			
			System.out.println("Factorial de " + multiplo + " = " + factorial);
			}
			
		}
		
	}
