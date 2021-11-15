package clasesProductos;

public class Carrito {
	private Producto[] productosEnCarrito;
	private int totalPedido;
	private int totalProductos;
	
	private int contador;
	public Carrito() {
		contador = 0;
		totalPedido = 0;
		totalProductos = 0;
		productosEnCarrito =  new Producto[10];
	}
	
	public void agregarCarrito(Producto productoAgregar, Inventario inventarioProductos) {
		productosEnCarrito[contador] = productoAgregar;
		int costo = productoAgregar.getValorVenta();
		contador++;
		totalPedido += costo;
		totalProductos++;
	}
	
	public Producto[] getProductosEnCarrito() {
		return productosEnCarrito;
	}
	
	public int[] datosNumerosCarrito() {
		int[] datos = {totalPedido, totalProductos};
		return datos;
	}
	
	public void enviarPedido(Inventario inventarioProductos) {
		inventarioProductos.addTotalDineroRecibido(totalPedido);
		inventarioProductos.addTotalElementosVendidos(totalProductos);
		contador = 0;
		totalPedido = 0;
		totalProductos = 0;
		productosEnCarrito =  new Producto[10];
	}
}
