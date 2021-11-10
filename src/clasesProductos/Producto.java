package clasesProductos;

import java.util.Random;

public class Producto {
	//Electrodomesticos
	public static final int ESTUFA = 1;
	public static final int NEVERA = 2;
	public static final int LAVADORA = 3;
	//Tecnología
	public static final int TELEVISORES = 1;
	public static final int TELEFONOS = 2;
	public static final int CELULARES = 3;
	//Decoración
	public static final int CUADROS = 1;
	public static final int MESAS = 2;
	public static final int RELOJES = 3;

	
	
	private int valorInversion;
	private int valorVenta;
	private int cantidad;
	private int codigo;
	
	public Producto() {
		this.valorInversion = 0;
		this.valorVenta = 0;
		this.cantidad = 0;
		this.codigo = 0;
	}
	
	public Producto(int valorInversion, int valorVenta, int cantidad, int codigo) {
		this.valorInversion = valorInversion;
		this.valorVenta = valorVenta;
		this.cantidad = cantidad;
		this.codigo = codigo;
	}
	
	public int getValorInversion() {
		return valorInversion;
	}

	public void setValorInversion(int valorInversion) {
		this.valorInversion = valorInversion;
	}

	public int getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(int valorVenta) {
		this.valorVenta = valorVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	protected static int generarCodProd(int cant) {
		Random r = new Random();
		int codigo = r.nextInt(cant)+1;
		return codigo;
	}
}


class Electrodomestico extends Producto{
	
	private static int codProd = generarCodProd(10);
	private int tipoProd;
	
	public Electrodomestico(int tipoProd, int valorInversion, int valorVenta, int cantidad) {
		super(valorInversion, valorVenta, cantidad, codProd);
		this.tipoProd = tipoProd;

	}

	public String getTipoProd() {
		String returnVal = "";
		
		switch(this.tipoProd) {
			case 1:
				returnVal = "Estufa";
				break;
				
			case 2:
				returnVal = "Nevera";
				break;
				
			case 3:
				returnVal = "Lavadora";
				break;
		}
		return returnVal;
	}

	public void setTipoProd(int tipoProd) {
		this.tipoProd = tipoProd;
	}
	
	
}

class Tecnologia extends Producto{
	
	private static int codProd = generarCodProd(10);
	private int tipoProd;
	
	public Tecnologia(int tipoProd, int valorInversion, int valorVenta, int cantidad) {
		super(valorInversion, valorVenta, cantidad, codProd);
		this.tipoProd = tipoProd;
	}

	public String getTipoProd() {
		String returnVal = "";
		
		switch(this.tipoProd) {
			case 1:
				returnVal = "Televisores";
				break;
				
			case 2:
				returnVal = "Telefonos";
				break;
				
			case 3:
				returnVal = "Celulares";
				break;
		}
		return returnVal;
	}

	public void setTipoProd(int tipoProd) {
		this.tipoProd = tipoProd;
	}
}

class Decoracion extends Producto{

	private static int codProd = generarCodProd(10);
	private int tipoProd;
	
	public Decoracion(int tipoProd, int valorInversion, int valorVenta, int cantidad) {
		super(valorInversion, valorVenta, cantidad, codProd);
		this.tipoProd = tipoProd;
	}

	public String getTipoProd() {
		String returnVal = "";
		
		switch(this.tipoProd) {
			case 1:
				returnVal = "Cuadros";
				break;
				
			case 2:
				returnVal = "Mesas";
				break;
				
			case 3:
				returnVal = "Relojes";
				break;
		}
		return returnVal;
	}

	public void setTipoProd(int tipoProd) {
		this.tipoProd = tipoProd;
	}
}