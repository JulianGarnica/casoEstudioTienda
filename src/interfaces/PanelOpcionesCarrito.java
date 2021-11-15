package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelOpcionesCarrito extends JPanel {
	private JTextField txtTotalpedido;
	private JTextField txtTotalproductos;
	private MainFrame principal;

	/**
	 * Create the panel.
	 */
	public PanelOpcionesCarrito(final MainFrame principal) {
		this.principal = principal;
		setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblTotalPedido = new JLabel("Total Pedido");
		add(lblTotalPedido);
		
		txtTotalpedido = new JTextField();
		txtTotalpedido.setEditable(false);
		add(txtTotalpedido);
		txtTotalpedido.setColumns(10);
		
		JLabel lblTotalProductos = new JLabel("Total Productos");
		add(lblTotalProductos);
		
		txtTotalproductos = new JTextField();
		txtTotalproductos.setEditable(false);
		txtTotalproductos.setColumns(10);
		add(txtTotalproductos);
		
		JLabel label = new JLabel("");
		add(label);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.enviarPedido();
			}
		});
		add(btnFinalizarCompra);
		
		JLabel label_1 = new JLabel("");
		add(label_1);
		
		JLabel label_2 = new JLabel("");
		add(label_2);
		
		JLabel label_3 = new JLabel("");
		add(label_3);
		
		JLabel label_4 = new JLabel("");
		add(label_4);

	}
	
	public void actualizarPanelCarritos(int[] datos) {
		System.out.println(datos[0]);
		txtTotalpedido.setText(Integer.toString(datos[0]));
		txtTotalproductos.setText(Integer.toString(datos[1]));
	}
}
