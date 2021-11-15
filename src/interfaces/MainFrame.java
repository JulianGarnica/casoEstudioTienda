package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesProductos.Carrito;
import clasesProductos.Inventario;
import clasesProductos.Producto;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import java.awt.Choice;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private Inventario inventarioProductos;
	private Carrito carrito;
	private TablaProds tablaProds;
	
	public int cuadroEscogido;
	private TablaCarrito tablaCarrito;
	private PanelTotales panelTotales;
	private PanelOpcionesCarrito panelOpcionesCarrito;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		String[] nombresProductos = {
				"Estufa Super inteligente I",
				"Nevera con capacidad pulmonar",
				"Mesa cuadrada"
		};
		int[][] productosPredefinidos = {
				{Inventario.ELECTRODOMESTICO,Inventario.obtenerProductosElectrodomesticos().get("ESTUFA"),500000,650000,10},
				{Inventario.ELECTRODOMESTICO,Inventario.obtenerProductosElectrodomesticos().get("NEVERA"),800000,1200000,10},
				{Inventario.DECORACION,Inventario.obtenerProductosDecoracion().get("MESAS"),100000,120000,10}
			};
		
		inventarioProductos = new Inventario(productosPredefinidos, nombresProductos);
		
		carrito = new Carrito();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tablaProds = new TablaProds(this);

		tablaProds.actualizarTabla(inventarioProductos.getProductos());
		contentPane.add(tablaProds, BorderLayout.WEST);
		
		PanelOpciones panelOpciones = new PanelOpciones(this);
		contentPane.add(panelOpciones, BorderLayout.EAST);
		
		tablaCarrito = new TablaCarrito();
		FlowLayout flowLayout = (FlowLayout) tablaCarrito.getLayout();
		flowLayout.setVgap(2);
		flowLayout.setHgap(2);
		contentPane.add(tablaCarrito, BorderLayout.SOUTH);
		
		panelOpcionesCarrito = new PanelOpcionesCarrito(this);
		tablaCarrito.getScrollPane().setRowHeaderView(panelOpcionesCarrito);
		
		panelTotales = new PanelTotales();
		contentPane.add(panelTotales, BorderLayout.NORTH);
		actualizarCuadrosTotales();
	}
	
	public void ActualizarDatosFormularioSeleccionado() {
		int filaSeleccionada = tablaProds.getCampoSeleccionadoAct();

		cuadroEscogido = filaSeleccionada;
		//tablaProds.actualizarInfoModifacionLibro(filaSeleccionada);
	}
	
	public void actualizarCuadrosTotales() {
		panelOpcionesCarrito.actualizarPanelCarritos(carrito.datosNumerosCarrito());
		panelTotales.actualizarPanelCarritos(inventarioProductos.darTotales());
	}
	
	public void actualizarTablaProductos() {
		tablaProds.actualizarTabla(inventarioProductos.getProductos());
	}
	
	public void actualizarTablaCarrito() {
		tablaCarrito.actualizarTabla(carrito.getProductosEnCarrito());
	}
	
	public Producto obtenerInfoProducto(int id) {
		return inventarioProductos.devolverProducto(id);
	}
	
	public void agregarProductoCarrito(int id) {
		carrito.agregarCarrito(inventarioProductos.devolverProducto(id), inventarioProductos);
		inventarioProductos.getProductos()[id].setCantidad(inventarioProductos.getProductos()[id].getCantidad()-1);
		actualizarTablaCarrito();
		actualizarTablaProductos();
		actualizarCuadrosTotales();
	}
	
	public void agregarNuevoProducto(String nombreProd, String categoria, String tipoProd, int valorInversion, int valorVenta, int cantidad) {
		int categoriaInt = 0;
		int tipoProdInt = 0;
		
		if(categoria.equals("Electrodomésticos")) {
			categoriaInt = Inventario.ELECTRODOMESTICO;
		}else if(categoria.equals("Tecnología")) {
			categoriaInt = Inventario.TECNOLOGIA;
		}else if(categoria.equals("Decoración")) {
			categoriaInt = Inventario.DECORACION;
		}
		
		if(tipoProd.equals("Estufa")) {
			tipoProdInt = Inventario.obtenerProductosElectrodomesticos().get("ESTUFA");
		}else if(tipoProd.equals("Nevera")) {
			tipoProdInt = Inventario.obtenerProductosElectrodomesticos().get("NEVERA");
		}else if(tipoProd.equals("Lavadora")) {
			tipoProdInt = Inventario.obtenerProductosElectrodomesticos().get("LAVADORA");
		}else if(tipoProd.equals("Televisor")) {
			tipoProdInt = Inventario.obtenerProductosTecnologia().get("TELEVISORES");
		}else if(tipoProd.equals("Teléfono")) {
			tipoProdInt = Inventario.obtenerProductosTecnologia().get("TELEFONOS");
		}else if(tipoProd.equals("Celular")) {
			tipoProdInt = Inventario.obtenerProductosTecnologia().get("CELULARES");
		}else if(tipoProd.equals("Cuadro")) {
			tipoProdInt = Inventario.obtenerProductosDecoracion().get("CUADROS");
		}else if(tipoProd.equals("Mesa")) {
			tipoProdInt = Inventario.obtenerProductosDecoracion().get("MESAS");
		}else if(tipoProd.equals("Reloj")) {
			tipoProdInt = Inventario.obtenerProductosDecoracion().get("RELOJES");
		}
		inventarioProductos.agregarProducto(nombreProd, categoriaInt, tipoProdInt, valorInversion, valorVenta, cantidad);
		actualizarTablaProductos();
		actualizarCuadrosTotales();
	}

	public int getCuadroEscogido() {
		return cuadroEscogido;
	}
	
	public void actualizarProducto(int posc, String nombreProd, int valorInversion, int valorVenta, int cantidad) {
		inventarioProductos.modificarProducto(posc, nombreProd, valorInversion, valorVenta, cantidad);
		actualizarTablaProductos();
		actualizarCuadrosTotales();
		
	}

	public void setCuadroEscogido(int cuadroEscogido) {
		this.cuadroEscogido = cuadroEscogido;
	}
	public TablaCarrito getTablaCarrito() {
		return tablaCarrito;
	}
	public PanelOpcionesCarrito getPanelOpcionesCarrito() {
		return panelOpcionesCarrito;
	}
	
	public void enviarPedido() {
		carrito.enviarPedido(inventarioProductos);
		actualizarCuadrosTotales();
		actualizarTablaCarrito();
		actualizarTablaProductos();
	}
}
