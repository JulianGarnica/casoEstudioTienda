package clasesProductos;

import java.util.HashMap;
import java.util.Random;

public class Inventario {
	public static final int ELECTRODOMESTICO = 1;
	public static final int TECNOLOGIA = 2;
	public static final int DECORACION = 3;
	
	private Producto[] productos;
	private int contador;
	
	private int totalDineroRecibido;
	private int totalElementosVendidos;
	
	public Inventario() {
		totalDineroRecibido = 0;
		totalElementosVendidos = 0;
	}
	
	public Inventario(int[][] arrayProductos, String[] nombresProductos) {
		super();
		this.productos = new Producto[40];
		contador = 0;
		for(int i=0; i<arrayProductos.length; i++){
			agregarProducto(nombresProductos[i],arrayProductos[i][0], arrayProductos[i][1], arrayProductos[i][2], arrayProductos[i][3], arrayProductos[i][4]);            
		}
	}
	
	protected static int generarCodProd(int cant) {
		Random r = new Random();
		String codigo = "";
		for(int i = 0; i<cant; i++) {
		 codigo += Integer.toString((int)Math.floor(Math.random()*6+1));
		}
		int stringCode = Integer.parseInt(codigo);
		return stringCode;
	}
	
	public void agregarProducto(String nombreProd, int categoria, int tipoProd, int valorInversion, int valorVenta, int cantidad) {

		//productos[0] = new Electrodomestico(nombreProd, tipoProd, valorInversion, valorVenta, cantidad);

		if((valorInversion*2/100) < valorVenta) {
			switch(categoria) {
			case 1:
				
					this.productos[contador] = new Electrodomestico(nombreProd, tipoProd, valorInversion, valorVenta, cantidad, generarCodProd(4));
				
				break;
				
			case 2:
				this.productos[contador] = new Tecnologia(nombreProd, tipoProd, valorInversion, valorVenta, cantidad, generarCodProd(4));
				break;
				
			case 3:
				this.productos[contador] = new Decoracion(nombreProd, tipoProd, valorInversion, valorVenta, cantidad, generarCodProd(4));
				break;
			}
		}else {
			System.out.println("No se puede agregar: Valor venta inferior al 2%");
		}
		
		contador++;
	}
	
	public Producto[] getProductos() {
		return productos;
	}

	public void modificarProducto(int posc, String nombreProd, int valorInversion, int valorVenta, int cantidad) {
		this.productos[posc].setNombreProd(nombreProd);
		this.productos[posc].setValorInversion(valorInversion);
		this.productos[posc].setValorVenta(valorVenta);
		this.productos[posc].setCantidad(cantidad);
	}
	
	public static HashMap<String, Integer> obtenerProductosElectrodomesticos(){
		HashMap<String, Integer> productosElectrodomesticos = new HashMap<String, Integer>();
		productosElectrodomesticos.put("ESTUFA", Producto.ESTUFA);
		productosElectrodomesticos.put("NEVERA", Producto.NEVERA);
		productosElectrodomesticos.put("LAVADORA", Producto.LAVADORA);
		
		return productosElectrodomesticos;
	}
	
	public static HashMap<String, Integer> obtenerProductosTecnologia(){
		HashMap<String, Integer> productosTecnologia = new HashMap<String, Integer>();
		productosTecnologia.put("TELEVISORES", Producto.TELEVISORES);
		productosTecnologia.put("TELEFONOS", Producto.TELEFONOS);
		productosTecnologia.put("CELULARES", Producto.CELULARES);
		
		return productosTecnologia;
	}
	
	public static HashMap<String, Integer> obtenerProductosDecoracion(){
		HashMap<String, Integer> productosDecoracion = new HashMap<String, Integer>();
		productosDecoracion.put("CUADROS", Producto.CUADROS);
		productosDecoracion.put("MESAS", Producto.MESAS);
		productosDecoracion.put("RELOJES", Producto.RELOJES);
		
		return productosDecoracion;
	}
	
	public Producto devolverProducto(int id) {
		return this.productos[id];
	}
	
	public int getTotalDineroRecibido() {
		return totalDineroRecibido;
	}

	public void addTotalDineroRecibido(int totalDineroRecibido) {
		this.totalDineroRecibido += totalDineroRecibido;
	}

	public int getTotalElementosVendidos() {
		return totalElementosVendidos;
	}

	public void addTotalElementosVendidos(int totalElementosVendidos) {
		this.totalElementosVendidos += totalElementosVendidos;
	}

	public int[] darTotales() {
		int totalInversion = 0;
		for(Producto iterado:productos) {
			if (iterado != null) {
				totalInversion += iterado.getValorInversion();
			}
		}
		int[] datos = {totalElementosVendidos, totalDineroRecibido, totalInversion};
		return datos;
	}
}
