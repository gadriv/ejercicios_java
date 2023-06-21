//
//María es propietaria de una tienda de ropa y le gustaría crear un programa que calcule el valor final del producto después de aplicar un descuento que ofrecería a sus clientes.
//
//Si el valor de la compra está entre $100.0 y $199.99, el descuento es del 10%.
//Si el valor de la compra está entre $200.0 y $299.99, el descuento es del 15%.
//Para compras superiores a $300.0, el descuento es del 20%.
//Para comenzar, María escribió el siguiente esquema de clase:

public class CompraDescuento {

		public static void main(String[] args) {
			
			double valorCompra = 250.0;
			double descuento = 0.0;
			double precioFinal = 0.0;
			
			if (valorCompra >= 100 && valorCompra<= 199.99) {
				
				descuento = 10.00;
				//System.out.println("Usted tiene un descuento del 10%");
			
			}else if (valorCompra >= 200 && valorCompra<= 299.99) {
				descuento = 15.00;
				//System.out.println("Usted tiene un descuento del 15%");
				
			}else if(valorCompra >= 300){
				descuento = 20.00;
				//System.out.println("Usted tiene un descuento del 20%");
			
			}else {
				System.out.println("Usted no tiene descuento");
			}
			
			
			precioFinal = valorCompra - (valorCompra * descuento/ 100);
			
			System.out.println("El valor de la compra es: " + valorCompra);
			System.out.println("Su descuento es de: " + descuento);
			System.out.println("El precion final es: " + precioFinal);					
			
		}
}
