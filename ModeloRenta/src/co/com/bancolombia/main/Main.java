package co.com.bancolombia.main;

import java.util.Date;

import co.com.bancolombia.modelo.Cliente;
import co.com.bancolombia.modelo.Producto;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(new Date(), true, 15000);
		
		Producto producto = new Producto("12345", "La era del hielo", 20000, null, true);
		cliente.agregarProducto(producto);
		
		System.out.println(Producto.CONSTANTE);
		System.out.println(cliente.getProductos().get(0).getTitulo());
	}

}
