package clasesProductos;

import java.util.HashMap;

public class Inventario {
	public static final int ELECTRODOMESTICO = 1;
	public static final int TECNOLOGIA = 2;
	public static final int DECORACION = 3;
	
	private Producto productos[];
	
	public Inventario() {
		this.productos = new Producto[] {};
	}
	
	public Inventario(int[][] arrayProductos) {
		this.productos = new Producto[] {};
		for(int i=0; i<arrayProductos.length; i++){
			agregarProducto(arrayProductos[i][0], arrayProductos[i][1], arrayProductos[i][2], arrayProductos[i][3], arrayProductos[i][4]);            
		}
	}
	
	public void agregarProducto(int categoria, int tipoProd, int valorInversion, int valorVenta, int cantidad) {
		switch(categoria) {
		case 1:
			this.productos[productos.length] = new Electrodomestico(tipoProd, valorInversion, valorVenta, cantidad);
			break;
			
		case 2:
			this.productos[productos.length] = new Tecnologia(tipoProd, valorInversion, valorVenta, cantidad);
			break;
			
		case 3:
			this.productos[productos.length] = new Decoracion(tipoProd, valorInversion, valorVenta, cantidad);
			break;
		}
	}
	
	public void modificarProducto(int posc, int valorVenta) {
		this.productos[posc].setValorVenta(valorVenta);
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
}
